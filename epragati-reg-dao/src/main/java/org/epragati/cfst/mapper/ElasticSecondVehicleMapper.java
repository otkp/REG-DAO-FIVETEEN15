package org.epragati.cfst.mapper;

import org.epragati.cfst.dto.ElasticSecondVehicleDTO;
import org.epragati.cfstSync.vo.ElasticSecondVehicleVO;
import org.epragati.common.mappers.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public class ElasticSecondVehicleMapper extends BaseMapper<ElasticSecondVehicleDTO, ElasticSecondVehicleVO>{

	@Override
	public ElasticSecondVehicleVO convertEntity(ElasticSecondVehicleDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ElasticSecondVehicleDTO convertVO(ElasticSecondVehicleDTO dto,ElasticSecondVehicleVO vo) {
		funPoint(vo.getAddress1(), dto::setAddress1);
		funPoint(vo.getAddress2(), dto::setAddress2);
		funPoint(vo.getAddress3(), dto::setAddress3);
		funPoint(vo.getClassOfVehicle(), dto::setClassOfVehicle);
		funPoint(vo.getDisplayName(), dto::setDisplayName);
		funPoint(vo.getDistrict(), dto::setDistrict);
		funPoint(vo.getDob(), dto::setDob);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getFirstName(), dto::setFirstName);
		funPoint(vo.getLastName(), dto::setLastName);
		funPoint(vo.getMandal(), dto::setMandal);
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getOfficeAddress(), dto::setOfficeAddress);
		funPoint(vo.getSynchStatus() ,dto::setSynchStatus);
		funPoint(vo.getPrNumber(), dto::setPrNumber);
		funPoint(vo.getIsAadhaarValidate(),dto::setIsAadhaarValidate);
		funPoint(vo.getAadhaarNo(),dto::setAadhaarNo);
		return dto;
	}

}

