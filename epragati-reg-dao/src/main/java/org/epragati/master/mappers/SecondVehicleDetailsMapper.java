package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.SecondVehicleDetailsDTO;
import org.epragati.master.vo.SecondVehicleDetailsVO;

public class SecondVehicleDetailsMapper extends BaseMapper<SecondVehicleDetailsDTO, SecondVehicleDetailsVO>{

	@Override
	public SecondVehicleDetailsVO convertEntity(SecondVehicleDetailsDTO dto) {
		SecondVehicleDetailsVO vo=new SecondVehicleDetailsVO();
		funPoint(dto.getComments(), vo::setComments);
		funPoint(dto.getSecondVehicleNo(),vo::setSecondVehicleNo);
		funPoint(dto.isSecondVehicle(), vo::setSecondVehicle);
		
		return vo;
	}

	
	
	
	
	
	
	
	
	
	
}
