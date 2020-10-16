package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TrSeriesDTO;
import org.epragati.master.vo.TrSeriesVO;
import org.springframework.stereotype.Component;

@Component
public class TrSeriesMapper extends BaseMapper<TrSeriesDTO, TrSeriesVO>{

	@Override
	public TrSeriesVO convertEntity(TrSeriesDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public TrSeriesVO convertEntity(TrSeriesDTO dto) {
		TrSeriesVO masterTrSeriesVO = new TrSeriesVO();
		funPoint(dto.getTsid(), masterTrSeriesVO::setTsid);
		funPoint(dto.getTsdId(), masterTrSeriesVO::setTsdId);
		funPoint(dto.getStartFrom(), masterTrSeriesVO::setStartFrom);
		funPoint(dto.getStartEnd(), masterTrSeriesVO::setStartEnd);
		funPoint(dto.getStatus(), masterTrSeriesVO::setStatus);
		funPoint(dto.getCreatedDate(), masterTrSeriesVO::setCreatedDate);
		funPoint(dto.getLupdate(), masterTrSeriesVO::setLupdate);
		return masterTrSeriesVO;
	}
	
	@Override
	public TrSeriesDTO convertVO(TrSeriesVO vo){
		TrSeriesDTO masterTrSeriesDTO = new TrSeriesDTO();
		funPoint(vo.getTsid(), masterTrSeriesDTO::setTsid);
		funPoint(vo.getTsdId(), masterTrSeriesDTO::setTsdId);
		funPoint(vo.getStartFrom(), masterTrSeriesDTO::setStartFrom);
		funPoint(vo.getStartEnd(), masterTrSeriesDTO::setStartEnd);
		funPoint(vo.getStatus(), masterTrSeriesDTO::setStatus);
		funPoint(vo.getCreatedDate(), masterTrSeriesDTO::setCreatedDate);
		funPoint(vo.getLupdate(), masterTrSeriesDTO::setLupdate);
		return masterTrSeriesDTO;
	}*/

}
