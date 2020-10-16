package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.HolidayDTO;
import org.epragati.master.vo.HolidayVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class HolidayMapper extends BaseMapper<HolidayDTO, HolidayVO> {

	@Override
	public HolidayVO convertEntity(HolidayDTO holidayDTO) {
		HolidayVO holidayVO=new HolidayVO();
		funPoint(holidayDTO.getSlno(), holidayVO::setSlno);
		funPoint(holidayDTO.getHolidayDate(), holidayVO::setHolidayDate);
		funPoint(holidayDTO.getHolidayDescription(), holidayVO::setHolidayDescription);
		funPoint(holidayDTO.getHolidayStatus(), holidayVO::setHolidayStatus);
		return holidayVO;
	}
	
	@Override
	public HolidayDTO convertVO(HolidayVO holidayVO) {
		HolidayDTO holidayDTO=new HolidayDTO();
		funPoint(holidayVO.getSlno(), holidayDTO::setSlno);
		funPoint(holidayVO.getHolidayDate(), holidayDTO::setHolidayDate);
		funPoint(holidayVO.getHolidayDescription(), holidayDTO::setHolidayDescription);
		funPoint(holidayVO.getHolidayStatus(), holidayDTO::setHolidayStatus);
		return holidayDTO;
	}

}
