package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.SeatConversion;
import org.epragati.regservice.vo.SeatConversionVO;
import org.springframework.stereotype.Component;

@Component
public class SeatConversionMapper extends BaseMapper<SeatConversion,SeatConversionVO>{

	@Override
	public SeatConversionVO convertEntity(SeatConversion dto) {
		SeatConversionVO vo = new SeatConversionVO();
		
		funPoint(dto.getId(),vo::setId);
		funPoint(dto.getCov(), vo::setCov);
		funPoint(dto.getCovDesc(), vo::setCovDesc);
		funPoint(dto.getConvCategory(), vo::setConvCategory);
		funPoint(dto.getSeatFrom(), vo::setSeatFrom);
		funPoint(dto.getSeatTo(), vo::setSeatTo);
		funPoint(dto.isTaxCal(), vo::setTaxCal);
		funPoint(dto.isFcFee(), vo::setTaxCal);
		funPoint(dto.isPermitCal(), vo::setPermitCal);
		return vo;
	}

	

}

