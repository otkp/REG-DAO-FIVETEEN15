package org.epragati.master.mappers;

import org.epragati.common.dto.PropertiesDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.common.vo.PropertiesVO;
import org.springframework.stereotype.Component;

@Component
public class PropertiesMapper extends BaseMapper<PropertiesDTO, PropertiesVO> {

	@Override
	public PropertiesVO convertEntity(PropertiesDTO dto) {
		PropertiesVO propertiesVO = new PropertiesVO();
		funPoint(dto.getPropertyDetails(), propertiesVO::setPropertyDetails);
		funPoint(dto.getStatus(), propertiesVO::setStatus);
		return propertiesVO;
	}

	@Override
	public PropertiesDTO convertVO(PropertiesVO vo) {
		PropertiesDTO propertiesDTO = new PropertiesDTO();
		funPoint(vo.getPropertyDetails(), propertiesDTO::setPropertyDetails);
		funPoint(vo.getStatus(), propertiesDTO::setStatus);
		return propertiesDTO;
	}
	
	public PropertiesVO convertRequired(PropertiesDTO dto) {
		PropertiesVO propertiesVO = new PropertiesVO();
		funPoint(dto.getFuelType(), propertiesVO::setFuelType);
		return propertiesVO;
	}

}
