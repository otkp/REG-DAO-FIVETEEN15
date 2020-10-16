package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.WeightDTO;
import org.epragati.master.vo.WeightVO;
import org.springframework.stereotype.Component;

@Component
public class WeightMapper extends BaseMapper<WeightDTO, WeightVO>{

	@Override
	public WeightVO convertEntity(WeightDTO dto) {
		WeightVO weightVO = new WeightVO();
		funPoint(dto.getWeighttype(), weightVO::setWeighttype);
		funPoint(dto.getWeightdescription(), weightVO::setWeightdescription);
		funPoint(dto.getFromvalue(), weightVO::setFromvalue);
		funPoint(dto.getTovalue(), weightVO::setTovalue);
		funPoint(dto.getStatus(), weightVO::setStatus);
		return weightVO;
	}
	
	@Override
	public WeightDTO convertVO(WeightVO dto) {
		WeightDTO weightVO = new WeightDTO();
		funPoint(dto.getWeighttype(), weightVO::setWeighttype);
		funPoint(dto.getWeightdescription(), weightVO::setWeightdescription);
		funPoint(dto.getFromvalue(), weightVO::setFromvalue);
		funPoint(dto.getTovalue(), weightVO::setTovalue);
		funPoint(dto.getStatus(), weightVO::setStatus);
		return weightVO;
	} 

}
