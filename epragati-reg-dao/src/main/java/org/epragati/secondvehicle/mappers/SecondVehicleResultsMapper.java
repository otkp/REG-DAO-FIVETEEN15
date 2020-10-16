package org.epragati.secondvehicle.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.elastic.vo.SecondVehicleResultsVO;
import org.epragati.secondvehicle.dto.SecondVehicleResultsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondVehicleResultsMapper extends BaseMapper<SecondVehicleResultsDTO, SecondVehicleResultsVO> {

	@Autowired
	private SecondVehicleDataMapppers secondVehicleDataMapppers;

	@Override
	public SecondVehicleResultsVO convertEntity(SecondVehicleResultsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SecondVehicleResultsDTO convertVO(SecondVehicleResultsVO vo) {
		SecondVehicleResultsDTO dto = new SecondVehicleResultsDTO();
		funPoint(vo.getActionBy(), dto::setActionBy);
		funPoint(vo.getRole(), dto::setRole);
		funPoint(vo.isFound(), dto::setFound);
		dto.setSecondVehicleData(secondVehicleDataMapppers.convertVO(vo.getSecondVehicleData()));
		return dto;
	}

}
