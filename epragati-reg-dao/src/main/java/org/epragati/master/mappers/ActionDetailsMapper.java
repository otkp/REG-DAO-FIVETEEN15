package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ActionDetailsDTO;
import org.epragati.master.vo.ActionDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class ActionDetailsMapper extends BaseMapper<ActionDetailsDTO, ActionDetailsVO> {

	@Override
	public ActionDetailsVO convertEntity(ActionDetailsDTO dto) {
		ActionDetailsVO actionDetailsVO = new ActionDetailsVO();
		funPoint(dto.getAction(), actionDetailsVO::setAction);
		funPoint(dto.getActionBy(), actionDetailsVO::setActionBy);
		funPoint(dto.getActionByRole(), actionDetailsVO::setActionByRole);
		funPoint(dto.getActionDatetime(), actionDetailsVO::setActionDatetime);
		//(dto.getIteration(), actionDetailsVO::setIteration);
	//	funPoint(dto.getReason(), actionDetailsVO::setReason);
		//funPoint( dto.getReferenceNumber(), actionDetailsVO::setReferenceNumber);
		
		
		return actionDetailsVO;
	}

	@Override
	public ActionDetailsDTO convertVO(ActionDetailsVO vo) {
		ActionDetailsDTO actionDetailsDTO = new ActionDetailsDTO();
		funPoint(vo.getAction(), actionDetailsDTO::setAction);
		funPoint(vo.getActionBy(), actionDetailsDTO::setActionBy);
		funPoint(vo.getActionDatetime(), actionDetailsDTO::setActionDatetime);
		funPoint(vo.getReason(), actionDetailsDTO::setReason);
		return actionDetailsDTO;
	}

}
