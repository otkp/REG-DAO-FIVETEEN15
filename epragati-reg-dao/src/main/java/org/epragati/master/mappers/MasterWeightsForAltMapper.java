package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterWeightsForAlt;
import org.epragati.master.vo.MasterWeightsForAltVO;
import org.springframework.stereotype.Component;

@Component
public class MasterWeightsForAltMapper extends BaseMapper<MasterWeightsForAlt, MasterWeightsForAltVO> {

	@Override
	public MasterWeightsForAltVO convertEntity(MasterWeightsForAlt dto) {
		MasterWeightsForAltVO vo = new MasterWeightsForAltVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getFromGvw(), vo::setFromGvw);
		funPoint(dto.getToGvw(), vo::setToGvw);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public MasterWeightsForAlt convertVO(MasterWeightsForAltVO vo) {
		MasterWeightsForAlt dto = new MasterWeightsForAlt();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getFromGvw(), dto::setFromGvw);
		funPoint(vo.getToGvw(), dto::setToGvw);
		funPoint(vo.getGvw(), dto::setGvw);
		funPoint(vo.isStatus(), dto::setStatus);
		return dto;
	}
}
