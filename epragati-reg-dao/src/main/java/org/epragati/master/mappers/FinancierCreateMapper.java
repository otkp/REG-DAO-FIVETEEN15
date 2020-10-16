package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ActionDTO;
import org.epragati.master.dto.FinancierCreateRequestDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.vo.ActionsVO;
import org.epragati.master.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancierCreateMapper extends BaseMapper<UserVO, FinancierCreateRequestDTO> {

	private static final Logger logger = LoggerFactory.getLogger(FinancierCreateMapper.class);

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
	private VillageMapper villageMapper;

	@Override
	public FinancierCreateRequestDTO convertEntity(UserVO userVo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * convertUser VO to Fin DTO
	 * 
	 * @param vo
	 * @return
	 */
	public FinancierCreateRequestDTO convertUserVOtoFinDTO(UserVO vo) {

		FinancierCreateRequestDTO dto = new FinancierCreateRequestDTO();
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
		funPoint(vo.getUserDepartment(), dto::setUserDepartment);
		funPoint(vo.getUserDesignation(), dto::setUserDesignation);
		funPoint(vo.getDob(), dto::setDob);
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

		return dto;

	}

	/**
	 * Mapper for Financier DTO to User DTO
	 * 
	 * @param finDto
	 * @return
	 */
	public UserDTO convertFinancierDtoToUserDTO(FinancierCreateRequestDTO finDto) {
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(finDto, dto);

		return dto;
	}

}