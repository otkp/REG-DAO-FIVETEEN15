package org.epragati.secondvehicle.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.elastic.vo.SecondVehicleDataVO;
import org.epragati.secondvehicle.dto.SecondVehicleDataDTO;
import org.springframework.stereotype.Component;

@Component
public class SecondVehicleDataMapppers extends BaseMapper<SecondVehicleDataDTO, SecondVehicleDataVO> {

	@Override
	public SecondVehicleDataVO convertEntity(SecondVehicleDataDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SecondVehicleDataDTO convertVO(SecondVehicleDataVO vo) {
		SecondVehicleDataDTO dto = new SecondVehicleDataDTO();
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getDob(), dto::setDob);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getFullName(), dto::setFullName);
		return dto;
	}

}
