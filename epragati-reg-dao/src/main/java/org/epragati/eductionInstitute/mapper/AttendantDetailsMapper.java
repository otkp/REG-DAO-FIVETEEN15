package org.epragati.eductionInstitute.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.AttendantDetailsDto;
import org.epragati.master.mappers.AadhaarDetailsResponseMapper;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.vo.AttendantDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AttendantDetailsMapper extends BaseMapper<AttendantDetailsDto, AttendantDetailsVO>{

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;
	@Autowired
	private AadhaarDetailsResponseMapper adddharMapper;

	@Override
	public AttendantDetailsVO convertEntity(AttendantDetailsDto dto) {
		AttendantDetailsVO vo = new AttendantDetailsVO();
		funPoint(dto.getAttendantName(), vo::setAttendantName);
		funPoint(dto.getDateOfBirth(), vo::setDateOfBirth);
		funPoint(dto.getCareOf(), vo::setCareOf);
		funPoint(dto.getGender(), vo::setGender);
		if(dto.getPresentAddress() != null) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAddress()));
		}
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		return vo;
	}

	@Override
	public AttendantDetailsDto convertVO(AttendantDetailsVO vo) {
		AttendantDetailsDto dto = new AttendantDetailsDto();
		funPoint(vo.getAttendantName(), dto::setAttendantName);
		funPoint(vo.getDateOfBirth(), dto::setDateOfBirth);
		funPoint(vo.getCareOf(), dto::setCareOf);
		funPoint(vo.getGender(), dto::setGender);
		if(vo.getPresentAddress() != null) {
			dto.setPresentAddress(applicantAddressMapper.convertVO(vo.getPresentAddress()));
		}
		funPoint(vo.getMobile(), dto::setMobile);
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		return dto;
	}
}
