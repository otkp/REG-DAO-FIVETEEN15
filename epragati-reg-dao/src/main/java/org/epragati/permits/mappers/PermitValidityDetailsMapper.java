package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitValidityDetailsDTO;
import org.epragati.permits.vo.PermitValidityDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class PermitValidityDetailsMapper extends BaseMapper<PermitValidityDetailsDTO, PermitValidityDetailsVO> {

	@Override
	public PermitValidityDetailsVO convertEntity(PermitValidityDetailsDTO dto) {
		PermitValidityDetailsVO vo = new PermitValidityDetailsVO();
		funPoint(dto.getPermitValidFrom(), vo::setPermitValidFrom);
		funPoint(dto.getPermitValidTo(), vo::setPermitValidTo);
		funPoint(dto.getPermitAuthorizationValidFrom(), vo::setPermitAuthorizationValidFrom);
		funPoint(dto.getPermitAuthorizationValidTo(), vo::setPermitAuthorizationValidTo);
		funPoint(dto.getExtentionDays(), vo::setExtentionDays);
		funPoint(dto.getNoOfMonths(), vo::setNoOfMonths);
		return vo;
	}

	@Override
	public PermitValidityDetailsDTO convertVO(PermitValidityDetailsVO vo) {
		PermitValidityDetailsDTO dto = new PermitValidityDetailsDTO();
		funPoint(vo.getPermitValidFrom(), dto::setPermitValidFrom);
		funPoint(vo.getPermitValidTo(), dto::setPermitValidTo);
		funPoint(vo.getPermitAuthorizationValidFrom(), dto::setPermitAuthorizationValidFrom);
		funPoint(vo.getPermitAuthorizationValidTo(), dto::setPermitAuthorizationValidTo);
		funPoint(vo.getExtentionDays(), dto::setExtentionDays);
		funPoint(vo.getNoOfMonths(), dto::setNoOfMonths);
		return dto;
	}

}
