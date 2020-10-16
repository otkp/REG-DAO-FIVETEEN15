package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ClassOfVehiclesLogDTO;
import org.epragati.master.vo.ClassOfVehiclesLogVO;
import org.springframework.stereotype.Component;

@Component
public class ClassOfVehiclesLogMapper extends BaseMapper<ClassOfVehiclesLogDTO, ClassOfVehiclesLogVO>{

	@Override
	public ClassOfVehiclesLogVO convertEntity(ClassOfVehiclesLogDTO dto) {
		ClassOfVehiclesLogVO vo = new ClassOfVehiclesLogVO();
		funPoint(dto.getFromCov(), vo::setFromCov);
		funPoint(dto.getToCov(), vo::setToCov);
		funPoint(dto.getFrom(), vo::setFrom);
		funPoint(dto.getTo(), vo::setTo);
		funPoint(dto.getCurrentcovNo(), vo::setCurrentcovNo);
		return vo;
	}
	
	@Override
	public ClassOfVehiclesLogDTO convertVO(ClassOfVehiclesLogVO dto) {
		ClassOfVehiclesLogDTO vo = new ClassOfVehiclesLogDTO();
		funPoint(dto.getFromCov(), vo::setFromCov);
		funPoint(dto.getToCov(), vo::setToCov);
		funPoint(dto.getFrom(), vo::setFrom);
		funPoint(dto.getTo(), vo::setTo);
		funPoint(dto.getCurrentcovNo(), vo::setCurrentcovNo);
		return vo;
	}

}
