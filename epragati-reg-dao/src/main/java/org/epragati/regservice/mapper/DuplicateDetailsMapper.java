package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.DuplicateDetailsDTO;
import org.epragati.regservice.vo.DuplicateDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class DuplicateDetailsMapper extends BaseMapper<DuplicateDetailsDTO, DuplicateDetailsVO>{
	@Override
	public DuplicateDetailsVO convertEntity(DuplicateDetailsDTO entry) {
		
		DuplicateDetailsVO duplicateDetailsVO = new DuplicateDetailsVO();
		funPoint(entry.getChooseReason(), duplicateDetailsVO::setChooseReason);
		if(entry.getChooseReason().equals(entry.getChooseReason().LOST)){
			funPoint(entry.getFirDate(), duplicateDetailsVO::setFirDate);
			funPoint(entry.getFirNumber(), duplicateDetailsVO::setFirNumber);
			funPoint(entry.getPoliceStation(), duplicateDetailsVO::setPoliceStation);
		}
		funPoint(entry.getRemarksForReason(), duplicateDetailsVO::setRemarksForReason);
		return duplicateDetailsVO;
	}
	
	@Override
	public DuplicateDetailsDTO convertVO(DuplicateDetailsVO vo) {
		
		DuplicateDetailsDTO duplicateDetailsDTO = new DuplicateDetailsDTO();
		funPoint(vo.getChooseReason(), duplicateDetailsDTO::setChooseReason);
		funPoint(vo.getRemarksForReason(), duplicateDetailsDTO::setRemarksForReason);
		if(vo.getChooseReason().equals(vo.getChooseReason().LOST)){
			funPoint(vo.getFirDate(), duplicateDetailsDTO::setFirDate);
			funPoint(vo.getFirNumber(), duplicateDetailsDTO::setFirNumber);
			funPoint(vo.getPoliceStation(), duplicateDetailsDTO::setPoliceStation);
		}
		return duplicateDetailsDTO;
	}
	}