package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitRouteTypeDTO;
import org.epragati.permits.vo.PermitRouteTypeVO;
import org.springframework.stereotype.Component;

@Component
public class PermitRouteTypeMapper extends BaseMapper<PermitRouteTypeDTO, PermitRouteTypeVO> {

	@Override
	public PermitRouteTypeVO convertEntity(PermitRouteTypeDTO dto) {
		PermitRouteTypeVO vo = new PermitRouteTypeVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getCov(), vo::setCov);
		funPoint(dto.getRouteType(), vo::setRouteType);
		funPoint(dto.isStatus(), vo::setStatus);
		funPoint(dto.isShowAdjacentDistrict(), vo::setShowAdjacentDistrict);
		funPoint(dto.getRouteCode(), vo::setRouteCode);
		funPoint(dto.isAuthorization(), vo::setAuthorization);
		return vo;
	}

	@Override
	public PermitRouteTypeDTO convertVO(PermitRouteTypeVO vo) {
		PermitRouteTypeDTO dto = new PermitRouteTypeDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getCov(), dto::setCov);
		funPoint(vo.getRouteType(), dto::setRouteType);
		funPoint(vo.isStatus(), dto::setStatus);
		funPoint(vo.isShowAdjacentDistrict(), dto::setShowAdjacentDistrict);
		funPoint(vo.getRouteCode(), dto::setRouteCode);
		funPoint(vo.isAuthorization(), dto::setAuthorization);
		return dto;
	}

}
