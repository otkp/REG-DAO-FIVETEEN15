package org.epragati.service.enclosure.mapper;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.springframework.stereotype.Component;

@Component
public class LlrImageMapper extends ImageMapper<ImageEnclosureDTO> {

	@Override
	public ImageEnclosureDTO getInstance() {
		return new ImageEnclosureDTO();
	}

}
