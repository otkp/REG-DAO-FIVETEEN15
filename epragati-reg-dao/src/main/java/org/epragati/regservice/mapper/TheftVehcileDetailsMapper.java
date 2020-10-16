package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.TheftVehicleDetailsDTO;
import org.epragati.regservice.vo.TheftVehicleDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class TheftVehcileDetailsMapper extends BaseMapper<TheftVehicleDetailsDTO, TheftVehicleDetailsVO> {

	@Override
	public TheftVehicleDetailsVO convertEntity(TheftVehicleDetailsDTO dto) {

		TheftVehicleDetailsVO vo=new TheftVehicleDetailsVO();
		funPoint(dto.getComplaintDate(), vo::setComplaintDate);
		funPoint(dto.getDistrict(), vo::setDistrict);
		funPoint(dto.getFirNo(), vo::setFirNo);
		funPoint(dto.getFirYear(), vo::setFirYear);
		funPoint(dto.getPoliceStationName(), vo::setPoliceStationName);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getType(), vo::setType);
		return vo;
	}

	@Override
	public TheftVehicleDetailsDTO convertVO(TheftVehicleDetailsVO vo) {
		TheftVehicleDetailsDTO dto = new TheftVehicleDetailsDTO();
		funPoint(vo.getComplaintDate(), dto::setComplaintDate);
		funPoint(vo.getDistrict(), dto::setDistrict);
		funPoint(vo.getFirNo(), dto::setFirNo);
		funPoint(vo.getFirYear(), dto::setFirYear);
		funPoint(vo.getPoliceStationName(), dto::setPoliceStationName);
		funPoint(vo.getRemarks(), dto::setRemarks);
		funPoint(vo.getState(), dto::setState);
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getType(), dto::setType);
		return dto;

	}

}
