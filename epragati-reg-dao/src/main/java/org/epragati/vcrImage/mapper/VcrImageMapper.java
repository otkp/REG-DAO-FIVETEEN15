package org.epragati.vcrImage.mapper;

import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.epragati.vcr.vo.VcrImageVO;
import org.epragati.vcrImage.dto.VcrImageDTO;
import org.springframework.stereotype.Component;

@Component
public class VcrImageMapper extends BaseMapper<VcrImageDTO, VcrImageVO> {

	@Override
	public VcrImageVO convertEntity(VcrImageDTO dto) {

		return null;
	}

	@Override
	public VcrImageDTO convertVO(VcrImageDTO e, VcrImageVO vo) {
		VcrImageDTO dto = new VcrImageDTO();

		funPoint(vo.getVcrNo(), dto::setVcrNo);
		funPoint(vo.getVehicleNo(), dto::setVehicleNo);
		return dto;
	}

	public VcrImageDTO convertVoToDto(VcrImageVO vo, List<KeyValue<String, List<ImageEnclosureDTO>>> enclosure) {
		VcrImageDTO dto = new VcrImageDTO();

		funPoint(vo.getVcrNo(), dto::setVcrNo);
		funPoint(vo.getVehicleNo(), dto::setVehicleNo);

		dto.setEnclosures(enclosure);

		return dto;
	}

}
