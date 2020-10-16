package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.OfficeWisePermitsAvilabilityDTO;
import org.epragati.permits.vo.OfficeWisePermitsAvilabilityVO;
import org.springframework.stereotype.Component;

@Component
public class OfficeWisePermitsAvilabilityMapper
		extends BaseMapper<OfficeWisePermitsAvilabilityDTO, OfficeWisePermitsAvilabilityVO> {

	@Override
	public OfficeWisePermitsAvilabilityVO convertEntity(OfficeWisePermitsAvilabilityDTO dto) {
		OfficeWisePermitsAvilabilityVO vo = new OfficeWisePermitsAvilabilityVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getTotalPermits(), vo::setTotalPermits);
		funPoint(dto.getBookedPermits(), vo::setBookedPermits);
		funPoint(dto.getRemainingPermits(), vo::setRemainingPermits);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public OfficeWisePermitsAvilabilityDTO convertVO(OfficeWisePermitsAvilabilityVO vo) {
		OfficeWisePermitsAvilabilityDTO dto = new OfficeWisePermitsAvilabilityDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getTotalPermits(), dto::setTotalPermits);
		funPoint(vo.getBookedPermits(), dto::setBookedPermits);
		funPoint(vo.getRemainingPermits(), dto::setRemainingPermits);
		funPoint(vo.isStatus(), dto::setStatus);
		return dto;
	}

}
