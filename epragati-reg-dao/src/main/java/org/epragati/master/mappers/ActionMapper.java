package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ActionDTO;
import org.epragati.master.vo.ActionVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class ActionMapper extends BaseMapper<ActionDTO, ActionVO>{

	ActionVO actionVO;
	ActionDTO actionDTO;
	@Override
	public ActionVO convertEntity(ActionDTO actionDTO) {
		actionVO=new ActionVO();
		funPoint(actionDTO.getId(), actionVO::setId);
		funPoint(actionDTO.getActionName(), actionVO::setActionName);
		return actionVO;
	}
	public List<ActionVO> convertEntity(List<ActionDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public ActionDTO convertVO(ActionVO actionVO) {
		actionDTO=new ActionDTO();
		funPoint(actionVO.getId(), actionDTO::setId);
		funPoint(actionVO.getActionName(), actionDTO::setActionName);
		return actionDTO;
	}
	public List<ActionDTO> convertVO(List<ActionVO> vos) {
		return vos.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
	

}
