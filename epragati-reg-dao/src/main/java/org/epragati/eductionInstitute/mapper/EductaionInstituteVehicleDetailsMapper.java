package org.epragati.eductionInstitute.mapper;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.EductaionInstituteVehicleDetailsDto;
import org.epragati.master.vo.EductaionInstituteVehicleDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EductaionInstituteVehicleDetailsMapper extends BaseMapper<EductaionInstituteVehicleDetailsDto,EductaionInstituteVehicleDetailsVO>{

	@Autowired
	private DriverDetailsMapper driverDetailsMapper;
	@Autowired
	private AttendantDetailsMapper attendantDetailsMapper;
	@Autowired
	private StudentDetailsMapper studentDetailsMapper;
	
	@Override
	public EductaionInstituteVehicleDetailsVO convertEntity(EductaionInstituteVehicleDetailsDto dto) {
		EductaionInstituteVehicleDetailsVO vo = new EductaionInstituteVehicleDetailsVO();
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getOwnerName(), vo::setOwnerName);
		funPoint(dto.getRegistrationDate(), vo::setRegistrationDate);
		funPoint(dto.getTaxValidity(), vo::setTaxValidity);
		funPoint(dto.getFcNumber(), vo::setFcNumber);
		funPoint(dto.getFcValidity(), vo::setFcValidity);
		funPoint(dto.getPermitNumber(), vo::setPermitNumber);
		funPoint(dto.getPermitValidity(), vo::setPermitValidity);
		if(dto.getDriverDetails() != null) {
			vo.setDriverDetails(driverDetailsMapper.convertEntity(dto.getDriverDetails()));
		}
		if(dto.getAttendantDetails() != null) {
			vo.setAttendantDetails(attendantDetailsMapper.convertEntity(dto.getAttendantDetails()));
		}
		funPoint(dto.getRoute(), vo::setRoute);
		if(dto.getStudentDetails() != null) {
			vo.setStudentDetails(studentDetailsMapper.convertEntity(dto.getStudentDetails()));
		}
		if(vo.getAttendantDetails() != null) {
			if(StringUtils.isNoneBlank(dto.getRoute())) {
				vo.getAttendantDetails().setRoute(dto.getRoute());
			}
		}
		return vo;
	}

	@Override
	public EductaionInstituteVehicleDetailsDto convertVO(EductaionInstituteVehicleDetailsVO vo) {
		EductaionInstituteVehicleDetailsDto dto = new EductaionInstituteVehicleDetailsDto();
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getPrNo(), dto::setPrNo);
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getOwnerName(), dto::setOwnerName);
		funPoint(vo.getRegistrationDate(), dto::setRegistrationDate);
		funPoint(vo.getTaxValidity(), dto::setTaxValidity);
		funPoint(vo.getFcNumber(), dto::setFcNumber);
		funPoint(vo.getFcValidity(), dto::setFcValidity);
		funPoint(vo.getPermitNumber(), dto::setPermitNumber);
		funPoint(vo.getPermitValidity(), dto::setPermitValidity);
		if(vo.getDriverDetails() != null) {
			dto.setDriverDetails(driverDetailsMapper.convertVO(vo.getDriverDetails()));
		}
		if(vo.getAttendantDetails() != null) {
			dto.setAttendantDetails(attendantDetailsMapper.convertVO(vo.getAttendantDetails()));
		}
		funPoint(vo.getRoute(), dto::setRoute);
		if(vo.getStudentDetails() != null) {
			dto.setStudentDetails(studentDetailsMapper.convertVO(vo.getStudentDetails()));
		}
		return dto;
	}
}
