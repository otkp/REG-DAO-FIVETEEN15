package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.UserRegistrationApplicationsDTO;
import org.epragati.master.vo.UserRegistrationApplicationsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class UserRegistrationApplicationsMapper extends BaseMapper<UserRegistrationApplicationsDTO, UserRegistrationApplicationsVO>{

	private UserRegistrationApplicationsVO userRegistrationApplicationsVO;
	private UserRegistrationApplicationsDTO userRegistrationApplicationsDTO;
	
	@Override
	public UserRegistrationApplicationsVO convertEntity(UserRegistrationApplicationsDTO userRegistrationApplicationsDTO) {
		userRegistrationApplicationsVO=new UserRegistrationApplicationsVO();
		funPoint(userRegistrationApplicationsDTO.getUraId(),userRegistrationApplicationsVO::setUraId);
		funPoint(userRegistrationApplicationsDTO.getApplicationNo(), userRegistrationApplicationsVO::setApplicationNo);
		funPoint(userRegistrationApplicationsDTO.getCreatedDate(), userRegistrationApplicationsVO::setCreatedDate);
		funPoint(userRegistrationApplicationsDTO.getlUpdate(), userRegistrationApplicationsVO::setlUpdate);
		funPoint(userRegistrationApplicationsDTO.getServiceId(), userRegistrationApplicationsVO::setServiceId);
		funPoint(userRegistrationApplicationsDTO.getStatus(), userRegistrationApplicationsVO::setStatus);
		funPoint(userRegistrationApplicationsDTO.getVariationType(), userRegistrationApplicationsVO::setVariationType);
		return userRegistrationApplicationsVO;
	}
	
	@Override
	public List<UserRegistrationApplicationsVO> convertEntity(List<UserRegistrationApplicationsDTO> userRegistrationApplicationsDTOList) {
		return userRegistrationApplicationsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public UserRegistrationApplicationsDTO convertVO(UserRegistrationApplicationsVO userRegistrationApplicationsVOList) {
		userRegistrationApplicationsDTO=new UserRegistrationApplicationsDTO();
		funPoint(userRegistrationApplicationsVO.getUraId(),userRegistrationApplicationsDTO::setUraId);
		funPoint(userRegistrationApplicationsVO.getApplicationNo(), userRegistrationApplicationsDTO::setApplicationNo);
		funPoint(userRegistrationApplicationsVO.getCreatedDate(), userRegistrationApplicationsDTO::setCreatedDate);
		funPoint(userRegistrationApplicationsVO.getlUpdate(), userRegistrationApplicationsDTO::setlUpdate);
		funPoint(userRegistrationApplicationsVO.getServiceId(), userRegistrationApplicationsDTO::setServiceId);
		funPoint(userRegistrationApplicationsVO.getStatus(), userRegistrationApplicationsDTO::setStatus);
		funPoint(userRegistrationApplicationsVO.getVariationType(), userRegistrationApplicationsDTO::setVariationType);
		return userRegistrationApplicationsDTO;
	}
	
	@Override
	public List<UserRegistrationApplicationsDTO> convertVO(List<UserRegistrationApplicationsVO> userRegistrationApplicationsVOList) {
		return userRegistrationApplicationsVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

	

}
