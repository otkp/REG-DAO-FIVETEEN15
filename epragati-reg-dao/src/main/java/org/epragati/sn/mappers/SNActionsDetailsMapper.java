package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.ActionsDetails;
import org.epragati.sn.vo.ActionsDetailsVo;
import org.springframework.stereotype.Component;

@Component
public class SNActionsDetailsMapper extends BaseMapper<ActionsDetails, ActionsDetailsVo>{

	@Override
	public ActionsDetailsVo convertEntity(ActionsDetails dto) {
		
		ActionsDetailsVo actionsDetailsVo =new ActionsDetailsVo();
		
		funPoint(dto.getAction(), actionsDetailsVo::setAction);
		funPoint(dto.getActionBy(), actionsDetailsVo::setActionBy);
		funPoint(dto.getActionDatetime(), actionsDetailsVo::setActionDatetime);
		funPoint(dto.getReason(), actionsDetailsVo::setReason);
		return actionsDetailsVo;
	}

}