package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcrImage.dto.VcrImageDTO;
import org.epragati.vcrImage.dto.VcrImageResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class VcrImageResponseMapper extends BaseMapper<VcrImageDTO, VcrImageResponseDTO> {

	@Override
	public VcrImageResponseDTO convertEntity(VcrImageDTO dto) {
		VcrImageResponseDTO imgResponse = new VcrImageResponseDTO();

		funPoint(dto.getVcrNo(), imgResponse::setVcrNo);
		funPoint(dto.getVehicleNo(), imgResponse::setVehicleNo);
		imgResponse.setEnclosures(dto.getEnclosures());
		return imgResponse;
	}

}
