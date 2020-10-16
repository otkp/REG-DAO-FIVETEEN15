package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RoleActionDTO;
import org.epragati.master.vo.RoleActionVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */

@Component
public class RoleActionMapper extends BaseMapper<RoleActionDTO, RoleActionVO>{

	RoleActionVO roleActionVO;
	RoleActionDTO roleActionDTO;
	
	public RoleActionVO convertEntity(RoleActionDTO roleActionDTO) {
		roleActionVO = new RoleActionVO();
		funPoint(roleActionDTO.getRole(), roleActionVO::setRole);
		funPoint(roleActionDTO.getAction(), roleActionVO::setAction);
		funPoint(roleActionDTO.getActionTime(), roleActionVO::setActionTime);
		funPoint(roleActionDTO.getApplicatioNo(), roleActionVO::setApplicatioNo);
		funPoint(roleActionDTO.getModule(), roleActionVO::setModule);
		return roleActionVO;
	}
	public List<RoleActionVO> convertEntity(List<RoleActionDTO> roleActionDTOList) {
		return roleActionDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	public RoleActionDTO convertVO(RoleActionVO roleActionVO) {
		roleActionDTO = new RoleActionDTO();
		funPoint(roleActionVO.getRole(), roleActionDTO::setRole);
		funPoint(roleActionVO.getAction(), roleActionDTO::setAction);
		funPoint(roleActionVO.getActionTime(), roleActionDTO::setActionTime);
		funPoint(roleActionVO.getApplicatioNo(), roleActionDTO::setApplicatioNo);
		funPoint(roleActionVO.getModule(), roleActionDTO::setModule);
		return roleActionDTO;
	}
	public List<RoleActionDTO> convertVO(List<RoleActionVO> roleActionVOList) {
		return roleActionVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
	

}
