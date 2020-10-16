package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DisabledDataDTO;
import org.epragati.rta.vo.DisabledDataVO;
import org.springframework.stereotype.Component;
@Component
public class DisabledDataMapper extends BaseMapper<DisabledDataDTO, DisabledDataVO> {

	@Override
	public DisabledDataVO convertEntity(DisabledDataDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisabledDataDTO convertVO(DisabledDataVO vo) {
		DisabledDataDTO dto = new DisabledDataDTO();
		funPoint(vo.getDisabilityCov(), dto::setDisabilityCov);
		funPoint(vo.getDisabledComment(), dto::setDisabledComment);
		funPoint(vo.isDisabled(), dto::setDisabled);
		return dto;
	}

}
