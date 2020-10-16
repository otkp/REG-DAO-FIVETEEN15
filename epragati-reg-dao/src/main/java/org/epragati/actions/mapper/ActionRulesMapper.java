package org.epragati.actions.mapper;

import org.epragati.actions.dto.RCActionRulesDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.rcactions.RCActionRulesVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActionRulesMapper extends BaseMapper<RCActionRulesDTO, RCActionRulesVO> {
	
	private static final Logger logger = LoggerFactory.getLogger(ActionRulesMapper.class);
	@Override
	public RCActionRulesVO convertEntity(RCActionRulesDTO dto) {
		RCActionRulesVO RCActionRulesVO =new RCActionRulesVO();
		funPoint(dto.getSource(), RCActionRulesVO::setSource);
		funPoint(dto.getSection(), RCActionRulesVO::setSection);
		return RCActionRulesVO;
	}
	
	
	public RCActionRulesDTO convertVO(RCActionRulesVO rcActionRulesVO) {
		RCActionRulesDTO rcActionRulesDTO =new RCActionRulesDTO();
		funPoint(rcActionRulesVO.getSource(), rcActionRulesDTO::setSource);
		funPoint(rcActionRulesVO.getSection(), rcActionRulesDTO::setSection);

		return rcActionRulesDTO;
	}

}
