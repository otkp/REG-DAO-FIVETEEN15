package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ActionDTO;
import org.epragati.master.dto.FinancierUserLogDTO;
import org.epragati.master.dto.UserCorrectionsDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.vo.ActionsVO;
import org.epragati.master.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends BaseMapper<UserDTO, UserVO> {

	@Autowired
	private DesignationMapper designationMapper;

	@Autowired
	private StateMapper stateMapper;

	@Autowired
	private DistrictMapper districtMapper;

	@Autowired
	private MandalMapper mandalMapper;

	@Autowired
	private PostOfficeMapper pinCodeMapper;

	@Autowired
	private OfficeMapper officeMapper;

	@Autowired
	private RolesMapper rolesMapper;

	@Autowired
	private ActionMapper actionMapper;

	@Autowired
	private ActionsMapper actionsMapper;

	@Autowired
	private VillageMapper villageMapper;

	@Value("${user.default.pwd:}")
	private String userDefaultPwd;

	@Override
	public UserVO convertEntity(UserDTO userDto) {
		UserVO userDetailsVo = new UserVO();
		funPoint(userDto.getAadharNo(), userDetailsVo::setAadharNo);
		funPoint(userDto.getEmail(), userDetailsVo::setEmail);
		funPoint(userDto.getEmpCode(), userDetailsVo::setEmpCode);
		funPoint(userDto.getFaxNo(), userDetailsVo::setFaxNo);
		funPoint(userDto.getFirstName(), userDetailsVo::setFirstName);
		funPoint(userDto.getMiddleName(), userDetailsVo::setMiddleName);
		funPoint(userDto.getLastName(), userDetailsVo::setLastName);
		funPoint(userDto.getLandmark(), userDetailsVo::setLandmark);
		funPoint(userDto.getMessage(), userDetailsVo::setMessage);
		funPoint(userDto.getMobile(), userDetailsVo::setMobile);
		// funPoint(userDto.getPassword(), userDetailsVo::setPassword);
		funPoint(userDto.getPhoneNo(), userDetailsVo::setPhoneNo);
		funPoint(userDto.getProfileImageUrl(), userDetailsVo::setProfileImageUrl);
		funPoint(userDto.getQualification(), userDetailsVo::setQualification);
		funPoint(userDto.getSignatureImageUrl(), userDetailsVo::setSignatureImageUrl);
		funPoint(userDto.getStreetName(), userDetailsVo::setStreetName);
		funPoint(userDto.isStatus(), userDetailsVo::setStatus);
		funPoint(userDto.getUserId(), userDetailsVo::setUserId);
		funPoint(userDto.getNewpassword(), userDetailsVo::setNewpassword);
		funPoint(userDto.getConfirmpassword(), userDetailsVo::setConfirmpassword);
		funPoint(userDto.getFirstname(), userDetailsVo::setFirstName);
		funPoint(userDto.getRid(), userDetailsVo::setRid);

		funPoint(userDto.getUserDepartment(), userDetailsVo::setUserDepartment);
		funPoint(userDto.getUserDesignation(), userDetailsVo::setUserDesignation);
		funPoint(userDto.getDob(), userDetailsVo::setDob);
		funPoint(userDto.getUserLevel(), userDetailsVo::setUserLevel);
		funPoint(userDto.isParent(), userDetailsVo::setIsParent);
		funPoint(userDto.getParentId(), userDetailsVo::setParentId);
		
		if (userDto.getDesignation() != null) {
			userDetailsVo.setDesignation(designationMapper.convertEntity(userDto.getDesignation()));
		}

		if (userDto.getDistrict() != null) {
			userDetailsVo.setDistrict(districtMapper.convertEntity(userDto.getDistrict()));
		}

		if (userDto.getMandalDTO() != null) {
			userDetailsVo.setMandalDTO(mandalMapper.convertEntity(userDto.getMandalDTO()));
		}

		if (userDto.getMandal() != null) {
			userDetailsVo.setMandal(mandalMapper.convertEntity(userDto.getMandal()));
		}

		if (userDto.getOffice() != null) {
			userDetailsVo.setOffice(officeMapper.convertEntity(userDto.getOffice()));
		}

		if (userDto.getPincode() != null) {
			userDetailsVo.setPincode(pinCodeMapper.convertEntity(userDto.getPincode()));
		}

		if (userDto.getState() != null) {
			userDetailsVo.setState(stateMapper.convertEntity(userDto.getState()));
		}

		if (userDto.getPrimaryRole() != null) {
			userDetailsVo.setPrimaryRole(rolesMapper.convertEntity(userDto.getPrimaryRole()));
		}

		if (userDto.getAdditionalRoles() != null && !userDto.getAdditionalRoles().isEmpty()) {
			userDetailsVo.setAdditionalRoles(rolesMapper.convertEntity(userDto.getAdditionalRoles()));
		}

		if (userDto.getActionItems() != null) {
			userDetailsVo.setActionItems(actionMapper.convertEntity(userDto.getActionItems()));
		}
		if (userDto.getVillage() != null) {
			userDetailsVo.setVillage(villageMapper.convertEntity(userDto.getVillage()));
		}
		funPoint(userDto.getRegdNumber(), userDetailsVo::setRegdNumber);
		funPoint(userDto.getWebsiteAddress(), userDetailsVo::setWebsiteAddress);
		funPoint(userDto.getUserName(), userDetailsVo::setUserName);
		funPoint(userDto.getFatherName(), userDetailsVo::setFatherName);
		funPoint(userDto.getDoorNo(), userDetailsVo::setDoorNo);
		funPoint(userDto.getCity(), userDetailsVo::setCity);
		funPoint(userDto.getIsAccountNonLocked(), userDetailsVo::setIsAccountNonLocked);
		funPoint(userDto.getRepresentativeName(), userDetailsVo::setRepresentativeName);
		funPoint(userDto.getUserStatus(), userDetailsVo::setUserStatus);
				
		return userDetailsVo;
	}

	@Override
	public UserDTO convertVO(UserVO vo) {

		UserDTO dto = new UserDTO();
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getEmail(), dto::setEmail);
		funPoint(vo.getEmpCode(), dto::setEmpCode);
		funPoint(vo.getFaxNo(), dto::setFaxNo);
		funPoint(vo.getMiddleName(), dto::setMiddleName);
		funPoint(vo.getMiddleName(), dto::setLastName);
		funPoint(vo.getLandmark(), dto::setLandmark);
		funPoint(vo.getMessage(), dto::setMessage);
		funPoint(vo.getMobile(), dto::setMobile);
		funPoint(vo.getPassword(), dto::setPassword);
		funPoint(vo.getPhoneNo(), dto::setPhoneNo);
		funPoint(vo.getProfileImageUrl(), dto::setProfileImageUrl);
		funPoint(vo.getQualification(), dto::setQualification);
		funPoint(vo.getSignatureImageUrl(), dto::setSignatureImageUrl);
		funPoint(vo.getStreetName(), dto::setStreetName);
		funPoint(vo.isStatus(), dto::setStatus);
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(vo.getNewpassword(), dto::setNewpassword);
		funPoint(vo.getConfirmpassword(), dto::setConfirmpassword);
		funPoint(vo.getFirstName(), dto::setFirstName);
		funPoint(vo.getRid(), dto::setRid);
		funPoint(vo.getRocNo(), dto::setRocNo);

		funPoint(vo.getFinancierPanNo(), dto::setFinancierPanNo);
		funPoint(vo.getPanNo(), dto::setPanNo);
		funPoint(vo.getRepresentativeEmail(), dto::setRepresentativeEmail);
		funPoint(vo.getDoorNo(), dto::setDoorNo);
		funPoint(vo.getOfficeContactNo(), dto::setOfficeContactNo);
		funPoint(vo.getInstitutionName(), dto::setFirstName);
		funPoint(vo.getRegistrationFirmDate(), dto::setRegistrationFirmDate);
		funPoint(vo.getUserRelation(), dto::setUserRelation);
		funPoint(vo.getCompanyType(), dto::setCompanyType);
		funPoint(vo.getRepresentativeName(), dto::setRepresentativeName);
		funPoint(vo.getRepresentativeMobileNo(), dto::setRepresentativeMobileNo);
		funPoint(vo.getCity(), dto::setCity);
		funPoint(vo.getOfficeMail(), dto::setOfficeMail);
		funPoint(vo.getMandalName(), dto::setMandalName);
		funPoint(vo.getDistrictName(), dto::setDistrictName);
		funPoint(vo.getStateName(), dto::setStateName);
		funPoint(vo.getInstitutionName(), dto::setInstitutionName);
		funPoint(vo.getInstitutionName(), dto::setFirstName);
		funPoint(vo.getUserDepartment(), dto::setUserDepartment);
		funPoint(vo.getUserDesignation(), dto::setUserDesignation);
		funPoint(vo.getDob(), dto::setDob);
		funPoint(vo.getUserLevel(), dto::setUserLevel);

		if (vo.getParentId() != null) {
			funPoint(vo.getParentId(), dto::setParentId);
		}
		if (vo.getDesignation() != null) {
			dto.setDesignation(designationMapper.convertVO(vo.getDesignation()));
		}

		if (vo.getUserAction() != null) {
			List<ActionDTO> list = new ArrayList<ActionDTO>();
			List<ActionsVO> listvo = vo.getUserAction();
			for (ActionsVO Actionsvo : listvo) {
				ActionDTO ActionDTO = new ActionDTO();
				ActionDTO.setId(Actionsvo.get_id());
				ActionDTO.setActionName(Actionsvo.getActionName());
				list.add(ActionDTO);
				dto.setActionItems(list);

			}
		}

		if (vo.getDistrict() != null) {
			dto.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		}

		if (vo.getMandalDTO() != null) {
			dto.setMandalDTO(mandalMapper.convertVO(vo.getMandalDTO()));
		}

		if (vo.getOffice() != null) {
			dto.setOffice(officeMapper.convertVO(vo.getOffice()));
		}

		if (vo.getMandal() != null) {
			dto.setMandal(mandalMapper.convertVO(vo.getMandal()));
		}
		if (vo.getPincode() != null) {
			dto.setPincode(pinCodeMapper.convertVO(vo.getPincode()));
		}

		if (vo.getState() != null) {
			dto.setState(stateMapper.convertVO(vo.getState()));
		}

		if (vo.getPrimaryRole() != null) {
			dto.setPrimaryRole(rolesMapper.convertVO(vo.getPrimaryRole()));
		}

		if (vo.getAdditionalRoles() != null && !vo.getAdditionalRoles().isEmpty()) {
			dto.setAdditionalRoles(rolesMapper.convertVO(vo.getAdditionalRoles()));
		}

		if (vo.getActionItems() != null) {
			dto.setActionItems(actionMapper.convertVO(vo.getActionItems()));
		}
		if (vo.getVillage() != null) {
			dto.setVillage(villageMapper.convertVO(vo.getVillage()));
		}
		funPoint(vo.getRegdNumber(), dto::setRegdNumber);
		funPoint(vo.getWebsiteAddress(), dto::setWebsiteAddress);
		funPoint(vo.getUserName(), dto::setUserName);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getRemarks(), dto::setRemarks);
		funPoint(vo.getRepresentativeName(), dto::setRepresentativeName);
		funPoint(vo.getUserStatus(), dto::setUserStatus);
		return dto;
	}

	public UserDTO convertLimitedVOToDTO(UserVO vo) {

		UserDTO dto = new UserDTO();
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getMobile(), dto::setMobile);
		if (vo.getOffice() != null) {
			dto.setOffice(officeMapper.convertVO(vo.getOffice()));
		}
		if (vo.getPrimaryRole() != null) {
			dto.setPrimaryRole(rolesMapper.convertVO(vo.getPrimaryRole()));
		}
		if (vo.getAdditionalRoles() != null && !vo.getAdditionalRoles().isEmpty()) {
			dto.setAdditionalRoles(rolesMapper.convertVO(vo.getAdditionalRoles()));
		}
		return dto;
	}

	@Override
	public UserDTO convertVO(UserDTO usersDto, UserVO userDetailsVo) {
		funPoint(userDetailsVo.getAadharNo(), usersDto::setAadharNo);
		funPoint(userDetailsVo.getEmail(), usersDto::setEmail);
		funPoint(userDetailsVo.getEmpCode(), usersDto::setEmpCode);
		funPoint(userDetailsVo.getFaxNo(), usersDto::setFaxNo);
		funPoint(userDetailsVo.getFirstName(), usersDto::setFirstName);
		funPoint(userDetailsVo.getMiddleName(), usersDto::setMiddleName);

		funPoint(userDetailsVo.getLastName(), usersDto::setLastName);
		funPoint(userDetailsVo.getLandmark(), usersDto::setLandmark);
		funPoint(userDetailsVo.getMessage(), usersDto::setMessage);
		funPoint(userDetailsVo.getMobile(), usersDto::setMobile);
		funPoint(userDetailsVo.getPassword(), usersDto::setPassword);
		funPoint(userDetailsVo.getPhoneNo(), usersDto::setPhoneNo);
		funPoint(userDetailsVo.getProfileImageUrl(), usersDto::setProfileImageUrl);
		funPoint(userDetailsVo.getQualification(), usersDto::setQualification);
		funPoint(userDetailsVo.getSignatureImageUrl(), usersDto::setSignatureImageUrl);
		funPoint(userDetailsVo.getStreetName(), usersDto::setStreetName);
		funPoint(userDetailsVo.isStatus(), usersDto::setStatus);
		funPoint(userDetailsVo.getUserId(), usersDto::setUserId);
		//funPoint(userDetailsVo.getUserName(), usersDto::setAadharNo);
		funPoint(userDetailsVo.getFatherName(), usersDto::setFatherName);
		funPoint(userDetailsVo.getCity(), usersDto::setCity);
		funPoint(userDetailsVo.getDoorNo(), usersDto::setDoorNo);
		funPoint(userDetailsVo.getRemarks(), usersDto::setRemarks);
		funPoint(userDetailsVo.getIsParent(), usersDto::setParent);
		funPoint(userDetailsVo.getParentId(), usersDto::setParentId);
		funPoint(userDetailsVo.getRepresentativeName(), usersDto::setRepresentativeName);
		funPoint(userDetailsVo.getUserStatus(), usersDto::setUserStatus);
		
		if (userDetailsVo.getDesignation() != null) {
			usersDto.setDesignation(designationMapper.convertVO(userDetailsVo.getDesignation()));
		}

		if (userDetailsVo.getDistrict() != null) {
			usersDto.setDistrict(districtMapper.convertVO(userDetailsVo.getDistrict()));
		}

		if (userDetailsVo.getMandalDTO() != null) {
			usersDto.setMandalDTO(mandalMapper.convertVO(userDetailsVo.getMandalDTO()));
		}

		if (userDetailsVo.getMandal() != null) {
			usersDto.setMandal(mandalMapper.convertVO(userDetailsVo.getMandal()));
		}

		if (userDetailsVo.getOffice() != null) {
			usersDto.setOffice(officeMapper.convertVO(userDetailsVo.getOffice()));
		}

		if (userDetailsVo.getPincode() != null) {
			usersDto.setPincode(pinCodeMapper.convertVO(userDetailsVo.getPincode()));
		}

		if (userDetailsVo.getState() != null) {
			usersDto.setState(stateMapper.convertVO(userDetailsVo.getState()));
		}

		if (userDetailsVo.getPrimaryRole() != null) {
			usersDto.setPrimaryRole(rolesMapper.convertVO(userDetailsVo.getPrimaryRole()));
		}

		if (userDetailsVo.getAdditionalRoles() != null && !userDetailsVo.getAdditionalRoles().isEmpty()) {
			usersDto.setAdditionalRoles(rolesMapper.convertVO(userDetailsVo.getAdditionalRoles()));
		}

		if (userDetailsVo.getActionItems() != null) {
			usersDto.setActionItems(actionMapper.convertVO(userDetailsVo.getActionItems()));
		}
		if (userDetailsVo.getVillage() != null) {
			usersDto.setVillage(villageMapper.convertVO(userDetailsVo.getVillage()));
		}
		return usersDto;
	}

	public UserVO convertRequired(UserDTO userDto) {
		UserVO userDetailsVo = new UserVO();
		// funPoint(userDto.getAadharNo(), userDetailsVo::setAadharNo);
		funPoint(userDto.getEmail(), userDetailsVo::setEmail);
		// funPoint(userDto.getEmpCode(), userDetailsVo::setEmpCode);
		funPoint(userDto.getFaxNo(), userDetailsVo::setFaxNo);
		funPoint(userDto.getFirstName(), userDetailsVo::setFirstName);
		funPoint(userDto.getMiddleName(), userDetailsVo::setMiddleName);
		funPoint(userDto.getMiddleName(), userDetailsVo::setLastName);
		funPoint(userDto.getLandmark(), userDetailsVo::setLandmark);
		// funPoint(userDto.getMessage(), userDetailsVo::setMessage);
		funPoint(userDto.getMobile(), userDetailsVo::setMobile);
		// funPoint(userDto.getPassword(), userDetailsVo::setPassword);
		funPoint(userDto.getPhoneNo(), userDetailsVo::setPhoneNo);
		// funPoint(userDto.getProfileImageUrl(), userDetailsVo::setProfileImageUrl);
		funPoint(userDto.getQualification(), userDetailsVo::setQualification);
		// funPoint(userDto.getSignatureImageUrl(),
		// userDetailsVo::setSignatureImageUrl);
		funPoint(userDto.getStreetName(), userDetailsVo::setStreetName);
		// funPoint(userDto.isStatus(), userDetailsVo::setStatus);
		// funPoint(userDto.getUserId(), userDetailsVo::setUserId);
		// funPoint(userDto.getNewpassword(), userDetailsVo::setNewpassword);
		// funPoint(userDto.getConfirmpassword(), userDetailsVo::setConfirmpassword);

		if (userDto.getDesignation() != null) {
			userDetailsVo.setDesignation(designationMapper.convertEntity(userDto.getDesignation()));
		}

		if (userDto.getDistrict() != null) {
			userDetailsVo.setDistrict(districtMapper.convertEntity(userDto.getDistrict()));
		}

		if (userDto.getMandalDTO() != null) {
			userDetailsVo.setMandalDTO(mandalMapper.convertEntity(userDto.getMandalDTO()));
		}

		if (userDto.getPincode() != null) {
			userDetailsVo.setPincode(pinCodeMapper.convertEntity(userDto.getPincode()));
		}

		if (userDto.getState() != null) {
			userDetailsVo.setState(stateMapper.convertEntity(userDto.getState()));
		}
		if (userDto.getValidFrom() != null) {
			userDetailsVo.setValidFrom(userDto.getValidFrom());
		}
		if (userDto.getValidTo() != null) {
			userDetailsVo.setValidTo(userDto.getValidTo());
		}
		return userDetailsVo;
	}

	public UserVO UserAndPassword(UserDTO dto) {
		UserVO vo = new UserVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(userDefaultPwd, vo::setPassword);
		return vo;
	}

	public UserVO requiredFields(UserDTO dto) {
		UserVO vo = new UserVO();
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getFirstName(), vo::setFirstName);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getEmail(), vo::setEmail);
		if (dto.getDistrict() != null) {
			vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}

		if (dto.getMandal() != null) {
			vo.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}

		if (dto.getPincode() != null) {
			vo.setPincode(pinCodeMapper.convertEntity(dto.getPincode()));
		}

		if (dto.getState() != null) {
			vo.setState(stateMapper.convertEntity(dto.getState()));
		}

		return vo;

	}

	public UserVO userManagementRequiredFields(UserDTO dto) {
		UserVO vo = new UserVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getLastName(), vo::setLastName);
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getFirstName(), vo::setFirstName);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getEmail(), vo::setEmail);
		if (dto.getOffice() != null) {
			vo.setOffice(officeMapper.convertEntity(dto.getOffice()));
		}
		if (dto.getDistrict() != null) {
			vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}

		if (dto.getMandal() != null) {
			vo.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}

		if (dto.getPincode() != null) {
			vo.setPincode(pinCodeMapper.convertEntity(dto.getPincode()));
		}

		if (dto.getState() != null) {
			vo.setState(stateMapper.convertEntity(dto.getState()));
		}

		return vo;

	}

	public UserVO getRequiredFields(UserDTO dto) {
		UserVO vo = new UserVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getFirstName(), vo::setFirstName);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getEmail(), vo::setEmail);
		funPoint(dto.getFirstname(), vo::setFirstName);
		if (dto.getOffice() != null) {
			vo.setOffice(officeMapper.convertEntity(dto.getOffice()));
		}
		
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getProfileImageUrl(), vo::setProfileImageUrl);

		return vo;

	}

	public List<UserVO> userLimitFiledsMapper(List<UserDTO> dtoList) {
		List<UserVO> userList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			UserVO vo = new UserVO();
			if (StringUtils.isNotBlank(dto.getFirstname())) {
				funPoint(dto.getFirstname(), vo::setFirstName);
			} else if (StringUtils.isNotBlank(dto.getFirstName())) {
				funPoint(dto.getFirstName(), vo::setFirstName);

			}
			funPoint(dto.getUserId(), vo::setUserId);
			userList.add(vo);
		});
		return userList;

	}
	
	private UserVO convertlimittedfileds(UserDTO dto) {
		UserVO userVO = new UserVO();
		funPoint(dto.getUserId(), userVO::setUserId);
		funPoint(dto.getFirstName(), userVO::setUserName);
		funPoint(dto.getLastName(), userVO::setLastName);
		return userVO;
	}

	public List<UserVO> convertlimittedList(List<UserDTO> dtoList) {
		return dtoList.stream().map(e -> convertlimittedfileds(e)).collect(Collectors.toList());
	}
	public FinancierUserLogDTO convertEntityFinancierUserLogDTO(UserDTO userDto) {
		FinancierUserLogDTO userDetailsVo = new FinancierUserLogDTO();
		funPoint(userDto.getAadharNo(), userDetailsVo::setAadharNo);
		funPoint(userDto.getEmail(), userDetailsVo::setEmail);
		funPoint(userDto.getEmpCode(), userDetailsVo::setEmpCode);
		funPoint(userDto.getFaxNo(), userDetailsVo::setFaxNo);
		funPoint(userDto.getFirstName(), userDetailsVo::setFirstName);
		funPoint(userDto.getMiddleName(), userDetailsVo::setMiddleName);
		funPoint(userDto.getMiddleName(), userDetailsVo::setLastName);
		funPoint(userDto.getLandmark(), userDetailsVo::setLandmark);
		funPoint(userDto.getMessage(), userDetailsVo::setMessage);
		funPoint(userDto.getMobile(), userDetailsVo::setMobile);
		// funPoint(userDto.getPassword(), userDetailsVo::setPassword);
		funPoint(userDto.getPhoneNo(), userDetailsVo::setPhoneNo);
		funPoint(userDto.getProfileImageUrl(), userDetailsVo::setProfileImageUrl);
		funPoint(userDto.getQualification(), userDetailsVo::setQualification);
		funPoint(userDto.getSignatureImageUrl(), userDetailsVo::setSignatureImageUrl);
		funPoint(userDto.getStreetName(), userDetailsVo::setStreetName);
		funPoint(userDto.isStatus(), userDetailsVo::setStatus);
		funPoint(userDto.getUserId(), userDetailsVo::setUserId);
		funPoint(userDto.getNewpassword(), userDetailsVo::setNewpassword);
		funPoint(userDto.getConfirmpassword(), userDetailsVo::setConfirmpassword);
		funPoint(userDto.getFirstname(), userDetailsVo::setFirstName);
		funPoint(userDto.getRid(), userDetailsVo::setRid);

		funPoint(userDto.getUserDepartment(), userDetailsVo::setUserDepartment);
		funPoint(userDto.getUserDesignation(), userDetailsVo::setUserDesignation);
		funPoint(userDto.getDob(), userDetailsVo::setDob);
		funPoint(userDto.getUserLevel(), userDetailsVo::setUserLevel);
		
		
		
		

		if (userDto.getDesignation() != null) {
			userDetailsVo.setDesignation(userDto.getDesignation());
		}

		if (userDto.getDistrict() != null) {
			userDetailsVo.setDistrict(userDto.getDistrict());
		}

		if (userDto.getMandalDTO() != null) {
			userDetailsVo.setMandalDTO(userDto.getMandalDTO());
		}

		if (userDto.getMandal() != null) {
			userDetailsVo.setMandal(userDto.getMandal());
		}

		if (userDto.getOffice() != null) {
			userDetailsVo.setOffice(userDto.getOffice());
		}

		if (userDto.getPincode() != null) {
			userDetailsVo.setPincode(userDto.getPincode());
		}

		if (userDto.getState() != null) {
			userDetailsVo.setState(userDto.getState());
		}

		if (userDto.getPrimaryRole() != null) {
			userDetailsVo.setPrimaryRole(userDto.getPrimaryRole());
		}

		if (userDto.getAdditionalRoles() != null && !userDto.getAdditionalRoles().isEmpty()) {
			userDetailsVo.setAdditionalRoles(userDto.getAdditionalRoles());
		}

		if (userDto.getActionItems() != null) {
			userDetailsVo.setActionItems(userDto.getActionItems());
		}
		if (userDto.getVillage() != null) {
			userDetailsVo.setVillage(userDto.getVillage());
		}
		if(userDto.getUserAction()!=null)
		{
			userDetailsVo.setUserAction(userDto.getUserAction());
		}
		funPoint(userDto.getRegdNumber(), userDetailsVo::setRegdNumber);
		funPoint(userDto.getWebsiteAddress(), userDetailsVo::setWebsiteAddress);
		funPoint(userDto.getUserName(), userDetailsVo::setUserName);
		funPoint(userDto.getFatherName(), userDetailsVo::setFatherName);
		funPoint(userDto.getDoorNo(), userDetailsVo::setDoorNo);
		funPoint(userDto.getCity(), userDetailsVo::setCity);
		funPoint(userDto.getIsAccountNonLocked(), userDetailsVo::setIsAccountNonLocked);
		return userDetailsVo;
	}
	public UserVO getRequiredFieldsForFinacier(UserDTO dto) {
		UserVO vo = new UserVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getFirstName(), vo::setFirstName);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getEmail(), vo::setEmail);
		funPoint(dto.getFirstname(), vo::setFirstName);
		if (dto.getOffice() != null) {
			vo.setOffice(officeMapper.convertEntity(dto.getOffice()));
		}
		funPoint(dto.isStatus(), vo::setFinancierStatus);
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getProfileImageUrl(), vo::setProfileImageUrl);
       
		
		
			List<ActionsVO> list = new ArrayList<ActionsVO>();
			List<ActionDTO> listdto = dto.getActionItems();
			for (ActionDTO ActionDTO : listdto) {
				ActionsVO ActionsVO = new ActionsVO();
				ActionsVO.set_id(ActionDTO.getId());
				ActionsVO.setActionName(ActionDTO.getActionName());
				list.add(ActionsVO);
				vo.setUserAction(list);
				
			}
				
		return vo;

	}

	public List<UserVO> convertUsersListToVo(List<UserDTO> masterUsersList) {
		return masterUsersList.stream().map(e -> convertUsersFieldsToDisplay(e)).collect(Collectors.toList());
	}

	private UserVO convertUsersFieldsToDisplay(UserDTO user) {
		UserVO userVO = new UserVO();
		funPoint(user.getUserId(), userVO::setUserId);
		funPoint(user.getFirstName(), userVO::setFirstName);
		funPoint(user.getRepresentativeName(), userVO::setRepresentativeName);
		funPoint(user.getMobile(), userVO::setMobile);
		funPoint(user.getEmail(), userVO::setEmail);
		funPoint(user.getDoorNo(), userVO::setDoorNo);
		funPoint(user.getStreetName(), userVO::setStreetName);

		if (user.getDistrict() != null) {
			userVO.setDistrict(districtMapper.convertEntity(user.getDistrict()));
		}

		if (user.getMandal() != null) {
			userVO.setMandal(mandalMapper.convertEntity(user.getMandal()));
		}

		if (user.getPincode() != null) {
			userVO.setPincode(pinCodeMapper.convertEntity(user.getPincode()));
		}

		if (user.getState() != null) {
			userVO.setState(stateMapper.convertEntity(user.getState()));
		}
		funPoint(user.getStreetName(), userVO::setStreetName);
		funPoint(user.getValidFrom(), userVO::setValidFrom);
		funPoint(user.getValidTo(), userVO::setValidTo);
		funPoint(user.getRid(), userVO::setRid);
		List<String> userAction = new ArrayList<>();
		List<ActionDTO> listdto = user.getActionItems();
		if (listdto != null) {
			userAction = listdto.stream().map(val -> val.getActionName()).collect(Collectors.toList());
		}
		if (userAction != null) {
			userVO.setActionNames(userAction);
		}

		return userVO;
	}
	
	public UserDTO getLimitedFieldsForFinaciers(UserDTO dto) {
		UserDTO user = new UserDTO();
		funPoint(dto.getUserId(), user::setUserId);
		funPoint(dto.getUserName(), user::setUserName);
		funPoint(dto.getMobile(), user::setMobile);
		funPoint(dto.getFirstname(), user::setFirstname);
		funPoint(dto.getLastName(), user::setLastName);
		if (dto.getDistrict()!=null) {
			user.setDistrict(dto.getDistrict());
		}
		if (dto.getState()!=null) {
			user.setState(dto.getState());
		}
		if (dto.getPincode()!=null) {
			user.setPincode(dto.getPincode());
		}
		if (dto.getMandal()!=null) {
			user.setMandal(dto.getMandal());
		}
		return user;
	}

	
	public UserCorrectionsDTO convertUserCorrectionsDTO(UserDTO userDto) {
		
		UserCorrectionsDTO dto = new UserCorrectionsDTO();
		funPoint(userDto.getAadharNo(), dto::setAadharNo);
		funPoint(userDto.getEmail(), dto::setEmail);
		funPoint(userDto.getEmpCode(), dto::setEmpCode);
		funPoint(userDto.getFaxNo(), dto::setFaxNo);
		funPoint(userDto.getMiddleName(), dto::setMiddleName);
		funPoint(userDto.getMiddleName(), dto::setLastName);
		funPoint(userDto.getLandmark(), dto::setLandmark);
		funPoint(userDto.getMessage(), dto::setMessage);
		funPoint(userDto.getMobile(), dto::setMobile);
		funPoint(userDto.getPassword(), dto::setPassword);
		funPoint(userDto.getPhoneNo(), dto::setPhoneNo);
		funPoint(userDto.getProfileImageUrl(), dto::setProfileImageUrl);
		funPoint(userDto.getQualification(), dto::setQualification);
		funPoint(userDto.getSignatureImageUrl(), dto::setSignatureImageUrl);
		funPoint(userDto.getStreetName(), dto::setStreetName);
		funPoint(userDto.isStatus(), dto::setStatus);
		funPoint(userDto.getUserId(), dto::setUserId);
		funPoint(userDto.getNewpassword(), dto::setNewpassword);
		funPoint(userDto.getConfirmpassword(), dto::setConfirmpassword);
		funPoint(userDto.getFirstName(), dto::setFirstName);
		funPoint(userDto.getRid(), dto::setRid);
		funPoint(userDto.getRocNo(), dto::setRocNo);

		funPoint(userDto.getFinancierPanNo(), dto::setFinancierPanNo);
		funPoint(userDto.getPanNo(), dto::setPanNo);
		funPoint(userDto.getRepresentativeEmail(), dto::setRepresentativeEmail);
		funPoint(userDto.getDoorNo(), dto::setDoorNo);
		funPoint(userDto.getOfficeContactNo(), dto::setOfficeContactNo);
		funPoint(userDto.getInstitutionName(), dto::setFirstName);
		funPoint(userDto.getRegistrationFirmDate(), dto::setRegistrationFirmDate);
		funPoint(userDto.getUserRelation(), dto::setUserRelation);
		funPoint(userDto.getCompanyType(), dto::setCompanyType);
		funPoint(userDto.getRepresentativeName(), dto::setRepresentativeName);
		funPoint(userDto.getRepresentativeMobileNo(), dto::setRepresentativeMobileNo);
		funPoint(userDto.getCity(), dto::setCity);
		funPoint(userDto.getOfficeMail(), dto::setOfficeMail);
		funPoint(userDto.getMandalName(), dto::setMandalName);
		funPoint(userDto.getDistrictName(), dto::setDistrictName);
		funPoint(userDto.getStateName(), dto::setStateName);
		funPoint(userDto.getInstitutionName(), dto::setInstitutionName);
		funPoint(userDto.getInstitutionName(), dto::setFirstName);
		funPoint(userDto.getUserDepartment(), dto::setUserDepartment);
		funPoint(userDto.getUserDesignation(), dto::setUserDesignation);
		funPoint(userDto.getDob(), dto::setDob);
		funPoint(userDto.getUserLevel(), dto::setUserLevel);
		funPoint(userDto.isParent(), dto::setParent);
		funPoint(userDto.getParentId(), dto::setParentId);
		
		if (userDto.getDesignation() != null) {
			dto.setDesignation(userDto.getDesignation());
		}

		if (userDto.getDistrict() != null) {
			dto.setDistrict(userDto.getDistrict());
		}

		
		if (userDto.getMandalDTO() != null) {
			dto.setMandalDTO(userDto.getMandalDTO());
		}

		if (userDto.getMandal() != null) {
			dto.setMandal(userDto.getMandal());
		}

		if (userDto.getOffice() != null) {
			dto.setOffice(userDto.getOffice());
		}

		if (userDto.getPincode() != null) {
			dto.setPincode(userDto.getPincode());
		}

		if (userDto.getState() != null) {
			dto.setState(userDto.getState());
		}

		if (userDto.getPrimaryRole() != null) {
			dto.setPrimaryRole(userDto.getPrimaryRole());
		}
		
		if (userDto.getAdditionalRoles() != null && !userDto.getAdditionalRoles().isEmpty()) {
			dto.setAdditionalRoles(userDto.getAdditionalRoles());
		}

		if (userDto.getActionItems() != null) {
			dto.setActionItems(userDto.getActionItems());
		}
		if (userDto.getVillage() != null) {
			dto.setVillage(userDto.getVillage());
		}
		if(userDto.getUserAction()!=null)
		{
			dto.setUserAction(userDto.getUserAction());
		}

		funPoint(userDto.getRegdNumber(), dto::setRegdNumber);
		funPoint(userDto.getWebsiteAddress(), dto::setWebsiteAddress);
		funPoint(userDto.getUserName(), dto::setUserName);
		funPoint(userDto.getFatherName(), dto::setFatherName);
		funPoint(userDto.getRemarks(), dto::setRemarks);
		funPoint(userDto.getRepresentativeName(), dto::setRepresentativeName);
		funPoint(userDto.getUserStatus(), dto::setUserStatus);
		return dto;
	}
	
	
	
}
