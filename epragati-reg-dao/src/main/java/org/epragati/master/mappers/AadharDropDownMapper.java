package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.AadharDropListDTO;
import org.epragati.master.vo.AadharDropListVO;
import org.springframework.stereotype.Component;
@Component
public class AadharDropDownMapper extends BaseMapper<AadharDropListDTO,AadharDropListVO>{

	@Override
	public AadharDropListVO convertEntity(AadharDropListDTO dto) {
		AadharDropListVO vo = new AadharDropListVO();
		
		funPoint(dto.getName(), vo::setName);
		funPoint(dto.getStatus(), vo::setStatus);
		return vo;
	}
	
	@Override
	public List<AadharDropListVO> convertEntity(List<AadharDropListDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	@Override
	public AadharDropListDTO convertVO(AadharDropListVO vo) {
		AadharDropListDTO dto = new AadharDropListDTO();
	
		funPoint(vo.getName(), dto::setName);
		funPoint(vo.getStatus(), dto::setStatus);
		return dto;

	}

	/**
	 * vo list to dto list conversion
	 * 
	 */

	@Override
	public List<AadharDropListDTO> convertVO(List<AadharDropListVO> vos) {
		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}
	
}
