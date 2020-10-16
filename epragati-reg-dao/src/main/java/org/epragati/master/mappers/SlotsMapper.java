package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.SlotsDTO;
import org.epragati.master.vo.SlotsVO;
import org.springframework.stereotype.Component;

@Component
public class SlotsMapper extends BaseMapper<SlotsDTO, SlotsVO>{

	@Override
	public SlotsVO convertEntity(SlotsDTO dto) {
		SlotsVO slotsVO = new SlotsVO();
		funPoint(dto.getService(), slotsVO::setService);
		funPoint(dto.getModule(), slotsVO::setModule);
		funPoint(dto.getDate(), slotsVO::setDate);
		funPoint(dto.getOfficeCode(), slotsVO::setOfficeCode);
		funPoint(dto.getAvailableSlots(), slotsVO::setAvailableSlots);
		funPoint(dto.getBooked(), slotsVO::setBooked);
		funPoint(dto.getTotalSlots(), slotsVO::setTotalSlots);
		funPoint(dto.getHoliday(), slotsVO::setHoliday);
		funPoint(dto.getStatus(), slotsVO::setStatus);
		funPoint(dto.getIsFastFilling(), slotsVO::setIsFastFilling);
		funPoint(dto.getLockedSlots(), slotsVO::setLockedSlots);
		return slotsVO;
	}
	
	@Override
	public SlotsDTO convertVO(SlotsVO vo){
		SlotsDTO slotsDTO = new SlotsDTO();
		funPoint(vo.getService(), slotsDTO::setService);
		funPoint(vo.getModule(), slotsDTO::setModule);
		funPoint(vo.getDate(), slotsDTO::setDate);
		funPoint(vo.getOfficeCode(), slotsDTO::setOfficeCode);
		funPoint(vo.getAvailableSlots(), slotsDTO::setAvailableSlots);
		funPoint(vo.getBooked(), slotsDTO::setBooked);
		funPoint(vo.getTotalSlots(), slotsDTO::setTotalSlots);
		funPoint(vo.getStatus(), slotsDTO::setStatus);
		funPoint(vo.getIsFastFilling(), slotsDTO::setIsFastFilling);
		funPoint(vo.getLockedSlots(), slotsDTO::setLockedSlots);
		return slotsDTO;
	}

}
