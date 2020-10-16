package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitRouteDetailsDTO;
import org.epragati.permits.vo.PermitRouteDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class PermitRouteDetailsMapper extends BaseMapper<PermitRouteDetailsDTO, PermitRouteDetailsVO> {

	@Override
	public PermitRouteDetailsVO convertEntity(PermitRouteDetailsDTO dto) {
		PermitRouteDetailsVO vo = new PermitRouteDetailsVO();
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getCode(), vo::setCode);
		funPoint(dto.getCov(), vo::setCov);
		funPoint(dto.getPermitType(), vo::setPermitType);
		return vo;
	}

	@Override
	public PermitRouteDetailsDTO convertVO(PermitRouteDetailsVO vo) {
		PermitRouteDetailsDTO dto = new PermitRouteDetailsDTO();
		funPoint(vo.getDescription(), dto::setDescription);
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getCode(), dto::setCode);
		funPoint(vo.getCov(), dto::setCov);
		funPoint(vo.getPermitType(), dto::setPermitType);
		return dto;
	}

}
