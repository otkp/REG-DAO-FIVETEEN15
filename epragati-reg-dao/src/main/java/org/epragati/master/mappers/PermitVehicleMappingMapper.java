package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitVehicleMappingDTO;
import org.epragati.permits.vo.PermitVehicleMappingVO;
import org.springframework.stereotype.Component;

@Component
public class PermitVehicleMappingMapper extends BaseMapper<PermitVehicleMappingDTO, PermitVehicleMappingVO> {

	@Override
	public PermitVehicleMappingVO convertEntity(PermitVehicleMappingDTO dto) {
		PermitVehicleMappingVO vo = new PermitVehicleMappingVO();
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getPermitType(), vo::setPermitType);
		funPoint(dto.getCov(), vo::setCov);
		return vo;
	}

	@Override
	public PermitVehicleMappingDTO convertVO(PermitVehicleMappingVO vo) {
		PermitVehicleMappingDTO dto = new PermitVehicleMappingDTO();
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getPermitType(), dto::setPermitType);
		funPoint(vo.getCov(), dto::setCov);
		return dto;
	}

}
