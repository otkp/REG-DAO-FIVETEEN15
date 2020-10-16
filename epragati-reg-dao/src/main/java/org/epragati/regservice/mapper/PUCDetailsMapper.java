package org.epragati.regservice.mapper;


import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.PUCDetailsDTO;
import org.epragati.regservice.vo.PUCDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class PUCDetailsMapper extends BaseMapper<PUCDetailsDTO, PUCDetailsVO>  {

	@Override
	public PUCDetailsVO convertEntity(PUCDetailsDTO dto) {

		PUCDetailsVO vo = new PUCDetailsVO();
		
		funPoint(dto.getValidFrom(), vo::setValidFrom);
		funPoint(dto.getValidTo(), vo::setValidTo);
		
		return vo;
		
	}
	
	@Override
	public PUCDetailsDTO convertVO(PUCDetailsVO vo) {
		
		PUCDetailsDTO dto = new PUCDetailsDTO();
		
		funPoint(vo.getValidFrom(), dto::setValidFrom);
		funPoint(vo.getValidTo(), dto::setValidTo);
		
		return dto;	
	}
}
