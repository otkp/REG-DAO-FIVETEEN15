package org.epragati.hsrp.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.regservice.dto.ActionDetails;
import org.springframework.stereotype.Component;

@Component
public class ActionsDetailsMapper extends BaseMapper<ActionDetails, ActionDetailsVO> {

	@Override
	public ActionDetailsVO convertEntity(ActionDetails dto) {
		ActionDetailsVO vo = new ActionDetailsVO();
		funPoint(dto.getRole(), vo::setRole);
		funPoint(dto.getUserId(), vo::setActionBy);
		funPoint(dto.getStatus(), vo::setStatus);
		return vo;
	}

}
