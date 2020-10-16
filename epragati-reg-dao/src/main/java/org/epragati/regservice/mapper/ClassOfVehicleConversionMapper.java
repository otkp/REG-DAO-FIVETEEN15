package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.ClassOfVehicleConversion;
import org.epragati.regservice.vo.ClassOfVehicleConversionVO;
import org.springframework.stereotype.Component;


@Component
public class ClassOfVehicleConversionMapper extends BaseMapper<ClassOfVehicleConversion , ClassOfVehicleConversionVO>{

	@Override
	public ClassOfVehicleConversionVO convertEntity(ClassOfVehicleConversion dto) {
		
		ClassOfVehicleConversionVO vo = new ClassOfVehicleConversionVO();
		funPoint(dto.getCategory(), vo::setCategory);
		funPoint(dto.getConvCategory(), vo::setConvCategory);
		funPoint(dto.getCov(), vo::setCov);
		funPoint(dto.getCovDesc(), vo::setCovDesc);
		funPoint(dto.getNewCategory(), vo::setNewCategory);
		funPoint(dto.getNewCov(), vo::setNewCov);
		funPoint(dto.getNewcovDesc(), vo::setNewcovDesc);
		funPoint(dto.isFcFee(), vo::setFcFee);
		funPoint(dto.isPermitCal(), vo::setPermitCal);
		funPoint(dto.isTaxCal(), vo::setTaxCal);
		
		return vo;
	}

	
}
