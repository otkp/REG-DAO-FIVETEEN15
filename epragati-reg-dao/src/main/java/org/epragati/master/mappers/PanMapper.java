package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.PanDTO;
import org.epragati.master.vo.PanVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saikiran.kola
 *
 */
@Component
public class PanMapper extends BaseMapper<PanDTO, PanVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public PanVO convertEntity(PanDTO dto) {
		PanVO panVO = new PanVO();
		funPoint(dto.getStatus(), panVO::setStatus);
		funPoint(dto.getFirstName(), panVO::setFirstName);
		funPoint(dto.getPanNumber(), panVO::setPanNumber);
		funPoint(dto.getLastName(), panVO::setLastName);
		funPoint(dto.getIsValid(), panVO::setIsValid);
		funPoint(dto.getMiddleName(), panVO::setMiddleName);
		funPoint(dto.getSalutation(), panVO::setSalutation);
		funPoint(dto.getPanUpdatedDateAtITDEnd(), panVO::setPanUpdatedDateAtITDEnd);
		return panVO;
	}

	/**
	 * 
	 * dto list to vo list conversion
	 */
	public List<PanVO> convertEntity(List<PanDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	@Override
	public PanDTO convertVO(PanVO vo){
		
		PanDTO dto = new PanDTO();
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getFirstName(), dto::setFirstName);
		funPoint(vo.getPan(), dto::setPanNumber);
		funPoint(vo.getLastName(), dto::setLastName);
		funPoint(vo.getIsValid(), dto::setIsValid);
		funPoint(vo.getMiddleName(), dto::setMiddleName);
		funPoint(vo.getSalutation(), dto::setSalutation);
		funPoint(vo.getPanUpdatedDateAtITDEnd(), dto::setPanUpdatedDateAtITDEnd);
		return dto;
	}

}
