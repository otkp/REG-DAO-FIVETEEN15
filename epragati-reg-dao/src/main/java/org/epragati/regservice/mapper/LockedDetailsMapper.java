package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.LockedDetailsDTO;
import org.epragati.regservice.vo.LockedDetailsVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Component
public class LockedDetailsMapper extends BaseMapper<LockedDetailsDTO, LockedDetailsVO> {

	@Override
	public LockedDetailsVO convertEntity(LockedDetailsDTO dto) {
		// TODO Auto-generated method stub
		LockedDetailsVO lockedDetailsVO=new LockedDetailsVO();
		funPoint(dto.getApplicatioNo(),lockedDetailsVO::setApplicatioNo);
		funPoint(dto.getIterationNo(),lockedDetailsVO::setIterationNo);
		funPoint(dto.getLockedBy(),lockedDetailsVO::setLockedBy);
		funPoint(dto.getLockedByRole(),lockedDetailsVO::setLockedByRole);
		funPoint(dto.getLockedDate(),lockedDetailsVO::setLockedDate);
		funPoint(dto.getModule(),lockedDetailsVO::setModule);
		funPoint(dto.getReleaseDate(),lockedDetailsVO::setReleaseDate);
		return lockedDetailsVO;
	}
	
	@Override
	public LockedDetailsDTO convertVO(LockedDetailsVO lockedDetailsVO) {
		// TODO Auto-generated method stub
		LockedDetailsDTO lockedDetailsDTO=new LockedDetailsDTO();
		funPoint(lockedDetailsVO.getApplicatioNo(),lockedDetailsDTO::setApplicatioNo);
		funPoint(lockedDetailsVO.getIterationNo(),lockedDetailsDTO::setIterationNo);
		funPoint(lockedDetailsVO.getLockedBy(),lockedDetailsDTO::setLockedBy);
		funPoint(lockedDetailsVO.getLockedByRole(),lockedDetailsDTO::setLockedByRole);
		funPoint(lockedDetailsVO.getLockedDate(),lockedDetailsDTO::setLockedDate);
		funPoint(lockedDetailsVO.getModule(),lockedDetailsDTO::setModule);
		funPoint(lockedDetailsVO.getReleaseDate(),lockedDetailsDTO::setReleaseDate);
		return lockedDetailsDTO;
	}

}
