package org.epragati.eductionInstitute.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StudentDetailsDto;
import org.epragati.master.mappers.BloodGroupMapper;
import org.epragati.master.vo.StudentDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDetailsMapper extends BaseMapper<StudentDetailsDto, StudentDetailsVO>{

	@Autowired
	private BloodGroupMapper bloodGroupMapper;

	@Override
	public StudentDetailsVO convertEntity(StudentDetailsDto dto) {
		StudentDetailsVO vo = new StudentDetailsVO();
		funPoint(dto.getSlNo(), vo::setSlNo);
		funPoint(dto.getStudenttName(), vo::setStudenttName);
		funPoint(dto.getFatherName(), vo::setFatherName);
		funPoint(dto.getDateOfBirth(), vo::setDateOfBirth);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getGender(), vo::setGender);
		if(dto.getBloodGrp() != null) {
			vo.setBloodGrp(bloodGroupMapper.convertEntity(dto.getBloodGrp()));
		}
		funPoint(dto.getEmergencyContactNo(), vo::setEmergencyContactNo);
		funPoint(dto.getEmail(), vo::setEmail);
		funPoint(dto.getStudying(), vo::setStudying);
		return vo;
	}
	
	@Override
	public StudentDetailsDto convertVO(StudentDetailsVO vo) {
		
		StudentDetailsDto dto = new StudentDetailsDto();
		funPoint(vo.getSlNo(), dto::setSlNo);
		funPoint(vo.getStudenttName(), dto::setStudenttName);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getDateOfBirth(), dto::setDateOfBirth);
		funPoint(vo.getMobile(), dto::setMobile);
		funPoint(vo.getGender(), dto::setGender);
		if(vo.getBloodGrp() != null) {
			dto.setBloodGrp(bloodGroupMapper.convertVO(vo.getBloodGrp()));
		}
		funPoint(vo.getEmergencyContactNo(), dto::setEmergencyContactNo);
		funPoint(vo.getEmail(), dto::setEmail);
		funPoint(vo.getStudying(), dto::setStudying);
		return dto;
		
	}
}
