package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.FreezeVehiclsVO;
import org.epragati.vcrImage.dto.FreezeVehiclsDTO;
import org.springframework.stereotype.Component;

@Component
public class FreezeVehiclsMapper extends BaseMapper<FreezeVehiclsDTO, FreezeVehiclsVO>{

	@Override
	public FreezeVehiclsVO convertEntity(FreezeVehiclsDTO dto) {
		FreezeVehiclsVO vo = new FreezeVehiclsVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getPrNo(), vo::setPrNo);
		return vo;
	}

}
