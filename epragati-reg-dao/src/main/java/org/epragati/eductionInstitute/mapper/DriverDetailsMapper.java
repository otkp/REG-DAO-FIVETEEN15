package org.epragati.eductionInstitute.mapper;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DriverDetailsDto;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.vo.DriverDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DriverDetailsMapper extends BaseMapper<DriverDetailsDto, DriverDetailsVO>{

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;
	@Override
	public DriverDetailsVO convertEntity(DriverDetailsDto dto) {
		DriverDetailsVO vo = new DriverDetailsVO();
		funPoint(dto.getDlNo(), vo::setDlNo);
		funPoint(dto.getFirstIssueOfficeName(), vo::setFirstIssueOfficeName);
		funPoint(dto.getFirstIssueOfficeCode(), vo::setFirstIssueOfficeCode);
		funPoint(dto.getDriverName(), vo::setDriverName);
		funPoint(dto.getDateOfBirth(), vo::setDob);
		funPoint(dto.getCareOf(), vo::setCareOf);
		funPoint(dto.getGender(), vo::setGender);
		if(dto.getPresentAddress() != null) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAddress()));
		}
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getDlIssueDate(), vo::setDlIssueDate);
		funPoint(dto.getBadgeNo(), vo::setBadgeNo);
		funPoint(dto.getNonTransportValidity(), vo::setNonTransportValidity);
		funPoint(dto.getTransportValidity(), vo::setTransportValidity);
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getDriverExperience(), vo::setDriverExperience);
		funPoint(dto.getNonTransportCovs(), vo::setNonTransportCovs);
		funPoint(dto.getTrasportCovs(), vo::setTrasportCovs);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		return vo;
	}

	@Override
	public DriverDetailsDto convertVO(DriverDetailsVO vo) {
		DriverDetailsDto dto = new DriverDetailsDto();
		funPoint(vo.getDlNo(), dto::setDlNo);
		funPoint(vo.getFirstIssueOfficeName(), dto::setFirstIssueOfficeName);
		funPoint(vo.getFirstIssueOfficeCode(), dto::setFirstIssueOfficeCode);
		funPoint(vo.getDriverName(), dto::setDriverName);
		funPoint(vo.getDob(), dto::setDateOfBirth);
		funPoint(vo.getCareOf(), dto::setCareOf);
		funPoint(vo.getGender(), dto::setGender);
		if(vo.getPresentAddress() != null) {
			dto.setPresentAddress(applicantAddressMapper.convertVO(vo.getPresentAddress()));
		}
		funPoint(vo.getMobile(), dto::setMobile);
		funPoint(vo.getDlIssueDate(), dto::setDlIssueDate);
		funPoint(vo.getBadgeNo(), dto::setBadgeNo);
		funPoint(vo.getNonTransportValidity(), dto::setNonTransportValidity);
		funPoint(vo.getTransportValidity(), dto::setTransportValidity);
		funPoint(vo.getAadharNo(), dto::setAadharNo);
		funPoint(vo.getDriverExperience(), dto::setDriverExperience);
		funPoint(vo.getNonTransportCovs(), dto::setNonTransportCovs);
		funPoint(vo.getTrasportCovs(), dto::setTrasportCovs);
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getOfficeName(), dto::setOfficeName);
		return dto;
	}
	public List<DriverDetailsVO> convertEntity(List<DriverDetailsDto> entity) {
		List<DriverDetailsVO> list = new ArrayList<>();

		for (DriverDetailsDto dto : entity) {
			DriverDetailsVO vo = new DriverDetailsVO();
		funPoint(dto.getDlNo(), vo::setDlNo);
		funPoint(dto.getFirstIssueOfficeName(), vo::setFirstIssueOfficeName);
		funPoint(dto.getFirstIssueOfficeCode(), vo::setFirstIssueOfficeCode);
		funPoint(dto.getDriverName(), vo::setDriverName);
		funPoint(dto.getDateOfBirth(), vo::setDob);
		funPoint(dto.getCareOf(), vo::setCareOf);
		funPoint(dto.getGender(), vo::setGender);
		if(dto.getPresentAddress() != null) {
			vo.setPresentAddress(applicantAddressMapper.convertEntity(dto.getPresentAddress()));
		}
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getDlIssueDate(), vo::setDlIssueDate);
		funPoint(dto.getBadgeNo(), vo::setBadgeNo);
		funPoint(dto.getNonTransportValidity(), vo::setNonTransportValidity);
		funPoint(dto.getTransportValidity(), vo::setTransportValidity);
		funPoint(dto.getAadharNo(), vo::setAadharNo);
		funPoint(dto.getDriverExperience(), vo::setDriverExperience);
		funPoint(dto.getNonTransportCovs(), vo::setNonTransportCovs);
		funPoint(dto.getTrasportCovs(), vo::setTrasportCovs);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		list.add(vo);

}
		return list;
	}
	
	public List<DriverDetailsDto> convertVO(List<DriverDetailsVO> driverDetails){
		List<DriverDetailsDto> list=new ArrayList<>();
		for(DriverDetailsVO vo:driverDetails) {
			DriverDetailsDto dto=new DriverDetailsDto();
			funPoint(vo.getDlNo(), dto::setDlNo);
			funPoint(vo.getFirstIssueOfficeName(), dto::setFirstIssueOfficeName);
			funPoint(vo.getFirstIssueOfficeCode(), dto::setFirstIssueOfficeCode);
			funPoint(vo.getDriverName(), dto::setDriverName);
			funPoint(vo.getDob(), dto::setDateOfBirth);
			funPoint(vo.getCareOf(), dto::setCareOf);
			funPoint(vo.getGender(), dto::setGender);
			if(vo.getPresentAddress() != null) {
				dto.setPresentAddress(applicantAddressMapper.convertVO(vo.getPresentAddress()));
			}
			funPoint(vo.getMobile(), dto::setMobile);
			funPoint(vo.getDlIssueDate(), dto::setDlIssueDate);
			funPoint(vo.getBadgeNo(), dto::setBadgeNo);
			funPoint(vo.getNonTransportValidity(), dto::setNonTransportValidity);
			funPoint(vo.getTransportValidity(), dto::setTransportValidity);
			funPoint(vo.getAadharNo(), dto::setAadharNo);
			funPoint(vo.getDriverExperience(), dto::setDriverExperience);
			funPoint(vo.getNonTransportCovs(), dto::setNonTransportCovs);
			funPoint(vo.getTrasportCovs(), dto::setTrasportCovs);
			funPoint(vo.getOfficeCode(), dto::setOfficeCode);
			funPoint(vo.getOfficeName(), dto::setOfficeName);
			list.add(dto);
		}
		return list;
		
	}
	
}


