package org.epragati.master.mappers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.aadhaar.AadharDetailsResponseVO;
import org.epragati.civilsupplies.dto.CardMemberDetails;
import org.epragati.civilsupplies.vo.CardMemberDetailsVO;
import org.epragati.common.dto.PropertiesDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.exception.BadRequestException;
import org.epragati.fa.dto.AddressDTO;
import org.epragati.fa.dto.DrivingLicenseDetailsDTO;
import org.epragati.fa.dto.FinancialAssistanceDTO;
import org.epragati.fa.dto.PersonalDetailsDTO;
import org.epragati.fa.dto.VehicleDetailsDTO;
import org.epragati.fa.vo.AddressVO;
import org.epragati.fa.vo.DrivingLicenseDetailsVO;
import org.epragati.fa.vo.FinancialAssistanceVO;
import org.epragati.fa.vo.PersonalDetailsVO;
import org.epragati.fa.vo.VehicleDetailsVO;
import org.epragati.master.dao.FcDetailsDAO;
import org.epragati.master.dao.OfficeDAO;
import org.epragati.master.dao.TaxDetailsDAO;
import org.epragati.master.dao.VillageDAO;
import org.epragati.master.dto.ActionDetailsDTO;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.dto.BankDetailsDTO;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.InsuranceDetailsDTO;
import org.epragati.master.dto.MandalDTO;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.TaxDetailsDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.vo.ApplicantAddressVO;
import org.epragati.master.vo.ApplicantDetailsVO;
import org.epragati.master.vo.BankDetailsVO;
import org.epragati.master.vo.DlDetailsVO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.epragati.permits.dao.PermitDetailsDAO;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.regservice.dto.PUCDetailsDTO;
import org.epragati.service.enclosure.mapper.EnclosureImageMapper;
import org.epragati.master.dto.VillageDTO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.tax.vo.TaxTypeEnum;
import org.epragati.util.PermitsEnum.PermitType;
import org.epragati.util.RoleEnum;
import org.epragati.util.Status;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ClassOfVehicleEnum;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialAssistanceMapper extends BaseMapper<FinancialAssistanceVO ,FinancialAssistanceDTO> {

	
	@Autowired
	private FcDetailsDAO fcDetailsDAO;
	
	@Autowired
	private PermitDetailsDAO permitDetailsDAO;
	
	@Autowired
	private TaxDetailsDAO taxDetailsDAO;
	
	
	@Autowired
	private OfficeDAO officeDAO;
	
	@Autowired
	private EnclosureImageMapper enclosureImageMapper;
	
	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;
	@Autowired
	private VillageDAO villageDAO;
	
	
	
	
	public FinancialAssistanceDTO convertEntity(FinancialAssistanceVO financialAssistanceVO,String userId,
			RegistrationDetailsDTO registrationDetailsDTO) {
		
	Predicate<Object> object=o->o!=null;
		
		FinancialAssistanceDTO financialAssistanceDTO=new FinancialAssistanceDTO();
		
		PersonalDetailsVO personalDetails = financialAssistanceVO.getPersonalDetails();
		if(personalDetails==null) {
			throw new BadRequestException("No PersonDetails Found");
		}
		PersonalDetailsDTO personalDetailsDTO = new PersonalDetailsDTO();
		BeanUtils.copyProperties(personalDetails, personalDetailsDTO);
		if(registrationDetailsDTO.getApplicantDetails().getPresentAddress()==null) {
			throw new BadRequestException("No Address Details Found");
		}
		
//		AddressDTO addressDTO=new AddressDTO();
//		BeanUtils.copyProperties(personalDetails.getAddress(), addressDTO);
		
		
		funPoint(registrationDetailsDTO.getApplicantDetails().getPresentAddress(), personalDetailsDTO::setPresentAddress);
		
//		funPoint(addressDTO, personalDetailsDTO::setAddress);
		
		funPoint(personalDetailsDTO, financialAssistanceDTO::setPersonalDetails);
		
		DrivingLicenseDetailsVO drivingLicenseDetails = financialAssistanceVO.getDrivingLicenseDetails();
		if(drivingLicenseDetails==null) {
			throw new BadRequestException("No DrivingLicense Details Found");
		}
		DrivingLicenseDetailsDTO drivingLicenseDetailsDTO = new DrivingLicenseDetailsDTO();
		BeanUtils.copyProperties(drivingLicenseDetails, drivingLicenseDetailsDTO);
		
		funPoint(drivingLicenseDetailsDTO,financialAssistanceDTO::setDrivingLicenseDetails);
		
		VehicleDetailsVO vehicleDetails = financialAssistanceVO.getVehicleDetails();
		if(vehicleDetails==null) {
			throw new BadRequestException("No Vehicle Details Found");
		}
		VehicleDetailsDTO vehicleDetailsDTO = new VehicleDetailsDTO();
		BeanUtils.copyProperties(vehicleDetails, vehicleDetailsDTO);
	
		if(vehicleDetails.getInsuranceDetails()!=null) {
			InsuranceDetailsDTO insuranceDetailsDTO = new InsuranceDetailsDTO();
			BeanUtils.copyProperties(vehicleDetails.getInsuranceDetails(), insuranceDetailsDTO);
			funPoint(insuranceDetailsDTO, vehicleDetailsDTO::setInsuranceDetails);		
			}
		
		
		funPoint(vehicleDetailsDTO,financialAssistanceDTO::setVehicleDetails);
		
		funPoint(financialAssistanceVO.getPrNo(), financialAssistanceDTO::setPrNo);
		
		BankDetailsVO bankDetails = financialAssistanceVO.getBankDetails();
		
		if(!object.test(bankDetails)) {
			throw new BadRequestException("No Bank Details Found");
		}
		BankDetailsDTO bankDetailsDTO = new BankDetailsDTO();
		BeanUtils.copyProperties(bankDetails, bankDetailsDTO);
		funPoint(bankDetailsDTO, financialAssistanceDTO::setBankDetails);
		if((financialAssistanceDTO.getActionDetails()==null)) {
			ArrayList<ActionDetailsDTO> actionDetails = new ArrayList<ActionDetailsDTO>();
			actionDetails.add(this.setActionDetails(userId,StatusRegistration.INITIATED.getDescription()));
			financialAssistanceDTO.setActionDetails(actionDetails);
		}
		
		if(financialAssistanceVO.getFamilyMembersDetails()==null) {
			throw new BadRequestException("Family Details not Found");
		}
		List<CardMemberDetailsVO> familyMembers = financialAssistanceVO.getFamilyMembersDetails().getFamilyMembers();
		ArrayList<CardMemberDetails> familyList = new ArrayList<CardMemberDetails>();
		familyMembers.forEach(family->{
			CardMemberDetails cardMemberDetails = new CardMemberDetails();
			cardMemberDetails.setAge(family.getAge());
			cardMemberDetails.setMemberName(family.getMemberName());
			cardMemberDetails.setUid(family.getUid());
			familyList.add(cardMemberDetails);
			
		});
		funPoint(familyList, financialAssistanceDTO::setFamilyMembersDetails);
		funPoint(StatusRegistration.INITIATED.getDescription(), financialAssistanceDTO::setApplicationStatus);
		funPoint(RoleEnum.MDO.getName(),financialAssistanceDTO::setCurrentRole);
		funPoint(LocalDate.now(), financialAssistanceDTO::setCreatedDate);
		return financialAssistanceDTO;
	}
	public ActionDetailsDTO setActionDetails(String userId,String status) {
		
		ActionDetailsDTO actionDetailsDTO = new ActionDetailsDTO();
		funPoint(LocalDateTime.now(), actionDetailsDTO::setActionDatetime);
		funPoint(userId, actionDetailsDTO::setActionBy);
		funPoint(status, actionDetailsDTO::setAction);
		
		return actionDetailsDTO;
	}
	
	public FinancialAssistanceVO validityChecking(RegistrationDetailsDTO registrationDetailsDTO,
			FinancialAssistanceVO financialAssistanceVO,PropertiesDTO propertiesDTO,DlDetailsVO dlDetails
			) {
		
		Predicate<Object> object=o->o!=null;
		VehicleDetailsVO vehicleDetailsVO = new VehicleDetailsVO();
		
		DrivingLicenseDetailsVO drivingLicenseDetailsVO = new DrivingLicenseDetailsVO();
		
		
		
		Optional<FcDetailsDTO> optionalfcDetails = fcDetailsDAO
				.findByStatusIsTrueAndPrNoOrderByCreatedDateDesc(registrationDetailsDTO.getPrNo());
		if(optionalfcDetails.isPresent()) {
			FcDetailsDTO fcDetailsDTO = optionalfcDetails.get();
			
			if (fcDetailsDTO.getFcValidUpto() != null) {
				vehicleDetailsVO.setFcValidityEnd(fcDetailsDTO.getFcValidUpto());	
			}
					}
		
		
		Optional<PermitDetailsDTO> optionalPermitDetails = permitDetailsDAO
				.findByPrNoAndPermitClassDescriptionOrderByCreatedDateDesc
				(registrationDetailsDTO.getPrNo(),PermitType.PRIMARY.getDescription());
		
		if(optionalPermitDetails.isPresent()) {
			PermitDetailsDTO permitDetailsDTO = optionalPermitDetails.get();
			vehicleDetailsVO.setPermitValidityEnd(permitDetailsDTO.getPermitValidityDetails().getPermitValidTo());
		}
		
		
		if (!ClassOfVehicleEnum.ARKT.getCovCode().equals(registrationDetailsDTO.getClassOfVehicle())) {
			
			List<TaxDetailsDTO> taxDetailsList = taxDetailsDAO.findByTaxRecordFromTaxDetails(registrationDetailsDTO.getPrNo(),
					TaxTypeEnum.getTaxTypesforFinancialAssistance());
			if(!taxDetailsList.isEmpty()) {
			List<TaxDetailsDTO> collect = taxDetailsList.stream()
					.sorted((s1, s2) -> s2.getCreatedDate().compareTo(s1.getCreatedDate()))
					.collect(Collectors.toList());
			if(collect.isEmpty()) {
				throw new BadRequestException("Tax Details Not Found");
			}
			 TaxDetailsDTO taxDetailsDTO = collect.get(0);
			 if(ClassOfVehicleEnum.MAXT.getCovCode().equals(registrationDetailsDTO.getClassOfVehicle())) {
				if(!taxDetailsDTO.getPaymentPeriod().equals(TaxTypeEnum.QuarterlyTax.getDesc())){
					 throw new BadRequestException("Tax Details Not Found");
				 }
				if ((taxDetailsDTO.getTaxPeriodEnd() != null)&&(taxDetailsDTO.getTaxPeriodEnd().isAfter(LocalDate.now()))) {
					
				vehicleDetailsVO.setTaxValidityEnd(taxDetailsDTO.getTaxPeriodEnd());
				}
			
			 }
			 List<String> filterCovList = propertiesDTO.getRegCovs().stream().filter(f->(!f.equals(ClassOfVehicleEnum.MAXT.getCovCode()))).
			 collect(Collectors.toList());
			 if(filterCovList.contains(registrationDetailsDTO.getClassOfVehicle())){
				 if(!taxDetailsDTO.getPaymentPeriod().equals(TaxTypeEnum.LifeTax.getDesc())) {
					 if ((taxDetailsDTO.getTaxPeriodEnd() != null)&&(taxDetailsDTO.getTaxPeriodEnd().isAfter(LocalDate.now()))) {
							vehicleDetailsVO.setTaxValidityEnd(taxDetailsDTO.getTaxPeriodEnd());
							}
				 }else {
					 vehicleDetailsVO.setTaxValidityEnd(taxDetailsDTO.getTaxPeriodEnd()); 
				 }
				 
			 }
			
			
		}
		}
			InsuranceDetailsDTO insuranceDetails = registrationDetailsDTO.getInsuranceDetails();
			
			if(object.test(insuranceDetails)) {
				InsuranceDetailsVO insuranceDetailsVO =new InsuranceDetailsVO();
				BeanUtils.copyProperties(insuranceDetails, insuranceDetailsVO);
				
				vehicleDetailsVO.setInsuranceDetails(insuranceDetailsVO);
		}
			
		if(object.test(registrationDetailsDTO.getPucDetailsDTO())) {
			PUCDetailsDTO pucDetailsDTO = registrationDetailsDTO.getPucDetailsDTO();
			if(object.test(pucDetailsDTO.getValidTo())) {
				vehicleDetailsVO.setPollutionValidityEnd(pucDetailsDTO.getValidTo());
			}
			if(!object.test(registrationDetailsDTO.getOfficeDetails())) {
				throw new BadRequestException("OfficeDetails Not Found");
			}
			vehicleDetailsVO.setOfficeCode(registrationDetailsDTO.getOfficeDetails().getOfficeCode());
			}
		
		funPoint(registrationDetailsDTO.getClassOfVehicle(),vehicleDetailsVO::setClassOfVehicle);
//			if(!object.test(registrationDetailsDTO.getApplicantDetails())) {
//				throw new  BadRequestException("Applicant Details Not Found");
//			}
			
//		financialAssistanceVO.setPersonalDetails(getPersonalDetails(registrationDetailsDTO.getApplicantDetails(),aadharDetailsResponseVO));
	        financialAssistanceVO.setVehicleDetails(vehicleDetailsVO);
			 financialAssistanceVO.setDrivingLicenseDetails(dldetailsMapper(dlDetails,drivingLicenseDetailsVO));
			 financialAssistanceVO.setCaste(propertiesDTO.getCaste());
			 financialAssistanceVO.setPrNo(registrationDetailsDTO.getPrNo());
			 
		return financialAssistanceVO;
	}

	public PersonalDetailsVO getPersonalDetails(ApplicantDetailsDTO applicantDetails,AadharDetailsResponseVO aadharDetailsResponseVO) {
		return convertApplicantDetailsForFa(applicantDetails,aadharDetailsResponseVO);
	}
public PersonalDetailsVO convertApplicantDetailsForFa(ApplicantDetailsDTO dto,AadharDetailsResponseVO aadharDetailsResponseVO) {
		
		PersonalDetailsVO personalDetailsVO=new PersonalDetailsVO();
		funPoint(aadharDetailsResponseVO.getName(), personalDetailsVO::setApplicantName);
		funPoint(dto.getFatherName(),personalDetailsVO::setFatherName);
		funPoint(dto.getDateOfBirth(),personalDetailsVO::setDateOfBirth);
		funPoint(dto.getGender(),personalDetailsVO::setGender);
		funPoint(dto.getAadharNo(), personalDetailsVO::setAadharNo);
		if(dto.getContact()!=null) {
			ContactDTO contact = dto.getContact();
			funPoint(contact.getMobile(),personalDetailsVO::setMobileNo);
			funPoint(contact.getEmail(), personalDetailsVO::setEmailId);
			
		}
		if (dto.getPresentAddress() != null) {
			ApplicantAddressDTO presentAddress = dto.getPresentAddress();
//			ApplicantAddressVO convertEntity = applicantAddressMapper.convertEntity(presentAddress);
//			ApplicantDetailsVO applicantDetailsVO = new ApplicantDetailsVO();
			
			AddressVO addressVO = new AddressVO();
			if (presentAddress.getCountry() != null) {
				funPoint(presentAddress.getCountry().getCountryName(), addressVO::setCountry);
			}
			if (presentAddress.getState() != null) {
				funPoint(presentAddress.getState().getStateName(), addressVO::setState);
			}
			if (presentAddress.getDistrict() != null) {
			funPoint(presentAddress.getDistrict().getDistrictName(), addressVO::setDistrict);
			}
			if (presentAddress.getMandal() != null) {
				funPoint(presentAddress.getMandal().getMandalName(), addressVO::setMandal);
			}
			if (presentAddress.getVillage() != null) {
				funPoint(presentAddress.getVillage().getVillageName(), addressVO::setVillage);
			}
		if (presentAddress.getDoorNo() != null) {
				funPoint(presentAddress.getDoorNo(), addressVO::setDoorNo);
			}
			if (presentAddress.getStreetName() != null) {
				funPoint(presentAddress.getStreetName(), addressVO::setStreet);
			}
		
			personalDetailsVO.setAddress(addressVO);
		}
			
	return personalDetailsVO;
		
	}
	public DrivingLicenseDetailsVO dldetailsMapper(DlDetailsVO dlDetails,DrivingLicenseDetailsVO drivingLicenseDetailsVO ) {
		Predicate<Object> object=o->o!=null;
		
		if((object.test(dlDetails.getDlNo()))) {
			drivingLicenseDetailsVO.setDlNo(dlDetails.getDlNo());
		}
		if(object.test(dlDetails.getNonTransportValidTo())) {
			drivingLicenseDetailsVO.setNonTransportValidityEnd(dlDetails.getNonTransportValidTo());
		}
		if(object.test(dlDetails.getTransportValidTo())) {
			drivingLicenseDetailsVO.setTransportValidityEnd(dlDetails.getNonTransportValidTo());
		}
		if(!(object.test(dlDetails.getOfficeCode()))) {
			throw new  BadRequestException("Office Code Not Found In DL");
		}
		
		Optional<OfficeDTO> optionalOfficeDTO=officeDAO.findByOfficeCode(dlDetails.getOfficeCode());
		
		if(optionalOfficeDTO.isPresent()){
			OfficeDTO officeDTO= optionalOfficeDTO.get();
			drivingLicenseDetailsVO.setIssuedOfficeName(officeDTO.getOfficeName());
		}
		if(!object.test(dlDetails.getApprovedCovs())) {
			throw new  BadRequestException("Class of Vehicles Not Found in Dl");
		}
		List<String> covs=new ArrayList<String>();
		dlDetails.getApprovedCovs().forEach(action->{
			covs.add(action.getCode());
		});
		drivingLicenseDetailsVO.setCovs(covs);
		
		return drivingLicenseDetailsVO;
		
	}
	
	public FinancialAssistanceVO convertVolimitedFeilds(FinancialAssistanceDTO financialAssistanceDTO) {
		FinancialAssistanceVO financialAssistanceVO = new FinancialAssistanceVO();
		funPoint(financialAssistanceDTO.getApplicationNumber(), financialAssistanceVO::setApplicationNumber);
		PersonalDetailsDTO personalDetails = financialAssistanceDTO.getPersonalDetails();
		PersonalDetailsVO personalDetailsVO = new PersonalDetailsVO();
		personalDetailsVO.setApplicantName(personalDetails.getApplicantName());
		personalDetailsVO.setDateOfBirth(personalDetails.getDateOfBirth());
		personalDetailsVO.setAadharNo("********"+personalDetails.getAadharNo().substring(8, 12));
		funPoint(personalDetailsVO, financialAssistanceVO::setPersonalDetails);
		funPoint(financialAssistanceDTO.getApplicationStatus(), financialAssistanceVO::setStatus);
		funPoint(financialAssistanceDTO.getPrNo(), financialAssistanceVO::setPrNo);
		List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures = financialAssistanceDTO.getEnclosures();
		
		List<KeyValue<String, List<ImageVO>>> vo=new ArrayList<KeyValue<String, List<ImageVO>>>();
		
  for(KeyValue<String, List<ImageEnclosureDTO>> enclosure:enclosures) {
			  
		  KeyValue<String, List<ImageVO>> test=new KeyValue<String, List<ImageVO>>();
		  String key = enclosure.getKey();
		  List<ImageEnclosureDTO> values =enclosure.getValue();
		  ArrayList<ImageVO> imageVoList = new ArrayList<ImageVO>();
		  
		  for(ImageEnclosureDTO dto:values) { 
			  ImageVO imageVO = new ImageVO();
			  imageVO.setAppImageDocId(dto.getImageId());
			  imageVO.setApplicantId(dto.getReferenceId());
			  imageVO.setImageType(dto.getImageType());
			  imageVO.setImageUrl(enclosureImageMapper.mappingNewUrl(dto.getImageId()));
			  imageVO.setImageDetails(dto.getImageDetails());
			  imageVO.setImageStaus(dto.getImageStaus());
			  imageVO.setEnclosureName(dto.getEnclosureName());
			  imageVO.setImageComment(dto.getImageComment());
			  imageVO.setServiceId(String.valueOf(ServiceEnum.FINANCIALASSISTANCE.getId()));
			  
			  
			  imageVoList.add(imageVO);
		  
		  } 
		  test.setKey(key);
		  test.setValue(imageVoList);
		  vo.add(test);
		  
		  }
  financialAssistanceVO.setEnclosures(vo);
		 
		return financialAssistanceVO;
	}
	/*
	 * public ActionDetailsDTO setLockedDetails( String userId,String status) {
	 * ActionDetailsDTO lockedDetails = new ActionDetailsDTO();
	 * lockedDetails.setAction(status);
	 * lockedDetails.setActionDatetime(LocalDateTime.now());
	 * lockedDetails.setActionBy(userId); return lockedDetails;
	 * 
	 * 
	 * }
	 */
	
	
	@Override
	public FinancialAssistanceDTO convertEntity(FinancialAssistanceVO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public FinancialAssistanceVO convertDistrictData(List<FinancialAssistanceDTO> dto,List<MandalDTO> mandaList,String districtName) {
		FinancialAssistanceVO districtVo = new FinancialAssistanceVO();
		districtVo.setDistrictName(districtName);
		List<FinancialAssistanceVO> mandalList = new ArrayList<>();
		for(MandalDTO mandal:mandaList) {
			getVillageData(dto, mandalList, mandal);
			
		}
		if(mandalList!=null && !mandalList.isEmpty()) {
			districtVo.setDistrictData(mandalList);
		}
	
		return districtVo;
	}
	
	public FinancialAssistanceVO convertMandalData(List<FinancialAssistanceDTO> dto,MandalDTO mandaDto,String districtName) {
		FinancialAssistanceVO districtVo = new FinancialAssistanceVO();
		districtVo.setDistrictName(districtName);
		List<FinancialAssistanceVO> mandalList = new ArrayList<>();
			getVillageData(dto, mandalList, mandaDto);
		if(mandalList!=null && !mandalList.isEmpty()) {
			districtVo.setDistrictData(mandalList);
		}
	
		return districtVo;
	}
	public FinancialAssistanceVO convertVillageData(List<FinancialAssistanceDTO> dto,MandalDTO mandaDto,String districtName,VillageDTO village) {
		FinancialAssistanceVO districtVo = new FinancialAssistanceVO();
		districtVo.setDistrictName(districtName);
		List<FinancialAssistanceVO> mandalList = new ArrayList<>();
		FinancialAssistanceVO mandalVo = new FinancialAssistanceVO();
		mandalVo.setMandalName(mandaDto.getMandalName());
		FinancialAssistanceVO vo = new FinancialAssistanceVO();
		vo.setVillageName(village.getVillageName());
		List<FinancialAssistanceDTO> villageDto = dto.stream().filter(p1->p1.getPersonalDetails().getAddress().getVillage().
				equalsIgnoreCase(village.getVillageName())).collect(Collectors.toList());
		List<FinancialAssistanceVO> villageList = new ArrayList<>();
		if(villageDto!=null && !villageDto.isEmpty()) {
			villageDto.forEach(one->{
				villageList.add(this.convertVolimitedFeilds(one));
			});
		}
		if(villageList!=null && !villageList.isEmpty()) {
			vo.setDate(villageList);
		//	mandalVo.getMandalData().add(vo);
			if(mandalVo==null || mandalVo.getMandalData()==null || mandalVo.getMandalData().isEmpty()) {
				List<FinancialAssistanceVO> data = new ArrayList<>();
				data.add(vo);
				mandalVo.setMandalData(data);
				//break;
			}else {
				mandalVo.getMandalData().add(vo);
				//break;
			}
			
		}
		if(mandalVo!=null && mandalVo.getMandalData()!=null && !mandalVo.getMandalData().isEmpty()) {
			if(mandalList==null || mandalList.isEmpty()) {
				mandalList.add(mandalVo);
			}else {
				mandalList.add(mandalVo);
			}
		}
	
		if(mandalList!=null && !mandalList.isEmpty()) {
			districtVo.setDistrictData(mandalList);
		}
	
		return districtVo;
	}
	private void getVillageData(List<FinancialAssistanceDTO> dto, List<FinancialAssistanceVO> mandalList,
			MandalDTO mandal) {
		List<VillageDTO>  listVilages = villageDAO.findByMandalId(mandal.getMandalCode());
		listVilages.sort((p2,p1)->p1.getVillageName().compareTo(p2.getVillageName()));
		FinancialAssistanceVO mandalVo = new FinancialAssistanceVO();
		mandalVo.setMandalName(mandal.getMandalName());
		for(VillageDTO village:listVilages) {
			FinancialAssistanceVO vo = new FinancialAssistanceVO();
			vo.setVillageName(village.getVillageName());
			List<FinancialAssistanceDTO> villageDto = dto.stream().filter(p1->(p1.getPersonalDetails().getAddress().getVillage().
					equalsIgnoreCase(village.getVillageName()) && p1.getPersonalDetails().getAddress().getMandal().
							equalsIgnoreCase(mandal.getMandalName()))).collect(Collectors.toList());
			List<FinancialAssistanceVO> villageList = new ArrayList<>();
			if(villageDto!=null && !villageDto.isEmpty()) {
				villageDto.forEach(one->{
					villageList.add(this.convertVolimitedFeilds(one));
				});
			}
			if(villageList!=null && !villageList.isEmpty()) {
				vo.setDate(villageList);
				if(mandalVo==null || mandalVo.getMandalData()==null || mandalVo.getMandalData().isEmpty()) {
					List<FinancialAssistanceVO> data = new ArrayList<>();
					data.add(vo);
					mandalVo.setMandalData(data);
					//break;
				}else {
					mandalVo.getMandalData().add(vo);
					//break;
				}
				
				
			}
			/*if(mandalVo==null || mandalVo.getVillageData()==null) {
				
			}*/
		}
		
		if(mandalVo!=null && mandalVo.getMandalData()!=null && !mandalVo.getMandalData().isEmpty()) {
			if(mandalList==null || mandalList.isEmpty()) {
				mandalList.add(mandalVo);
			}else {
				mandalList.add(mandalVo);
			}
		}
	}
	
	public FinancialAssistanceVO getData(List<FinancialAssistanceDTO> dto) {
		
			List<FinancialAssistanceVO> villageList = new ArrayList<>();
			dto.forEach(one->{
					villageList.add(this.convertVolimitedFeilds(one));
				});
			FinancialAssistanceVO vo = new FinancialAssistanceVO();
				
			vo.setDate(villageList);
			return vo;
	}
	
}
