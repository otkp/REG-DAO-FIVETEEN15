package org.epragati.hsrp.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.epragati.common.dto.EmbossDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.vo.HSRPRTARequestModel;
import org.springframework.stereotype.Component;

@Component
public class EmbossMapper extends BaseMapper<EmbossDTO, HSRPRTARequestModel> {

	public EmbossDTO convertVO(HSRPRTARequestModel vo) {
		// TODO--date needs use dateutils
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// convert String to LocalDate
		LocalDate embossingDate = LocalDate.parse(vo.getEmbossingDate(), formatter);
		EmbossDTO embossDTO = new EmbossDTO();
		funPoint(embossingDate, embossDTO::setDateOfEmbossing);
		funPoint(vo.getFrontLaserCode(), embossDTO::setFrontLaserCode);
		funPoint(vo.getRearLaserCode(), embossDTO::setRearLaserCode);
		embossDTO.setEmbbosUpdateDate(LocalDate.now());
		return embossDTO;
	}

	@Override
	public HSRPRTARequestModel convertEntity(EmbossDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
