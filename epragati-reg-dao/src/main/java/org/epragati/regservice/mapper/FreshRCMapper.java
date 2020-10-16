package org.epragati.regservice.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.MessageKeys;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.dto.MasterFreshRcMviQuestions;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.RegistrationDetailsLogDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.mappers.DistrictMapper;
import org.epragati.master.mappers.MandalMapper;
import org.epragati.master.mappers.PostOfficeMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.master.mappers.UserMapper;
import org.epragati.master.mappers.VillageMapper;
import org.epragati.master.vo.MasterFreshrcMviQuestionsVO;
import org.epragati.master.vo.UserVO;
import org.epragati.master.vo.VillageVO;
import org.epragati.regservice.dto.Comments;
import org.epragati.regservice.dto.FreshRcDTO;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.regservice.vo.CommentsVO;
import org.epragati.regservice.vo.FreshApplicationSearchVO;
import org.epragati.regservice.vo.FreshRcVO;
import org.epragati.regservice.vo.RegServiceVO;
import org.epragati.rta.reports.vo.FreshRCReportVO;
import org.epragati.util.RoleEnum;
import org.epragati.util.StatusRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class FreshRCMapper extends BaseMapper<FreshRcDTO, FreshRcVO> {

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private DistrictMapper districtMapper;
	@Autowired
	private MandalMapper mandalMapper;
	@Autowired
	private PostOfficeMapper pinCodeMapper;

	@Autowired
	private VillageMapper villageMapper;
	@Autowired
	private StateMapper stateMapper;

	@Override
	public FreshRcVO convertEntity(FreshRcDTO dto) {
		FreshRcVO freshRcVO = new FreshRcVO();
		List<CommentsVO> commentsList = new ArrayList<CommentsVO>();
		CommentsVO commentsVO = new CommentsVO();
		funPoint(dto.getNoOfEMIs(), freshRcVO::setNoOfEMIs);
		funPoint(dto.getPendingAmount(), freshRcVO::setPendingAmount);
		funPoint(dto.getPendingFrom(), freshRcVO::setPendingFrom);
		funPoint(dto.getPendingTo(), freshRcVO::setPendingTo);
		funPoint(dto.getFinancerComments(), freshRcVO::setFinancerComments);
		funPoint(dto.getFinancerUserId(), freshRcVO::setFinancerUserId);
		funPoint(dto.getYardName(), freshRcVO::setYardName);
		funPoint(dto.getYardLocation(), freshRcVO::setYardLocation);
		funPoint(dto.isAOAssignedToMVI(),freshRcVO::setAOAssignedToMVI);
		if (dto.getYardAddress() != null) {

			freshRcVO.setYardAddress(applicantAddressMapper.convertEntity(dto.getYardAddress()));
			if (dto.getYardAddress().getOtherVillage() != null && !dto.getYardAddress().getOtherVillage().isEmpty()) {

				VillageVO village = new VillageVO();
				village.setVillageName(dto.getYardAddress().getOtherVillage());
				freshRcVO.getYardAddress().setVillage(village);
			}
		}
		if (dto.getFinancerDetails() != null) {
			freshRcVO.setFinancerDetails(userMapper.convertEntity(dto.getFinancerDetails()));
		}
		if (dto.getFrcComments()!=null &&!dto.getFrcComments().isEmpty()) {
			dto.getFrcComments().forEach(val -> {
				if (val.getRole().equals(RoleEnum.AO.getName())) {
					setCommentsBasedOnRoles(commentsVO, val);
				}
				if (val.getRole().equals(RoleEnum.MVI.getName())) {
					setCommentsBasedOnRoles(commentsVO, val);
				}
				if (val.getRole().equals(RoleEnum.RTO.getName())) {
					setCommentsBasedOnRoles(commentsVO, val);
				}
			});
			commentsList.add(commentsVO);
			freshRcVO.setComments(commentsList);
		}
		return freshRcVO;
	}

	private void setCommentsBasedOnRoles(CommentsVO commentsVO, Comments val) {
		commentsVO.setComments(val.getComments());
		commentsVO.setUserId(val.getUserId());
		commentsVO.setRole(val.getRole());
		commentsVO.setDate(val.getDate());
	}
	
	public FreshRcVO convertEntityPrc(FreshRcDTO dto) {
		FreshRcVO freshRcVO = new FreshRcVO();
		List<CommentsVO> commentsList = new ArrayList<CommentsVO>();
		CommentsVO commentsVO = new CommentsVO();
		funPoint(dto.getNoOfEMIs(), freshRcVO::setNoOfEMIs);
		funPoint(dto.getPendingAmount(), freshRcVO::setPendingAmount);
		funPoint(dto.getPendingFrom(), freshRcVO::setPendingFrom);
		funPoint(dto.getPendingTo(), freshRcVO::setPendingTo);
		funPoint(dto.getFinancerComments(), freshRcVO::setFinancerComments);
		funPoint(dto.getFinancerUserId(), freshRcVO::setFinancerUserId);
		funPoint(dto.getYardName(), freshRcVO::setYardName);
		funPoint(dto.getYardLocation(), freshRcVO::setYardLocation);
		if (dto.getYardAddress() != null) {
			freshRcVO.setYardAddress(applicantAddressMapper.convertEntity(dto.getYardAddress()));
		}
		if (dto.getFinancerDetails() != null) {
			freshRcVO.setFinancerDetails(userMapper.convertEntity(dto.getFinancerDetails()));
		}
		return freshRcVO;
	}

	@Override
	public FreshRcDTO convertVO(FreshRcVO freshRcVO) {
		FreshRcDTO freshRcDTO = new FreshRcDTO();
		Comments comments = new Comments();
		List<Comments> commentsList = new ArrayList<Comments>();
		funPoint(freshRcVO.getNoOfEMIs(), freshRcDTO::setNoOfEMIs);
		funPoint(freshRcVO.getPendingAmount(), freshRcDTO::setPendingAmount);
		funPoint(freshRcVO.getPendingFrom(), freshRcDTO::setPendingFrom);
		funPoint(freshRcVO.getPendingTo(), freshRcDTO::setPendingTo);
		funPoint(freshRcVO.getFinancerComments().toUpperCase(), freshRcDTO::setFinancerComments);
		funPoint(freshRcVO.getFinancerUserId().toUpperCase(), freshRcDTO::setFinancerUserId);
		funPoint(freshRcVO.getYardName().toUpperCase(), freshRcDTO::setYardName);
		funPoint(freshRcVO.getYardLocation().toUpperCase(), freshRcDTO::setYardLocation);
		if (freshRcVO.getYardAddress() != null) {
			freshRcDTO.setYardAddress(applicantAddressMapper.convertVO(freshRcVO.getYardAddress()));
		}
		return freshRcDTO;
	}

	public RegServiceVO freshRcDetailsForApprovals(RegServiceVO regServiceVO, RegServiceDTO dto) {
		FreshRcVO freshRcVO=convertEntity(dto.getFreshRcdetails());
		funPoint(dto.getMviOfficeCode(), regServiceVO::setMviOfficeCode);
		if (StringUtils.isNotEmpty(dto.getFreshRcdetails().getMviUserId())) {
			freshRcVO.setMviUserId(dto.getFreshRcdetails().getMviUserId());
		}
		if (StringUtils.isNotEmpty(dto.getFreshRcdetails().getMviName())) {
			freshRcVO.setMviName(dto.getFreshRcdetails().getMviName());
		}
		funPoint(dto.getMviOfficeCode(), regServiceVO::setMviOfficeCode);
		regServiceVO.setFreshRc(freshRcVO);
		return regServiceVO;
	}


	public List<RegServiceVO> ConvertEntityForImageReupload(RegServiceDTO regServiceDTO) {
		List<RegServiceVO> regServiceVOList = new ArrayList<RegServiceVO>();
		RegServiceVO regServiceVO = new RegServiceVO();
		funPoint(regServiceDTO.getApplicationNo(), regServiceVO::setApplicationNo);
		funPoint(regServiceDTO.getApplicationStatus(), regServiceVO::setApplicationStatus);
		regServiceVO.getFreshRc().setReuploadImages(true);
		regServiceVOList.add(regServiceVO);
		return regServiceVOList;

	}

	public List<RegServiceVO> ConvertEntityForDisplayRecord(List<RegServiceDTO> regServiceDTOList) {
		List<RegServiceVO> regServiceVOList = new ArrayList<RegServiceVO>();
		RegServiceVO regServiceVO = new RegServiceVO();
		for (RegServiceDTO regServiceDTO : regServiceDTOList) {
			funPoint(regServiceDTO.getPrNo(), regServiceVO::setPrNo);
			funPoint(regServiceDTO.getTrNo(), regServiceVO::setTrNo);
			funPoint(regServiceDTO.getApplicationStatus(), regServiceVO::setApplicationStatus);
		}
		regServiceVOList.add(regServiceVO);
		return regServiceVOList;

	}

	public FreshApplicationSearchVO convertenablefrom37record(RegServiceDTO dto) {
		FreshApplicationSearchVO freshApplicationSearch = new FreshApplicationSearchVO();
		freshApplicationSearch = covertcommanfreshfileds(dto, freshApplicationSearch);
		freshApplicationSearch.setfRcFrom37(true);
		return freshApplicationSearch;
	}

	public FreshApplicationSearchVO convertdisablefrom37record(RegServiceDTO dto) {
		FreshApplicationSearchVO freshApplicationSearch = new FreshApplicationSearchVO();
		freshApplicationSearch = covertcommanfreshfileds(dto, freshApplicationSearch);
		freshApplicationSearch.setfRcFrom37(false);
		return freshApplicationSearch;
	}

	public FreshApplicationSearchVO convertForTerminatDocment(RegServiceDTO dto) {
		FreshApplicationSearchVO freshApplicationSearch = new FreshApplicationSearchVO();
		freshApplicationSearch = covertcommanfreshfileds(dto, freshApplicationSearch);
		freshApplicationSearch.setFinancierTerminated(true);
		return freshApplicationSearch;
	}

	public FreshApplicationSearchVO convertForReuploadDocments(RegServiceDTO dto) {
		FreshApplicationSearchVO freshApplicationSearch = new FreshApplicationSearchVO();
		freshApplicationSearch = covertcommanfreshfileds(dto, freshApplicationSearch);
		freshApplicationSearch.setFinancierTerminated(false);
		return freshApplicationSearch;
	}

	public FreshApplicationSearchVO covertcommanfreshfileds(RegServiceDTO dto,
			FreshApplicationSearchVO freshApplicationSearch) {
		funPoint(dto.getApplicationNo(), freshApplicationSearch::setApplicationNumber);
		funPoint(dto.getApplicationStatus(), freshApplicationSearch::setApplicationStatus);
		funPoint(dto.getTrNo(), freshApplicationSearch::setTrNo);
		funPoint(dto.getPrNo(), freshApplicationSearch::setPrNo);
		return freshApplicationSearch;
	}

	public RegistrationDetailsDTO convertDataOfFinancierToReg(RegistrationDetailsDTO registrationDetailsDTO,
			Optional<UserDTO> userDtoOpt) {
		registrationDetailsDTO.setOwnerType(OwnerTypeEnum.Company);
		registrationDetailsDTO.getApplicantDetails().setAadharNo(userDtoOpt.get().getAadharNo());
		ContactDTO contactDTO = new ContactDTO();
		funPoint(userDtoOpt.get().getEmail(), contactDTO::setEmail);
		funPoint(userDtoOpt.get().getMobile(), contactDTO::setMobile);
		registrationDetailsDTO.getApplicantDetails().setContact(contactDTO);
		ApplicantAddressDTO presentAddressDetails = new ApplicantAddressDTO();
		if (userDtoOpt.get().getMandal() != null) {
			presentAddressDetails.setMandal(userDtoOpt.get().getMandal());
		}
		if (userDtoOpt.get().getState() != null) {
			presentAddressDetails.setState(userDtoOpt.get().getState());
		}
		if (userDtoOpt.get().getStreetName() != null) {
			presentAddressDetails.setStreetName(userDtoOpt.get().getStreetName());
		}
		if (userDtoOpt.get().getDistrict() != null) {
			presentAddressDetails.setDistrict(userDtoOpt.get().getDistrict());
		}
		if (userDtoOpt.get().getDoorNo() != null) {
			presentAddressDetails.setDoorNo(userDtoOpt.get().getDoorNo());
		}
		registrationDetailsDTO.getApplicantDetails().setPresentAddress(presentAddressDetails);
		funPoint(userDtoOpt.get().getDob(), registrationDetailsDTO.getApplicantDetails()::setDateOfBirth);
		funPoint(userDtoOpt.get().getOffice(), registrationDetailsDTO::setOfficeDetails);
		funPoint(userDtoOpt.get().getRepresentativeName(), registrationDetailsDTO.getApplicantDetails()::setFirstName);
		registrationDetailsDTO.getApplicantDetails().setFatherName(null);
		funPoint(userDtoOpt.get().getFirstName(), registrationDetailsDTO.getApplicantDetails()::setDisplayName);
		funPoint(userDtoOpt.get().getFirstName(), registrationDetailsDTO.getApplicantDetails()::setEntityName);
		registrationDetailsDTO.getApplicantDetails().setRepresentativeName(userDtoOpt.get().getRepresentativeName());
		registrationDetailsDTO.getApplicantDetails().setIsAadhaarValidated(true);
		registrationDetailsDTO.setFinanceDetails(null);
		return registrationDetailsDTO;
	}

	public RegistrationDetailsLogDTO convertRegDetailsToLog(RegistrationDetailsDTO registrationDetailsDTO,
			RegistrationDetailsLogDTO regLogDetails) {
		regLogDetails.setRegiDetails(registrationDetailsDTO);
		regLogDetails.setLogCreatedDateStr(LocalDateTime.now().toString());
		regLogDetails.setLogCreatedDateTime(LocalDateTime.now());
		return regLogDetails;
	}

	/**
	 * Converting fresh RC questions based on role
	 * 
	 * @param regServiceVO
	 * @param frcQuestions
	 * @param role
	 * @return RegServiceVO that contains fresh RC questions based on role
	 */
	public RegServiceVO convertFrcQuestionsDtoToVo(RegServiceVO regServiceVO,
			List<MasterFreshRcMviQuestions> frcQuestions) {
		List<MasterFreshrcMviQuestionsVO> frcQuestionsVOList = new ArrayList<>();
		frcQuestions.forEach(question -> {
			MasterFreshrcMviQuestionsVO frcQuestionsVO = new MasterFreshrcMviQuestionsVO();
			frcQuestionsVO.setQuestion(question.getQuestion());
			frcQuestionsVO.setSerialNo(question.getSerialNo());
			frcQuestionsVO.setRole(question.getRole());
			frcQuestionsVOList.add(frcQuestionsVO);
		});
		regServiceVO.getFreshRc().setFrcQuestionsVO(frcQuestionsVOList);
		return regServiceVO;
	}
	/**
	 * set AO role  questions based on status 
	 * @param regServiceVO
	 * @param frcQuestions
	 * @return
	 */
	
	public RegServiceVO convertFrcQuestionDtoToVoForAO(RegServiceVO regServiceVO, MasterFreshRcMviQuestions question) {
		List<MasterFreshrcMviQuestionsVO> frcQuestionsVOList = new ArrayList<>();
		MasterFreshrcMviQuestionsVO frcQuestionsVO = new MasterFreshrcMviQuestionsVO();
		frcQuestionsVO.setQuestion(question.getQuestion());
		frcQuestionsVO.setSerialNo(question.getSerialNo());
		frcQuestionsVO.setRole(question.getRole());
		frcQuestionsVOList.add(frcQuestionsVO);
		regServiceVO.getFreshRc().setFrcQuestionsVO(frcQuestionsVOList);
		return regServiceVO;
	}

	public MasterFreshRcMviQuestions setQuestionsToDTO(MasterFreshrcMviQuestionsVO question) {
		MasterFreshRcMviQuestions frcQuestionsDTO = new MasterFreshRcMviQuestions();

		frcQuestionsDTO.setQuestion(question.getQuestion());
		frcQuestionsDTO.setSelectedOption(question.isSelectedOption());
		frcQuestionsDTO.setRole(question.getRole());
		if (question.getRemarksForFinancier()!= null) {
			frcQuestionsDTO.setRemarksForFinancier(question.getRemarksForFinancier());
		}
		return frcQuestionsDTO;
	}
	
	public RegServiceDTO convertFrcStatus(RegServiceDTO regServiceDTO)
	{
		
		regServiceDTO.setApplicationStatus(StatusRegistration.FRESHRCREJECTED);
		regServiceDTO.setFlowId(null);
		regServiceDTO.setCurrentRoles(null);
		regServiceDTO.setLockedDetails(null); 
		
		return regServiceDTO;
		
	}
	
	public RegistrationDetailsDTO convertPresentAddressVoToDto(RegServiceVO input,
			RegistrationDetailsDTO registrationDetailsDTO) {
		if (input.getPresentAddress().getDistrict() != null) {
			registrationDetailsDTO.getApplicantDetails().getPresentAddress()
					.setDistrict(districtMapper.convertVO(input.getPresentAddress().getDistrict()));
		}
		if (input.getPresentAddress().getMandal() != null) {
			registrationDetailsDTO.getApplicantDetails().getPresentAddress()
					.setMandal(mandalMapper.convertVO(input.getPresentAddress().getMandal()));
		}
		return registrationDetailsDTO;
	}
	
	/**
	 * for fresh rc report convert  fields from regServiceDTO dto to FreshRCReportVO 
	 * @param dto
	 * @return
	 */
	public FreshRCReportVO setDtoToVoForFrcReport(RegServiceDTO dto) {
		FreshRCReportVO reportVO = new FreshRCReportVO();
		reportVO.setApprovedDtae(dto.getApprovedDate());
		reportVO.setCov(dto.getRegistrationDetails().getClassOfVehicleDesc().toString());
		reportVO.setVehicleNo(dto.getPrNo());
		reportVO.setFinancierReason(dto.getFreshRcdetails().getFinancerComments());
		reportVO.setMviName(dto.getFreshRcdetails().getMviName());
		reportVO.setOfficeName(dto.getOfficeDetails().getOfficeName());
		reportVO.setCreatedDate(dto.getCreatedDate());
		if (!CollectionUtils.isEmpty(dto.getFreshRcdetails().getFrcComments())) {
			dto.getFreshRcdetails().getFrcComments().stream().forEach(data -> {
				if (data.getRole() != null && data.getRole().equals(RoleEnum.RTO.getName())) {
					reportVO.setRtoName(data.getUserId());
				}
				if (data.getRole() != null && data.getRole().equals(RoleEnum.AO.getName())) {
					reportVO.setAoName(data.getUserId());
				}
			});
		}
		if (dto.getFreshRcdetails().getYardAddress() != null) {

			reportVO.setYardAddress(applicantAddressMapper.convertEntity(dto.getFreshRcdetails().getYardAddress()));
			if (dto.getFreshRcdetails().getYardAddress().getOtherVillage() != null
					&& !dto.getFreshRcdetails().getYardAddress().getOtherVillage().isEmpty()) {

				VillageVO village = new VillageVO();
				village.setVillageName(dto.getFreshRcdetails().getYardAddress().getOtherVillage());
				reportVO.getYardAddress().setVillage(village);
			}
		}

		setstatus(dto,reportVO);
		return reportVO;
	}
	
	
	private FreshRCReportVO setstatus(RegServiceDTO dto, FreshRCReportVO vo) {
		if (null != dto.getApplicationStatus()) {
			if ((Arrays.asList(StatusRegistration.AOAPPROVED, StatusRegistration.AOREJECTED)
					.contains(dto.getApplicationStatus())) && dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_RTO_PENDING_STATUS);
			}
			if ((Arrays.asList(StatusRegistration.AOAPPROVED, StatusRegistration.RTOAPPROVED)
					.contains(dto.getApplicationStatus())) && !dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_MVI_PENDING_STATUS);
			}
			if ((Arrays.asList(StatusRegistration.MVIAPPROVED, StatusRegistration.MVIREJECTED)
					.contains(dto.getApplicationStatus())) && dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_AO_PENDING_STATUS);
			}
			if (Arrays.asList(StatusRegistration.AOREJECTED).contains(dto.getApplicationStatus()) && !dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_RTO_PENDING_STATUS);
			}
			if (Arrays.asList(StatusRegistration.PAYMENTDONE,StatusRegistration.REUPLOAD).contains(dto.getApplicationStatus())) {
				vo.setStatus(MessageKeys.FRESHRC_AO_PENDING_STATUS);
			}
			if (Arrays.asList(StatusRegistration.APPROVED).contains(dto.getApplicationStatus())) {
				vo.setStatus(MessageKeys.FRESHRC_APPROVED);
			}
			if (Arrays.asList(StatusRegistration.FRESHRCREJECTED).contains(dto.getApplicationStatus())
					&& dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_MVI_REJECTED);
			}
			if (Arrays.asList(StatusRegistration.FRESHRCREJECTED).contains(dto.getApplicationStatus())
					&& !dto.isMviDone()) {
				vo.setStatus(MessageKeys.FRESHRC_AO_REJECTED);
			}
			if (Arrays.asList(StatusRegistration.REJECTED).contains(dto.getApplicationStatus())
					&& dto.isMviDone()) {
				vo.setStatus(StatusRegistration.REJECTED.getDescription());
			}
		}
		return vo;
	}
	
	public UserDTO convertFinancierAdressToDto(UserDTO dto, UserVO vo) {

		if (vo.getDistrict() != null && !vo.getDistrict().getDistrictName().isEmpty()) {
			dto.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		}

		if (vo.getMandal() != null && !vo.getMandal().getMandalName().isEmpty()) {
			dto.setMandal(mandalMapper.convertVO(vo.getMandal()));
		}

		if (vo.getPostOffice() != null && !vo.getPostOffice().getPostOfficeName().isEmpty()) {
			dto.setPostOffice(pinCodeMapper.convertVO(vo.getPostOffice()));
		}

		if (vo.getState() != null && !vo.getState().getStateName().isEmpty()) {
			dto.setState(stateMapper.convertVO(vo.getState()));
		}

		if (vo.getVillage() != null && !vo.getVillage().getVillageName().isEmpty()) {
			dto.setVillage(villageMapper.convertVO(vo.getVillage()));
		}
		

		return dto;
	}

	public UserVO convertFinancierAdressToVo(UserDTO dto) {

		UserVO userVO = new UserVO();
		if ((dto.getState() != null && !dto.getState().getStateName().isEmpty())) {
			userVO.setState(stateMapper.convertEntity(dto.getState()));
		}
		if (dto.getMandal() != null && !dto.getMandal().getMandalName().isEmpty()) {
			userVO.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}
		if (dto.getVillage() != null && !dto.getVillage().getVillageName().isEmpty()) {
			userVO.setVillage(villageMapper.convertEntity(dto.getVillage()));
		}
		if (dto.getDistrict() != null && !dto.getDistrict().getDistrictName().isEmpty()) {
			userVO.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}
		if (dto.getPostOffice() != null && !dto.getPostOffice().getPostOfficeName().isEmpty()) {
			userVO.setPostOffice(pinCodeMapper.convertEntity(dto.getPostOffice()));
		}
		return userVO;
	}
	
}
