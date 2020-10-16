package org.epragati.secondvehicle.mappers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.elastic.vo.SecondVehicleDataVO;
import org.epragati.elastic.vo.SecondVehicleResultsVO;
import org.epragati.elastic.vo.SecondVehicleSearchResultsVO;
import org.epragati.secondvehicle.dto.SecondVehicleDataDTO;
import org.epragati.secondvehicle.dto.SecondVehicleResultsDTO;
import org.epragati.secondvehicle.dto.SecondVehicleSearchResultsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondVehicleSearchResultsMapper
		extends BaseMapper<SecondVehicleSearchResultsDTO, SecondVehicleSearchResultsVO> {

	@Autowired
	private SecondVehicleDataMapppers secondVehicleDataMapppers;

	@Override
	public SecondVehicleSearchResultsVO convertEntity(SecondVehicleSearchResultsDTO dto) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public SecondVehicleSearchResultsDTO convertVO(SecondVehicleSearchResultsVO vo) {
		SecondVehicleSearchResultsDTO dto = new SecondVehicleSearchResultsDTO();
		List<SecondVehicleResultsDTO> secondVehicleList = new ArrayList<SecondVehicleResultsDTO>();
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		SecondVehicleResultsVO secondVehicle = vo.getSvResults();
		
			SecondVehicleResultsDTO secondVehicleDTO = new SecondVehicleResultsDTO();
			secondVehicleDTO.setRole(secondVehicle.getRole());
			secondVehicleDTO.setActionBy(secondVehicle.getRole());
			List<SecondVehicleDataVO> secondVehicleDataList = secondVehicle.getSecondVehicleData();
			List<SecondVehicleDataDTO> secondVehicleDataDTO = secondVehicleDataMapppers
					.convertVO(secondVehicleDataList);
			secondVehicleDTO.setSecondVehicleData(secondVehicleDataDTO);
			secondVehicleDTO.setCreatedDate(LocalDateTime.now());

			secondVehicleList.add(secondVehicleDTO);

	
		dto.setSvResults(secondVehicleList);
		return dto;

	}

}
