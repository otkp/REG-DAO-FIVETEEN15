package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.UserRegistrationDTO;
import org.epragati.master.vo.UserRegistrationVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class UserRegistrationMapper extends BaseMapper<UserRegistrationDTO, UserRegistrationVO>{

	private UserRegistrationVO userRegistrationVO;
	private UserRegistrationDTO userRegistrationDTO;
	
	@Override
	public UserRegistrationVO convertEntity(UserRegistrationDTO userRegistrationDTO) {
		userRegistrationVO=new UserRegistrationVO();
		funPoint(userRegistrationDTO.getrId(), userRegistrationVO::setrId);
		funPoint(userRegistrationDTO.getAddress1(), userRegistrationVO::setAddress1);
		funPoint(userRegistrationDTO.getAddress2(), userRegistrationVO::setAddress2);
		funPoint(userRegistrationDTO.getAlMobile(), userRegistrationVO::setAlMobile);
		funPoint(userRegistrationDTO.getAltEmail(), userRegistrationVO::setAltEmail);
		funPoint(userRegistrationDTO.getApplicationNo(), userRegistrationVO::setApplicationNo);
		funPoint(userRegistrationDTO.getCreatedBy(), userRegistrationVO::setCreatedBy);
		funPoint(userRegistrationDTO.getCreateddate(), userRegistrationVO::setCreateddate);
		funPoint(userRegistrationDTO.getDistrict(), userRegistrationVO::setDistrict);
		funPoint(userRegistrationDTO.getEmail(), userRegistrationVO::setEmail);
		funPoint(userRegistrationDTO.getlUpdate(), userRegistrationVO::setlUpdate);
		funPoint(userRegistrationDTO.getMandal(), userRegistrationVO::setMandal);
		funPoint(userRegistrationDTO.getMobile(), userRegistrationVO::setMobile);
		funPoint(userRegistrationDTO.getName(), userRegistrationVO::setName);
		funPoint(userRegistrationDTO.getPan(), userRegistrationVO::setPan);
		funPoint(userRegistrationDTO.getPhone(), userRegistrationVO::setPhone);
		funPoint(userRegistrationDTO.getRepAadhaar(), userRegistrationVO::setRepAadhaar);
		funPoint(userRegistrationDTO.getRepAltMobile(), userRegistrationVO::setRepAltMobile);
		funPoint(userRegistrationDTO.getRepEmail(), userRegistrationVO::setRepEmail);
		funPoint(userRegistrationDTO.getRepMobile(), userRegistrationVO::setRepMobile);
		funPoint(userRegistrationDTO.getRepName(), userRegistrationVO::setRepName);
		funPoint(userRegistrationDTO.getRtaOffice(), userRegistrationVO::setRtaOffice);
		funPoint(userRegistrationDTO.getStatus(), userRegistrationVO::setStatus);
		funPoint(userRegistrationDTO.getTin(), userRegistrationVO::setTin);
		funPoint(userRegistrationDTO.getUserId(), userRegistrationVO::setUserId);
		funPoint(userRegistrationDTO.getUserType(), userRegistrationVO::setUserType);
		funPoint(userRegistrationDTO.getVillage(), userRegistrationVO::setVillage);
		return userRegistrationVO;
	}
	
	@Override
	public List<UserRegistrationVO> convertEntity(List<UserRegistrationDTO> userRegistrationDTOList) {
		return userRegistrationDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public UserRegistrationDTO convertVO(UserRegistrationVO userRegistrationVO) {
		userRegistrationDTO=new UserRegistrationDTO();
		funPoint(userRegistrationVO.getrId(), userRegistrationDTO::setrId);
		funPoint(userRegistrationVO.getAddress1(), userRegistrationDTO::setAddress1);
		funPoint(userRegistrationVO.getAddress2(), userRegistrationDTO::setAddress2);
		funPoint(userRegistrationVO.getAlMobile(), userRegistrationDTO::setAlMobile);
		funPoint(userRegistrationVO.getAltEmail(), userRegistrationDTO::setAltEmail);
		funPoint(userRegistrationVO.getApplicationNo(), userRegistrationDTO::setApplicationNo);
		funPoint(userRegistrationVO.getCreatedBy(), userRegistrationDTO::setCreatedBy);
		funPoint(userRegistrationVO.getCreateddate(), userRegistrationDTO::setCreateddate);
		funPoint(userRegistrationVO.getDistrict(), userRegistrationDTO::setDistrict);
		funPoint(userRegistrationVO.getEmail(), userRegistrationDTO::setEmail);
		funPoint(userRegistrationVO.getlUpdate(), userRegistrationDTO::setlUpdate);
		funPoint(userRegistrationVO.getMandal(), userRegistrationDTO::setMandal);
		funPoint(userRegistrationVO.getMobile(), userRegistrationDTO::setMobile);
		funPoint(userRegistrationVO.getName(), userRegistrationDTO::setName);
		funPoint(userRegistrationVO.getPan(), userRegistrationDTO::setPan);
		funPoint(userRegistrationVO.getPhone(), userRegistrationDTO::setPhone);
		funPoint(userRegistrationVO.getRepAadhaar(), userRegistrationDTO::setRepAadhaar);
		funPoint(userRegistrationVO.getRepAltMobile(), userRegistrationDTO::setRepAltMobile);
		funPoint(userRegistrationVO.getRepEmail(), userRegistrationDTO::setRepEmail);
		funPoint(userRegistrationVO.getRepMobile(), userRegistrationDTO::setRepMobile);
		funPoint(userRegistrationVO.getRepName(), userRegistrationDTO::setRepName);
		funPoint(userRegistrationVO.getRtaOffice(), userRegistrationDTO::setRtaOffice);
		funPoint(userRegistrationVO.getStatus(), userRegistrationDTO::setStatus);
		funPoint(userRegistrationVO.getTin(), userRegistrationDTO::setTin);
		funPoint(userRegistrationVO.getUserId(), userRegistrationDTO::setUserId);
		funPoint(userRegistrationVO.getUserType(), userRegistrationDTO::setUserType);
		funPoint(userRegistrationVO.getVillage(), userRegistrationDTO::setVillage);
		return userRegistrationDTO;
	}
	
	@Override
	public List<UserRegistrationDTO> convertVO(List<UserRegistrationVO> userRegistrationVOList) {
		return userRegistrationVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
}
