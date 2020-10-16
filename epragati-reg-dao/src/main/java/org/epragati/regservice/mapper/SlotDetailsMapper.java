package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.SlotDetailsDTO;
import org.epragati.regservice.vo.SlotDetailsVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Component
public class SlotDetailsMapper extends BaseMapper<SlotDetailsDTO,SlotDetailsVO>{

	@Override
	public SlotDetailsVO convertEntity(SlotDetailsDTO dto) {
		// TODO Auto-generated method stub
		SlotDetailsVO slotDetailsVO = new SlotDetailsVO();
		funPoint(dto.getServiceType(),slotDetailsVO::setServiceType);
		funPoint(dto.getCreatedDate(),slotDetailsVO::setSlotCreatedDate);
		funPoint(dto.getSlotTime(),slotDetailsVO::setSlotTime);
		funPoint(dto.getStatus(),slotDetailsVO::setStatusComment);
		funPoint(dto.getSlotDate(),slotDetailsVO::setTestSlotDate);
		funPoint(dto.getStatusComment(),slotDetailsVO::setStatusComment);
		return slotDetailsVO;
	}
	
	@Override
	public SlotDetailsDTO convertVO(SlotDetailsVO dto) {
		// TODO Auto-generated method stub
		SlotDetailsDTO slotDetailsDTO = new SlotDetailsDTO();
		funPoint(dto.getServiceType(),slotDetailsDTO::setServiceType);
		funPoint(dto.getSlotCreatedDate(),slotDetailsDTO::setCreatedDate);
		funPoint(dto.getSlotTime(),slotDetailsDTO::setSlotTime);
		funPoint(dto.getStatus(),slotDetailsDTO::setStatusComment);
		funPoint(dto.getTestSlotDate(),slotDetailsDTO::setSlotDate);
		funPoint(dto.getStatusComment(),slotDetailsDTO::setStatusComment);
		return slotDetailsDTO;
	}


}
