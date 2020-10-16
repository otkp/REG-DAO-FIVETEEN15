package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.HarvestersDetailsDTO;
import org.epragati.master.vo.HarvestersDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class HarvestersDetailsMapper extends BaseMapper<HarvestersDetailsDTO, HarvestersDetailsVO>{

	@Override
	public HarvestersDetailsVO convertEntity(HarvestersDetailsDTO dto) {
		HarvestersDetailsVO vo = new HarvestersDetailsVO();
		funPoint(dto.getHarvestersMakerName(), vo::setHarvestersMakerName);
		funPoint(dto.getHarvestersMakerClass(), vo::setHarvestersMakerClass);
		funPoint(dto.getRlw(), vo::setRlw);
		funPoint(dto.getUlw(), vo::setUlw);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		return vo;
	}
	
	@Override
	public HarvestersDetailsDTO convertVO(HarvestersDetailsVO vo) {
		HarvestersDetailsDTO dto = new HarvestersDetailsDTO();
		funPoint(vo.getHarvestersMakerName(), dto::setHarvestersMakerName);
		funPoint(vo.getHarvestersMakerClass(), dto::setHarvestersMakerClass);
		funPoint(vo.getRlw(), dto::setRlw);
		funPoint(vo.getUlw(), dto::setUlw);
		funPoint(vo.getChassisNumber(), dto::setChassisNumber);
		return dto;
	}

}
