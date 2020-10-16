package org.epragati.mobile.auth.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.mobile.auth.dto.CitizenAppAuthenticationDTO;
import org.epragati.mobile.auth.vo.CitizenAppAuthenticationVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
/**
 * 
 * 
 * @author roshan.jugalkishor
 *
 */
@Component
public class CitizenAppAutenticationMapper extends BaseMapper<CitizenAppAuthenticationDTO,CitizenAppAuthenticationVO> {

	@Override
	public CitizenAppAuthenticationVO convertEntity(CitizenAppAuthenticationDTO dto) {
		CitizenAppAuthenticationVO citizenAppAuthenticationVO=new CitizenAppAuthenticationVO();
		funPoint(dto.getAadharNo(), citizenAppAuthenticationVO::setAadharNo);
		funPoint(dto.getFirstName(), citizenAppAuthenticationVO::setFirstName);
		funPoint(dto.getLastName(), citizenAppAuthenticationVO::setLastName);
		funPoint(dto.getFatherName(), citizenAppAuthenticationVO::setFatherName);
		funPoint(dto.getDob(), citizenAppAuthenticationVO::setDob);
		funPoint(dto.getDlNo(), citizenAppAuthenticationVO::setDlNo);
		funPoint(dto.getNoOfVehicals(), citizenAppAuthenticationVO::setNoOfVehicals);
		funPoint(dto.getMobileNo(), citizenAppAuthenticationVO::setMobileNo);
		funPoint(dto.getIsdeactivate(), citizenAppAuthenticationVO::setIsdeactivate);
		return citizenAppAuthenticationVO;
	}
	
	public CitizenAppAuthenticationVO limitedDashBoardfields(CitizenAppAuthenticationDTO dto) {
		CitizenAppAuthenticationVO citizenAppAuthenticationVO=new CitizenAppAuthenticationVO();
		funPoint(dto.getAadharNo(), citizenAppAuthenticationVO::setAadharNo);
		funPoint(dto.getFirstName(), citizenAppAuthenticationVO::setFirstName);
		funPoint(dto.getLastName(), citizenAppAuthenticationVO::setLastName);
		funPoint(dto.getFatherName(), citizenAppAuthenticationVO::setFatherName);
		funPoint(dto.getDob(), citizenAppAuthenticationVO::setDob);
		funPoint(dto.getDlNo(), citizenAppAuthenticationVO::setDlNo);
		funPoint(dto.getMobileNo(), citizenAppAuthenticationVO::setMobileNo);
		funPoint(dto.getIsdeactivate(), citizenAppAuthenticationVO::setIsdeactivate);
		return citizenAppAuthenticationVO;
	}
	
	@Override
	public CitizenAppAuthenticationDTO convertVO(CitizenAppAuthenticationVO vo) {
		CitizenAppAuthenticationDTO citizenAppAuthenticationDTO=new CitizenAppAuthenticationDTO();
		BeanUtils.copyProperties(vo, citizenAppAuthenticationDTO);
		return citizenAppAuthenticationDTO;
	}
	
	/**
	 * 
	 * 
	 * @param registrationDetailsDTO
	 * @param noOfVehicals
	 * @return
	 */
	public CitizenAppAuthenticationDTO recordsMapping(RegistrationDetailsDTO registrationDetailsDTO,Integer noOfVehicals)
	{
		CitizenAppAuthenticationDTO citizenAppAuthenticationDTO=new CitizenAppAuthenticationDTO();
		funPoint(registrationDetailsDTO.getApplicantDetails().getAadharNo(), citizenAppAuthenticationDTO::setAadharNo);
		funPoint(registrationDetailsDTO.getApplicantDetails().getFirstName(), citizenAppAuthenticationDTO::setFirstName);
		funPoint(registrationDetailsDTO.getApplicantDetails().getLastName(), citizenAppAuthenticationDTO::setLastName);
		funPoint(registrationDetailsDTO.getApplicantDetails().getFatherName(), citizenAppAuthenticationDTO::setFatherName);
		funPoint(registrationDetailsDTO.getApplicantDetails().getDateOfBirth(), citizenAppAuthenticationDTO::setDob);
		funPoint(registrationDetailsDTO.getApplicantDetails().getContact().getMobile(), citizenAppAuthenticationDTO::setMobileNo);
		funPoint(noOfVehicals, citizenAppAuthenticationDTO::setNoOfVehicals);
		
		return citizenAppAuthenticationDTO;
	}
	
}
