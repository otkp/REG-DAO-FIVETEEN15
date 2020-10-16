package org.epragati.vcrImage.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.exception.BadRequestException;
import org.epragati.jwt.JwtUser;
import org.epragati.master.dao.OffenceDAO;
import org.epragati.master.dao.OfficeDAO;
import org.epragati.master.dao.UserDAO;
import org.epragati.master.dto.DistrictDTO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.vo.OffenceVO;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.payment.dto.FeesDTO;
import org.epragati.payment.report.vo.ReportsVO;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.payments.vo.CashBookVO;
import org.epragati.payments.vo.ChalanaDetailsVO;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.regservice.mapper.ActionDetailMapper;
import org.epragati.regservice.vo.SpeedGunVO;
import org.epragati.rta.reports.vo.ReportVO;
import org.epragati.sequence.SequenceGenerator;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.epragati.util.document.Sequence;
import org.epragati.util.payment.ClassOfVehicleEnum;
import org.epragati.util.payment.GatewayTypeEnum;
import org.epragati.util.payment.ServiceCodeEnum;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.constant.VcrConstent;
import org.epragati.vcr.vo.EnforcementVcrVO;
import org.epragati.vcr.vo.UnpaidVcrListVO;
import org.epragati.vcr.vo.VcrFinalServiceVO;
import org.epragati.vcrImage.dto.OtherSectionDTO;
import org.epragati.vcrImage.dto.SpeedGunDTO;
import org.epragati.vcrImage.dto.VcrDeleteDetailsDTO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@Component
public class VcrFinalServiceMapper extends BaseMapper<VcrFinalServiceDTO, VcrFinalServiceVO> {

	@Autowired
	private VcrMapper vcrMapper;
	@Autowired
	private RegistrationVcrMapper registrationVcrMapper;
	@Autowired
	private OwnerDetailsMapper ownerDetailsmapper;
	@Autowired
	private DriverDetailsVcrMapper driverDetailsMapper;
	@Autowired
	private VehicleProceedingMapper vehicleProceedingMapper;
	@Autowired
	private OffenceVcrMapper offenceMapper;
	@Autowired
	private SeizedAndDocumentImpoundedMapper seizedAndDocumentMapper;
	@Autowired
	private ValidityDetailsMapper validityDetailsMapper;
	@Autowired
	private OverLoadMapper overLoadMapper;
	@Autowired
	private OtherSectionMapper otherSectionMapper;
	@Autowired
	private ActionDetailMapper actionDetailMapper;
	@Value("${reg.service.images.new.url:}")
	private String imagePreUrl;
	@Autowired
	private IllicitPlaceDetailsMapper illicitPlaceDetails;

	private static final Logger logger = LoggerFactory.getLogger(VcrFinalServiceMapper.class);
	private static int i = 1;
	private static int dayChk = 0;

	@Autowired
	private OfficeDAO officeDAO;
	@Autowired
	private SequenceGenerator sequenceGenerator;
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private OffenceDAO offenceDAO;
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public VcrFinalServiceVO convertEntity(VcrFinalServiceDTO dto) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		VcrFinalServiceVO vo = new VcrFinalServiceVO();
		vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
		vo.setRegistration(registrationVcrMapper.convertEntity(dto.getRegistration()));
		
		if(dto.getOwnerDetails()!=null) {
			vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
		}
		if(dto.getDriver()!=null) {
			vo.setDriver(driverDetailsMapper.convertEntity(dto.getDriver()));
		}
		if(dto.getVehicleProceeding()!=null) {
			vo.setVehicleProceeding(vehicleProceedingMapper.convertEntity(dto.getVehicleProceeding()));
		}
		if(dto.getOffence()!=null) {
			vo.setOffence(offenceMapper.convertEntity(dto.getOffence()));
		}
		if(dto.getSeizedAndDocumentImpounded()!=null) {
			vo.setSeizedAndDocumentImpounded(seizedAndDocumentMapper.convertEntity(dto.getSeizedAndDocumentImpounded()));
		}
		
		if (dto.getOtherSections() != null) {
			vo.setOtherSections(otherSectionMapper.convertEntity(dto.getOtherSections()));
		}
		if (dto.getValidityDetails() != null) {
			vo.setValidityDetailsVo(validityDetailsMapper.convertEntity(dto.getValidityDetails()));
		}
		
