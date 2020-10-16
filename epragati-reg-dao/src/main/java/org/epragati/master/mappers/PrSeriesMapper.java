package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.PrSeriesDTO;
import org.epragati.master.vo.PrSeriesVO;
import org.springframework.stereotype.Component;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class PrSeriesMapper extends BaseMapper<PrSeriesDTO, PrSeriesVO>{

	@Override
	public PrSeriesVO convertEntity(PrSeriesDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public PrSeriesVO convertEntity(PrSeriesDTO dto) {
		PrSeriesVO masterPrSeriesVO = new PrSeriesVO();
		funPoint(dto.getCid(), masterPrSeriesVO::setCid);
		funPoint(dto.getPsofficecode(), masterPrSeriesVO::setPsofficecode);
		funPoint(dto.getStartFrom(), masterPrSeriesVO::setStartFrom);
		funPoint(dto.getStartEnd(), masterPrSeriesVO::setStartEnd);
		funPoint(dto.getPsid(), masterPrSeriesVO::setPsid);
		funPoint(dto.getStatus(), masterPrSeriesVO::setStatus);
		funPoint(dto.getCreateddate(), masterPrSeriesVO::setCreatedDate);
		funPoint(dto.getLupdate(), masterPrSeriesVO::setLupdate);
		return masterPrSeriesVO;
	}

	@Override
	public PrSeriesDTO convertVO(PrSeriesVO vo) {
		PrSeriesDTO masterPrSeriesDTO = new PrSeriesDTO();
		funPoint(vo.getCid(), masterPrSeriesDTO::setCid);
		funPoint(vo.getPsofficecode(), masterPrSeriesDTO::setPsofficecode);
		funPoint(vo.getStartFrom(), masterPrSeriesDTO::setStartFrom);
		funPoint(vo.getStartEnd(), masterPrSeriesDTO::setStartEnd);
		funPoint(vo.getPsid(), masterPrSeriesDTO::setPsid);
		funPoint(vo.getStatus(), masterPrSeriesDTO::setStatus);
		funPoint(vo.getCreatedDate(), masterPrSeriesDTO::setCreateddate);
		funPoint(vo.getLupdate(), masterPrSeriesDTO::setLupdate);
		return masterPrSeriesDTO;
	}
*/
}
