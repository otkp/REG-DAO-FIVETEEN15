package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FinancierSeriesDTO;
import org.epragati.master.vo.FinancierSeriesVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class FinancierSeriesMapper extends BaseMapper<FinancierSeriesDTO, FinancierSeriesVO>{
	
	FinancierSeriesDTO financerSeriesDTO;
	FinancierSeriesVO financerSeriesVO;
	@Override
	public FinancierSeriesVO convertEntity(FinancierSeriesDTO financerSeriesDTO) {
		
		financerSeriesVO = new FinancierSeriesVO();
		funPoint(financerSeriesDTO.getSeries(), financerSeriesVO::setSeries);
		funPoint(financerSeriesDTO.getYear(), financerSeriesVO::setYear);
		funPoint(financerSeriesDTO.getStartFrom(), financerSeriesVO::setStartFrom);
		funPoint(financerSeriesDTO.getEndTo(), financerSeriesVO::setEndTo);
		funPoint(financerSeriesDTO.getStatus(), financerSeriesVO::setStatus);
		funPoint(financerSeriesDTO.getCurrentNo(), financerSeriesVO::setCurrentNo);
		return financerSeriesVO;
	}
	
	@Override
	public List<FinancierSeriesVO> convertEntity(List<FinancierSeriesDTO> financerSeriesDTOList) {
		return financerSeriesDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public FinancierSeriesDTO convertVO(FinancierSeriesVO financerSeriesVO) {
		
		financerSeriesDTO = new FinancierSeriesDTO();
		funPoint(financerSeriesVO.getSeries(), financerSeriesDTO::setSeries);
		funPoint(financerSeriesVO.getYear(), financerSeriesDTO::setYear);
		funPoint(financerSeriesVO.getStartFrom(), financerSeriesDTO::setStartFrom);
		funPoint(financerSeriesVO.getEndTo(), financerSeriesDTO::setEndTo);
		funPoint(financerSeriesVO.getStatus(), financerSeriesDTO::setStatus);
		funPoint(financerSeriesVO.getCurrentNo(), financerSeriesDTO::setCurrentNo);
		return financerSeriesDTO;
	}
	
	@Override
	public List<FinancierSeriesDTO> convertVO(List<FinancierSeriesVO> financerSeriesVOList) {
		return financerSeriesVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
}
