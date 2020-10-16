/**
 * 
 */
package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.HolidayExcemptionDTO;
import org.epragati.master.vo.HolidayExcemptionVO;
import org.springframework.stereotype.Component;

/**
 * @author saroj.sahoo
 *
 */
@Component
public class HolidayExcemptionMapper extends BaseMapper<HolidayExcemptionDTO, HolidayExcemptionVO>{

	public HolidayExcemptionVO holidayExcemptionVO;
	public HolidayExcemptionDTO holidayExcemptionDTO;
	
	@Override
	public HolidayExcemptionVO convertEntity(HolidayExcemptionDTO holidayExcemptionDTO) {
		holidayExcemptionVO=new HolidayExcemptionVO();
		funPoint(holidayExcemptionDTO.getExcemptionDate(), holidayExcemptionVO::setExcemptionDate);
		funPoint(holidayExcemptionDTO.isHolidayType(), holidayExcemptionVO::setHolidayType);
		funPoint(holidayExcemptionDTO.getId(), holidayExcemptionVO::setId);
		funPoint(holidayExcemptionDTO.getOfficeCode(), holidayExcemptionVO::setOfficeCode);
		funPoint(holidayExcemptionDTO.getServiceId(), holidayExcemptionVO::setServiceId);
		funPoint(holidayExcemptionDTO.getCreatedBy(), holidayExcemptionVO::setCreatedBy);
		funPoint(holidayExcemptionDTO.getCreatedDate(), holidayExcemptionVO::setCreatedDate);
		funPoint(holidayExcemptionDTO.getModifiedBy(), holidayExcemptionVO::setModifiedBy);
		funPoint(holidayExcemptionDTO.getModifiedDate(), holidayExcemptionVO::setModifiedDate);
		return holidayExcemptionVO;
	}
	
	@Override
	public HolidayExcemptionDTO convertVO(HolidayExcemptionVO holidayExcemptionVO) {
		holidayExcemptionDTO=new HolidayExcemptionDTO();
		funPoint(holidayExcemptionVO.getExcemptionDate(), holidayExcemptionDTO::setExcemptionDate);
		funPoint(holidayExcemptionVO.isHolidayType(), holidayExcemptionDTO::setHolidayType);
		funPoint(holidayExcemptionVO.getId(), holidayExcemptionDTO::setId);
		funPoint(holidayExcemptionVO.getOfficeCode(), holidayExcemptionDTO::setOfficeCode);
		funPoint(holidayExcemptionVO.getServiceId(), holidayExcemptionDTO::setServiceId);
		funPoint(holidayExcemptionVO.getCreatedBy(), holidayExcemptionDTO::setCreatedBy);
		funPoint(holidayExcemptionVO.getCreatedDate(), holidayExcemptionDTO::setCreatedDate);
		funPoint(holidayExcemptionVO.getModifiedBy(), holidayExcemptionDTO::setModifiedBy);
		funPoint(holidayExcemptionVO.getModifiedDate(), holidayExcemptionDTO::setModifiedDate);
		return holidayExcemptionDTO;
	}

}
