package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.UserEnclousersActionsDTO;
import org.epragati.master.vo.UserEnclousersActionsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class UserEnclousersActionsMapper extends BaseMapper<UserEnclousersActionsDTO ,UserEnclousersActionsVO>{

	private UserEnclousersActionsVO userEnclousersActionsVO;
	private UserEnclousersActionsDTO userEnclousersActionsDTO;
	
	@Override
	public UserEnclousersActionsVO convertEntity(UserEnclousersActionsDTO userEnclousersActionsDTO) {
		userEnclousersActionsVO = new UserEnclousersActionsVO();
		funPoint(userEnclousersActionsDTO.getUeaId(),userEnclousersActionsVO::setUeaId);
		funPoint(userEnclousersActionsDTO.getUeId(), userEnclousersActionsVO::setUeId);
		funPoint(userEnclousersActionsDTO.getAction(), userEnclousersActionsVO::setAction);
		funPoint(userEnclousersActionsDTO.getActionBy(), userEnclousersActionsVO::setActionBy);
		funPoint(userEnclousersActionsDTO.getActionDate(), userEnclousersActionsVO::setActionDate);
		funPoint(userEnclousersActionsDTO.getRole(), userEnclousersActionsVO::setRole);
		funPoint(userEnclousersActionsDTO.getRemarks(), userEnclousersActionsVO::setRemarks);
		return userEnclousersActionsVO;
	}
	
	@Override
	public List<UserEnclousersActionsVO> convertEntity(List<UserEnclousersActionsDTO> userEnclousersActionsDTOList) {
		return userEnclousersActionsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public UserEnclousersActionsDTO convertVO(UserEnclousersActionsVO userEnclousersActionsVO) {
		userEnclousersActionsDTO = new UserEnclousersActionsDTO();
		funPoint(userEnclousersActionsVO.getUeaId(),userEnclousersActionsDTO::setUeaId);
		funPoint(userEnclousersActionsVO.getUeId(), userEnclousersActionsDTO::setUeId);
		funPoint(userEnclousersActionsVO.getAction(), userEnclousersActionsDTO::setAction);
		funPoint(userEnclousersActionsVO.getActionBy(), userEnclousersActionsDTO::setActionBy);
		funPoint(userEnclousersActionsVO.getActionDate(), userEnclousersActionsDTO::setActionDate);
		funPoint(userEnclousersActionsVO.getRole(), userEnclousersActionsDTO::setRole);
		funPoint(userEnclousersActionsVO.getRemarks(), userEnclousersActionsDTO::setRemarks);
		return userEnclousersActionsDTO;
	}
	
	@Override
	public List<UserEnclousersActionsDTO> convertVO(List<UserEnclousersActionsVO> userEnclousersActionsList) {
		return userEnclousersActionsList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}
