package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.FinanceDetailsDTO;
import org.epragati.master.dto.HarvestersDetailsDTO;
import org.epragati.master.dto.InvoiceDetailsDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.TrailerChassisDetailsDTO;
import org.epragati.master.dto.VahanDetailsDTO;
import org.epragati.master.dto.VehicleDetailsDTO;
import org.epragati.master.vo.HarvestersDetailsVO;
import org.epragati.payment.mapper.ApplicantDeatilsMapper;
import org.epragati.rta.vo.RegistrationCardDetailsVO;
import org.epragati.rta.vo.RegistrationCorrectionsVO;
import org.epragati.rta.vo.TrailerChassisDetailsVO;
import org.epragati.util.DateConverters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationCardDetailsMapper extends BaseMapper<RegistrationDetailsDTO, RegistrationCardDetailsVO> {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationDetailsMapper.class);
	
	@Autowired
	private OfficeMapper officeMapper;

	@Autowired
	private VahanDetailsMapper vahanDetailsMapper;

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Autowired
	private FinanceDetailsMapper financeDetailsMapper;

	@Autowired
	private InsuranceDetailsMapper insuranceDetailsMapper;

	@Autowired
	private RegistrationValidityMapper registrationValidityMapper;

	@Autowired
	private DealerDetailsMapper dealerDetailsMapper;

	@Autowired
	private ApplicantDeatilsMapper applicantDeatilsMapper;
	
	@Autowired
	private HarvestersDetailsMapper harvestersDetailsMapper;
	
	@Autowired
	private TrailerChassisDetailsMapper trailerChassisDetailsMapper;
	
	@Autowired
	private MandalMapper mandalMapper;

	@Autowired
	private VillageMapper villageMapper;

	@Autowired
	private PostOfficeMapper postOfficeMapper;

	@Override
	public RegistrationCardDetailsVO convertEntity(RegistrationDetailsDTO dto) {
		RegistrationCardDetailsVO vo = new RegistrationCardDetailsVO();
		vo.setSignOfOwner(
				"iVBORw0KGgoAAAANSUhEUgAAAGAAAAAcCAYAAACeeLqCAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABJJJREFUeNrsWbFy00AQVUIKOpSKoYozQ0HDYL4gckdnp6Oz3UEV+wsif4GTL7DTQSWnSyopHV2coYEZZuJ0hMaig8rcZt6Fl+N0soyHBNDO7Eg+3e3tvd3bvT17XkkllVRSSSXNQU8PXlQUByUSy6OVHMB99Wgo3lFcNT5PFCeKe++bR5MCc4oBU8XjgrpWFLcUh5Ahv4f/rAHg6QMsVAAeKb4AeNK2BSCE9pQRunOCeAoZmwV1lbli6Bxi/trfboC1DPBbAF+Aaitwh1khST36ijvqXXbItuqbOuZrwZAN8Oh/D0GrDs+XELGZBb6QhB7F27ID4KH9nPmaik8AfJ3axRjnimfwcp8MNkV70yIvxreI2iK0TTGed94M8+hwOoPOU9rNt2sA8vxajjdrgwl4PcTjFn5nhZAKwD8E6BroFOFknWK9D3B6CDumLgJiF+MaBOoh+vcMh+iiXRxr1wiL6wvkpOUbAKFHFOrOCX4LHhdjgamxONP7JZd0AJZO8B7eB5Dlg3WfPQKWaQxOSIaP3BBjPp++7aC9Su1C++QEt74DrkByhR1LnrhaBAwmi6kiNzBpsBMDwCbtun1488SSuD0DNFeOqUJOj9p3Ibd21/LOmiVMFAWfk/QIizXl6HDTJU+b0ClLG79OvxMYKYL31wscV0NLf52jGhYj36lT0MWC4EtSHqvv7LUebe+2sc1H6CeGeQ7vTZCkNUA1SqRtClmJAWKP6pIUMrl/G3JSGLNijLtbx1AAXdWxXYPsAj+HRhmFWEjtoWVcSjlAh6GWZZfy2KER5mxyzHEN7MDtP4D5jSJyzdFRJ6sBvNrLA98S+23hISpYiDUA5ATKby2pAtbrS35Dhs5tw4IGuF7DquVkUUc4GWLrauDn8fyAQoSrEOMTUB5FlpC2DOqTvqMFvb9KuCzlFJTgFBNYjDBP2JFtnKo+ScFCLKZwEKBA8ugZG2HGVoBx0danEBNT/wGND3BgiI05PSrOZpSDzAJPX41oPQMYxFZQ9mnsM1eCldvOmeLYTLyI/87kjLGhY3fMyPunpGCWAXhxGtApFqr76fcphZVzuriz9XfN2aExHj1bxndznG9U3xEMzvP65BC/7gDcasrJIFBADqh96PJ8JOw+4vTeAoVYEbIVYAF5mi7mKo7+LqqjJhnT+KwCz5ZTmlTwVaCbPlKniADZVxEK6JCuFSJcSbs8v0MWzbqMyyvEzL5FKaVCS19phAuGZZG1MWeBZ47zkEtqOGTUjGJS6EHuMVSB2FbApvBW2Q1ikEMd2+HxVe/n/wRj5Iex4yTjKsROIMuzFFApvvk5x1wdz0+8+a6qU8xl/jexTw51QfraCryUdt4B5JzifQPPIfSPsOYbheC9LO2+jD4dP9x+LIt5ovileIH6HQqr91cQ9A0Kv875U0aUP1b8jtqk/3c83+Bdy7uk3XIMj5axnwGKBmyFirK3+H0fC58QiGb/lOR+AH8lWQd0TBbdjqCTZ+gn+pxBzhHGXcJZzuAYKXR7pPgj+lzrtDLPnsT5vkoJSYQmDo8vqaSSSiqppJJy6IcAAwDV9de/3bDEVwAAAABJRU5ErkJggg==");
		vo.setSignOfAuth(
				"iVBORw0KGgoAAAANSUhEUgAAAMgAAAA8CAYAAAAjW/WRAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyhpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTMyIDc5LjE1OTI4NCwgMjAxNi8wNC8xOS0xMzoxMzo0MCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTUuNSAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QTk1MUQzRERFOTZCMTFFNzgxNzE4QkI4RjNGMjhCOUQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QTk1MUQzREVFOTZCMTFFNzgxNzE4QkI4RjNGMjhCOUQiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpBOTUxRDNEQkU5NkIxMUU3ODE3MThCQjhGM0YyOEI5RCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpBOTUxRDNEQ0U5NkIxMUU3ODE3MThCQjhGM0YyOEI5RCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PgGCixoAAAhISURBVHja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");
		funPoint(dto.isDuplicate(), vo::setDuplicate);
		if (StringUtils.isNotBlank(dto.getPrNo())) {
			funPoint(dto.getPrNo(), vo::setVehRegNo);
		}
		if (null != (dto.getRegistrationValidity().getPrGeneratedDate())) {
			vo.setRegDate(dto.getRegistrationValidity().getPrGeneratedDate());
		} else if (null != (dto.getPrGeneratedDate())) {
			vo.setRegDate(dto.getPrGeneratedDate().toLocalDate());
		}
		if (null != (dto.getRegistrationValidity().getRegistrationValidity())) {
			vo.setRegValidity(dto.getRegistrationValidity().getRegistrationValidity());
		}
		if (null != (dto.getOfficeDetails())) {
			vo.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
		}
		if (StringUtils.isNotBlank(dto.getVehicleType())) {
			funPoint(dto.getVehicleType(), vo::setVehCategory);
		}
		if (null != dto.getOwnerType()) {
			funPoint(dto.getOwnerType(), vo::setOwnerType);
		}
		if (null != (dto.getVahanDetails())) {
			vo.setVahanDetails(vahanDetailsMapper.convertEntity(dto.getVahanDetails()));
		}
		if (StringUtils.isNotBlank(dto.getClassOfVehicleDesc())) {
			funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		}
		if (null != (dto.getRegistrationValidity().getTaxValidity())) {
			funPoint(dto.getRegistrationValidity().getTaxValidity(), vo::setTaxPaidUpto);
		}
		if (StringUtils.isNotBlank(dto.getApplicantDetails().getDisplayName())) {
			funPoint(dto.getApplicantDetails().getDisplayName(), vo::setName);
		}
		if (StringUtils.isNotBlank(dto.getApplicantDetails().getFatherName())) {
			funPoint(dto.getApplicantDetails().getFatherName(), vo::setParentsName);
		}

		if (StringUtils.isNotBlank(dto.getApplicantDetails().getFirstName())) {
			funPoint(dto.getApplicantDetails().getFirstName(), vo::setFirstName);
		}
		if (null != (dto.getApplicantDetails().getPresentAddress())) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(dto.getApplicantDetails().getPresentAddress()));
		}
		funPoint(dto.getTaxAmount(), vo::setAmount);
		if (null != (dto.getRegistrationValidity().getTaxValidity())) {
			funPoint(dto.getRegistrationValidity().getTaxValidity(), vo::setTaxValidUpto);
		}
		funPoint(dto.isCardPrinted(), vo::setBackendUpdateFlag);
		if (null != (dto.getFinanceDetails())) {
			vo.setFinanceDetails(financeDetailsMapper.convertEntity(dto.getFinanceDetails()));
		}
		if (null != (dto.getInsuranceDetails())) {
			vo.setInsuranceDetails(insuranceDetailsMapper.convertEntity(dto.getInsuranceDetails()));
		}
		if (null != (dto.getlUpdate())) {
			vo.setApprovedDate(dto.getlUpdate());
		}
		if (null != (dto.getRegistrationValidity())) {
			vo.setRegistrationValidity(registrationValidityMapper.convertEntity(dto.getRegistrationValidity()));
		}
		if (null != (dto.getDealerDetails())) {
			vo.setDealerDetails(dealerDetailsMapper.convertEntity(dto.getDealerDetails()));
		}
		if (null != (dto.getCardPrintedDate())) {
			vo.setCardPrintedDate(dto.getCardPrintedDate().toLocalDate());
		}
		if (null != (dto.getServiceIds())) {
			vo.setServiceIds(dto.getServiceIds());
		}
		return vo;
	}

	public RegistrationDetailsDTO convertVO(RegistrationDetailsDTO dto, RegistrationCardDetailsVO vo) {
		// RegistrationDetailsDTO dto = new RegistrationDetailsDTO();
		funPoint(vo.isDuplicate(), dto::setDuplicate);
		if (StringUtils.isNotBlank(vo.getVehRegNo())) {
			funPoint(vo.getVehRegNo(), dto::setPrNo);
		}
		if (null != (vo.getRegDate())) {
			dto.getRegistrationValidity().setPrGeneratedDate(vo.getRegDate());
			dto.setPrGeneratedDate(vo.getRegDate().atStartOfDay());
		}
		if (null != (vo.getRegValidity())) {
			dto.getRegistrationValidity().setRegistrationValidity(vo.getRegValidity());
		}
		if (null != (vo.getTaxPaidUpto())) {
			dto.getRegistrationValidity().setTaxValidity(vo.getTaxPaidUpto());
		}

		if (null != (vo.getOfficeDetails())) {
			dto.setOfficeDetails(officeMapper.convertVO(vo.getOfficeDetails()));
		}
		if (StringUtils.isNotBlank(vo.getVehCategory())) {
			funPoint(vo.getVehCategory(), dto::setVehicleType);
		}
		if (null != vo.getOwnerType()) {
			funPoint(vo.getOwnerType(), dto::setOwnerType);
		}
		if (null != (vo.getVahanDetails())) {
			dto.setVahanDetails(vahanDetailsMapper.convertVO(vo.getVahanDetails()));
		}
		if (StringUtils.isNotBlank(vo.getClassOfVehicleDesc())) {
			funPoint(vo.getClassOfVehicleDesc(), dto::setClassOfVehicleDesc);
		}

		if (null != (vo.getApplicantDetails())) {
			dto.setApplicantDetails(applicantDeatilsMapper.convertVO(vo.getApplicantDetails()));
		}
		funPoint(vo.getAmount(), dto::setTaxAmount);
		if (null != (vo.getTaxValidUpto())) {
			dto.getRegistrationValidity().setTaxValidity(vo.getTaxValidUpto());
		}
		funPoint(vo.isBackendUpdateFlag(), dto::setCardPrinted);
		if (null != (vo.getFinanceDetails())) {
			dto.setFinanceDetails(financeDetailsMapper.convertVO(vo.getFinanceDetails()));
		}
		if (null != (vo.getInsuranceDetails())) {
			dto.setInsuranceDetails(insuranceDetailsMapper.convertVO(vo.getInsuranceDetails()));
		}
		if (null != (vo.getApprovedDate())) {
			dto.setlUpdate(vo.getApprovedDate());
		}
		if (null != (vo.getRegistrationValidity())) {
			dto.setRegistrationValidity(registrationValidityMapper.convertVO(vo.getRegistrationValidity()));
		}
		if (null != (vo.getDealerDetails())) {
			dto.setDealerDetails(dealerDetailsMapper.convertVO(vo.getDealerDetails()));
		}
		if (null != (vo.getServiceIds())) {
			dto.setServiceIds(vo.getServiceIds());
		}

		return dto;
	}

	public RegistrationDetailsDTO convertVO(RegistrationDetailsDTO updateRegDetailsDTO,
			RegistrationCorrectionsVO registrationCorrectionDetailsVO) {
		funPoint(registrationCorrectionDetailsVO.isDuplicate(), updateRegDetailsDTO::setDuplicate);
		if (StringUtils.isNotBlank(registrationCorrectionDetailsVO.getPrNo())) {
			funPoint(registrationCorrectionDetailsVO.getPrNo(), updateRegDetailsDTO::setPrNo);
		}
		if (null != (registrationCorrectionDetailsVO.getRepresentativeName())) {
			updateRegDetailsDTO.getApplicantDetails().setRepresentativeName(registrationCorrectionDetailsVO.getRepresentativeName());
			//updateRegDetailsDTO.getApplicantDetails().setIsAadhaarValidated(Boolean.FALSE);
		}
		//As discussed with Murthy , this condition is added for Correction Screen
		if (!registrationCorrectionDetailsVO.getOwnerType().equals(OwnerTypeEnum.Individual)) {
			updateRegDetailsDTO.getApplicantDetails().setIsAadhaarValidated(Boolean.FALSE);
		}
		if (null != (registrationCorrectionDetailsVO.getOwnerType())) {
			updateRegDetailsDTO.setOwnerType(registrationCorrectionDetailsVO.getOwnerType());
		}
		if (null != (registrationCorrectionDetailsVO.getDateOfRegistration())) {
			updateRegDetailsDTO.getRegistrationValidity()
					.setPrGeneratedDate(registrationCorrectionDetailsVO.getDateOfRegistration());
			updateRegDetailsDTO
					.setPrGeneratedDate(registrationCorrectionDetailsVO.getDateOfRegistration().atStartOfDay());
		}
		if (null != (registrationCorrectionDetailsVO.getRegistrationValidTill())) {
			updateRegDetailsDTO.getRegistrationValidity().setRegistrationValidity(DateConverters
					.convertLocalDateToLocalDateTime(registrationCorrectionDetailsVO.getRegistrationValidTill()));
		}

		if (StringUtils.isNotBlank(registrationCorrectionDetailsVO.getVehicleType())) {
			funPoint(registrationCorrectionDetailsVO.getVehicleType(), updateRegDetailsDTO::setVehicleType);
		}
			/*if (null != (registrationCorrectionDetailsVO.getVahanDetailsVO())) {
				updateRegDetailsDTO
						.setVahanDetails(vahanDetailsMapper.convertVO(registrationCorrectionDetailsVO.getVahanDetailsVO()));
			}*/
		if (StringUtils.isNotBlank(registrationCorrectionDetailsVO.getClassOfVehicleDesc())) {
			funPoint(registrationCorrectionDetailsVO.getClassOfVehicleDesc(),
					updateRegDetailsDTO::setClassOfVehicleDesc);
		}

		if (null != (registrationCorrectionDetailsVO.getDisplayName())) {
			updateRegDetailsDTO.getApplicantDetails().setDisplayName(registrationCorrectionDetailsVO.getDisplayName());
		}
		if (null != (registrationCorrectionDetailsVO.getFirstName())) {
			updateRegDetailsDTO.getApplicantDetails().setFirstName(registrationCorrectionDetailsVO.getFirstName());
		}
		if (null != (registrationCorrectionDetailsVO.getFatherName())) {
			updateRegDetailsDTO.getApplicantDetails().setFatherName(registrationCorrectionDetailsVO.getFatherName());
		}
		
		//Address details 
		
		if (null != registrationCorrectionDetailsVO.getMandalVO()) {
			if (updateRegDetailsDTO.getApplicantDetails().getPresentAddress() != null) {
				updateRegDetailsDTO.getApplicantDetails().getPresentAddress()
						.setMandal(mandalMapper.convertVO(registrationCorrectionDetailsVO.getMandalVO()));
			}
		}

		if (null != registrationCorrectionDetailsVO.getVillageVO()) {
			if (updateRegDetailsDTO.getApplicantDetails().getPresentAddress() != null) {
				updateRegDetailsDTO.getApplicantDetails().getPresentAddress()
						.setVillage(villageMapper.convertVO(registrationCorrectionDetailsVO.getVillageVO()));
			}
		}

		if (null != registrationCorrectionDetailsVO.getPinCodeVO()) {
			if (updateRegDetailsDTO.getApplicantDetails().getPresentAddress() != null) {
				updateRegDetailsDTO.getApplicantDetails().getPresentAddress()
						.setPostOffice(postOfficeMapper.convertVO(registrationCorrectionDetailsVO.getPinCodeVO()));
			}
		}
		if (StringUtils.isNotBlank(registrationCorrectionDetailsVO.getOtherVillage())) {
			if (updateRegDetailsDTO.getApplicantDetails().getPresentAddress() != null) {
				updateRegDetailsDTO.getApplicantDetails().getPresentAddress()
						.setOtherVillage(registrationCorrectionDetailsVO.getOtherVillage());
			}
		}
		
		
		
		//Contact
		
		if (null != registrationCorrectionDetailsVO.getContact()) {
			ContactDTO contactDto = updateRegDetailsDTO.getApplicantDetails().getContact() != null
					? updateRegDetailsDTO.getApplicantDetails().getContact() : new ContactDTO();
			funPoint(registrationCorrectionDetailsVO.getContact().getEmail(), contactDto::setEmail);
			funPoint(registrationCorrectionDetailsVO.getContact().getMobile(), contactDto::setMobile);
			updateRegDetailsDTO.getApplicantDetails().setContact(contactDto);
		}
		
		//Entity Name for Organization related RCs
		if (null != (registrationCorrectionDetailsVO.getEntityName())) {
			updateRegDetailsDTO.getApplicantDetails().setEntityName(registrationCorrectionDetailsVO.getEntityName());
		}
		
		//Finance Details
		if (null != registrationCorrectionDetailsVO.getFinanceDetailsVO()) {
			FinanceDetailsDTO financeDto = updateRegDetailsDTO.getFinanceDetails() != null
					? updateRegDetailsDTO.getFinanceDetails() : new FinanceDetailsDTO();
			
			funPoint(registrationCorrectionDetailsVO.getFinanceDetailsVO().getFinancerName(),
					financeDto::setFinancerName);
			
			funPoint(registrationCorrectionDetailsVO.getFinanceDetailsVO().getAgreementDate(),
					financeDto::setAgreementDate);

			/*if(StringUtils.isNoneBlank(registrationCorrectionDetailsVO.getFinanceDetailsVO().getState())){
				financeDto.setState(registrationCorrectionDetailsVO.getFinanceDetailsVO().getState());
			}*/
			/*if(StringUtils.isNoneBlank(registrationCorrectionDetailsVO.getFinanceDetailsVO().getDistrict())){
				financeDto.setDistrict(registrationCorrectionDetailsVO.getFinanceDetailsVO().getDistrict());
			}
			if(StringUtils.isNoneBlank(registrationCorrectionDetailsVO.getFinanceDetailsVO().getFinancerName())){
				financeDto.setFinancerName(registrationCorrectionDetailsVO.getFinanceDetailsVO().getFinancerName());
			}*/
			updateRegDetailsDTO.setIsFinancier(Boolean.TRUE);
			updateRegDetailsDTO.setFinanceDetails(financeDto);
			
		}
		
		//Vahan Details update
		
		if (null != registrationCorrectionDetailsVO.getVahanDetailsVO()) {
			VahanDetailsDTO vahanDetailsDTO = updateRegDetailsDTO.getVahanDetails() != null
					? updateRegDetailsDTO.getVahanDetails() : new VahanDetailsDTO();

			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getChassisNumber(),
					vahanDetailsDTO::setChassisNumber);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getEngineNumber(),
					vahanDetailsDTO::setEngineNumber);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getEnginePower(),
					vahanDetailsDTO::setEnginePower);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getNoCyl(), vahanDetailsDTO::setNoCyl);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getMakersModel(),
					vahanDetailsDTO::setMakersModel);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getMakersDesc(),
					vahanDetailsDTO::setMakersDesc);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getCubicCapacity(),
					vahanDetailsDTO::setCubicCapacity);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getColor(), vahanDetailsDTO::setColor);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getWheelbase(), vahanDetailsDTO::setWheelbase);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getGvw(), vahanDetailsDTO::setGvw);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getUnladenWeight(),
					vahanDetailsDTO::setUnladenWeight);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getSeatingCapacity(),
					vahanDetailsDTO::setSeatingCapacity);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getFuelDesc(), vahanDetailsDTO::setFuelDesc);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getManufacturedMonthYear(),
					vahanDetailsDTO::setManufacturedMonthYear);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getBodyTypeDesc(),
					vahanDetailsDTO::setBodyTypeDesc);
			if (null != registrationCorrectionDetailsVO.getVahanDetailsVO().getHarvestersDetails()) {
				HarvestersDetailsVO harvesterDetailsVo = registrationCorrectionDetailsVO.getVahanDetailsVO()
						.getHarvestersDetails();
				HarvestersDetailsDTO harvestersDto = updateRegDetailsDTO.getVahanDetails()
						.getHarvestersDetails() != null ? updateRegDetailsDTO.getVahanDetails().getHarvestersDetails()
								: new HarvestersDetailsDTO();
				harvestersDto = harvestersDetailsMapper.convertVO(harvesterDetailsVo);
				vahanDetailsDTO.setHarvestersDetails(harvestersDto);
			}
			
			if (null != registrationCorrectionDetailsVO.getVahanDetailsVO().getTrailerChassisDetailsVO()) {
				List<TrailerChassisDetailsVO> listOfTrailerDetailsVO = registrationCorrectionDetailsVO
						.getVahanDetailsVO().getTrailerChassisDetailsVO();
				List<TrailerChassisDetailsDTO> listOfTrailerDetailsDTO = updateRegDetailsDTO.getVahanDetails()
						.getTrailerChassisDetailsDTO() != null
								? updateRegDetailsDTO.getVahanDetails().getTrailerChassisDetailsDTO()
								: new ArrayList<>();
				listOfTrailerDetailsDTO = trailerChassisDetailsMapper.convertVO(listOfTrailerDetailsVO);
				vahanDetailsDTO.setTrailerChassisDetailsDTO(listOfTrailerDetailsDTO);
			}
			updateRegDetailsDTO.setVahanDetails(vahanDetailsDTO);
			
			
			//Vehicle Details Update 

			VehicleDetailsDTO vehicleDetailsDTO = updateRegDetailsDTO.getVehicleDetails() != null
					? updateRegDetailsDTO.getVehicleDetails() : new VehicleDetailsDTO();

			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getChassisNumber(),
					vehicleDetailsDTO::setChassisNumber);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getEngineNumber(),
					vehicleDetailsDTO::setEngineNumber);
			
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getMakersModel(),
					vehicleDetailsDTO::setMakersModel);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getMakersDesc(),
					vehicleDetailsDTO::setMakersDesc);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getColor(), vehicleDetailsDTO::setColor);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getGvw(), vehicleDetailsDTO::setRlw);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getUnladenWeight(),
					vehicleDetailsDTO::setUlw);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getSeatingCapacity(),
					vehicleDetailsDTO::setSeatingCapacity);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getFuelDesc(), vehicleDetailsDTO::setFuelDesc);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getManufacturedMonthYear(),
					vehicleDetailsDTO::setManufacturedMonthYear);
			funPoint(registrationCorrectionDetailsVO.getVahanDetailsVO().getBodyTypeDesc(),
					vehicleDetailsDTO::setBodyTypeDesc);
			
			if (null != registrationCorrectionDetailsVO.getVahanDetailsVO().getTrailerChassisDetailsVO()) {
				List<TrailerChassisDetailsVO> listOfTrailerDetailsVO = registrationCorrectionDetailsVO
						.getVahanDetailsVO().getTrailerChassisDetailsVO();
				List<TrailerChassisDetailsDTO> listOfTrailerDetailsDTO = updateRegDetailsDTO.getVahanDetails()
						.getTrailerChassisDetailsDTO() != null
								? updateRegDetailsDTO.getVahanDetails().getTrailerChassisDetailsDTO()
								: new ArrayList<>();
				listOfTrailerDetailsDTO = trailerChassisDetailsMapper.convertVO(listOfTrailerDetailsVO);
				vehicleDetailsDTO.setTrailers(listOfTrailerDetailsDTO);
			}
			updateRegDetailsDTO.setVehicleDetails(vehicleDetailsDTO);

		}
		
		if (null != registrationCorrectionDetailsVO.getInvoiceDetailsVO()) {
			InvoiceDetailsDTO invoicDetails = updateRegDetailsDTO.getInvoiceDetails() != null
					? updateRegDetailsDTO.getInvoiceDetails() : new InvoiceDetailsDTO();

			funPoint(registrationCorrectionDetailsVO.getInvoiceDetailsVO().getInvoiceNo(), invoicDetails::setInvoiceNo);
			funPoint(registrationCorrectionDetailsVO.getInvoiceDetailsVO().getInvoiceDate(),
					invoicDetails::setInvoiceDate);
			funPoint(registrationCorrectionDetailsVO.getInvoiceDetailsVO().getInvoiceValue(),
					invoicDetails::setInvoiceValue);
			updateRegDetailsDTO.setInvoiceDetails(invoicDetails);

		}
		
		if(null != registrationCorrectionDetailsVO.getVehicleType()){
			funPoint(registrationCorrectionDetailsVO.getVehicleType(), updateRegDetailsDTO::setVehicleType);
		}
		if(null != registrationCorrectionDetailsVO.getClassOfVehicleDesc()){
			funPoint(registrationCorrectionDetailsVO.getClassOfVehicleDesc(), updateRegDetailsDTO::setClassOfVehicle);
		}
		/*
		 * if (null != (registrationCorrectionDetailsVO.getTaxPaidUpto())) {
		 * updateRegDetailsDTO.getRegistrationValidity()
		 * .setTaxValidity(registrationCorrectionDetailsVO.getTaxPaidUpto()); }
		 */
		/*
		 * if (null != (registrationCorrectionDetailsVO.getOfficeDetails())) {
		 * updateRegDetailsDTO .setOfficeDetails(officeMapper.convertVO(
		 * registrationCorrectionDetailsVO.getOfficeDetails())); }
		 */
		/*
		 * if (null != registrationCorrectionDetailsVO.getOwnerType()) {
		 * funPoint(registrationCorrectionDetailsVO.getOwnerType(),
		 * updateRegDetailsDTO::setOwnerType); }
		 */

		/*
		 * if (null != (registrationCorrectionDetailsVO.getTaxValidUpto())) {
		 * updateRegDetailsDTO.getRegistrationValidity()
		 * .setTaxValidity(registrationCorrectionDetailsVO.getTaxValidUpto()); }
		 */
		// funPoint(registrationCorrectionDetailsVO.isBackendUpdateFlag(),
		// updateRegDetailsDTO::setCardPrinted);
		/*
		 * if (null !=
		 * (registrationCorrectionDetailsVO.getInsuranceDetailsVO())) {
		 * updateRegDetailsDTO.setInsuranceDetails(
		 * insuranceDetailsMapper.convertVO(registrationCorrectionDetailsVO.
		 * getInsuranceDetails())); }
		 */
		/*
		 * if (null != (registrationCorrectionDetailsVO.getApprovedDate())) {
		 * updateRegDetailsDTO.setlUpdate(registrationCorrectionDetailsVO.
		 * getApprovedDate()); }
		 */
		/*
		 * if (null !=
		 * (registrationCorrectionDetailsVO.getRegistrationValidity())) {
		 * updateRegDetailsDTO.setRegistrationValidity(
		 * registrationValidityMapper.convertVO(registrationCorrectionDetailsVO.
		 * getRegistrationValidity())); }
		 */
		/*
		 * if (null != (registrationCorrectionDetailsVO.getDealerDetails())) {
		 * updateRegDetailsDTO.setDealerDetails(
		 * dealerDetailsMapper.convertVO(registrationCorrectionDetailsVO.
		 * getDealerDetails())); }
		 */

		return updateRegDetailsDTO;
	}
}
