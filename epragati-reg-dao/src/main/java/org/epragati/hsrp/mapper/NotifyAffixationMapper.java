package org.epragati.hsrp.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.epragati.common.dto.NotifyAffixationDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.vo.AffixationVO;
import org.epragati.hsrp.vo.HSRPRTARequestModel;
import org.springframework.stereotype.Component;

@Component
public class NotifyAffixationMapper extends BaseMapper<NotifyAffixationDTO, AffixationVO> {

	@Override
	public AffixationVO convertEntity(NotifyAffixationDTO dto) {

		AffixationVO affixationVO = new AffixationVO();
		//TODO--date needs to save
		return affixationVO;
	}

	public NotifyAffixationDTO convertVO(HSRPRTARequestModel vo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// convert String to LocalDate
		LocalDate hsrpAvailabilityDate = LocalDate.parse(vo.getHsrpAvailabilityDate(), formatter);
		NotifyAffixationDTO notifyaffixationDTO = new NotifyAffixationDTO();
		funPoint(hsrpAvailabilityDate, notifyaffixationDTO::setHsrpAvailabilityDate);
		//funPoint(vo.getAffixationCenterCode(), notifyaffixationDTO::setAffixationCenterCode);
		return notifyaffixationDTO;
	}

}
