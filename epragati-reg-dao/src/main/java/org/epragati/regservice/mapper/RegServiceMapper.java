package org.epragati.regservice.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.aadhaar.VcrHistoryVO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.dao.enclosure.TemporaryEnclosuresDAO;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.dto.enclosure.TemporaryEnclosuresDTO;
import org.epragati.exception.BadRequestException;
import org.epragati.hsrp.vo.DataVO;
import org.epragati.images.vo.ImageInput;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.MotorDrivingSchoolDTO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.StagingRegServiceDetailsAutoApprovalDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.mappers.ContactMapper;
import org.epragati.master.mappers.DistrictMapper;
import org.epragati.master.mappers.FcDetailsMapper;
import org.epragati.master.mappers.FinanceDetailsMapper;
import org.epragati.master.mappers.InsuranceDetailsMapper;
import org.epragati.master.mappers.MandalMapper;
import org.epragati.master.mappers.OfficeMapper;
import org.epragati.master.mappers.PermitDetailsMapper;
import org.epragati.master.mappers.RCCancellationMapper;
import org.epragati.master.mappers.RcCancellationQuestionsMappers;
import org.epragati.master.mappers.RegVehicleDetailsMapper;
import org.epragati.master.mappers.RegistrationDetailsMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.master.mappers.UserMapper;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.payment.dto.PaymentTransactionDTO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.payment.mapper.BreakPaymentsSaveMapper;
import org.epragati.payment.mapper.FeeDetailsMapper;
import org.epragati.payment.report.vo.OsDataEntryFinalVO;
import org.epragati.payment.report.vo.OsDataEntryReport;
import org.epragati.payment.report.vo.RegReportVO;
import org.epragati.payments.dao.PaymentTransactionDAO;
import org.epragati.permits.dto.OtherStateTemporaryPermitDetailsDTO;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.permits.mappers.OtherStateTemporaryPermitDetailsMapper;
import org.epragati.permits.vo.OtherStateTemporaryPermitDetailsVO;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.regservice.vo.CommonFieldsVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.regservice.vo.TowVO;
import org.epragati.rta.reports.vo.CitizenEnclosuresVO;
import org.epragati.rta.reports.vo.CitizenSearchReportVO;
import org.epragati.rta.reports.vo.PermitHistoryDeatilsVO;
import org.epragati.util.DateConverters;
import org.epragati.util.RoleEnum;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ModuleEnum;
import org.epragati.util.payment.ServiceEnum;
import org.epragati.vcr.vo.VoluntaryTaxVO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.epragati.vcrImage.dto.VoluntaryTaxDTO;
import org.epragati.vcrImage.mapper.VoluntaryTaxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class RegServiceMapper extends BaseMapper<RegServiceDTO, RegServiceVO> {

	@Autowired
	private ApplicantDeatilsMapper applicantDeatilsMapper;

	@Autowired
	private FeeDetailsMapper feeDetailsMapper;

	@Autowired
	private OfficeMapper officeMapper;

	@Autowired
	private SlotDetailsMapper slotDetailsMapper;

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Autowired
	private BreakPaymentsSaveMapper breakPaymentsSaveMapper;

	@Autowired
	private DuplicateDetailsMapper duplicateDetailsMapper;

	@Autowired
	private RegistrationDetailsMapper<StagingRegistrationDetailsDTO> registrationDetailsMapper;

	@Autowired
	private AlterationMapper alterationMapper;

	@Autowired
	private FcDetailsMapper fcDetailsMapper;

	@Autowired
	private NOCDetailsMapper nOCDetailsMapper;

	@Autowired
	private PUCDetailsMapper pucDetailsMapper;

	@Autowired
	private TaxDetailsMapper taxDetailsMapper;

	@Autowired
	private GreenTaxMapper greenTaxDetailsMapper;

	@Autowired
	private TowMapper towMapper;

	@Autowired
	private InsuranceDetailsMapper insuranceDetailsMapper;

	@Autowired
	private PermitDetailsMapper permitDetailsMapper;

	@Autowired
	private TheftVehcileDetailsMapper theftVehcileDetailsMapper;

	@Autowired
	private FinanceDetailsMapper financeDetailsMapper;

	@Autowired
	private ContactMapper contactMapper;

	@Autowired
	private BileteralTaxMapper bileteralTaxMapper;

	@Autowired
	private MandalMapper mandalMapper;

	@Autowired
	private DistrictMapper districtMapper;

	@Autowired
	private StateMapper stateMapper;

	@Autowired
	private VoluntaryTaxMapper voluntaryTaxMapper;

	@Autowired
	private PaymentTransactionDAO paymentTransactionDAO;
	/*
	 * @Autowired private TheftVehcileDetailsMapper theftVehcileDetailsMapper;
	 */

	@Autowired
	private VehicleStoppageDetailsMapper vehicleStoppageDetailsMapper;

	@Autowired
	private OtherStateTemporaryPermitDetailsMapper otherStateTemporaryPermitDetailsMapper;
	@Autowired
	private FreshRCMapper freshRCMapper;
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RCCancellationMapper rcCancellationMapper;

	@Autowired
	private RcCancellationQuestionsMappers rcCancellationQuestionsMappers;

	@Autowired
	private RegVehicleDetailsMapper vehicleDetailsMapper;
	@Autowired
	private TemporaryEnclosuresDAO temporaryEnclosuresDAO;
	@Value("${reg.service.images.new.url:}")
	private String imagePreUrl;

	
	@Override
	public RegServiceVO convertEntity(RegServiceDTO dto) {
		// TODO Auto-generated method stub
		RegServiceVO regServiceVO = new RegServiceVO();
		if (dto != null) {
			regServiceVO.setAadhaarNo(dto.getAadhaarNo());
			regServiceVO.setPrNo(dto.getPrNo());
			regServiceVO.setTrNo(dto.getTrNo());
			regServiceVO.setOfficeCode(dto.getOfficeCode());
			funPoint(dto.getApplicationNo(),  regServiceVO::setApplicationNo);
			if (dto.getBasicApplicantDetails() != null) {
				regServiceVO.setBasicApplicantDetails(
						applicantDeatilsMapper.convertRequiredEntity(dto.getBasicApplicantDetails()));
			}
			if (dto.getFreshRcdetails() != null) {

				regServiceVO.setFreshRc(freshRCMapper.convertEntity(dto.getFreshRcdetails()));
				regServiceVO.setMviOfficeCode(dto.getMviOfficeCode());
			}
			/*
			 * if(dto.getFlowDetails()!=null){
			 * regServiceVO.setFlowDetails(flowMapper.convertEntity(dto. getFlowDetails()));
			 * } if(dto.getFeeDetails()!=null){
			 * regServiceVO.setFeeDetails(feeDetailsMapper.convertEntity(dto.
			 * getFeeDetails())); }
			 */
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getNewOfficeDetails() != null) {
				regServiceVO.setNewOfficeDetails(officeMapper.convertEntity(dto.getNewOfficeDetails()));
			}
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getServiceType() != null) {
				regServiceVO.setServiceType(dto.getServiceType());
			}
			if (dto.getSlotDetails() != null) {
				regServiceVO.setSlotDetails(slotDetailsMapper.convertEntity(dto.getSlotDetails()));
			}

			funPoint(dto.getApplicationStatus(), regServiceVO::setApplicationStatus);

			if (dto.getPresentAdderss() != null) {
				regServiceVO.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAdderss()));
			}

			funPoint(dto.getGatewayType(), regServiceVO::setGatewayType);
			funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
			if (dto.getBuyerDetails() != null) {
				regServiceVO.setTowDetails(towMapper.convertEntity(dto.getBuyerDetails()));
			}
			if (dto.getBreakPayments() != null) {
				regServiceVO.setBreakPaymentsVo(breakPaymentsSaveMapper.convertEntity(dto.getBreakPayments()));
			}

			if (dto.getPdtl() != null) {
				regServiceVO.setPermitDetailsVO(permitDetailsMapper.convertEntity(dto.getPdtl()));
			}
			if (dto.getDuplicateDetails() != null) {
				regServiceVO.setDuplicateDetailsVO(duplicateDetailsMapper.convertEntity(dto.getDuplicateDetails()));
			}
			if (dto.getAlterationDetails() != null) {
				regServiceVO.setAlterationVO(alterationMapper.convertEntity(dto.getAlterationDetails()));
			}
			if(dto.getSpecificVcrPayment()!=null) {
				 regServiceVO.setSpecificVcrPayment(dto.getSpecificVcrPayment());
			}
		
			// funPoint(dto.getBreakPayments(), regServiceVO::setBreakPayments);
			// funPoint(dto.getCreatedDate(),regServiceVO::setCreatedDate);

			if (null != dto.getRegistrationDetails())
				regServiceVO
						.setRegistrationDetails(registrationDetailsMapper.convertEntity(dto.getRegistrationDetails()));

			if (null != dto.getFcDetails())
				regServiceVO.setFcDetails(fcDetailsMapper.convertEntity(dto.getFcDetails()));
			if (null != dto.getnOCDetails())
				regServiceVO.setnOCDetails(nOCDetailsMapper.convertEntity(dto.getnOCDetails()));
			if (null != dto.getPucDetails())
				regServiceVO.setPucDetails(pucDetailsMapper.convertEntity(dto.getPucDetails()));
			if (null != dto.getTaxDetails())
				regServiceVO.setTaxDetails(taxDetailsMapper.convertEntity(dto.getTaxDetails()));
			if (null != dto.getGreenTaxDetails())
				regServiceVO.setGreenTaxDetails(greenTaxDetailsMapper.convertEntity(dto.getGreenTaxDetails()));
			funPoint(dto.getTaxAmount(), regServiceVO::setTaxAmount);
			funPoint(dto.getTaxvalidity(), regServiceVO::setTaxvalidity);
			funPoint(dto.getCesFee(), regServiceVO::setCesFee);
			funPoint(dto.getCesValidity(), regServiceVO::setCesValidity);
			funPoint(dto.getPenalty(), regServiceVO::setPenalty);
			funPoint(dto.getTaxType(), regServiceVO::setTaxType);
			funPoint(dto.getGreenTaxAmount(), regServiceVO::setGreenTaxAmount);
			funPoint(dto.getGreenTaxvalidity(), regServiceVO::setGreenTaxvalidity);
			funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
			funPoint(dto.getServiceType(), regServiceVO::setServiceType);
			funPoint(dto.getOfficeCode(), regServiceVO::setOfficeCode);
			funPoint(dto.getCreatedDate(), regServiceVO::setCreatedDate);
			funPoint(dto.getIterationCount(), regServiceVO::setIterationCount);
			funPoint(dto.getCurrentIndex(), regServiceVO::setCurrentIndex);
			funPoint(dto.isSpecialNoRequired(), regServiceVO::setSpecialNoRequired);
			funPoint(dto.isFinancerRequired(), regServiceVO::setFinancerRequired);
			funPoint(dto.getTaxArrears(), regServiceVO::setTaxArrears);
			funPoint(dto.getPenaltyArrears(), regServiceVO::setPenaltyArrears);
			funPoint(dto.getPermitCode(), regServiceVO::setPermitCode);
			funPoint(dto.getQuaterTaxForNewGo(), regServiceVO::setQuaterTaxForNewGo);
			if (null != dto.getInsuranceDetails()) {
				regServiceVO.setInsuranceDetailsVo(insuranceDetailsMapper.convertEntity(dto.getInsuranceDetails()));
			}
			funPoint(dto.getApprovedDate(), regServiceVO::setApprovedDate);
			funPoint(dto.getMviOfficeCode(), regServiceVO::setMviOfficeCode);
			if (dto.getMviOfficeDetails() != null) {
				regServiceVO.setMviOfficeDetails(officeMapper.convertEntity(dto.getMviOfficeDetails()));
			}
			funPoint(dto.getPaymentTransactionNo(), regServiceVO::setPaymentTransactionNo);
			/*
			 * if(null != dto.getActionDetails()) {
			 * regServiceVO.setActionDetailsVO(actionDetailMapper.convertEntity(
			 * dto.getActionDetails())); }
			 */
			if (dto.getFeeDetails() != null) {
				regServiceVO.setFeeDetails(feeDetailsMapper.convertEntity(dto.getFeeDetails()));
			}
			if (dto.getTheftDetails() != null) {
				regServiceVO.setTheftDetails(theftVehcileDetailsMapper.convertEntity(dto.getTheftDetails()));
			}
			if (dto.getRegistrationDetails() != null && dto.getRegistrationDetails().isTaxPaidByVcr()) {
				regServiceVO.getRegistrationDetails().setTaxPaidByVcr(dto.getRegistrationDetails().isTaxPaidByVcr());
			}
			if (null != dto.getFinanceDetails())
				regServiceVO.setFinanceDetails(financeDetailsMapper.convertEntity(dto.getFinanceDetails()));
			funPoint(dto.getToken(), regServiceVO::setToken);
			funPoint(dto.isFinancierDoneByOnline(), regServiceVO::setFinancierDoneByOnline);
			if (dto.getContactDetails() != null) {
				regServiceVO.setContactDetails(contactMapper.convertEntity(dto.getContactDetails()));
			}
			funPoint(dto.isPaidPyamentsForFC(), regServiceVO::setPaidPyamentsForFC);
			if (dto.getPayTaxType() != null) {
				regServiceVO.setPayTaxType(dto.getPayTaxType());
			}
			if (dto.getVehicleStoppageDetails() != null) {
				regServiceVO.setVehicleStoppageDetailsVO(
						vehicleStoppageDetailsMapper.convertEntity(dto.getVehicleStoppageDetails()));
			}
			funPoint(dto.getTaxExcemption(), regServiceVO::setTaxExcemption);
			funPoint(dto.isPaidPyamentsForRenewal(), regServiceVO::setPaidPyamentsForRenewal);
			funPoint(dto.getFreshRcFinanceToken(), regServiceVO::setFreshRcFinanceToken);
			funPoint(dto.isMviDone(), regServiceVO::setMviDone);
			funPoint(dto.isWeightAlt(), regServiceVO::setWeightAlt);
			funPoint(dto.getGvw(), regServiceVO::setGvw);
			funPoint(dto.getOsSecondVechicleFoundRTO(), regServiceVO::setOsSecondVechicleFoundRTO);
			funPoint(dto.getIsPRNoRequiredosSVRejected(), regServiceVO::setIsPRNoRequiredosSVRejected);
			if (dto.getOtherStateFianContinue() != null) {
				funPoint(dto.getOtherStateFianContinue(), regServiceVO::setOtherStateFianContinue);
			}
			if (dto.getBileteralTaxDetails() != null) {
				regServiceVO.setBileteralTaxDetails(bileteralTaxMapper.convertEntity(dto.getBileteralTaxDetails()));
			}
			if (dto.getReInspectionDate() != null) {
				funPoint(dto.getReInspectionDate(), regServiceVO::setReInspectionDate);
			}
		}
		if (dto.getOldMviOfficeDetails() != null) {
			regServiceVO.setOldMviOfficeDetails(officeMapper.convertEntity(dto.getOldMviOfficeDetails()));
		}

		if (dto.getOtherStateTemporaryPermitDetails() != null) {
			regServiceVO.setOtherStateTemporaryPermit(
					otherStateTemporaryPermitDetailsMapper.convertEntity(dto.getOtherStateTemporaryPermitDetails()));
		}
		funPoint(dto.getVcrNosList(), regServiceVO::setVcrNosList);
		funPoint(dto.getDateOfCompletion(), regServiceVO::setDateOfCompletion);
		if (dto.getVoluntaryTaxDetails() != null) {
			regServiceVO.setVoluntaryTaxDetails(voluntaryTaxMapper.convertEntity(dto.getVoluntaryTaxDetails()));
		}

		if (dto.getRcCancellation() != null) {
			regServiceVO.setRcCancellation(rcCancellationMapper.converEntityLimitedFields(dto.getRcCancellation()));
		}
		if (dto.getRcQuesList() != null) {
			regServiceVO.setRcQuesList(rcCancellationQuestionsMappers.convertEntity(dto.getRcQuesList()));
		}
		funPoint(dto.getLastTaxPaidUpTo(), regServiceVO::setLastTaxPaidUpTo);
		funPoint(dto.getDtcOfficeCode(), regServiceVO::setDtcOfficeCode);
		funPoint(dto.isGetOtherStateDataFromVahanService(), regServiceVO::setGetOtherStateDataFromVahanService);
		funPoint(dto.getCreatedBy(), regServiceVO::setCreatedBy);
		funPoint(dto.getCancellationRemarks(), regServiceVO::setCancellationRemarks);
		funPoint(dto.getCancelledBy(), regServiceVO::setCancelledBy);
		funPoint(dto.getCancelledDate(), regServiceVO::setCancelledDate);
		funPoint(dto.getCancelledIpAddress(), regServiceVO::setCancelledIpAddress);
		funPoint(dto.getStageCarriageType(), regServiceVO::setStageCarriageType);
		funPoint(dto.getRemarks(), regServiceVO::setRemarks);
		
		funPoint(dto.getStageCarriageServiceType(), regServiceVO::setStageCarriageServiceType);

		return regServiceVO;
	}

	public RegServiceVO limitedDashBoardfields(RegServiceDTO dto) {
		RegServiceVO regServiceVO = new RegServiceVO();
		if (dto != null) {
			if (dto.getRegistrationDetails() != null) {
				regServiceVO.setRegistrationDetails(
						registrationDetailsMapper.limitedDashBoardfields(dto.getRegistrationDetails()));
			}
			regServiceVO.setAadhaarNo(dto.getAadhaarNo());
			regServiceVO.setPrNo(dto.getPrNo());
			regServiceVO.setTrNo(dto.getTrNo());
			regServiceVO.setOfficeCode(dto.getOfficeCode());
			funPoint(dto.getApplicationNo(), regServiceVO::setApplicationNo);
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			funPoint(dto.getIterationCount(), regServiceVO::setIterationCount);
			funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
			funPoint(dto.getServiceType(), regServiceVO::setServiceType);
			funPoint(dto.getOfficeCode(), regServiceVO::setOfficeCode);
			funPoint(dto.getCreatedDate(), regServiceVO::setCreatedDate);
			funPoint(dto.getApplicationStatus(), regServiceVO::setApplicationStatus);
		}
		return regServiceVO;

	}

	@Override
	public List<RegServiceVO> convertEntity(List<RegServiceDTO> regServiceDTOList) {
		return regServiceDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	public RegServiceVO limitedFieldsDTOToVO(RegServiceDTO dto) {
		RegServiceVO regServiceVO = new RegServiceVO();
		regServiceVO.setApplicationNo(dto.getApplicationNo());
		regServiceVO.setAadhaarNo(dto.getAadhaarNo());
		regServiceVO.setPrNo(dto.getPrNo());
		if (null != dto.getRegistrationDetails()) {
			regServiceVO.setRegistrationDetails(registrationDetailsMapper.convertEntity(dto.getRegistrationDetails()));
		}
		if (dto.getFreshRcdetails() != null) {
			freshRCMapper.freshRcDetailsForApprovals(regServiceVO, dto);
		}
		if (dto.getPresentAdderss() != null) {
			regServiceVO.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAdderss()));
		}
		if (dto.getOfficeDetails() != null) {
			regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
		}
		// if(dto.getFlowDetails()!=null){
		// regServiceVO.setFlowDetails(flowMapper.convertEntity(dto.getFlowDetails()));
		// }
		if (dto.getPdtl() != null) {
			regServiceVO.setPermitDetailsVO(permitDetailsMapper.convertEntity(dto.getPdtl()));
		}
		if (dto.getDuplicateDetails() != null) {
			regServiceVO.setDuplicateDetailsVO(duplicateDetailsMapper.convertEntity(dto.getDuplicateDetails()));
		}
		if (dto.getFcDetails() != null) {
			regServiceVO.setFcDetails(fcDetailsMapper.convertEntity(dto.getFcDetails()));
		}
		if (dto.getnOCDetails() != null) {
			regServiceVO.setnOCDetails(nOCDetailsMapper.convertEntity(dto.getnOCDetails()));
		}
		if (dto.getPucDetails() != null) {
			regServiceVO.setPucDetails(pucDetailsMapper.convertEntity(dto.getPucDetails()));
		}
		if (dto.getTaxDetails() != null) {
			regServiceVO.setTaxDetails(taxDetailsMapper.convertEntity(dto.getTaxDetails()));
		}

		if (dto.getOtherStateVoluntaryTax() != null) {
			regServiceVO.setTaxDetails(
					taxDetailsMapper.convertEntityforOtherStateVoluntaryTax(dto.getOtherStateVoluntaryTax()));
			regServiceVO.getRegistrationDetails().setTaxType(regServiceVO.getTaxDetails().getTaxType());
			regServiceVO.getRegistrationDetails()
					.setTaxAmount(Long.parseLong(dto.getOtherStateVoluntaryTax().getTax()));
			regServiceVO.getTaxDetails()
					.setTaxType(dto.getTaxType() + "(" + regServiceVO.getTaxDetails().getTaxType() + ")");
		}

		if (dto.getGreenTaxDetails() != null) {
			regServiceVO.setGreenTaxDetails(greenTaxDetailsMapper.convertEntity(dto.getGreenTaxDetails()));
		}
		if (dto.getAlterationDetails() != null) {
			regServiceVO.setAlterationVO(alterationMapper.convertEntity(dto.getAlterationDetails()));
		}
		if (dto.getServiceType() != null) {
			regServiceVO.setServiceType(dto.getServiceType());
		}
		funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
		if (dto.getBuyerDetails() != null) {
			regServiceVO.setTowDetails(towMapper.convertEntity(dto.getBuyerDetails()));
		}
		if (dto.getFeeDetails() != null) {
			regServiceVO.setFeeDetails(feeDetailsMapper.convertEntity(dto.getFeeDetails()));
		}
		if (dto.getInsuranceDetails() != null) {
			regServiceVO.setInsuranceDetailsVo(insuranceDetailsMapper.convertEntity(dto.getInsuranceDetails()));
		}
		if (dto.getFinanceDetails() != null) {
			regServiceVO.setFinanceDetails(financeDetailsMapper.convertEntity(dto.getFinanceDetails()));
		}
		funPoint(dto.getIterationCount(), regServiceVO::setIterationCount);
		funPoint(dto.getlUpdate(), regServiceVO::setlUpdate);
		if (dto.getPdtl() != null) {
			regServiceVO.setPermitDetailsVO(permitDetailsMapper.convertEntity(dto.getPdtl()));
		}
		if (dto.getTheftDetails() != null) {
			regServiceVO.setTheftDetails(theftVehcileDetailsMapper.convertEntity(dto.getTheftDetails()));
		}
		if (dto.getContactDetails() != null) {
			regServiceVO.setContactDetails(contactMapper.convertEntity(dto.getContactDetails()));
		}
		if (dto.getVehicleStoppageDetails() != null) {
			regServiceVO.setVehicleStoppageDetailsVO(
					vehicleStoppageDetailsMapper.convertEntity(dto.getVehicleStoppageDetails()));
		}
		funPoint(dto.isPaidPyamentsForFC(), regServiceVO::setPaidPyamentsForFC);
		funPoint(dto.getReasonForChangeOffice(), regServiceVO::setReasonForChangeOffice);
		funPoint(dto.getTaxExcemption(), regServiceVO::setTaxExcemption);
		funPoint(dto.getQuaterTaxForNewGo(), regServiceVO::setQuaterTaxForNewGo);
		funPoint(dto.getVcrNosList(), regServiceVO::setVcrNosList);
		funPoint(dto.getDateOfCompletion(), regServiceVO::setDateOfCompletion);
		if (dto.getVoluntaryTaxDetails() != null) {
			regServiceVO.setVoluntaryTaxDetails(voluntaryTaxMapper.convertEntity(dto.getVoluntaryTaxDetails()));
		}
		funPoint(dto.getLastTaxPaidUpTo(), regServiceVO::setLastTaxPaidUpTo);
		funPoint(dto.getDtcOfficeCode(), regServiceVO::setDtcOfficeCode);
		return regServiceVO;
	}

	RegServiceVO regServiceVO = new RegServiceVO();

	public RegServiceVO limiteddtoToVo(RegServiceDTO dto) {

		RegServiceVO regServiceVO = new RegServiceVO();

		regServiceVO.setApplicationNo(dto.getApplicationNo());
		regServiceVO.setPrNo(dto.getPrNo());
		regServiceVO.setTrNo(dto.getTrNo());
		if (dto.getBasicApplicantDetails() != null) {
			regServiceVO.setBasicApplicantDetails(
					applicantDeatilsMapper.limitedApplicantDetailsdtoToVo(dto.getBasicApplicantDetails()));
		}
		regServiceVO.setStatus(dto.getStatus());

		return regServiceVO;

	}

	@Override
	public RegServiceDTO convertVO(RegServiceVO dto) {
		// TODO Auto-generated method stub
		RegServiceDTO regServiceVO = new RegServiceDTO();

		if (dto.getAadhaarResponse() != null) {
			// regServiceVO.setAadhaarResponse(aadhaarDetailsResponseMapper.convertVO(dto.getAadhaarResponse()));
		}
		funPoint(dto.getApplicationNo(), regServiceVO::setApplicationNo);

		if (dto.getBasicApplicantDetails() != null) {
			regServiceVO
					.setBasicApplicantDetails(applicantDeatilsMapper.convertRequiredVO(dto.getBasicApplicantDetails()));
		}
		// if(dto.getFlowDetails()!=null){
		// regServiceVO.setFlowDetails(flowMapper.convertVO(dto.getFlowDetails()));
		// }
		if (dto.getFeeDetails() != null) {
			regServiceVO.setFeeDetails(feeDetailsMapper.convertVO(dto.getFeeDetails()));
		}
		if (dto.getOfficeDetails() != null) {
			regServiceVO.setOfficeDetails(officeMapper.convertVO(dto.getOfficeDetails()));
		}
		if (dto.getNewOfficeDetails() != null) {
			regServiceVO.setNewOfficeDetails(officeMapper.convertVO(dto.getNewOfficeDetails()));
		}
		/*
		 * if(dto.getOfficeDetails()!=null){
		 * regServiceVO.setOfficeDetails(officeMapper.convertVO(dto.
		 * getOfficeDetails())); } if(dto.getOfficeDetails()!=null){
		 * regServiceVO.setOfficeDetails(officeMapper.convertVO(dto.
		 * getOfficeDetails())); }
		 */
		if (dto.getServiceType() != null) {
			regServiceVO.setServiceType(dto.getServiceType());
		}
		if (dto.getSlotDetails() != null) {
			regServiceVO.setSlotDetails(slotDetailsMapper.convertVO(dto.getSlotDetails()));
		}

		funPoint(dto.getApplicationStatus(), regServiceVO::setApplicationStatus);

		if (dto.getPresentAddress() != null) {
			regServiceVO.setPresentAdderss(applicantAddressMapper.convertVO(dto.getPresentAddress()));
		}

		funPoint(dto.getCreatedDate(), regServiceVO::setCreatedDate);
		funPoint(dto.getGatewayType(), regServiceVO::setGatewayType);
		funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
		if (dto.getTowDetails() != null) {
			regServiceVO.setBuyerDetails(towMapper.convertVO(dto.getTowDetails()));
		}
		if (dto.getBreakPaymentsVo() != null) {
			regServiceVO.setBreakPayments(breakPaymentsSaveMapper.convertVO(dto.getBreakPaymentsVo()));
		}

		if (dto.getPermitDetailsVO() != null) {
			regServiceVO.setPdtl(permitDetailsMapper.convertVO(dto.getPermitDetailsVO()));
		}
		if (dto.getDuplicateDetailsVO() != null) {
			regServiceVO.setDuplicateDetails(duplicateDetailsMapper.convertVO(dto.getDuplicateDetailsVO()));
		}
		if (dto.getAlterationVO() != null) {
			regServiceVO.setAlterationDetails(alterationMapper.convertVO(dto.getAlterationVO()));
		}
		if (null != dto.getRegistrationDetails())
			regServiceVO.setRegistrationDetails(registrationDetailsMapper.convertVO(dto.getRegistrationDetails()));

		if (null != dto.getFcDetails())
			regServiceVO.setFcDetails(fcDetailsMapper.convertVO(dto.getFcDetails()));
		if (null != dto.getnOCDetails())
			regServiceVO.setnOCDetails(nOCDetailsMapper.convertVO(dto.getnOCDetails()));
		if (null != dto.getPucDetails())
			regServiceVO.setPucDetails(pucDetailsMapper.convertVO(dto.getPucDetails()));
		if (null != dto.getTaxDetails())
			regServiceVO.setTaxDetails(taxDetailsMapper.convertVO(dto.getTaxDetails()));
		if (null != dto.getGreenTaxDetails())
			regServiceVO.setGreenTaxDetails(greenTaxDetailsMapper.convertVO(dto.getGreenTaxDetails()));
		funPoint(dto.getPrNo(), regServiceVO::setPrNo);
		funPoint(dto.getTrNo(), regServiceVO::setTrNo);
		funPoint(dto.getTaxAmount(), regServiceVO::setTaxAmount);
		funPoint(dto.getTaxvalidity(), regServiceVO::setTaxvalidity);
		funPoint(dto.getCesFee(), regServiceVO::setCesFee);
		funPoint(dto.getCesValidity(), regServiceVO::setCesValidity);
		funPoint(dto.getPenalty(), regServiceVO::setPenalty);
		funPoint(dto.getTaxType(), regServiceVO::setTaxType);
		funPoint(dto.getGreenTaxAmount(), regServiceVO::setGreenTaxAmount);
		funPoint(dto.getGreenTaxvalidity(), regServiceVO::setGreenTaxvalidity);
		funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
		funPoint(dto.getServiceType(), regServiceVO::setServiceType);
		funPoint(dto.getOfficeCode(), regServiceVO::setOfficeCode);
		funPoint(dto.getCreatedDate(), regServiceVO::setCreatedDate);
		funPoint(dto.getIterationCount(), regServiceVO::setIterationCount);
		funPoint(dto.getCurrentIndex(), regServiceVO::setCurrentIndex);
		funPoint(dto.isSpecialNoRequired(), regServiceVO::setSpecialNoRequired);
		funPoint(dto.isFinancerRequired(), regServiceVO::setFinancerRequired);
		funPoint(dto.getApprovedDate(), regServiceVO::setApprovedDate);
		funPoint(dto.getTaxArrears(), regServiceVO::setTaxArrears);
		funPoint(dto.getPenaltyArrears(), regServiceVO::setPenaltyArrears);
		funPoint(dto.getQuaterTaxForNewGo(), regServiceVO::setQuaterTaxForNewGo);
		if (null != dto.getInsuranceDetailsVo()) {
			regServiceVO.setInsuranceDetails(insuranceDetailsMapper.convertVO(dto.getInsuranceDetailsVo()));
		}
		funPoint(dto.getMviOfficeCode(), regServiceVO::setMviOfficeCode);
		if (dto.getMviOfficeDetails() != null) {
			regServiceVO.setMviOfficeDetails(officeMapper.convertVO(dto.getMviOfficeDetails()));
		}
		/*
		 * if(null != dto.getActionDetailsVO()) {
		 * regServiceVO.setActionDetails(actionDetailMapper.convertVO(dto.
		 * getActionDetailsVO())); }
		 */

		funPoint(dto.getPreviousPrNo(), regServiceVO::setPreviousPrNo);
		funPoint(dto.isPreviousPrNoExist(), regServiceVO::setPreviousPrNoExist);
		funPoint(dto.getPaymentTransactionNo(), regServiceVO::setPaymentTransactionNo);
		if (null != dto.getFinanceDetails())
			regServiceVO.setFinanceDetails(financeDetailsMapper.convertVO(dto.getFinanceDetails()));
		funPoint(dto.getToken(), regServiceVO::setToken);
		funPoint(dto.isFinancierDoneByOnline(), regServiceVO::setFinancierDoneByOnline);
		if (dto.getContactDetails() != null) {
			regServiceVO.setContactDetails(contactMapper.convertVO(dto.getContactDetails()));
		}
		funPoint(dto.isPaidPyamentsForFC(), regServiceVO::setPaidPyamentsForFC);
		funPoint(dto.getAadhaarNo(), regServiceVO::setAadhaarNo);
		funPoint(dto.getOsDateofentry(), regServiceVO::setOsDateofentry);
		funPoint(dto.isMviDone(), regServiceVO::setMviDone);
		if (dto.getBileteralTaxDetails() != null) {
			regServiceVO.setBileteralTaxDetails(bileteralTaxMapper.convertVO(dto.getBileteralTaxDetails()));

		}
		if (dto.getOldMviOfficeDetails() != null) {
			regServiceVO.setOldMviOfficeDetails(officeMapper.convertVO(dto.getOldMviOfficeDetails()));
		}

		if (dto.getOtherStateTemporaryPermit() != null) {
			regServiceVO.setOtherStateTemporaryPermitDetails(
					otherStateTemporaryPermitDetailsMapper.convertVO(dto.getOtherStateTemporaryPermit()));
		}

		funPoint(dto.getVcrNosList(), regServiceVO::setVcrNosList);
		funPoint(dto.getDateOfCompletion(), regServiceVO::setDateOfCompletion);
		if (dto.getVoluntaryTaxDetails() != null) {
			regServiceVO.setVoluntaryTaxDetails(voluntaryTaxMapper.convertVO(dto.getVoluntaryTaxDetails()));
		}
		funPoint(dto.getLastTaxPaidUpTo(), regServiceVO::setLastTaxPaidUpTo);
		if (dto.getIsOtherState() != null) {
			regServiceVO.setIsOtherState(dto.getIsOtherState());
		}
		funPoint(dto.getDtcOfficeCode(), regServiceVO::setDtcOfficeCode);
		funPoint(dto.isGetOtherStateDataFromVahanService(), regServiceVO::setGetOtherStateDataFromVahanService);
		funPoint(dto.getStageCarriageType(), regServiceVO::setStageCarriageType);
		funPoint(dto.getRemarks(), regServiceVO::setRemarks);
		funPoint(dto.getStageCarriageServiceType(), regServiceVO::setStageCarriageServiceType);
		return regServiceVO;
	}

	/**
	 * This method is used to display the value for application search
	 * 
	 * @param regServiceDTO
	 * @return searchreport vo
	 */
	public CitizenSearchReportVO convertSpecificFieldsForCtizenSearch(RegServiceDTO regServiceDTO) {
		CitizenSearchReportVO searchReportVo = new CitizenSearchReportVO();
		if (!regServiceDTO.getServiceIds().stream().anyMatch(id -> id.equals(ServiceEnum.BILLATERALTAX.getId()))) {
			funPoint(regServiceDTO.getApplicationNo(), searchReportVo::setApplicationNumber);
			funPoint(regServiceDTO.getRegistrationDetails().getApplicantDetails().getFirstName(),
					searchReportVo::setApplicantName);
			funPoint(regServiceDTO.getApplicationStatus(), searchReportVo::setApplicationStatus);
			funPoint(regServiceDTO.getPrNo(), searchReportVo::setPrNo);
			funPoint(regServiceDTO.getRegistrationDetails().getTrNo(), searchReportVo::setTrNo);
			funPoint(regServiceDTO.getRegistrationDetails().getApplicationNo(), searchReportVo::setRegApplicationNo);
			if (regServiceDTO.getServiceType() != null) {
				searchReportVo.setServiceType(regServiceDTO.getServiceType());
			}
			funPoint(regServiceDTO.getRegistrationDetails().getApplicantDetails().getFatherName(),
					searchReportVo::setFatherName);
			if (null != regServiceDTO.getBuyerDetails() && null != regServiceDTO.getBuyerDetails().getTokenNo()) {
				funPoint(regServiceDTO.getBuyerDetails().getTokenNo(), searchReportVo::setToken);
			}
			searchReportVo.setApplicantDetailsVO(
					applicantDeatilsMapper.convertEntity(regServiceDTO.getRegistrationDetails().getApplicantDetails()));
			searchReportVo.setCovDes(regServiceDTO.getRegistrationDetails().getClassOfVehicleDesc());
			searchReportVo.setModule(ModuleEnum.CITIZEN);
			if (null != regServiceDTO.getOtherStateNOCStatus()
					&& StatusRegistration.NOCVERIFICATIONPENDING.equals(regServiceDTO.getOtherStateNOCStatus())) {
				funPoint(regServiceDTO.getOtherStateNOCStatus(), searchReportVo::setOtherStateNOCStatus);
			}
		} else {
			funPoint(regServiceDTO.getBileteralTaxDetails().getOwnerName(), searchReportVo::setApplicantName);
			searchReportVo.setFatherName("NA");

		}
		searchReportVo.setModule(ModuleEnum.CITIZEN);
		funPoint(regServiceDTO.getApplicationNo(), searchReportVo::setApplicationNumber);
		funPoint(regServiceDTO.getApplicationStatus(), searchReportVo::setApplicationStatus);
		funPoint(regServiceDTO.getPrNo(), searchReportVo::setPrNo);

		if (regServiceDTO.getServiceType() != null) {
			searchReportVo.setServiceType(regServiceDTO.getServiceType());
		}

		if (null != regServiceDTO.getBuyerDetails() && null != regServiceDTO.getBuyerDetails().getTokenNo()) {
			funPoint(regServiceDTO.getBuyerDetails().getTokenNo(), searchReportVo::setToken);
		}
		return searchReportVo;
	}

	public RegServiceVO convertDtoToVoForNOC(RegServiceDTO regServiceDTO) {
		RegServiceVO regServiceVO = new RegServiceVO();
		if (null != regServiceDTO.getnOCDetails()) {
			regServiceVO.setnOCDetails(nOCDetailsMapper.convertEntity(regServiceDTO.getnOCDetails()));
		}
		if (null != regServiceDTO.getInsuranceDetails()) {
			regServiceVO
					.setInsuranceDetailsVo(insuranceDetailsMapper.convertEntity(regServiceDTO.getInsuranceDetails()));
		}
		if (null != regServiceDTO.getPucDetails()) {
			regServiceVO.setPucDetails(pucDetailsMapper.convertEntity(regServiceDTO.getPucDetails()));
		}
		return regServiceVO;
	}

	public RegServiceVO convertLimitedDtoToVoForDataEntry(RegServiceDTO regServiceDTO, RegServiceVO regServiceVO) {

		if (regServiceDTO.getTaxDetails() != null) {
			if (regServiceDTO.getRegistrationDetails().getTaxType() == null) {
				regServiceVO.getRegistrationDetails().setTaxType(regServiceVO.getTaxDetails().getTaxType());
			}

			if (regServiceDTO.getRegistrationDetails().getTaxAmount() == null) {
				if (regServiceDTO.getTaxAmount() != null) {
					regServiceVO.getTaxDetails().setTaxAmount(regServiceDTO.getTaxAmount());
					regServiceVO.getRegistrationDetails().setTaxAmount(regServiceDTO.getTaxAmount());
				} else if (regServiceDTO.getTaxAmount() == null && regServiceVO.getRegistrationDetails() != null) {
					regServiceVO.getRegistrationDetails()
							.setTaxAmount(regServiceVO.getRegistrationDetails().getTaxAmount());
				}
			}
			if (regServiceDTO.getTaxvalidity() != null) {
				regServiceVO.getTaxDetails().setValidUpto(regServiceDTO.getTaxvalidity());
				regServiceVO.getRegistrationDetails().setTaxvalidity(regServiceDTO.getTaxvalidity());
				if (regServiceVO.getRegistrationDetails().getRegistrationValidity() != null) {
					regServiceVO.getRegistrationDetails().getRegistrationValidity()
							.setTaxValidity(regServiceDTO.getTaxvalidity());
				}
			} else {
				if (regServiceVO.getRegistrationDetails().getRegistrationValidity() != null) {
					regServiceVO.getRegistrationDetails().getRegistrationValidity()
							.setTaxValidity(regServiceVO.getTaxDetails().getValidUpto());
				}
			}
			if (regServiceDTO.getTaxDetails() != null && regServiceDTO.getTaxDetails().getVcrno() != null) {
				regServiceVO.getTaxDetails().setPaymentDAte(regServiceDTO.getTaxDetails().getPaymentDAte());
				regServiceVO.getTaxDetails().setMvi(regServiceDTO.getTaxDetails().getMvi());
				regServiceVO.getTaxDetails().setTaxAmount(regServiceDTO.getTaxDetails().getTaxAmount());
				regServiceVO.getTaxDetails().setVcrno(regServiceDTO.getTaxDetails().getVcrno());
			}
			if (regServiceDTO.getTaxDetails().getCollectedAmount() != null) {
				regServiceVO.getTaxDetails().setCollectedAmount(regServiceDTO.getTaxDetails().getCollectedAmount());
			}
			if (regServiceDTO.getTaxDetails().getDate() != null) {
				regServiceVO.getTaxDetails().setDate(regServiceDTO.getTaxDetails().getDate());
			}
		}
		if (regServiceDTO.getRegistrationDetails().getInsuranceDetails() != null) {
			if (regServiceDTO.getInsuranceDetails() == null) {
				regServiceVO.setInsuranceDetailsVo(insuranceDetailsMapper
						.convertEntity(regServiceDTO.getRegistrationDetails().getInsuranceDetails()));
			}
		}
		if (regServiceDTO.getRegistrationDetails().getVahanDetails() != null) {
			if (regServiceDTO.getRegistrationDetails().getVahanDetails().getGvw() == null) {
				regServiceDTO.getRegistrationDetails().getVahanDetails()
						.setGvw(regServiceDTO.getRegistrationDetails().getVahanDetails().getRearAxleWeight());
			}
		}
		if (regServiceDTO.getRegistrationDetails().getInvoiceDetails() != null) {
			if (regServiceDTO.getRegistrationDetails().getInvoiceDetails().getInvoiceDate() == null) {
				regServiceVO.getRegistrationDetails().getInvoiceDetails().setInvoiceDate(
						regServiceVO.getRegistrationDetails().getInvoiceDetails().getInvoiceDateForOther());
			}
		}

		if (regServiceDTO.getRegistrationDetails().getFinanceDetails() != null) {
			if (regServiceDTO.getRegistrationDetails().getFinanceDetails().getCity() != null) {
				regServiceVO.getRegistrationDetails().getFinanceDetails()
						.setCity(regServiceDTO.getRegistrationDetails().getFinanceDetails().getCity());
			}

			if (regServiceDTO.getRegistrationDetails().getFinanceDetails().getMandal() != null) {
				regServiceVO.getRegistrationDetails().getFinanceDetails().setMandal(mandalMapper
						.convertEntity(regServiceDTO.getRegistrationDetails().getFinanceDetails().getMandal()));
			}
			if (regServiceDTO.getRegistrationDetails().getFinanceDetails().getDistrict() != null) {
				regServiceVO.getRegistrationDetails().getFinanceDetails().setDistrict(districtMapper
						.convertEntity(regServiceDTO.getRegistrationDetails().getFinanceDetails().getDistrict()));
			}
			if (regServiceDTO.getRegistrationDetails().getFinanceDetails().getState() != null) {
				regServiceVO.getRegistrationDetails().getFinanceDetails().setState(stateMapper
						.convertEntity(regServiceDTO.getRegistrationDetails().getFinanceDetails().getState()));
			}
		}
		if (regServiceDTO.getFeeDetails() != null) {
			regServiceVO.getRegistrationDetails()
					.setFeeDetailsVO(feeDetailsMapper.convertEntity(regServiceDTO.getFeeDetails()));
		}
		funPoint(regServiceDTO.isMviDone(), regServiceVO::setMviDone);
		return regServiceVO;
	}

	public RegServiceDTO freshRcforFinanceMapper(UserDTO userDTO, RegServiceDTO regServiceDTO) {
		ApplicantAddressDTO applicantAddressDTO = new ApplicantAddressDTO();
		ContactDTO contactDTO = new ContactDTO();
		if (userDTO.getAadharNo() != null) {
			regServiceDTO.setAadhaarNo(userDTO.getAadharNo());
			if (userDTO.getDistrict() != null) {
				applicantAddressDTO.setDistrict(userDTO.getDistrict());
			}
			if (userDTO.getMandal() != null) {
				applicantAddressDTO.setMandal(userDTO.getMandal());
			}
			if (userDTO.getRepresentativeEmail() != null) {
				contactDTO.setEmail(userDTO.getRepresentativeEmail());
			}
			if (userDTO.getRepresentativeMobileNo() != null) {
				contactDTO.setMobile(userDTO.getRepresentativeEmail());
			}
			if (userDTO.getState() != null) {
				applicantAddressDTO.setState(userDTO.getState());
			}
			if (userDTO.getStreetName() != null) {
				applicantAddressDTO.setStreetName(userDTO.getStreetName());
			}

			if (userDTO.getDoorNo() != null) {
				applicantAddressDTO.setDoorNo(userDTO.getDoorNo());
			}
			regServiceDTO.setContactDetails(contactDTO);
			regServiceDTO.setPresentAdderss(applicantAddressDTO);
		}
		return regServiceDTO;

	}

	/**
	 * This method is used to display the value for application search For Mobile
	 * 
	 * @param regServiceDTO
	 * @return searchreport vo
	 */
	public CitizenSearchReportVO convertSpecificFieldsForCtizenSearchForMobile(RegServiceDTO regServiceDTO) {
		CitizenSearchReportVO searchReportVo = new CitizenSearchReportVO();
		funPoint(regServiceDTO.getApplicationNo(), searchReportVo::setApplicationNumber);
		funPoint(regServiceDTO.getRegistrationDetails().getApplicantDetails().getFirstName(),
				searchReportVo::setApplicantName);
		funPoint(regServiceDTO.getApplicationStatus(), searchReportVo::setApplicationStatus);
		funPoint(regServiceDTO.getPrNo(), searchReportVo::setPrNo);
		funPoint(regServiceDTO.getRegistrationDetails().getTrNo(), searchReportVo::setTrNo);
		if (regServiceDTO.getServiceType() != null) {
			searchReportVo.setServiceType(regServiceDTO.getServiceType());
		}
		funPoint(regServiceDTO.getRegistrationDetails().getApplicantDetails().getFatherName(),
				searchReportVo::setFatherName);
		if (null != regServiceDTO.getBuyerDetails() && null != regServiceDTO.getBuyerDetails().getTokenNo()) {
			funPoint(regServiceDTO.getBuyerDetails().getTokenNo(), searchReportVo::setToken);
		}
		searchReportVo.setModule(ModuleEnum.CITIZEN);
		return searchReportVo;
	}

	public List<CitizenSearchReportVO> convertSpecificFieldsForCtizenSearch(List<RegServiceDTO> regServiceDTO) {
		return regServiceDTO.stream().map(e -> convertSpecificFieldsForCtizenSearch(e)).collect(Collectors.toList());
	}

	public RegServiceDTO freshRcforFinanceMapper(RegServiceVO input, UserDTO userDTO, RegServiceDTO regServiceDTO,
			OfficeDTO officeDTO) {
		ContactDTO contactDTO = new ContactDTO();
		if (input.getFreshRc() != null) {
			input.getFreshRc().setFinancerUserId(input.getFinancierUserId());
			regServiceDTO.setFreshRcdetails(freshRCMapper.convertVO(input.getFreshRc()));
			if (userDTO.getEmail() != null) {
				contactDTO.setEmail(userDTO.getEmail());
			}
			if (userDTO.getMobile() != null) {
				contactDTO.setMobile(userDTO.getMobile());
			}
			regServiceDTO.getFreshRcdetails().setFinancerContactDetails(contactDTO);
		}
		if (input.getFreshRc().getFinancerUserId() != null) {
			input.getFreshRc().setFinancerDetails(userMapper.convertEntity(userDTO));
		}
		regServiceDTO.getFreshRcdetails()
				.setFinancerDetails(userMapper.convertVO(input.getFreshRc().getFinancerDetails()));
		if (officeDTO != null) {
			input.setMviOfficeDetails(officeMapper.convertEntity(officeDTO));
		}
		if (input.getMviOfficeDetails() != null) {
			regServiceDTO.setMviOfficeDetails(officeMapper.convertVO(input.getMviOfficeDetails()));
		}
		return regServiceDTO;
	}

	public RegServiceDTO convertEntity(MotorDrivingSchoolDTO dt) {
		RegServiceDTO dto = new RegServiceDTO();
		if (dt != null) {
			dto.setApplicationNo(dt.getApplicationNo());
			dto.setMotorDrivingSchoolDTO(dt);

		}
		return dto;

	}

	public StagingRegServiceDetailsAutoApprovalDTO convertStagingRegServiceDetailsAutoApproval(
			RegServiceDTO regServiceDTO, Set<String> roles) {
		StagingRegServiceDetailsAutoApprovalDTO stagingRegSerLog = new StagingRegServiceDetailsAutoApprovalDTO();
		stagingRegSerLog.setRegService(regServiceDTO);
		stagingRegSerLog.setAutoApprovalsDate(LocalDate.now());
		stagingRegSerLog.setCreatedDate(LocalDateTime.now());
		stagingRegSerLog.setAutoApprovalInitiatedDate(regServiceDTO.getAutoApprovalInitiatedDate());
		if (regServiceDTO.getServiceType().contains(ServiceEnum.CHANGEOFADDRESS)) {
			if (regServiceDTO.getPresentAdderss() != null && regServiceDTO.getPresentAdderss().getDistrict() != null) {
				stagingRegSerLog.setDistrict(regServiceDTO.getPresentAdderss().getDistrict());
				stagingRegSerLog.setDistrictId(regServiceDTO.getPresentAdderss().getDistrict().getDistrictId());
				stagingRegSerLog.setDistrictName(regServiceDTO.getPresentAdderss().getDistrict().getDistrictName());
			}
		} else {
			if (regServiceDTO.getRegistrationDetails() != null
					&& regServiceDTO.getRegistrationDetails().getApplicantDetails() != null
					&& regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress() != null
					&& regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getDistrict() != null) {
				stagingRegSerLog.setDistrict(
						regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress().getDistrict());
				stagingRegSerLog.setDistrictId(regServiceDTO.getRegistrationDetails().getApplicantDetails()
						.getPresentAddress().getDistrict().getDistrictId());
				stagingRegSerLog.setDistrictName(regServiceDTO.getRegistrationDetails().getApplicantDetails()
						.getPresentAddress().getDistrict().getDistrictName());
			}
		}

		funPoint(regServiceDTO.getPrNo(), stagingRegSerLog::setPrNo);
		funPoint(regServiceDTO.getOfficeCode(), stagingRegSerLog::setOfficeCode);
		funPoint(regServiceDTO.getApplicationNo(), stagingRegSerLog::setApplicationNo);
		funPoint(regServiceDTO.getApplicationNo(), stagingRegSerLog::setApplicationNo);
		funPoint(regServiceDTO.getServiceType(), stagingRegSerLog::setServiceName);
		funPoint(roles, stagingRegSerLog::setRoleType);
		return stagingRegSerLog;
	}

	public DataVO convertRegServiceDTO(RegServiceDTO regServiceDTO, String hsrpFee, String cmfsId) {

		DataVO dataVO = new DataVO();

		funPoint(replaceDefaults(regServiceDTO.getOfficeDetails().getOfficeCode()), dataVO::setRtoCode);
		funPoint(replaceDefaults(regServiceDTO.getOfficeDetails().getOfficeName()), dataVO::setRtoName);
		funPoint(replaceDefaults(regServiceDTO.getOfficeDetails().getHsrpOffice()), dataVO::setAffixationCenterCode);
		funPoint(replaceDefaults(regServiceDTO.getApplicationNo()), dataVO::setTransactionNo);
		funPoint(
				replaceDefaults(DateConverters
						.convertHSRLocalDateFormat(regServiceDTO.getRegistrationDetails().getTrGeneratedDate())),
				dataVO::setTransactionDate);
		funPoint(
				replaceDefaults(DateConverters
						.convertHSRLocalDateFormat(regServiceDTO.getRegistrationDetails().getTrGeneratedDate())),
				dataVO::setAuthorizationDate);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getVahanDetails().getEngineNumber()),
				dataVO::setEngineNo);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getVahanDetails().getChassisNumber()),
				dataVO::setChassisNo);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getFirstName()),
				dataVO::setOwnerName);
		funPoint(replaceDefaults(this.onwerAddress(regServiceDTO)), dataVO::setOwnerAddress);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getContact().getEmail()),
				dataVO::setOwnerEmailId);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
				.getPostOffice().getPostOfficeCode().toString()), dataVO::setOwnerPinCode);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getContact().getMobile()),
				dataVO::setMobileNo);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getClassOfVehicleDesc()),
				dataVO::setVehicleType);
		funPoint("NB", dataVO::setTransType);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getVehicleType()), dataVO::setVehicleClassType);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getVahanDetails().getManufacturedMonthYear()),
				dataVO::setMfrsName);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getVahanDetails().getMakersModel()),
				dataVO::setModelName);
		funPoint(replaceDefaults(hsrpFee), dataVO::setHsrpFee);
		funPoint(replaceDefaults(cmfsId), dataVO::setPaymentsId);

		funPoint("N", dataVO::setOldNewFlag);
		funPoint("", dataVO::setGovtVehicleTag);
		funPoint(replaceDefaults(regServiceDTO.getTrNo()), dataVO::setTrNumber);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getDealerDetails().getDealerName()),
				dataVO::setDealerName);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getDealerDetails().getDealerMail()),
				dataVO::setDealerMail);
		funPoint(replaceDefaults(regServiceDTO.getRegistrationDetails().getDealerDetails().getDealerId()),
				dataVO::setDealerRtoCode);
		funPoint("", dataVO::setPrNumber);
		if (regServiceDTO.getPrNo() != null) {
			funPoint(replaceDefaults(regServiceDTO.getPrNo()), dataVO::setPrNumber);
		}
		funPoint("", dataVO::setRegDate);
		return dataVO;
	}

	private String onwerAddress(RegServiceDTO regServiceDTO) {
		String address = null;
		if (regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress() != null) {
			address = replaceDefaults(
					regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress().getDoorNo())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getStreetName())
					+ " "
					+ replaceDefaults(
							regServiceDTO
									.getRegistrationDetails().getApplicantDetails().getPresentAddress().getTownOrCity())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getVillage() == null
									? StringUtils.EMPTY
									: regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
											.getVillage().getVillageName())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getMandal() == null
									? ""
									: regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
											.getMandal().getMandalName())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getDistrict() == null
									? ""
									: regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
											.getDistrict().getDistrictName())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getState() == null
									? ""
									: regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
											.getState().getStateName())
					+ " "
					+ replaceDefaults(regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
							.getPostOffice() == null ? ""
									: regServiceDTO.getRegistrationDetails().getApplicantDetails().getPresentAddress()
											.getPostOffice().getPostOfficeCode().toString());
		}
		return address;
	}

	private String replaceDefaults(String input) {

		if (StringUtils.isBlank(input)) {
			return StringUtils.EMPTY;
		}
		return input;
	}

	public List<RegReportVO> convertNocEntityLimitedList(List<RegServiceDTO> regDetails) {
		return regDetails.stream().map(e -> convertNocFieldsToDisplay(e)).collect(Collectors.toList());
	}

	public RegReportVO convertNocFieldsToDisplay(RegServiceDTO regService) {
		RegReportVO regReportVO = new RegReportVO();
		funPoint(regService.getPrNo(), regReportVO::setPrNo);
		funPoint(regService.getRegistrationDetails().getApplicantDetails().getRepresentativeName(),
				regReportVO::setOwnerName);
		funPoint(regService.getRegistrationDetails().getVehicleDetails().getClassOfVehicleDesc(), regReportVO::setCov);
		if (regService.getnOCDetails() != null) {
			regReportVO.setNocDetails(nOCDetailsMapper.convertEntity(regService.getnOCDetails()));
		}
		List<ActionDetailsVO> actionList = new ArrayList<ActionDetailsVO>();
		List<ActionDetails> listdto = regService.getActionDetails();
		if (listdto != null) {
			for (ActionDetails actionDTO : listdto) {
				ActionDetailsVO actionsVO = new ActionDetailsVO();
				actionsVO.setId(actionDTO.getId());
				actionsVO.setUserId(actionDTO.getUserId());
				actionsVO.setRole(actionDTO.getRole());
				actionsVO.setStatus(actionDTO.getStatus());

				actionList.add(actionsVO);
				regReportVO.setUserAction(actionList);

			}
		}

		funPoint(regService.getOfficeDetails().getOfficeName(), regReportVO::setOfficeName);
		return regReportVO;
	}

	public List<CitizenEnclosuresVO> citizenServicesList(List<RegServiceDTO> citizenServices) {

		List<CitizenEnclosuresVO> regServicesList = new ArrayList<>();

		for (RegServiceDTO data : citizenServices) {

			CitizenEnclosuresVO serviceDetails = new CitizenEnclosuresVO();

			if (data.getPrNo() != null) {
				serviceDetails.setPrNo(data.getPrNo());
			} else {
				serviceDetails.setPrNo(data.getTrNo());
			}

			if (!CollectionUtils.isEmpty(data.getServiceType())) {
				serviceDetails.setServiceType(data.getServiceType());
			}
			serviceDetails.setApplicationNo(data.getApplicationNo());
			if (null != data.getCreatedDate()) {
				serviceDetails.setAppliedDate(data.getCreatedDate().toLocalDate());
			}
			if (null != data.getApplicationStatus()) {
				serviceDetails.setApplStatus(data.getApplicationStatus().toString());
			}
			if (data.getRegistrationDetails() != null && data.getRegistrationDetails().getVahanDetails() != null) {

				if (data.getRegistrationDetails().getVahanDetails().getChassisNumber() != null) {
					serviceDetails.setChassisNo(data.getRegistrationDetails().getVahanDetails().getChassisNumber());
				}
				if (null != data.getRegistrationDetails().getVahanDetails().getEngineNumber()) {
					serviceDetails.setEngineNo(data.getRegistrationDetails().getVahanDetails().getEngineNumber());
				}
			}
			if (data.getRegistrationDetails().getApplicantDetails() != null) {
				if (null != data.getRegistrationDetails().getApplicantDetails().getDisplayName()) {
					serviceDetails
							.setApplicantName(data.getRegistrationDetails().getApplicantDetails().getDisplayName());
				}
				if (null != data.getRegistrationDetails().getClassOfVehicleDesc()) {
					serviceDetails.setCov(data.getRegistrationDetails().getClassOfVehicleDesc());
				}
			}
			if (data.getActionDetails() != null) {

				data.getActionDetails().stream().forEach(a -> {

					if (a.getRole().equalsIgnoreCase(RoleEnum.CCO.getName())) {
						if (a.getlUpdate() != null && a.getUserId() != null) {
							serviceDetails.setCcoApprovedDate(a.getlUpdate().toLocalDate());
							serviceDetails.setCcouserId((a.getUserId()));
						}
					}
					if (a.getRole().equalsIgnoreCase(RoleEnum.MVI.getName())) {
						if (a.getlUpdate() != null && a.getUserId() != null) {
							serviceDetails.setMviApprovedDate(a.getlUpdate().toLocalDate());
							serviceDetails.setMviUserId((a.getUserId()));
						}
					}
					if (a.getRole().equalsIgnoreCase(RoleEnum.AO.getName())) {
						if (a.getlUpdate() != null && a.getUserId() != null) {
							serviceDetails.setAoApprovedDate(a.getlUpdate().toLocalDate());
							serviceDetails.setAoUserId(a.getUserId());
						}
					}
					if (a.getRole().equalsIgnoreCase(RoleEnum.RTO.getName())) {
						if (a.getlUpdate() != null && a.getUserId() != null) {
							serviceDetails.setRtoApprovedDate(a.getlUpdate().toLocalDate());
							serviceDetails.setRtouserId(a.getUserId());
						}
					}
				});
			}

			regServicesList.add(serviceDetails);
		}
		return regServicesList;
	}

	public RegServiceVO convertEntity(OtherStateTemporaryPermitDetailsDTO osTpDetailsDto,
			VoluntaryTaxDTO vtDetailsDto) {
		RegServiceVO regVO = new RegServiceVO();
		OtherStateTemporaryPermitDetailsVO ostTpVO = new OtherStateTemporaryPermitDetailsVO();
		VoluntaryTaxVO vtVO = new VoluntaryTaxVO();
		ApplicantDetailsVO applicantDetailsVO = new ApplicantDetailsVO();
		if (osTpDetailsDto != null) {
			if (osTpDetailsDto.getVehicleDetails() != null) {
				ostTpVO.setVehicleDetails(vehicleDetailsMapper.convertEntity(osTpDetailsDto.getVehicleDetails()));
			}
			if (osTpDetailsDto.getTemporaryPermitDetails() != null) {
				ostTpVO.setTemporaryPermitDetails(
						permitDetailsMapper.convertEntity(osTpDetailsDto.getTemporaryPermitDetails()));
			}
			if (osTpDetailsDto.getFeeDetails() != null) {
				regVO.setFeeDetails(feeDetailsMapper.convertEntity(osTpDetailsDto.getFeeDetails()));
			}
			applicantDetailsVO.setDisplayName(osTpDetailsDto.getApplicantDetails().getDisplayName());
			ostTpVO.setApplicantDetails(applicantDetailsVO);
			ostTpVO.setCreatedDate(osTpDetailsDto.getCreatedDate());
			regVO.setOtherStateTemporaryPermit(ostTpVO);

		}
		if (vtDetailsDto != null) {
			vtVO.setApplicationNo(vtDetailsDto.getApplicationNo());
			vtVO.setRegNo(vtDetailsDto.getRegNo());
			vtVO.setClassOfVehicle(vtDetailsDto.getClassOfVehicle());
			vtVO.setClassOfVehicleDesc(vtDetailsDto.getClassOfVehicleDesc());
			vtVO.setGvw(vtDetailsDto.getGvw());
			vtVO.setUlw(vtDetailsDto.getUlw());
			vtVO.setOwnerName(vtDetailsDto.getOwnerName());
			vtVO.setSeatingCapacity(vtDetailsDto.getSeatingCapacity());
			vtVO.setTax(vtDetailsDto.getTax());
			vtVO.setServiceFee(vtDetailsDto.getServiceFee());
			vtVO.setTaxType(vtDetailsDto.getTaxType());
			vtVO.setTaxvalidFrom(vtDetailsDto.getTaxvalidFrom());
			vtVO.setTaxvalidUpto(vtDetailsDto.getTaxvalidUpto());
			vtVO.setPaidDate(vtDetailsDto.getPaidDate());
			regVO.setCreatedDate(vtDetailsDto.getCreatedDate());
			regVO.setVoluntaryTaxDetails(vtVO);
		}
		return regVO;
	}

	public List<CommonFieldsVO> convertFCFields(List<RegServiceDTO> regServiceDTOList, List<ImageInput> imageInput,
			String userId) {
		List<CommonFieldsVO> vo = new ArrayList<>();
		for (RegServiceDTO e : regServiceDTOList) {
			try {
				CommonFieldsVO single = convertFieldsForFC(e, imageInput, userId);
				vo.add(single);
			} catch (CloneNotSupportedException e1) {
				throw new BadRequestException(e1.getMessage());
			}
		}
		return vo;
	}

	private CommonFieldsVO convertFieldsForFC(RegServiceDTO dto, List<ImageInput> imageInput, String userId)
			throws CloneNotSupportedException {
		CommonFieldsVO vo = new CommonFieldsVO();
		vo.setApplicationNo(dto.getApplicationNo());
		vo.setPrNo(dto.getPrNo());
		List<ImageInput> image = new ArrayList<>();
		Iterator<ImageInput> iterator = imageInput.iterator();
		while (iterator.hasNext()) {
			image.add((ImageInput) iterator.next().clone());
		}
		Optional<TemporaryEnclosuresDTO> enlosuresOptional = temporaryEnclosuresDAO
				.findByApplicationNoAndCreatedByAndStatusIsFalse(vo.getApplicationNo(), userId);
		if (enlosuresOptional != null && enlosuresOptional.isPresent()) {
			for (ImageInput input : image) {
				for (KeyValue<String, List<ImageEnclosureDTO>> uploadInmages : enlosuresOptional.get()
						.getEnclosures()) {
					if (uploadInmages.getKey().equalsIgnoreCase(input.getType())) {
						ImageEnclosureDTO imgage = uploadInmages.getValue().stream().findFirst().get();
						input.setUrl(imagePreUrl + "?appImageDocId=" + imgage.getImageId());
						if (StringUtils.isNoneBlank(imgage.getRemarks())) {
							input.setRemarks(imgage.getRemarks());
						}
					}
				}
			}
		}

		vo.setImageInput(image);
		if (dto.getRegistrationDetails() != null) {
			if (dto.getRegistrationDetails().getApplicantDetails() != null) {
				StringBuilder sb = new StringBuilder();
				if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getApplicantDetails().getFirstName())) {
					sb.append(dto.getRegistrationDetails().getApplicantDetails().getFirstName());
				}
				if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getApplicantDetails().getLastName())) {
					sb.append(dto.getRegistrationDetails().getApplicantDetails().getLastName());
				}
				vo.setName(sb.toString());
				if (dto.getRegistrationDetails().getApplicantDetails().getContact() != null && StringUtils
						.isNoneBlank(dto.getRegistrationDetails().getApplicantDetails().getContact().getMobile())) {
					vo.setMobile(dto.getRegistrationDetails().getApplicantDetails().getContact().getMobile());
				}

				if (dto.getRegistrationDetails().getVahanDetails() != null) {
					if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getVahanDetails().getChassisNumber())) {
						vo.setChassisNumber(dto.getRegistrationDetails().getVahanDetails().getChassisNumber());
					}
					if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getVahanDetails().getEngineNumber())) {
						vo.setEngineNumber(dto.getRegistrationDetails().getVahanDetails().getEngineNumber());
					}
					if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getVahanDetails().getMakersModel())) {
						vo.setMakersModel(dto.getRegistrationDetails().getVahanDetails().getMakersModel());
					}
					if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getVahanDetails().getSeatingCapacity())) {
						vo.setSeatingCapacity(dto.getRegistrationDetails().getVahanDetails().getSeatingCapacity());
					}
					if (dto.getRegistrationDetails().getVahanDetails().getGvw() != null) {
						vo.setGvw(dto.getRegistrationDetails().getVahanDetails().getGvw());
					}
					if (dto.getRegistrationDetails().getVahanDetails().getUnladenWeight() != null) {
						vo.setUlw(dto.getRegistrationDetails().getVahanDetails().getUnladenWeight());
					}
					if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getVahanDetails().getBodyTypeDesc())) {
						vo.setBodyTypeDesc(dto.getRegistrationDetails().getVahanDetails().getBodyTypeDesc());
					}
				}
				if (StringUtils.isNoneBlank(dto.getRegistrationDetails().getClassOfVehicleDesc())) {
					vo.setClassOfVehicle(dto.getRegistrationDetails().getClassOfVehicleDesc());
				}
			}
			if (dto.getRegistrationDetails().getOfficeDetails() != null
					&& StringUtils.isNoneBlank(dto.getRegistrationDetails().getOfficeDetails().getOfficeName())) {
				vo.setOfficeName(dto.getRegistrationDetails().getOfficeDetails().getOfficeName());
			}

		}
		if (dto.getMviOfficeDetails() != null && StringUtils.isNoneBlank(dto.getMviOfficeDetails().getOfficeName())) {
			vo.setInspectionOfficeName(dto.getMviOfficeDetails().getOfficeName());
		}
		if (dto.getSlotDetails() != null && dto.getSlotDetails().getSlotDate() != null) {
			vo.setTestSlotDate(dto.getSlotDetails().getSlotDate());
		}
		if (dto.getServiceType() != null && !dto.getServiceType().isEmpty()) {
			vo.setServiceType(dto.getServiceType().stream().findFirst().get());
		}
		return vo;
	}

	/**
	 * Mapper for Permit History Screen
	 */

	public PermitHistoryDeatilsVO primarypermitDetails(PermitDetailsDTO data) {

		PermitHistoryDeatilsVO vo = new PermitHistoryDeatilsVO();

		if (data.getPrNo() != null)
			vo.setPrNo(data.getPrNo());
		if (data.getPermitNo() != null)
			vo.setPermitNumber(data.getPermitNo());
		if (data.getPermitType() != null && data.getPermitType().getDescription() != null)
			vo.setPermitType(data.getPermitType().getDescription());
		if (data.getRdto() != null && data.getRdto().getClassOfVehicleDesc() != null)
			vo.setCov(data.getRdto().getClassOfVehicleDesc());
		if (data.getPermitValidityDetails() != null) {
			if (data.getPermitValidityDetails().getPermitValidFrom() != null)
				vo.setVallidFrom(data.getPermitValidityDetails().getPermitValidFrom());
			if (data.getPermitValidityDetails().getPermitValidTo() != null)
				vo.setValidUpto(data.getPermitValidityDetails().getPermitValidTo());
			if (data.getPermitValidityDetails().getPermitAuthorizationValidFrom() != null)
				vo.setAuthVallidFrom(data.getPermitValidityDetails().getPermitAuthorizationValidFrom());
			if (data.getPermitValidityDetails().getPermitAuthorizationValidTo() != null)
				vo.setAuthValidUpto(data.getPermitValidityDetails().getPermitAuthorizationValidTo());
		}
		if (data.getRouteDetails() != null) {
			if (data.getRouteDetails().getValidFromRoute() != null)
				vo.setValidFromRoute(data.getRouteDetails().getValidFromRoute());
			if (data.getRouteDetails().getValidToRoute() != null)
				vo.setValidToRoute(data.getRouteDetails().getValidToRoute());
			if (data.getRouteDetails().getForwardRoute() != null)
				vo.setValidFromRoute(data.getRouteDetails().getForwardRoute());
			if (data.getRouteDetails().getReturnRoute() != null)
				vo.setValidToRoute(data.getRouteDetails().getReturnRoute());
			if (data.getRouteDetails().getValidFromRoute() == null && data.getRouteDetails().getValidToRoute() == null
					&& data.getRouteDetails().getPermitRouteDetails() != null
					&& data.getRouteDetails().getPermitRouteDetails().getDescription() != null)
				vo.setValidToRoute(data.getRouteDetails().getPermitRouteDetails().getDescription());
		}
		if (data.getPermitStatus() != null)
			vo.setStatus(data.getPermitStatus());

		return vo;
	}

	private String getValue(String value) {
		if (StringUtils.isNotBlank(value)) {
			return value;
		}
		return StringUtils.EMPTY;
	}

	public OsDataEntryFinalVO convertEntityToVo(List<RegServiceDTO> listOfRecords, HashMap<String, Double> hashMap) {
		List<OsDataEntryReport> throughMvi = new ArrayList<OsDataEntryReport>();
		List<OsDataEntryReport> throughOnline = new ArrayList<OsDataEntryReport>();
		Set<String> keySet = hashMap.keySet();
		for (RegServiceDTO a : listOfRecords) {
			OsDataEntryReport osDataEntryReport = new OsDataEntryReport();
			funPoint(a.getApplicationNo(), osDataEntryReport::setApplicationNo);
			funPoint(a.getPrNo(), osDataEntryReport::setPrNo);
			funPoint(a.getRegistrationDetails().getClassOfVehicle(), osDataEntryReport::setClassOfVehicle);
			funPoint(a.getRegistrationDetails().getVehicleType(), osDataEntryReport::setVehicleType);
			if (a.getRegistrationDetails() != null && a.getRegistrationDetails().getApplicantDetails() != null) {
				funPoint(a.getRegistrationDetails().getApplicantDetails().getDisplayName(),
						osDataEntryReport::setOwnerName);
			}
			if (keySet.contains(a.getApplicationNo())) {
				funPoint(hashMap.get(a.getApplicationNo()), osDataEntryReport::setTaxAmount);
				if (a.getTaxDetails() != null) {
					funPoint(a.getTaxDetails().getTaxType(), osDataEntryReport::setTaxType);
					String date = a.getTaxDetails().getPaymentDAte() == null ? StringUtils.EMPTY
							: getValue(a.getTaxDetails().getPaymentDAte().toString());
					funPoint(date, osDataEntryReport::setPaymentDate);
					throughOnline.add(osDataEntryReport);
					continue;
				}
			} else {
				if (a.getTaxDetails() != null) {
					funPoint(a.getTaxDetails().getMvi(), osDataEntryReport::setMviName);
					funPoint(a.getTaxDetails().getTaxAmount(), osDataEntryReport::setMviAmount);
					String date = a.getTaxDetails().getPaymentDAte() == null ? StringUtils.EMPTY
							: getValue(a.getTaxDetails().getPaymentDAte().toString());
					funPoint(date, osDataEntryReport::setPaymentDate);
				}
			}
			throughMvi.add(osDataEntryReport);
		}
		OsDataEntryFinalVO osDataEntryFinalVO = new OsDataEntryFinalVO();
		Map<String, List<OsDataEntryReport>> throughMviCollAmount = new HashMap<String, List<OsDataEntryReport>>();
		Map<String, List<OsDataEntryReport>> throughOnlinePay = new HashMap<String, List<OsDataEntryReport>>();
		throughMviCollAmount.put("throughMviCollAmount", throughMvi);
		throughOnlinePay.put("throughOnlinePay", throughOnline);
		funPoint(throughMviCollAmount, osDataEntryFinalVO::setThroughMviCollRecords);
		funPoint(throughOnlinePay, osDataEntryFinalVO::setThroughOnlinePayRecords);

		funPoint(throughMvi.size(), osDataEntryFinalVO::setThroughMviCollAmount);
		funPoint(throughOnline.size(), osDataEntryFinalVO::setThroughOnlinePay);
		return osDataEntryFinalVO;
	}

	public void mappingNonPayTax(List<String> noTaxRecordFoundList, List<RegServiceDTO> listOfRecords,
			OsDataEntryFinalVO osDataEntryFinalVO) {
		Map<String, List<OsDataEntryReport>> noTaxes = new HashMap<String, List<OsDataEntryReport>>();
		List<RegServiceDTO> noTax = listOfRecords.stream()
				.filter(p -> noTaxRecordFoundList.contains(p.getApplicationNo())).collect(Collectors.toList());
		List<OsDataEntryReport> list = new ArrayList<OsDataEntryReport>();
		noTax.forEach(tax -> {
			OsDataEntryReport osDataEntryReport = new OsDataEntryReport();
			funPoint(tax.getApplicationNo(), osDataEntryReport::setApplicationNo);
			funPoint(tax.getPrNo(), osDataEntryReport::setPrNo);
			if (tax.getRegistrationDetails() != null) {
				funPoint(tax.getRegistrationDetails().getClassOfVehicle(), osDataEntryReport::setClassOfVehicle);
				funPoint(tax.getRegistrationDetails().getVehicleType(), osDataEntryReport::setVehicleType);
				if (tax.getRegistrationDetails().getApplicantDetails() != null) {
					if (tax.getRegistrationDetails() != null
							&& tax.getRegistrationDetails().getApplicantDetails() != null) {
						funPoint(tax.getRegistrationDetails().getApplicantDetails().getDisplayName(),
								osDataEntryReport::setOwnerName);
					}
				}
			}
			list.add(osDataEntryReport);
		});
		noTaxes.put("noTax", list);
		osDataEntryFinalVO.setNoTaxRecordCount(list.size());
		osDataEntryFinalVO.setNoTaxRecords(noTaxes);

	}

	public VcrHistoryVO setVcrDetails(VcrFinalServiceDTO data) {

		VcrHistoryVO vo = new VcrHistoryVO();

		if (data.getRegistration().getRegNo() != null)
			vo.setPrNo(data.getRegistration().getRegNo());
		if (data.getVcr().getVcrNumber() != null)
			vo.setVcrNumber(data.getVcr().getVcrNumber());
		if (data.getVcr().getDateOfCheck() != null)
			vo.setBookedDate(data.getVcr().getDateOfCheck().toLocalDate());
		if (data.getUsername() != null)
			vo.setBookedMVIName(data.getUsername());
		if (data.getCreatedDate() != null)
			vo.setEntryDate(data.getCreatedDate().toLocalDate());
		if (data.getCreatedBy() != null)
			vo.setEnteredBy(data.getCreatedBy());
		if (data.getOfficeName() != null)
			vo.setOfficeName(data.getOfficeName());
		if (data.getOffencetotal() != null)
			vo.setCompoundingFee(data.getOffencetotal().toString());
		if (data.getIsSpeedGun() != null) {
			vo.setVcrType("speedGun");
		} else {
			vo.setVcrType("evcr");
		}

		if (data.getIsVcrClosed() != null && data.getIsVcrClosed()) {
			vo.setStatus("PAID");
			if (data.getPaymentType() != null && data.getPaymentType().equalsIgnoreCase("CASH")) {
				vo.setPayType("CASH");
				if (data.getPaidDate() != null)
					vo.setPaidDate(data.getPaidDate().toLocalDate());

			} else {
				vo.setPayType("ONLINE");
				
				
				if(data.getTax() != null)
				vo.setTax(data.getTax().toString());
				
				if(data.getPenalty() != null)
					vo.setPenalty(data.getPenalty().toString());
				
				if(data.getTaxArrears() != null)
					vo.setTaxArrears(data.getTaxArrears().toString());
				if(data.getPenaltyArrears() != null)
					vo.setPenaltyArrears(data.getPenaltyArrears().toString());
				
//				List<PaymentTransactionDTO> paymentList = paymentTransactionDAO
//					.findByApplicationFormRefNum(data.getServiceApplicationNo());

//				if (!paymentList.isEmpty()) {
//					paymentList.stream().forEach(x -> {
//						if (x.getPayStatus() != null) {
//							if (x.getPayStatus().equalsIgnoreCase("success")) {
//								vo.setPaidDate(x.getlUpdate().toLocalDate());
//
//								if (x.getFeeDetailsDTO() != null && x.getFeeDetailsDTO().getFeeDetails() != null) {
//									x.getFeeDetailsDTO().getFeeDetails().forEach(y -> {
//										if (y.getFeesType() != null) {
//											if (y.getFeesType().contains("Tax"))
//												vo.setTax(y.getAmount().toString());
//
//											if (y.getFeesType().equalsIgnoreCase("Penalty"))
//												vo.setPenalty(y.getAmount().toString());
//
//										}
//									});
//								}
//							}
//						}
//					});
//				}
				
			}
		} else
			vo.setStatus("UNPAID");

		return vo;
	}
	public RegServiceVO convertEntityForMobileApp(RegServiceDTO dto) {
		// TODO Auto-generated method stub
		RegServiceVO regServiceVO = new RegServiceVO();
		if (dto != null) {
			regServiceVO.setAadhaarNo(dto.getAadhaarNo());
			regServiceVO.setPrNo(dto.getPrNo());
			regServiceVO.setTrNo(dto.getTrNo());
			regServiceVO.setOfficeCode(dto.getOfficeCode());
			funPoint(dto.getPrNo(),  regServiceVO::setApplicationNo);
			if (dto.getBasicApplicantDetails() != null) {
				regServiceVO.setBasicApplicantDetails(
						applicantDeatilsMapper.convertRequiredEntity(dto.getBasicApplicantDetails()));
			}
			if (dto.getFreshRcdetails() != null) {

				regServiceVO.setFreshRc(freshRCMapper.convertEntity(dto.getFreshRcdetails()));
				regServiceVO.setMviOfficeCode(dto.getMviOfficeCode());
			}
			/*
			 * if(dto.getFlowDetails()!=null){
			 * regServiceVO.setFlowDetails(flowMapper.convertEntity(dto. getFlowDetails()));
			 * } if(dto.getFeeDetails()!=null){
			 * regServiceVO.setFeeDetails(feeDetailsMapper.convertEntity(dto.
			 * getFeeDetails())); }
			 */
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getNewOfficeDetails() != null) {
				regServiceVO.setNewOfficeDetails(officeMapper.convertEntity(dto.getNewOfficeDetails()));
			}
			if (dto.getOfficeDetails() != null) {
				regServiceVO.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			}
			if (dto.getServiceType() != null) {
				regServiceVO.setServiceType(dto.getServiceType());
			}
			if (dto.getSlotDetails() != null) {
				regServiceVO.setSlotDetails(slotDetailsMapper.convertEntity(dto.getSlotDetails()));
			}

			funPoint(dto.getApplicationStatus(), regServiceVO::setApplicationStatus);

			if (dto.getPresentAdderss() != null) {
				regServiceVO.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAdderss()));
			}

			funPoint(dto.getGatewayType(), regServiceVO::setGatewayType);
			funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
			if (dto.getBuyerDetails() != null) {
				regServiceVO.setTowDetails(towMapper.convertEntity(dto.getBuyerDetails()));
			}
			if (dto.getBreakPayments() != null) {
				regServiceVO.setBreakPaymentsVo(breakPaymentsSaveMapper.convertEntity(dto.getBreakPayments()));
			}

			if (dto.getPdtl() != null) {
				regServiceVO.setPermitDetailsVO(permitDetailsMapper.convertEntity(dto.getPdtl()));
			}
			if (dto.getDuplicateDetails() != null) {
				regServiceVO.setDuplicateDetailsVO(duplicateDetailsMapper.convertEntity(dto.getDuplicateDetails()));
			}
			if (dto.getAlterationDetails() != null) {
				regServiceVO.setAlterationVO(alterationMapper.convertEntity(dto.getAlterationDetails()));
			}
			if(dto.getSpecificVcrPayment()!=null) {
				 regServiceVO.setSpecificVcrPayment(dto.getSpecificVcrPayment());
			}
		
			// funPoint(dto.getBreakPayments(), regServiceVO::setBreakPayments);
			// funPoint(dto.getCreatedDate(),regServiceVO::setCreatedDate);

			if (null != dto.getRegistrationDetails())
				regServiceVO
						.setRegistrationDetails(registrationDetailsMapper.convertEntity(dto.getRegistrationDetails()));

			if (null != dto.getFcDetails())
				regServiceVO.setFcDetails(fcDetailsMapper.convertEntity(dto.getFcDetails()));
			if (null != dto.getnOCDetails())
				regServiceVO.setnOCDetails(nOCDetailsMapper.convertEntity(dto.getnOCDetails()));
			if (null != dto.getPucDetails())
				regServiceVO.setPucDetails(pucDetailsMapper.convertEntity(dto.getPucDetails()));
			if (null != dto.getTaxDetails())
				regServiceVO.setTaxDetails(taxDetailsMapper.convertEntity(dto.getTaxDetails()));
			if (null != dto.getGreenTaxDetails())
				regServiceVO.setGreenTaxDetails(greenTaxDetailsMapper.convertEntity(dto.getGreenTaxDetails()));
			funPoint(dto.getTaxAmount(), regServiceVO::setTaxAmount);
			funPoint(dto.getTaxvalidity(), regServiceVO::setTaxvalidity);
			funPoint(dto.getCesFee(), regServiceVO::setCesFee);
			funPoint(dto.getCesValidity(), regServiceVO::setCesValidity);
			funPoint(dto.getPenalty(), regServiceVO::setPenalty);
			funPoint(dto.getTaxType(), regServiceVO::setTaxType);
			funPoint(dto.getGreenTaxAmount(), regServiceVO::setGreenTaxAmount);
			funPoint(dto.getGreenTaxvalidity(), regServiceVO::setGreenTaxvalidity);
			funPoint(dto.getServiceIds(), regServiceVO::setServiceIds);
			funPoint(dto.getServiceType(), regServiceVO::setServiceType);
			funPoint(dto.getOfficeCode(), regServiceVO::setOfficeCode);
			funPoint(dto.getCreatedDate(), regServiceVO::setCreatedDate);
			funPoint(dto.getIterationCount(), regServiceVO::setIterationCount);
			funPoint(dto.getCurrentIndex(), regServiceVO::setCurrentIndex);
			funPoint(dto.isSpecialNoRequired(), regServiceVO::setSpecialNoRequired);
			funPoint(dto.isFinancerRequired(), regServiceVO::setFinancerRequired);
			funPoint(dto.getTaxArrears(), regServiceVO::setTaxArrears);
			funPoint(dto.getPenaltyArrears(), regServiceVO::setPenaltyArrears);
			funPoint(dto.getPermitCode(), regServiceVO::setPermitCode);
			funPoint(dto.getQuaterTaxForNewGo(), regServiceVO::setQuaterTaxForNewGo);
			if (null != dto.getInsuranceDetails()) {
				regServiceVO.setInsuranceDetailsVo(insuranceDetailsMapper.convertEntity(dto.getInsuranceDetails()));
			}
			funPoint(dto.getApprovedDate(), regServiceVO::setApprovedDate);
			funPoint(dto.getMviOfficeCode(), regServiceVO::setMviOfficeCode);
			if (dto.getMviOfficeDetails() != null) {
				regServiceVO.setMviOfficeDetails(officeMapper.convertEntity(dto.getMviOfficeDetails()));
			}
			funPoint(dto.getPaymentTransactionNo(), regServiceVO::setPaymentTransactionNo);
			/*
			 * if(null != dto.getActionDetails()) {
			 * regServiceVO.setActionDetailsVO(actionDetailMapper.convertEntity(
			 * dto.getActionDetails())); }
			 */
			if (dto.getFeeDetails() != null) {
				regServiceVO.setFeeDetails(feeDetailsMapper.convertEntity(dto.getFeeDetails()));
			}
			if (dto.getTheftDetails() != null) {
				regServiceVO.setTheftDetails(theftVehcileDetailsMapper.convertEntity(dto.getTheftDetails()));
			}
			if (dto.getRegistrationDetails() != null && dto.getRegistrationDetails().isTaxPaidByVcr()) {
				regServiceVO.getRegistrationDetails().setTaxPaidByVcr(dto.getRegistrationDetails().isTaxPaidByVcr());
			}
			if (null != dto.getFinanceDetails())
				regServiceVO.setFinanceDetails(financeDetailsMapper.convertEntity(dto.getFinanceDetails()));
			funPoint(dto.getToken(), regServiceVO::setToken);
			funPoint(dto.isFinancierDoneByOnline(), regServiceVO::setFinancierDoneByOnline);
			if (dto.getContactDetails() != null) {
				regServiceVO.setContactDetails(contactMapper.convertEntity(dto.getContactDetails()));
			}
			funPoint(dto.isPaidPyamentsForFC(), regServiceVO::setPaidPyamentsForFC);
			if (dto.getPayTaxType() != null) {
				regServiceVO.setPayTaxType(dto.getPayTaxType());
			}
			if (dto.getVehicleStoppageDetails() != null) {
				regServiceVO.setVehicleStoppageDetailsVO(
						vehicleStoppageDetailsMapper.convertEntity(dto.getVehicleStoppageDetails()));
			}
			funPoint(dto.getTaxExcemption(), regServiceVO::setTaxExcemption);
			funPoint(dto.isPaidPyamentsForRenewal(), regServiceVO::setPaidPyamentsForRenewal);
			funPoint(dto.getFreshRcFinanceToken(), regServiceVO::setFreshRcFinanceToken);
			funPoint(dto.isMviDone(), regServiceVO::setMviDone);
			funPoint(dto.isWeightAlt(), regServiceVO::setWeightAlt);
			funPoint(dto.getGvw(), regServiceVO::setGvw);
			funPoint(dto.getOsSecondVechicleFoundRTO(), regServiceVO::setOsSecondVechicleFoundRTO);
			funPoint(dto.getIsPRNoRequiredosSVRejected(), regServiceVO::setIsPRNoRequiredosSVRejected);
			if (dto.getOtherStateFianContinue() != null) {
				funPoint(dto.getOtherStateFianContinue(), regServiceVO::setOtherStateFianContinue);
			}
			if (dto.getBileteralTaxDetails() != null) {
				regServiceVO.setBileteralTaxDetails(bileteralTaxMapper.convertEntity(dto.getBileteralTaxDetails()));
			}
			if (dto.getReInspectionDate() != null) {
				funPoint(dto.getReInspectionDate(), regServiceVO::setReInspectionDate);
			}
		}
		if (dto.getOldMviOfficeDetails() != null) {
			regServiceVO.setOldMviOfficeDetails(officeMapper.convertEntity(dto.getOldMviOfficeDetails()));
		}

		if (dto.getOtherStateTemporaryPermitDetails() != null) {
			regServiceVO.setOtherStateTemporaryPermit(
					otherStateTemporaryPermitDetailsMapper.convertEntity(dto.getOtherStateTemporaryPermitDetails()));
		}
		funPoint(dto.getVcrNosList(), regServiceVO::setVcrNosList);
		funPoint(dto.getDateOfCompletion(), regServiceVO::setDateOfCompletion);
		if (dto.getVoluntaryTaxDetails() != null) {
			regServiceVO.setVoluntaryTaxDetails(voluntaryTaxMapper.convertEntity(dto.getVoluntaryTaxDetails()));
		}

		if (dto.getRcCancellation() != null) {
			regServiceVO.setRcCancellation(rcCancellationMapper.converEntityLimitedFields(dto.getRcCancellation()));
		}
		if (dto.getRcQuesList() != null) {
			regServiceVO.setRcQuesList(rcCancellationQuestionsMappers.convertEntity(dto.getRcQuesList()));
		}
		funPoint(dto.getLastTaxPaidUpTo(), regServiceVO::setLastTaxPaidUpTo);
		funPoint(dto.getDtcOfficeCode(), regServiceVO::setDtcOfficeCode);
		funPoint(dto.isGetOtherStateDataFromVahanService(), regServiceVO::setGetOtherStateDataFromVahanService);
		funPoint(dto.getCreatedBy(), regServiceVO::setCreatedBy);
		funPoint(dto.getCancellationRemarks(), regServiceVO::setCancellationRemarks);
		funPoint(dto.getCancelledBy(), regServiceVO::setCancelledBy);
		funPoint(dto.getCancelledDate(), regServiceVO::setCancelledDate);
		funPoint(dto.getCancelledIpAddress(), regServiceVO::setCancelledIpAddress);
		funPoint(dto.getStageCarriageType(), regServiceVO::setStageCarriageType);
		funPoint(dto.getRemarks(), regServiceVO::setRemarks);
		
		funPoint(dto.getStageCarriageServiceType(), regServiceVO::setStageCarriageServiceType);

		return regServiceVO;
	}

	public TowVO convertEntityToTowVO(RegServiceDTO dto) {
		TowVO towVO = new TowVO();
		
		if (dto.getBuyerDetails() != null) {
			funPoint(dto.getBuyerDetails().getTokenNo(), towVO::setToken);
			funPoint(dto.getBuyerDetails().getTokenNoGeneratedTime(), towVO::setTokenNoGeneratedTime);
			if(dto.getBuyerDetails().getBuyerAadhaarNo() != null) {
				towVO.setBuyerAadhaarNo(Long.parseLong(dto.getBuyerDetails().getBuyerAadhaarNo()));
			}
		}
		return towVO;
	}
	
}