		List<String> urls = new ArrayList<>();
		if (dto.getSeizedAndDocumentImpounded() != null
				&& dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO() != null
				&& dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO().getEnclosures() != null
				&& !dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO().getEnclosures().isEmpty()) {

			dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO().getEnclosures().forEach(single -> {
				single.getValue().forEach(imgae -> {
					urls.add(imagePreUrl + "?appImageDocId=" + imgae.getImageId());
					// imagePreUrl+"?appImageDocId="+imgae.getImageId();
				});

			});
		}
		if (dto.getOtherSections() != null && !dto.getOtherSections().isEmpty()) {
			for (OtherSectionDTO otherSectionDto : dto.getOtherSections()) {
				if (otherSectionDto.getEnclosures() != null && !otherSectionDto.getEnclosures().isEmpty()) {
					otherSectionDto.getEnclosures().forEach(single -> {
						single.getValue().forEach(imgae -> {
							urls.add(imagePreUrl + "?appImageDocId=" + imgae.getImageId());
						});

					});
				}
			}
		}
		vo.setImagesUrls(urls);
		funPoint(dto.getMviOfficeCode(), vo::setMviOfficeCode);
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getOffencetotal(), vo::setOffencetotal);
		funPoint(dto.getDisposalType(), vo::setDisposalType);
		funPoint(dto.isPartialDisposal(), vo::setPartialDisposal);
		funPoint(dto.isFinalDisposal(), vo::setFinalDisposal);
		funPoint(dto.getOrderNo(), vo::setOrderNo);
		funPoint(dto.getOrderDate(), vo::setOrderDate);
		funPoint(dto.getCourtName(), vo::setCourtName);
		funPoint(dto.getCaseNo(), vo::setCaseNo);
		funPoint(dto.getCollectedDate(), vo::setCollectedDate);
		funPoint(dto.getFineCollected(), vo::setFineCollected);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getProceedingNo(), vo::setProceedingNo);
		funPoint(dto.getLicenseNo(), vo::setLicenseNo);
		funPoint(dto.getRegistrationNo(), vo::setRegistrationNo);
		funPoint(dto.getProceedingDate(), vo::setProceedingDate);
		funPoint(dto.getPartiallyClosed(), vo::setPartiallyClosed);
		funPoint(dto.getPilledCov(), vo::setPilledCov);
		funPoint(dto.getPilledPermit(), vo::setPilledPermit);
		funPoint(dto.getPilledSeatings(), vo::setPilledSeatings);
		funPoint(dto.getPilledRouteCode(), vo::setPilledRouteCode);
		if (dto.getActions() != null) {
			vo.setActions(actionDetailMapper.convertEntity(dto.getActions()));
		}
		funPoint(dto.getUsername(), vo::setUsername);
		funPoint(dto.getPaidDate(), vo::setPaidDate);
		//vo.setPaidDateForReport(dto.getPaidDate().format(df));
		//funPoint(dto.getPaidDate(), vo::setPaidDate.format);
		funPoint(dto.isPaymentIntiated(), vo::setPaymentIntiated);
		funPoint(dto.getOffencetotal(), vo::setCompoundFee);
		funPoint(dto.getServiceFee(), vo::setServiceFee);
		funPoint(dto.getTax(), vo::setTax);
		funPoint(dto.getPenalty(), vo::setPenalty);
		funPoint(dto.getTaxArrears(), vo::setTaxArrears);
		funPoint(dto.getPenaltyArrears(), vo::setPenaltyArrears);
		if (dto.getIllicitPlaceDetails() != null && !dto.getIllicitPlaceDetails().isEmpty()) {
			vo.setIllicitPlaceDetails(illicitPlaceDetails.convertEntity(dto.getIllicitPlaceDetails()));
		}
		funPoint(dto.getPilledMeasurements(), vo::setPilledMeasurements);
		funPoint(dto.getPilledGoods(), vo::setPilledGoods);
		funPoint(dto.getCreatedBy(), vo::setMviName);
		funPoint(dto.getCfxIssued(), vo::setCfxIssued);
		funPoint(dto.isVehicleHaveAitp(), vo::setVehicleHaveAitp);
		funPoint(dto.getPaymentType(), vo::setPaymentType);
		if (dto.getSaveDoc() != null && dto.getSaveDoc()) {
			vo.setSaveDoc(dto.getSaveDoc());
		}
		funPoint(dto.isAnnualTax(), vo::setAnnualTax);
		funPoint(dto.getDesignation(), vo::setDesignation);
		funPoint(dto.getCreatedBy(), vo::setCreatedBy);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		funPoint(dto.getVehicleSeized(), vo::setVehicleSeized);
		vo.setIsVcrClosed(dto.getIsVcrClosed());
		funPoint(dto.getCess(), vo::setCess);
		funPoint(dto.getTaxValidityForTaxPaid(), vo::setTaxValidityForTaxPaid);
		funPoint(dto.getGreentaxValidityForTaxPaid(), vo::setGreentaxValidityForTaxPaid);
		funPoint(dto.getDeductionMode(), vo::setDeductionMode);
		funPoint(dto.getVoluntaryMode(), vo::setVoluntaryMode);
		funPoint(dto.getPaymentDone(),vo::setPaymentDone);
		funPoint(dto.getIsRoadSafety(), vo::setIsRoadSafety);
		funPoint(dto.getIsSpeedGun() , vo::setIsSpeedGun);
		if(dto.getIsEvcrPrinted()!=null) {
			vo.seteVcrPrinted(dto.getIsEvcrPrinted());
		}

	if(dto.getIsSpeedGunVcrPrinted()!=null) {
		vo.setSpeedGunVcrPrinted(dto.getIsSpeedGunVcrPrinted());
		
	}
    if(dto.getSpeedGunDTO()!=null&&dto.getSpeedGunDTO().getVehicleImage()!=null) {
    	vo.setSpeedGunImage(dto.getSpeedGunDTO().getVehicleImage());
    	vo.setSpeedGunVO(speedGunConvertEntity(dto.getSpeedGunDTO()));
    }
	return vo;
	}
	private SpeedGunVO speedGunConvertEntity(SpeedGunDTO dto) {
		SpeedGunVO vo=new SpeedGunVO();
		funPoint(dto.getSpeed(), vo::setSpeed);
		funPoint(dto.getSpeedZone(), vo::setSpeedZone);
		return vo;
	}
	

	public List<VcrFinalServiceVO> convertLimited(List<VcrFinalServiceDTO> dtoList) {
		List<VcrFinalServiceVO> vcrList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			VcrFinalServiceVO vo = new VcrFinalServiceVO();
			if (dto.getVcr() != null) {
				vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
			}
			if (dto.getRegistration() != null) {
				vo.setRegistration(registrationVcrMapper.convertLimited(dto.getRegistration()));
			}
			if (dto.getOwnerDetails() != null) {
				vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
			}
			if (dto.getOffence() != null) {
				vo.setOffence(offenceMapper.convertLimited(dto.getOffence()));
			}

			if (!CollectionUtils.isEmpty(dto.getChallanDetails())) {
				vo.setChallanNo(
						dto.getChallanDetails().stream().map(val -> val.getChallanNo()).collect(Collectors.toList()));
			}
			vo.setIssuedBy(dto.getCreatedBy());
			vo.setOfficeCode(dto.getOfficeCode());
			vo.setIsVcrClosed(dto.getIsVcrClosed());

			vo.setCompoundFee(0);
			vo.setTax(0d);
			vo.setTaxArrears(0d);
			vo.setPenalty(0L);
			vo.setPenaltyArrears(0L);
			if (dto.getOffencetotal() != null) {
				vo.setCompoundFee(dto.getOffencetotal());
			}
			if (dto.getTax() != null) {
				vo.setTax(dto.getTax());
			}

			if (dto.getPenalty() != null) {
				vo.setPenalty(dto.getPenalty());
			}

			if (dto.getServiceFee() != null) {
				vo.setServiceFee(dto.getServiceFee());
			}

			if (dto.getPenaltyArrears() != null) {
				vo.setPenaltyArrears(dto.getPenaltyArrears());
			}

			if (dto.getTaxArrears() != null) {
				vo.setTaxArrears(dto.getTaxArrears());
			}

			vo.setTotal(
					vo.getTax() + vo.getTaxArrears() + vo.getPenalty() + vo.getPenaltyArrears() + vo.getCompoundFee());
			if (dto.getPaidDate() != null) {
				vo.setPaidDate(dto.getPaidDate());
			}
			if (dto.getIsVcrClosed()) {
				if (StringUtils.isNotEmpty(dto.getPaymentType())
						&& dto.getPaymentType().equals(GatewayTypeEnum.CASH.getDescription())) {
					vo.setStatus(StatusRegistration.VcrEnum.PAID.getDesc() + "(" + GatewayTypeEnum.CASH.getDescription()
							+ ")");
				} else if (StringUtils.isNotEmpty(dto.getPaymentType())) {
					vo.setStatus(StatusRegistration.VcrEnum.PAID.getDesc() + "(" + "ONLINE" + ")");
				} else {
					vo.setStatus(StatusRegistration.VcrEnum.PAID.getDesc());
				}

			} else {
				vo.setStatus(StatusRegistration.VcrEnum.UNPAID.getDesc());
			}
			vcrList.add(vo);
		});
		return vcrList;
	}

	public List<VcrFinalServiceVO> cashBookMapper(List<VcrFinalServiceDTO> dtoList) {
		List<VcrFinalServiceVO> vcrList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			VcrFinalServiceVO vo = new VcrFinalServiceVO();
			if (dto.getVcr() != null) {
				vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
			}
			if (dto.getRegistration() != null) {
				vo.setRegistration(registrationVcrMapper.convertLimited(dto.getRegistration()));
			}
			if (dto.getOwnerDetails() != null) {
				vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
			}

			vo.setIssuedBy(dto.getCreatedBy());
			vo.setOfficeCode(dto.getOfficeCode());
			vo.setIsVcrClosed(dto.getIsVcrClosed());
			vo.setCompoundFee(dto.getOffencetotal());
			vo.setServiceFee(dto.getServiceFee());
			vo.setPenalty(dto.getPenalty());
			vo.setTax(dto.getTax());
			vo.setTaxArrears(dto.getTaxArrears());
			vo.setPenaltyArrears(dto.getPenaltyArrears());
			vcrList.add(vo);
		});
		return vcrList;
	}

	public List<VcrFinalServiceVO> seizedMapper(List<VcrFinalServiceDTO> dtoList) {
		List<VcrFinalServiceVO> vcrList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			VcrFinalServiceVO vo = new VcrFinalServiceVO();
			if (dto.getVcr() != null) {
				vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
			}
			if (dto.getRegistration() != null) {
				vo.setRegistration(registrationVcrMapper.convertLimited(dto.getRegistration()));
			}
			if (dto.getOwnerDetails() != null) {
				vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
			}
			if (dto.getSeizedAndDocumentImpounded() != null) {
				vo.setSeizedAndDocumentImpounded(
						seizedAndDocumentMapper.siezedMapper(dto.getSeizedAndDocumentImpounded()));
			}
			vo.setIssuedBy(dto.getCreatedBy());
			vo.setOfficeCode(dto.getOfficeCode());
			if (dto.getIsVcrClosed() != null && dto.getIsVcrClosed()) {
				vo.setStatus(StatusRegistration.VcrStatusEnum.CLOSED.getDesc());
			} else {
				vo.setStatus(StatusRegistration.VcrStatusEnum.OPEN.getDesc());
			}
			vcrList.add(vo);
		});
		return vcrList;
	}

	public List<CashBookVO> individualCashBookVcrMapper(List<VcrFinalServiceDTO> dtoList) {
		List<CashBookVO> vcrList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			CashBookVO vo = new CashBookVO();
			if (dto.getVcr() != null) {
				vo.setVcrNo(dto.getVcr().getVcrNumber());
				if (dto.getVcr().getDateOfCheck() != null) {
					vo.setVcrDate(dto.getVcr().getDateOfCheck().toLocalDate());
				}
			}

			if (dto.getRegistration() != null) {
				vo.setRegNo(dto.getRegistration().getRegNo());
			}
			vo.setIssuedBy(dto.getCreatedBy());
			if (dto.getOffencetotal() != null) {
				vo.setCompoundFee(dto.getOffencetotal());
			}

			if (dto.getServiceFee() != null) {
				vo.setServiceFee(dto.getServiceFee());
			}
			if (dto.getPenalty() != null) {
				vo.setPenality(dto.getPenalty());
			}
			if (dto.getTax() != null) {
				vo.setTaxAmount(dto.getTax());
			}
			if (dto.getTaxArrears() != null) {
				vo.setTaxArrears(dto.getTaxArrears());
			}
			if (dto.getPenaltyArrears() != null) {
				vo.setPenalityArrears(dto.getPenaltyArrears());
			}
			vo.setTresuryName(dto.getTresuryName());

			vo.setTresuryAmount(dto.getTresuryAmount());
			if (dto.getChallanDate() != null) {
				vo.setChallanDate(dto.getChallanDate());
			}
			vo.setTotal(vo.getCompoundFee() + vo.getTaxAmount() + vo.getPenality() + vo.getSpFee() + vo.getTpFee()
					+ vo.getServiceFee());
			if (StringUtils.isNotEmpty(dto.getTresuryAmount())) {
				vo.setTotal(vo.getTotal() + Long.parseLong(dto.getTresuryAmount()));
			}
			vcrList.add(vo);
		});
		return vcrList;
	}

	public List<CashBookVO> individualCashBookPermitMapper(List<RegServiceDTO> regServiceDTO) {
		List<CashBookVO> vcrList = new ArrayList<>();
		regServiceDTO.stream().forEach(reg -> {
			CashBookVO vo = new CashBookVO();
			vo.setRegNo(reg.getPrNo());
			if (reg.getOtherStateTemporaryPermitDetails() != null
					&& reg.getOtherStateTemporaryPermitDetails().getTemporaryPermitDetails() != null
					&& reg.getOtherStateTemporaryPermitDetails().getTemporaryPermitDetails().getPermitNo() != null) {
				vo.setVcrNo(reg.getOtherStateTemporaryPermitDetails().getTemporaryPermitDetails().getPermitNo());
			}
			if (reg.getCreatedDate() != null) {
				vo.setVcrDate(reg.getCreatedDate().toLocalDate());
			}
			FeeDetailsDTO feeDetails = reg.getFeeDetails();
			List<FeesDTO> feeList = feeDetails.getFeeDetails();
			if (!CollectionUtils.isEmpty(feeList)) {
				feeList.stream().forEach(fee -> {
					if (fee.getFeesType() != null && fee.getAmount() != null) {
						if (reg.getServiceIds() != null
								&& reg.getServiceIds().contains(ServiceEnum.OTHERSTATESPECIALPERMIT.getId())
								&& fee.getFeesType().equals(ServiceCodeEnum.PERMIT_FEE.getTypeDesc())) {
							vo.setSpFee(fee.getAmount());
						} else if (reg.getServiceIds() != null
								&& reg.getServiceIds().contains(ServiceEnum.OTHERSTATETEMPORARYPERMIT.getId())
								&& fee.getFeesType().equals(ServiceCodeEnum.PERMIT_FEE.getTypeDesc())) {
							vo.setTpFee(fee.getAmount());
						}
						if (fee.getFeesType().equals(ServiceCodeEnum.TAXSERVICEFEE.getTypeDesc())) {
							vo.setServiceFee(vo.getServiceFee() + fee.getAmount());
						} else if (fee.getFeesType().equals(ServiceCodeEnum.PERMIT_SERVICE_FEE.getTypeDesc())) {
							vo.setServiceFee(vo.getServiceFee() + fee.getAmount());
						}

						else if (TaxTypeEnum.getOtherStatePermitTaxTypes().contains(fee.getFeesType())) {
							vo.setTaxAmount(fee.getAmount());
						}
						vo.setTotal(vo.getCompoundFee() + vo.getTaxAmount() + vo.getPenality() + vo.getSpFee()
								+ vo.getTpFee() + vo.getServiceFee());

					}
				});
				vcrList.add(vo);
			}
		});
		return vcrList;
	}

	public void setFeeDetails(List<RegServiceDTO> regServiceDTOList) {
		List<RegServiceDTO> specialPermitsList = regServiceDTOList.stream()
				.filter(reg -> reg.getServiceIds().contains(ServiceEnum.OTHERSTATESPECIALPERMIT.getId()))
				.collect(Collectors.toList());

		List<FeeDetailsDTO> specialPermitFee = specialPermitsList.stream()
				.map(specialPermit -> specialPermit.getFeeDetails()).collect(Collectors.toList());

	}

	public List<VcrFinalServiceVO> reconcilationMapper(List<VcrFinalServiceDTO> dtoList) {
		List<VcrFinalServiceVO> vcrList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			VcrFinalServiceVO vo = new VcrFinalServiceVO();
			if (dto.getVcr() != null) {
				vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
			}
			vo.setOffencetotal(dto.getOffencetotal());
			if (dto.getRegistration() != null) {
				vo.setRegistration(registrationVcrMapper.convertLimited(dto.getRegistration()));
			}
			if (dto.getOwnerDetails() != null) {
				vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
			}
			vo.setIssuedBy(dto.getCreatedBy());
			vo.setIsVcrClosed(dto.getIsVcrClosed());
			vo.setConsolidateUpdated(dto.isConsolidateUpdated());
			if (dto.getTax() != null) {
				vo.setTax(dto.getTax());
			}
			if (dto.getPenalty() != null) {
				vo.setPenalty(dto.getPenalty());
			}

			if (dto.getTaxArrears() != null) {
				vo.setPenaltyArrears(dto.getPenaltyArrears());
			}

			if (dto.getTaxArrears() != null) {
				vo.setTaxArrears(dto.getTaxArrears());
			}
			if (dto.getServiceFee() != null) {
				vo.setServiceFee(dto.getServiceFee());
			}
			if (dto.getReleaseOrderFee() != null) {
				vo.setReleaseOrderFee(dto.getReleaseOrderFee());
			}

			if (dto.getGreenTax() != null) {
				vo.setGreenTax(dto.getGreenTax());
			}

			if (dto.getDeductionMode() != null) {
				vo.setDeductionMode(dto.getDeductionMode());
			}

			if (dto.getVoluntaryMode() != null) {
				vo.setVoluntaryMode(dto.getVoluntaryMode());
			}
			
			if (dto.getChallanDetails() != null) {
				List<ChalanaDetailsVO> challanDetailsVO= new ArrayList<>();
				
				dto.getChallanDetails().forEach(vcrDetails -> {
					ChalanaDetailsVO challanVO = new ChalanaDetailsVO();
					if (vcrDetails != null) {
						if (vcrDetails.getAmount() != null) {
							challanVO.setAmount(vcrDetails.getAmount());
						}
						if (vcrDetails.getApplicationNo() != null) {
							challanVO.setApplicationNo(vcrDetails.getApplicationNo());
						}
						if (vcrDetails.getChallanDate() != null) {
							challanVO.setChallanDate(vcrDetails.getChallanDate());
						}
						if (vcrDetails.getChallanNo() != null) {
							challanVO.setChallanNo(vcrDetails.getChallanNo());
						}
						if (vcrDetails.getTresuryName() != null) {
							challanVO.setTresuryName(vcrDetails.getTresuryName());
						}
						if (vcrDetails.getType() != null) {
							challanVO.setType(vcrDetails.getType());
						}

						challanDetailsVO.add(challanVO);
					}
				});
				vo.setChalanaDetailsVO(challanDetailsVO);
			}
			
			vcrList.add(vo);
		});
		return vcrList;
	}

	@Override
	public VcrFinalServiceDTO convertVO(VcrFinalServiceVO vo) {
		VcrFinalServiceDTO dto = new VcrFinalServiceDTO();

		dto.setVcr(vcrMapper.convertVO(vo.getVcr()));
		dto.setRegistration(registrationVcrMapper.convertVO(vo.getRegistration()));
		dto.setOwnerDetails(ownerDetailsmapper.convertVO(vo.getOwnerDetails()));
		if(vo.getIsSpeedGun()==null) {
			dto.setDriver(driverDetailsMapper.convertVO(vo.getDriver()));
			dto.setVehicleProceeding(vehicleProceedingMapper.convertVO(vo.getVehicleProceeding()));
			dto.setSeizedAndDocumentImpounded(seizedAndDocumentMapper.convertVO(vo.getSeizedAndDocumentImpounded()));
		}
		dto.setOffence(offenceMapper.convertVO(vo.getOffence()));
		if (vo.getOtherSections() != null) {
			dto.setOtherSections(otherSectionMapper.convertVO(vo.getOtherSections()));
		}
		dto.setValidityDetails(validityDetailsMapper.convertVO(vo.getValidityDetailsVo()));
		funPoint(vo.getMviOfficeCode(), dto::setMviOfficeCode);
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getOffencetotal(), dto::setOffencetotal);
		funPoint(vo.getDisposalType(), dto::setDisposalType);
		funPoint(vo.isPartialDisposal(), dto::setPartialDisposal);
		funPoint(vo.isFinalDisposal(), dto::setFinalDisposal);
		funPoint(vo.getOrderNo(), dto::setOrderNo);
		funPoint(vo.getOrderDate(), dto::setOrderDate);
		funPoint(vo.getCourtName(), dto::setCourtName);
		funPoint(vo.getCaseNo(), dto::setCaseNo);
		funPoint(vo.getCollectedDate(), dto::setCollectedDate);
		funPoint(vo.getFineCollected(), dto::setFineCollected);
		funPoint(vo.getPermitNo(), dto::setPermitNo);
		funPoint(vo.getProceedingNo(), dto::setProceedingNo);
		funPoint(vo.getLicenseNo(), dto::setLicenseNo);
		funPoint(vo.getRegistrationNo(), dto::setRegistrationNo);
		funPoint(vo.getProceedingDate(), dto::setProceedingDate);
		funPoint(vo.getPartiallyClosed(), dto::setPartiallyClosed);
		funPoint(vo.getPilledCov(), dto::setPilledCov);
		funPoint(vo.getPilledPermit(), dto::setPilledPermit);
		funPoint(vo.getPilledSeatings(), dto::setPilledSeatings);
		funPoint(vo.getPilledRouteCode(), dto::setPilledRouteCode);
		if(vo.getIsSpeedGun() == null)
			dto.setIsSpeedGun(Boolean.FALSE);
		if (vo.getActions() != null) {
			dto.setActions(actionDetailMapper.convertVO(vo.getActions()));
		}

		funPoint(vo.getUsername(), dto::setUsername);
		funPoint(vo.getPaidDate(), dto::setPaidDate);
		funPoint(vo.isPaymentIntiated(), dto::setPaymentIntiated);
		funPoint(vo.getServiceFee(), dto::setServiceFee);
		funPoint(vo.getTax(), dto::setTax);
		funPoint(vo.getPenalty(), dto::setPenalty);
		funPoint(vo.getTaxArrears(), dto::setTaxArrears);
		funPoint(vo.getPenaltyArrears(), dto::setPenaltyArrears);
		if (vo.getIllicitPlaceDetails() != null && !vo.getIllicitPlaceDetails().isEmpty()) {
			dto.setIllicitPlaceDetails(illicitPlaceDetails.convertVO(vo.getIllicitPlaceDetails()));
		}
		funPoint(vo.getPilledMeasurements(), dto::setPilledMeasurements);
		funPoint(vo.getPilledGoods(), dto::setPilledGoods);
		funPoint(vo.getMviName(), dto::setCreatedBy);
		funPoint(vo.getCfxIssued(), dto::setCfxIssued);
		funPoint(vo.isVehicleHaveAitp(), dto::setVehicleHaveAitp);
		funPoint(vo.getPaymentType(), dto::setPaymentType);
		funPoint(vo.isAnnualTax(), dto::setAnnualTax);
		funPoint(vo.getDesignation(), dto::setDesignation);
		funPoint(vo.getCreatedBy(), dto::setCreatedBy);
		funPoint(vo.getOfficeName(), dto::setOfficeName);
		funPoint(vo.getVehicleSeized(), dto::setVehicleSeized);
		funPoint(vo.getIsVcrClosed(), dto::setIsVcrClosed);
		funPoint(vo.getCess(), dto::setCess);
		funPoint(vo.getTaxValidityForTaxPaid(), dto::setTaxValidityForTaxPaid);
		funPoint(vo.getGreentaxValidityForTaxPaid(), dto::setGreentaxValidityForTaxPaid);
		funPoint(vo.getDeductionMode(), dto::setDeductionMode);
		funPoint(vo.getVoluntaryMode(), dto::setVoluntaryMode);
		funPoint(vo.getIsRoadSafety(), dto::setIsRoadSafety);
		
		if (vo.getSpeedGunVO() != null) {
			dto.setSpeedGunDTO(speedGunConvertEntity(vo.getSpeedGunVO()));
		}
		
		return dto;
	}
	private SpeedGunDTO speedGunConvertEntity(SpeedGunVO vo) {
		SpeedGunDTO dto=new SpeedGunDTO();
		funPoint(vo.getSpeed(), dto::setSpeed);
		funPoint(vo.getSpeedZone(), dto::setSpeedZone);
		return dto;
	}
	
	public List<VcrFinalServiceDTO> limitedFields(List<VcrFinalServiceVO> vo) {
		List<VcrFinalServiceDTO> vcrList = new ArrayList<>();
		vo.stream().forEach(vcr -> {
			VcrFinalServiceDTO dto = new VcrFinalServiceDTO();
			funPoint(vcr.getFineCollected(), dto::setFineCollected);
			dto.setOffencetotal(vcr.getOffencetotal());
			dto.setVcr(vcrMapper.convertVO(vcr.getVcr()));
			vcrList.add(dto);
		});
		return vcrList;
	}

	public VcrFinalServiceDTO convertVoToDto(VcrFinalServiceVO vo,
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclosure, JwtUser jwtUser) throws Exception {

		VcrFinalServiceDTO dto = this.convertVO(vo);

		/**
		 * setting base entity value
		 */
		if(dto.getRegistration()!=null) {
			if(dto.getRegistration().getTaxCalculationDateForQuarterlyTax()!=null && 
					dto.getRegistration().getTaxCalculationDateForQuarterlyTax().isAfter(LocalDate.now())) {
				throw new Exception("Tax calculation date should not be future date.");
			}
			if(dto.getRegistration().getTaxCalculationDateForLifeTax()!= null &&
					dto.getRegistration().getTaxCalculationDateForLifeTax().isAfter(LocalDate.now())) {
				throw new Exception("Tax calculation date should not be future date.");
			}
		}
		dto.setCreatedBy(jwtUser.getUsername());
		dto.setCreatedDate(LocalDateTime.now());
		dto.setlUpdate(LocalDateTime.now());
		dto.setModifiedBy(jwtUser.getUsername());
		dto.setModifiedDate(LocalDateTime.now());
		dto.setOfficeCode(jwtUser.getOfficeCode());
		Optional<OfficeDTO> office = officeDAO.findByOfficeCodeAndIsActiveTrue(jwtUser.getOfficeCode());
		if (office.isPresent()) {
			dto.setOfficeName(office.get().getOfficeName());
		}
		if(vo.getIsSpeedGun()==null) {
			this.validationsForillicetPlaces(vo);
		}
		
		if (enclosure != null) {

			/*
			 * enclosure.stream().findFirst().get().getValue().forEach(geo -> {
			 * 
			 * geo.setLatitude(vo.getSeizedAndDocumentImpounded().getVehicleSeizedVO().
			 * getLatitude());
			 * geo.setLongitude(vo.getSeizedAndDocumentImpounded().getVehicleSeizedVO().
			 * getLongitude()); });
			 * dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO().setEnclosures(
			 * enclosure);
			 */
			enclosure.forEach(r -> {

				if ("vehicleSeized".equals(r.getKey())) {
					List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures_t = new ArrayList<>();
					r.getValue().forEach(seized -> {
						seized.setLatitude(vo.getSeizedAndDocumentImpounded().getVehicleSeizedVO().getLatitude());
						seized.setLongitude(vo.getSeizedAndDocumentImpounded().getVehicleSeizedVO().getLongitude());
					});
					KeyValue<String, List<ImageEnclosureDTO>> ky = new KeyValue<String, List<ImageEnclosureDTO>>(
							r.getKey(), r.getValue());
					enclosures_t.add(ky);
					dto.getSeizedAndDocumentImpounded().getVehicleSeizedDTO().setEnclosures(enclosures_t);
				}
				if ("otherSection1".equals(r.getKey())) {
					List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures_t1 = new ArrayList<>();
					r.getValue().forEach(other -> {
						other.setLatitude(vo.getOtherSections().get(0).getLatitude());
						other.setLongitude(vo.getOtherSections().get(0).getLongitude());
					});
					KeyValue<String, List<ImageEnclosureDTO>> ky = new KeyValue<String, List<ImageEnclosureDTO>>(
							r.getKey(), r.getValue());
					enclosures_t1.add(ky);
					dto.getOtherSections().get(0).setEnclosures(enclosures_t1);
				}
				if ("otherSection2".equals(r.getKey())) {

					List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures_t2 = new ArrayList<>();
					r.getValue().forEach(other -> {
						other.setLatitude(vo.getOtherSections().get(1).getLatitude());
						other.setLongitude(vo.getOtherSections().get(1).getLongitude());
					});
					KeyValue<String, List<ImageEnclosureDTO>> ky = new KeyValue<String, List<ImageEnclosureDTO>>(
							r.getKey(), r.getValue());
					enclosures_t2.add(ky);
					dto.getOtherSections().get(1).setEnclosures(enclosures_t2);

				}
			});
		}

		vo.getOffence().getOffence().forEach(offence -> {
			if (offence.getOffenceDescription() != null && offence.getOffenceDescription().equals(VcrConstent.OVERLOAD))
				this.checkingOverloadOffence(dto, offence);

			if (offence.getOffenceDescription() != null
					&& offence.getOffenceDescription().equals(VcrConstent.CARRING_PASSENGERS))
				dto.getOffence().getOffence().forEach(passenger -> {
					if (passenger.getOffenceDescription().equals(VcrConstent.CARRING_PASSENGERS))
						passenger.setNoOfPersons(offence.getNoOfPersons());
				});

		});

		return dto;

	}

	public void checkingOverloadOffence(VcrFinalServiceDTO finalServiceDTO, OffenceVO finalServiceVO) {
		finalServiceDTO.getOffence().getOffence().forEach(overLoad -> {
			if (overLoad.getOffenceDescription() != null
					&& overLoad.getOffenceDescription().equals(VcrConstent.OVERLOAD))
				overLoad.setOverLoadDesc(overLoadMapper.changeVoToDTO(finalServiceVO.getOverLoadDesc()));

		});

	}

	/**
	 * this method is used to get Unique number
	 * 
	 * @param officeCode
	 * @return
	 */
	public String getVcrNumber(String officeCode) {
	/*	int year = Calendar.getInstance().get(Calendar.YEAR);
		Format formatter = new SimpleDateFormat("MMM");
		String month = formatter.format(new Date());
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = Calendar.getInstance().get(Calendar.SECOND);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		int mnthDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int number = genUniqueNumber(mnthDay);
		String vcrNumber = officeCode + "/" + month + year + "/" + number + second + day + hour + minute;*/
		Map<String, String> officeCodeMap = new TreeMap<>();
		officeCodeMap.put("officeCode", officeCode);
		String vcrNumber = sequenceGenerator.getSequence(String.valueOf(Sequence.VCR.getSequenceId()), officeCodeMap);
		logger.warn("vcrNumber generated [{}]", vcrNumber);
		return vcrNumber;

	}

	private int genUniqueNumber(int mnthDay) {

		if (dayChk == mnthDay) {
			return ++i;
		} else {
			dayChk = mnthDay;
			return i = 0;
		}
		/*
		 * int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1); int number =
		 * genHelper(); logger.warn("IIIII [{}]", number); return "" + randomNum +
		 * number;
		 */
	}

	private int genHelper() {

		if (i >= 500) {
			logger.warn("i value reach:- [{}]", i);

			i = 1;
		}

		logger.warn("i value :- [{}]", i);

		return ++i;
	}

	private void validationsForillicetPlaces(VcrFinalServiceVO vo) throws Exception {
		if (vo.getRegistration() == null || vo.getRegistration().getClasssOfVehicle() == null
				|| StringUtils.isBlank(vo.getRegistration().getClasssOfVehicle().getCovcode())) {
			throw new Exception("please pass appropriate JSON format.");
		}
		String vehicleCov = vo.getRegistration().getClasssOfVehicle().getCovcode();
		if (StringUtils.isBlank(vo.getPilledCov())) {
			if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.COCT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
				if (vo.getIllicitPlaceDetails().size() == 1) {
					vo.getIllicitPlaceDetails().stream().findFirst().get().setPointToPoint(Boolean.TRUE);
				} else {
					vo.getIllicitPlaceDetails().forEach(id -> id.setBetweenStages(Boolean.TRUE));
				}
			} else if ((vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.OBT.getCovCode())
					|| vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.OBPN.getCovCode()))
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.MAXT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MCRN.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.COCT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MCRN.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.MAXT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MCRN.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MTLT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.MAXT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MTLT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.MAXT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.EIBT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.GCRT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.PSVT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.SCRT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.PSVT.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.MAXT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			} else if (vehicleCov.equalsIgnoreCase(ClassOfVehicleEnum.TTRN.getCovCode())
					&& vo.getPilledCov().equalsIgnoreCase(ClassOfVehicleEnum.TTTT.getCovCode())) {
				this.throwAnErrorForillicetPlaces(vo);
			}
		}
	}

	private void throwAnErrorForillicetPlaces(VcrFinalServiceVO vo) throws Exception {
		if (vo.getIllicitPlaceDetails() == null || vo.getIllicitPlaceDetails().isEmpty()) {
			throw new Exception("Please provide illicet Places details");
		}

	}

	public List<EnforcementVcrVO> vcrEnforcementMapper(List<VcrFinalServiceDTO> vcrList) {
		List<EnforcementVcrVO> vcrEnforcementList = new ArrayList<EnforcementVcrVO>();
		vcrList.stream().forEach(vcr -> {
			EnforcementVcrVO enforcementVO = new EnforcementVcrVO();
			if (vcr.getOffencetotal() != null) {
				enforcementVO.setCfAmount(vcr.getOffencetotal());
			}
			if (vcr.getRegistration() != null && vcr.getRegistration().getClasssOfVehicle() != null
					&& vcr.getRegistration().getClasssOfVehicle().getCovdescription() != null) {
				enforcementVO.setClassOfVehicle(vcr.getRegistration().getClasssOfVehicle().getCovdescription());
			}
			enforcementVO.setOfficeCode(vcr.getOfficeCode());
			if (vcr.getPenalty() != null) {
				enforcementVO.setPenality(vcr.getPenalty());
			}
			if (vcr.getTax() != null) {
				enforcementVO.setTaxAmount(vcr.getTax());
			}
			if (vcr.getIsVcrClosed()) {
				enforcementVO.setStatus(StatusRegistration.VcrStatusEnum.CLOSED.getDesc());
			} else {
				enforcementVO.setStatus(StatusRegistration.VcrStatusEnum.OPEN.getDesc());
			}

			if (vcr.getRegistration() != null && vcr.getRegistration().getSeatingCapacity() != null) {
				enforcementVO.setSeatingCapacity(vcr.getRegistration().getSeatingCapacity());
			}

			if (vcr.getRegistration() != null && StringUtils.isNotEmpty(vcr.getRegistration().getRegNo())) {
				enforcementVO.setRegNo(vcr.getRegistration().getRegNo());
			} else if (vcr.getRegistration() != null && StringUtils.isNotEmpty(vcr.getRegistration().getTrNo())) {
				enforcementVO.setRegNo(vcr.getRegistration().getTrNo());
			}
			if (vcr.getVcr() != null && vcr.getVcr().getDateOfCheck().toLocalDate() != null) {
				enforcementVO.setBookedDate(vcr.getVcr().getDateOfCheck().toLocalDate());
			}
			if (vcr.getOffence() != null && !CollectionUtils.isEmpty(vcr.getOffence().getOffence())) {
				enforcementVO.setOffence(vcr.getOffence().getOffence().stream().map(val -> val.getOffenceDescription())
						.collect(Collectors.toList()));
			}
			if (vcr.getVcr() != null) {
				enforcementVO.setVcrNo(vcr.getVcr().getVcrNumber());
			}

			enforcementVO.setMviName(vcr.getCreatedBy());
			enforcementVO
					.setTotal(enforcementVO.getCfAmount() + enforcementVO.getTaxAmount() + enforcementVO.getPenality());
			vcrEnforcementList.add(enforcementVO);

		});
		return vcrEnforcementList;
	}
	
	public VcrDeleteDetailsDTO convertVOTODelete(VcrFinalServiceVO vo) {
		VcrDeleteDetailsDTO dto = new VcrDeleteDetailsDTO();

		dto.setVcr(vcrMapper.convertVO(vo.getVcr()));
		dto.setRegistration(registrationVcrMapper.convertVO(vo.getRegistration()));
		dto.setOwnerDetails(ownerDetailsmapper.convertVO(vo.getOwnerDetails()));
		dto.setDriver(driverDetailsMapper.convertVO(vo.getDriver()));
		dto.setVehicleProceeding(vehicleProceedingMapper.convertVO(vo.getVehicleProceeding()));
		dto.setOffence(offenceMapper.convertVO(vo.getOffence()));
		dto.setSeizedAndDocumentImpounded(seizedAndDocumentMapper.convertVO(vo.getSeizedAndDocumentImpounded()));
		if (vo.getOtherSections() != null) {
			dto.setOtherSections(otherSectionMapper.convertVO(vo.getOtherSections()));
		}
		dto.setValidityDetails(validityDetailsMapper.convertVO(vo.getValidityDetailsVo()));
		funPoint(vo.getMviOfficeCode(), dto::setMviOfficeCode);
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getOffencetotal(), dto::setOffencetotal);
		funPoint(vo.getDisposalType(), dto::setDisposalType);
		funPoint(vo.isPartialDisposal(), dto::setPartialDisposal);
		funPoint(vo.isFinalDisposal(), dto::setFinalDisposal);
		funPoint(vo.getOrderNo(), dto::setOrderNo);
		funPoint(vo.getOrderDate(), dto::setOrderDate);
		funPoint(vo.getCourtName(), dto::setCourtName);
		funPoint(vo.getCaseNo(), dto::setCaseNo);
		funPoint(vo.getCollectedDate(), dto::setCollectedDate);
		funPoint(vo.getFineCollected(), dto::setFineCollected);
		funPoint(vo.getPermitNo(), dto::setPermitNo);
		funPoint(vo.getProceedingNo(), dto::setProceedingNo);
		funPoint(vo.getLicenseNo(), dto::setLicenseNo);
		funPoint(vo.getRegistrationNo(), dto::setRegistrationNo);
		funPoint(vo.getProceedingDate(), dto::setProceedingDate);
		funPoint(vo.getPartiallyClosed(), dto::setPartiallyClosed);
		funPoint(vo.getPilledCov(), dto::setPilledCov);
		funPoint(vo.getPilledPermit(), dto::setPilledPermit);
		funPoint(vo.getPilledSeatings(), dto::setPilledSeatings);
		funPoint(vo.getPilledRouteCode(), dto::setPilledRouteCode);
		if (vo.getActions() != null) {
			dto.setActions(actionDetailMapper.convertVO(vo.getActions()));
		}

		funPoint(vo.getUsername(), dto::setUsername);
		funPoint(vo.getPaidDate(), dto::setPaidDate);
		funPoint(vo.isPaymentIntiated(), dto::setPaymentIntiated);
		funPoint(vo.getServiceFee(), dto::setServiceFee);
		funPoint(vo.getTax(), dto::setTax);
		funPoint(vo.getPenalty(), dto::setPenalty);
		funPoint(vo.getTaxArrears(), dto::setTaxArrears);
		funPoint(vo.getPenaltyArrears(), dto::setPenaltyArrears);
		if (vo.getIllicitPlaceDetails() != null && !vo.getIllicitPlaceDetails().isEmpty()) {
			dto.setIllicitPlaceDetails(illicitPlaceDetails.convertVO(vo.getIllicitPlaceDetails()));
		}
		funPoint(vo.getPilledMeasurements(), dto::setPilledMeasurements);
		funPoint(vo.getPilledGoods(), dto::setPilledGoods);
		funPoint(vo.getMviName(), dto::setCreatedBy);
		funPoint(vo.getCfxIssued(), dto::setCfxIssued);
		funPoint(vo.isVehicleHaveAitp(), dto::setVehicleHaveAitp);
		funPoint(vo.getPaymentType(), dto::setPaymentType);
		funPoint(vo.isAnnualTax(), dto::setAnnualTax);
		funPoint(vo.getDesignation(), dto::setDesignation);
		funPoint(vo.getCreatedBy(), dto::setCreatedBy);
		funPoint(vo.getOfficeName(), dto::setOfficeName);
		funPoint(vo.getVehicleSeized(), dto::setVehicleSeized);
		funPoint(vo.getIsVcrClosed(), dto::setIsVcrClosed);
		funPoint(vo.getCess(), dto::setCess);
		funPoint(vo.getTaxValidityForTaxPaid(), dto::setTaxValidityForTaxPaid);
		funPoint(vo.getGreentaxValidityForTaxPaid(), dto::setGreentaxValidityForTaxPaid);
		funPoint(vo.getDeductionMode(), dto::setDeductionMode);
		funPoint(vo.getVoluntaryMode(), dto::setVoluntaryMode);
		funPoint(vo.isDeleteVcrConfirmation(), dto::setDeleteVcrConfirmation);
		funPoint(vo.getPaymentDone(),dto::setPaymentDone);
		funPoint(vo.getErrorMsg(), dto::setErrorMsg);
		funPoint(vo.getIsRoadSafety(), dto::setIsRoadSafety);
		return dto;
	}
	
	public VCRNonPaymentDetailsVO convertVcrNonPayment(VcrFinalServiceDTO vcrFinalServiceDTO){
		VCRNonPaymentDetailsVO vCRNonPaymentDetailsVO = new VCRNonPaymentDetailsVO();
		funPoint(vcrFinalServiceDTO.getOfficeCode(), vCRNonPaymentDetailsVO::setOfficeCode);
		funPoint(vcrFinalServiceDTO.getCreatedDate(), vCRNonPaymentDetailsVO::setCreatedDate);
		funPoint(vcrFinalServiceDTO.getCreatedBy(), vCRNonPaymentDetailsVO::setVcrIssuedBy);
		funPoint(vcrFinalServiceDTO.getOffencetotal(), vCRNonPaymentDetailsVO::setOffencetotal);
		funPoint(vcrFinalServiceDTO.getIsScNoVcr(), vCRNonPaymentDetailsVO::setIsScNoVcr);
		funPoint(vcrFinalServiceDTO.getIsScNoVcrIssuedBy(), vCRNonPaymentDetailsVO::setIsScNoVcrIssuedBy);
		vCRNonPaymentDetailsVO.setPaymentStatus(StatusRegistration.PAYMENTPENDING.getDescription());
		if(vcrFinalServiceDTO.getRegistration()!=null){
			registrationVcrMapper.convertVcrNonPaymentReg(vCRNonPaymentDetailsVO,vcrFinalServiceDTO.getRegistration());
		}
		if(vcrFinalServiceDTO.getOwnerDetails()!=null){
			ownerDetailsmapper.convertVcrNonPaymentOwner(vCRNonPaymentDetailsVO,vcrFinalServiceDTO.getOwnerDetails());
		}
		if(vcrFinalServiceDTO.getVcr()!=null){
			vcrMapper.convertVcrNonPayment(vCRNonPaymentDetailsVO,vcrFinalServiceDTO.getVcr());
		}
		return vCRNonPaymentDetailsVO;
	}
	
	public List<VCRNonPaymentDetailsVO> convertEntityLimitedList(List<VcrFinalServiceDTO> vcrFinalServiceDTOList){
		  return vcrFinalServiceDTOList.stream().map(e -> convertVcrNonPayment(e)).collect(Collectors.toList());
		}
	
	public ReportsVO convertDistrictViceVcrCount(List<VcrFinalServiceDTO> dtoList,List<String> distinctMVI,List<UserDTO>  users ,List<String> listOfOffices) throws BadRequestException{
			List<VcrFinalServiceVO> vcrList = new ArrayList<>();
			ReportsVO finalReport = new ReportsVO();
			 long totalVcrCount=0l;
			 double totalTax=0l;
			 long totalPenalty=0l;
			 double totalTaxArrears=0l;
			 long totalPenaltyArrears=0l;
			 double totalPaidCf=0l;
			 double totalUnPaidCf=0l;
			 double finalTotal = 0l;
			 
			 double paidTotalTax=0l;
			 long paidTotalPenalty=0l;
			 double paidTotalTaxArrears=0l;
			 long paidTotalPenaltyArrears=0l;
			 double paidFinalTotal = 0l;
			 int paidRecordsCount = 0;
			 
			List<String> listOfMvis =null;
			List<UserDTO> lisOfMasterUsers = users.stream().filter(id->distinctMVI.stream().noneMatch(one->one.equalsIgnoreCase(id.getUserId()))).collect(Collectors.toList());
					if(lisOfMasterUsers!=null && !lisOfMasterUsers.isEmpty()) {
						 listOfMvis =lisOfMasterUsers.stream().map(UserDTO::getUserId).collect(Collectors.toList());
						distinctMVI.addAll(listOfMvis);
					}
			for(String mviName:distinctMVI){
				ReportVO reportVo = new ReportVO();
				Optional<UserDTO> userData = userDAO.findByUserId(mviName);
				if(!userData.isPresent()) {
					throw new BadRequestException("User data not found for user Id: "+mviName);
				}
				String firstName=userData.get().getFirstName()!=null?userData.get().getFirstName():"";
				String lastName=userData.get().getLastName()!=null?userData.get().getLastName():"";
				String finalName=userData.get().getUserId()+":"+firstName+" "+lastName;
				 
				
				List<VcrFinalServiceDTO> vcrListDto = dtoList.stream().filter(one->one.getCreatedBy().equalsIgnoreCase(mviName)).collect(Collectors.toList());
				if(vcrListDto!=null && !vcrListDto.isEmpty()) {
					reportVo.setMviName(finalName);
					reportVo.setVcrList(this.returnVcrList(vcrListDto,reportVo));
				}else {
					/*if(!distinctMVI.stream().anyMatch(districtsingleMvi->users.stream().anyMatch(masterUser->masterUser.getUserId().equalsIgnoreCase(districtsingleMvi)))) {
						continue;
					}*/
					if(!listOfOffices.stream().anyMatch(id->id.equalsIgnoreCase(userData.get().getOffice().getOfficeCode())) || !userData.get().isStatus()) {
						continue;
					}
					reportVo.setMviName(finalName);
					reportVo.setCount(0);
					reportVo.setTotalPiadCf(0);
					reportVo.setTotalUnPiadCf(0);
					reportVo.setTaxAmount(0);
					reportVo.setPenalty(0l);
					reportVo.setTaxArrears(0d);
					reportVo.setPenaltyArrears(0l);
					reportVo.setMviTotalAmount(0d);
				}
				totalVcrCount=totalVcrCount+reportVo.getCount();
				totalTax = totalTax+reportVo.getTaxAmount();
				totalPenalty = totalPenalty+reportVo.getPenalty();
				totalTaxArrears=totalTaxArrears+reportVo.getTaxArrears();
				totalPenaltyArrears = totalPenaltyArrears+reportVo.getPenaltyArrears();
				totalPaidCf=totalPaidCf+reportVo.getTotalPiadCf();
				totalUnPaidCf=totalUnPaidCf+reportVo.getTotalUnPiadCf();
				finalTotal = finalTotal+reportVo.getMviTotalAmount();
				
				 paidTotalTax=paidTotalTax+reportVo.getPaidTaxAmount();
				  paidTotalPenalty=paidTotalPenalty+reportVo.getPaidpenalty();
				  paidTotalTaxArrears=paidTotalTaxArrears+reportVo.getPaidTaxArrears();
				  paidTotalPenaltyArrears=paidTotalPenaltyArrears+reportVo.getPaidPenaltyArrears();
				  paidRecordsCount= paidRecordsCount+reportVo.getPaidRecordsCount();
				  paidFinalTotal = paidFinalTotal+reportVo.getPaidMviCount();
				
				if(finalReport.getReport()==null) {
					List<ReportVO> listReport = new ArrayList<>();
					listReport.add(reportVo);
					finalReport.setReport(listReport);
				}else {
					finalReport.getReport().add(reportVo);
				}
				
			}
			if(finalReport!=null && finalReport.getReport()!=null && !finalReport.getReport().isEmpty()) {
				finalReport.getReport().sort((p2,p1)->Long.compare(p1.getCount(), p2.getCount()));
			}
			finalReport.setTotalVcrCount(totalVcrCount);
			
			ReportVO reportVo = new ReportVO();
			vcrList=this.returnVcrList(dtoList,reportVo);
			finalReport.setVcrList(vcrList);
			
			finalReport.setTotalTax(totalTax);
			finalReport.setTotalPenalty(totalPenalty);
			finalReport.setTotalTaxArrears(totalTaxArrears);
			finalReport.setTotalPenaltyArrears(totalPenaltyArrears);
			finalReport.setTotalPaidCf(totalPaidCf);
			finalReport.setTotalUnPaidCf(totalUnPaidCf);
			finalReport.setFinalTotal(finalTotal);
			
			finalReport.setPaidTotalTaxAmount(paidTotalTax);
			finalReport.setPaidTotalpenalty(paidTotalPenalty);
			finalReport.setPaidTotalTaxArrears(paidTotalTaxArrears);
			finalReport.setPaidTotalPenaltyArrears(paidTotalPenaltyArrears);
			finalReport.setPaidfinalTotal(paidFinalTotal);
			finalReport.setPaidTotalRecordsCount(paidRecordsCount);
			return finalReport;

		}
		
		private List<VcrFinalServiceVO> returnVcrList(List<VcrFinalServiceDTO> dtoList,ReportVO reportVo) {
			List<VcrFinalServiceVO> vcrList = new ArrayList<>();
			 double taxAmount=0d;
			 Long penalty=0l;
			 Double taxArrears=0d;
			 Long penaltyArrears=0l;
			double totalCf=0d;
			
			int totalPaidRecords=0;
			 
			 double paidTaxAmount=0d;
			 Long paidpenalty=0l;
			 double paidTaxArrears=0d;
			 Long paidPenaltyArrears=0l;
			for(VcrFinalServiceDTO dto :dtoList) {
			
				VcrFinalServiceVO vo = new VcrFinalServiceVO();
				if (dto.getVcr() != null) {
					vo.setVcr(vcrMapper.convertEntity(dto.getVcr()));
				}
				if (dto.getRegistration() != null) {
					vo.setRegistration(registrationVcrMapper.convertLimited(dto.getRegistration()));
				}
				if (dto.getOwnerDetails() != null) {
					vo.setOwnerDetails(ownerDetailsmapper.convertEntity(dto.getOwnerDetails()));
				}
				if (dto.getOffence() != null) {
					vo.setOffence(offenceMapper.convertLimited(dto.getOffence()));
				}

				if (!CollectionUtils.isEmpty(dto.getChallanDetails())) {
					vo.setChallanNo(
							dto.getChallanDetails().stream().map(val -> val.getChallanNo()).collect(Collectors.toList()));
				}
				vo.setIssuedBy(dto.getCreatedBy());
				vo.setOfficeCode(dto.getOfficeCode());
				vo.setIsVcrClosed(dto.getIsVcrClosed());
				if (dto.getVehicleSeized() != null && dto.getVehicleSeized()) {
					vo.setActionTaken("Seized");
				} /*
					 * else if (dto.getSeizedAndDocumentImpounded() != null &&
					 * dto.getSeizedAndDocumentImpounded().getDocumentImpoundedDTO() != null) {
					 * vo.setActionTaken("Impounded"); }
					 */ else if (dto.getOffencetotal() != null && dto.getPaidDate() != null) {
					vo.setActionTaken("CF Paid");
				}

				vo.setCompoundFee(0);
				vo.setTax(0d);
				vo.setTaxArrears(0d);
				vo.setPenalty(0L);
				vo.setPenaltyArrears(0L);
				if (dto.getOffencetotal() != null) {
					vo.setCompoundFee(dto.getOffencetotal());
				}

				if (dto.getReleaseOrderFee() != null) {
					int cf = (int) (vo.getCompoundFee() + dto.getReleaseOrderFee());
					vo.setCompoundFee(cf);
				}
				if((dto.getDeductionMode()!=null && dto.getDeductionMode())||dto.getRegistration().isOtherState()|| dto.getRegistration().isUnregisteredVehicle()) {
				if (dto.getTax() != null) {
					vo.setTax(dto.getTax());
				}
				if (dto.getPenalty() != null) {
					vo.setPenalty(dto.getPenalty());
				}
				if (dto.getServiceFee() != null) {
					vo.setServiceFee(dto.getServiceFee());
				}
				if (dto.getPenaltyArrears() != null) {
					vo.setPenaltyArrears(dto.getPenaltyArrears());
				}
				if (dto.getTaxArrears() != null) {
					vo.setTaxArrears(dto.getTaxArrears());
				}
				}
				totalCf =totalCf+vo.getCompoundFee();
				 taxAmount=taxAmount+vo.getTax();
				 penalty=penalty+vo.getPenalty();
				 taxArrears=taxArrears+vo.getTaxArrears();
				 penaltyArrears=penaltyArrears+vo.getPenaltyArrears();
				
				vo.setTotal(
						vo.getTax() + vo.getTaxArrears() + vo.getPenalty() + vo.getPenaltyArrears() + vo.getCompoundFee());

				if (!CollectionUtils.isEmpty(dto.getChallanDetails())) {
					Optional<ChalanaDetailsDTO> challanDate = dto.getChallanDetails().stream()
							.filter(coll -> coll.getChallanDate() != null).findFirst();
					if (challanDate.isPresent()) {
						vo.setChallanDate(challanDate.get().getChallanDate());
					}
				}

				if (dto.getPaidDate() != null) {
					vo.setPaidDate(dto.getPaidDate());
				}

				if (dto.getFineCollected() != null) {
					vo.setFineCollected(dto.getFineCollected());
				}

				if (dto.getPaidDate() != null && StringUtils.isNotEmpty(dto.getPaymentType())
						&& dto.getPaymentType().equals(GatewayTypeEnum.CASH.getDescription())) {
					vo.setStatus(
							StatusRegistration.VcrEnum.PAID.getDesc() + "(" + GatewayTypeEnum.CASH.getDescription() + ")");
					totalPaidRecords = totalPaidRecords+1;
					paidTaxAmount=paidTaxAmount+vo.getTax();
					paidpenalty=paidpenalty+vo.getPenalty();
					paidTaxArrears=paidTaxArrears+vo.getTaxArrears();
					paidPenaltyArrears=paidPenaltyArrears+vo.getPenaltyArrears();
				} else if (dto.getPaidDate() != null && StringUtils.isNotEmpty(dto.getPaymentType())) {
					vo.setStatus(StatusRegistration.VcrEnum.PAID.getDesc() + "(" + "ONLINE" + ")");
					totalPaidRecords = totalPaidRecords+1;
					paidTaxAmount=paidTaxAmount+vo.getTax();
					paidpenalty=paidpenalty+vo.getPenalty();
					paidTaxArrears=paidTaxArrears+vo.getTaxArrears();
					paidPenaltyArrears=paidPenaltyArrears+vo.getPenaltyArrears();
				}

				else if (dto.getPaidDate() != null) {
					vo.setStatus(StatusRegistration.VcrEnum.PAID.getDesc());
					totalPaidRecords = totalPaidRecords+1;
					paidTaxAmount=paidTaxAmount+vo.getTax();
					paidpenalty=paidpenalty+vo.getPenalty();
					paidTaxArrears=paidTaxArrears+vo.getTaxArrears();
					paidPenaltyArrears=paidPenaltyArrears+vo.getPenaltyArrears();

				} else {
					vo.setStatus(StatusRegistration.VcrEnum.UNPAID.getDesc());
				}

				if (dto.getIsVcrClosed() != null && dto.getIsVcrClosed()) {
					vo.setVcrStatus(StatusRegistration.VcrStatusEnum.CLOSED.getDesc());
				} else {
					vo.setVcrStatus(StatusRegistration.VcrStatusEnum.OPEN.getDesc());
				}
				vo.setRecieptNo(dto.getRecieptNo());

				vcrList.add(vo);
			}
			reportVo.setCount(dtoList.size());
			reportVo.setTotalCf(totalCf);
			reportVo.setTaxAmount(taxAmount);
			reportVo.setPenalty(penalty);
			reportVo.setTaxArrears(taxArrears);
			reportVo.setPenaltyArrears(penaltyArrears);
			
			reportVo.setPaidTaxAmount(paidTaxAmount);
			reportVo.setPaidpenalty(paidpenalty);
			reportVo.setPaidTaxArrears(paidTaxArrears);
			reportVo.setPaidPenaltyArrears(paidPenaltyArrears);
			reportVo.setPaidRecordsCount(totalPaidRecords);
			reportVo.setPaidMviCount(totalCf+paidTaxAmount+paidpenalty+paidTaxArrears+paidPenaltyArrears);
			return vcrList;
		}
		
		
		public ReportVO convertRoadSafetyVcrCount(List<VcrFinalServiceDTO> dtoList, Integer districtId)
				throws BadRequestException {
			
			DBObject dbObject = new BasicDBObject("isRoadSafety", new BasicDBObject("$eq", Boolean.TRUE));
			List<String> findByQuery = mongoTemplate.getCollection("master_vcr_offences").distinct("offenceDescription",
					dbObject);
			findByQuery.sort((p1, p2) -> p1.compareTo(p2));

			List<OfficeDTO> officeList = officeDAO.findBydistrict(districtId);
			List<VcrFinalServiceDTO> vcrListDto = new ArrayList<>();
			for (VcrFinalServiceDTO vcrDto : dtoList) {
				if (officeList.stream().anyMatch(one -> one.getOfficeCode().equalsIgnoreCase(vcrDto.getMviOfficeCode()))) {
					vcrListDto.add(vcrDto);
				}
			}
			if (vcrListDto == null || vcrListDto.isEmpty())  {
				throw new BadRequestException("No Vcr Data Found ");
			}
			
			ReportVO reportVo = this.returnVcrRoadSafetyList(vcrListDto, findByQuery);
			reportVo.setDistrictId(districtId);
			return reportVo;
		}

		private ReportVO returnVcrRoadSafetyList(List<VcrFinalServiceDTO> dtoList,
				List<String> findByQuery) {
			Long grandTotal = 0l;
			Map<String, List<VcrFinalServiceDTO>> groupingMap = dtoList.stream()
					.collect(Collectors.groupingBy(VcrFinalServiceDTO::getCreatedBy));
			List<ReportVO> finalList = new ArrayList<>();
			List<ReportVO> offenceList = this.setOffenceCountasZero(findByQuery);
			for (String MviName : groupingMap.keySet()) {
				Long mviCount = 0l;
				ReportVO userReportVo = new ReportVO();
				List<ReportVO> vcrReport = new ArrayList<>();
				List<ReportVO> userReportList = new ArrayList<>();
				String finalMviName = this.getMviName(MviName);
				userReportVo.setMviName(finalMviName);
				List<VcrFinalServiceDTO> listOfDto = groupingMap.get(MviName);
				for (String offence : findByQuery) {
					ReportVO offenceReportVo = new ReportVO();
					List<VcrFinalServiceDTO> listOfOffence = new ArrayList<>();
					for (VcrFinalServiceDTO userData : listOfDto) {
						if (userData.getOffence().getOffence().stream()
								.anyMatch(one -> one.getOffenceDescription().equalsIgnoreCase(offence))) {
							listOfOffence.add(userData);
						}
					}
					offenceReportVo.setOffenceDesc(offence);
					if (listOfOffence != null && !listOfOffence.isEmpty()) {
						listOfOffence.stream().forEach(one -> {
							ReportVO singlevcrReport = new ReportVO();
							singlevcrReport.setOffenceDesc(offence);
							singlevcrReport.setVcrNo(one.getVcr().getVcrNumber());
							singlevcrReport.setDateOfCheck(one.getVcr().getDateOfCheck());
							vcrReport.add(singlevcrReport);
						});
						this.getTotalOffenceCount(offenceList, offence, listOfOffence.size());
						offenceReportVo.setOffenceCount(listOfOffence.size());
						mviCount = mviCount + listOfOffence.size();
						grandTotal=grandTotal+listOfOffence.size();

					} else {
						offenceReportVo.setOffenceCount(0);
					}

					userReportList.add(offenceReportVo);
				}
				userReportVo.setCcpPermit(vcrReport);
				userReportVo.setReport(userReportList);
				userReportVo.setTotalCount(mviCount);
				finalList.add(userReportVo);

			}
			ReportVO reportVo = new ReportVO();
			reportVo.setReport(finalList);
			reportVo.setTotaloffenceCount(offenceList);
			reportVo.setGrandTotal(grandTotal);
			return reportVo;
		}

		public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
			Map<Object, Boolean> map = new ConcurrentHashMap<>();
			return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
		}

		public ReportVO convertRoadSafetyVcrDistrictCount(List<VcrFinalServiceDTO> dtoList, List<DistrictDTO> districtDTO)
				throws BadRequestException {
			DBObject dbObject = new BasicDBObject("isRoadSafety", new BasicDBObject("$eq", Boolean.TRUE));
			List<String> findByQuery = mongoTemplate.getCollection("master_vcr_offences").distinct("offenceDescription",
					dbObject);
			findByQuery.sort((p1, p2) -> p1.compareTo(p2));
			districtDTO.sort((p1, p2) -> p1.getDistrictName().compareTo(p2.getDistrictName()));
			return this.returnVcrRoadSafetyDistrict(dtoList, findByQuery,
					districtDTO);
			
		}

		private ReportVO returnVcrRoadSafetyDistrict(List<VcrFinalServiceDTO> dtoList,
				List<String> findByQuery, List<DistrictDTO> districtDTO) {
			Long grandTotal = 0l;
			List<ReportVO> finalList = new ArrayList<>();
			List<ReportVO> offenceList = this.setOffenceCountasZero(findByQuery);
			for (DistrictDTO district : districtDTO) {
				Long districtCount = 0l;
				ReportVO districtReportVo = new ReportVO();
				districtReportVo.setDistrictName(district.getDistrictName());
				districtReportVo.setDistrictId(district.getDistrictId());
				List<OfficeDTO> officeList = officeDAO.findBydistrict(district.getDistrictId());
				List<VcrFinalServiceDTO> vcrListDto = new ArrayList<>();
				for (VcrFinalServiceDTO vcrDto : dtoList) {
					if (officeList.stream().anyMatch(one -> one.getOfficeCode().equalsIgnoreCase(vcrDto.getMviOfficeCode()))) {
						vcrListDto.add(vcrDto);
					}
				}
				for (String offence : findByQuery) {
					ReportVO offenceReportVo = new ReportVO();
					offenceReportVo.setOffenceDesc(offence);
					if (vcrListDto != null && !vcrListDto.isEmpty()) {
						List<VcrFinalServiceDTO> offencList = new ArrayList<>();
						for (VcrFinalServiceDTO offencDto : vcrListDto) {
							if (offencDto.getOffence().getOffence().stream()
									.anyMatch(one -> one.getOffenceDescription().equalsIgnoreCase(offence))) {
								offencList.add(offencDto);
							}
						}
						offenceReportVo.setOffenceCount(0);
						if (offencList != null && !offencList.isEmpty()) {
							this.getTotalOffenceCount(offenceList, offence, offencList.size());
							districtCount = districtCount + offencList.size();
							grandTotal = grandTotal+offencList.size();
							offenceReportVo.setOffenceCount(offencList.size());
						}

					} else {
						offenceReportVo.setOffenceCount(0);
					}
					if (districtReportVo.getReport() == null || districtReportVo.getReport().isEmpty()) {

						List<ReportVO> singleReport = new ArrayList<>();
						singleReport.add(offenceReportVo);
						districtReportVo.setReport(singleReport);
					} else {

						districtReportVo.getReport().add(offenceReportVo);
					}

				}
				districtReportVo.setTotalCount(districtCount);
				finalList.add(districtReportVo);

			}
			ReportVO vo = new ReportVO();
			vo.setReport(finalList);
			vo.setTotaloffenceCount(offenceList);
			vo.setRoadSafetyOffencesList(findByQuery);
			vo.setGrandTotal(grandTotal);
			return vo;
		}

		private void getTotalOffenceCount(List<ReportVO> offenceList, String offence, int count) {
			for (ReportVO singleoffence : offenceList) {
				if (singleoffence.getOffenceType().equalsIgnoreCase(offence)) {
					singleoffence.setOffenceCount(singleoffence.getOffenceCount() + count);
				}
			}

		}

		private List<ReportVO> setOffenceCountasZero(List<String> findByQuery) {
			List<ReportVO> offenceList = new ArrayList<>();
			for (String offence : findByQuery) {
				ReportVO vo = new ReportVO();
				vo.setOffenceType(offence);
				vo.setOffenceCount(0);
				offenceList.add(vo);
			}

			return offenceList;

		}

		private String getMviName(String mviName) {
			Optional<UserDTO> userData = userDAO.findByUserId(mviName);
			if(!userData.isPresent()) {
				throw new BadRequestException("User data not found for user Id: "+mviName);
			}
			String firstName=userData.get().getFirstName()!=null?userData.get().getFirstName():"";
			String lastName=userData.get().getLastName()!=null?userData.get().getLastName():"";
			String finalName=userData.get().getUserId()+":"+firstName+" "+lastName;
			return finalName;
		}
		public UnpaidVcrListVO convertVcrUnpaidCountOfficewise(VcrFinalServiceDTO dto)
		{
			UnpaidVcrListVO vo = new UnpaidVcrListVO();
			if (dto.getVcr() != null) {
				vo.setVcrNo(dto.getVcr().getVcrNumber());
			}
			if (dto.getRegistration() != null) {
				vo.setClassOfVehicle(dto.getRegistration().getClasssOfVehicle().getCovdescription());
				vo.setPrNo(dto.getRegistration().getRegNo());
				vo.setTrNo(dto.getRegistration().getTrNo());
			

			}
			if (dto.getOwnerDetails() != null) {
				vo.setFullName(dto.getOwnerDetails().getFullName());
				vo.setAddress(dto.getOwnerDetails().getAddress());
				vo.setContactNo(dto.getOwnerDetails().getMobileNo());
			}
			if (dto.getMviOfficeCode() != null) {
				vo.setOfficeName(dto.getMviOfficeCode());
			}
			vo.setBookedMviName(dto.getCreatedBy());
	        vo.setBookedDate(dto.getVcr().getDateOfCheck());
			return vo;
		}
}