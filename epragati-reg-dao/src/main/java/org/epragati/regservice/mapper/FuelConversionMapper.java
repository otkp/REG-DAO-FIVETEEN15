package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.FuelConversion;
import org.epragati.regservice.vo.FuelConversionVO;
import org.springframework.stereotype.Component;

@Component
public class FuelConversionMapper extends BaseMapper<FuelConversion , FuelConversionVO>{

	@Override
	public FuelConversionVO convertEntity(FuelConversion dto) {
		FuelConversionVO vo = new FuelConversionVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getOldFuel(), vo::setOldFuel);
		funPoint(dto.getConvCategory(), vo::setConvCategory);
		funPoint(dto.getFuel(), vo::setFuel);
		funPoint(dto.getFuleDesc(),vo::setFuleDesc);
		funPoint(dto.isTaxCal(), vo::setTaxCal);
		funPoint(dto.isFcFee(), vo::setTaxCal);
		funPoint(dto.isPermitCal(), vo::setPermitCal);
		
		
		return vo;
	}

}
