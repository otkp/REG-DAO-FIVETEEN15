package org.epragati.hsrp.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.epragati.common.dto.AffixationDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.vo.AffixationVO;
import org.epragati.hsrp.vo.HSRPRTARequestModel;
import org.springframework.stereotype.Component;

@Component
public class AffixationMapper extends BaseMapper<AffixationDTO, AffixationVO> {

	@Override
	public AffixationVO convertEntity(AffixationDTO dto) {

		AffixationVO affixationVO = new AffixationVO();
		// TO-DO saving purpose
		return affixationVO;
	}

	public AffixationDTO convertVO(HSRPRTARequestModel vo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// convert String to LocalDate
		LocalDate affixationDate = LocalDate.parse(vo.getAffixationDate(), formatter);
		AffixationDTO affixationDTO = new AffixationDTO();
		funPoint(affixationDate, affixationDTO::setDateOfAffixation);
		//funPoint(vo.getAffixationCenterCode(), affixationDTO::setAffixationCenterCode);
		return affixationDTO;
	}

}
