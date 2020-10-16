package org.epragati.regservice.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.LegalHiresDTO;
import org.epragati.regservice.vo.LegalHiresVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class LegalHiresMapper extends BaseMapper<LegalHiresDTO, LegalHiresVO>{

	@Override
	public LegalHiresVO convertEntity(LegalHiresDTO dto) {
		
		return null;
	}
	@Override
	public LegalHiresDTO convertVO(LegalHiresVO vo) {
		LegalHiresDTO legalHiresDTO= new LegalHiresDTO();
		if(vo.getSlNo()!=null){
			funPoint(vo.getSlNo(), legalHiresDTO::setSlNo);
		}
		funPoint(vo.getName(), legalHiresDTO::setName);
		funPoint(vo.getAadhaarNo(), legalHiresDTO::setAadhaarNo);
		return legalHiresDTO;
	}
	@Override
	public List<LegalHiresDTO> convertVO(List<LegalHiresVO> vo) {
		return vo.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}

