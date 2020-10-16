package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.UserLoginsDTO;
import org.epragati.master.vo.UserLoginsVO;
import org.springframework.stereotype.Component;
@Component
public class UserLoginsMapper extends BaseMapper<UserLoginsDTO, UserLoginsVO> {

	@Override
	public UserLoginsVO convertEntity(UserLoginsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * convert DTO List to VO List
	 * 
	 */
	public List<UserLoginsVO> convertEntity(List<UserLoginsDTO> dtoList) {
		List<UserLoginsVO> list = new ArrayList<UserLoginsVO>();
		for (UserLoginsDTO masterUserLoginsDTO : dtoList) {
			UserLoginsVO masterUserLoginsVo = new UserLoginsVO();
			funPoint(masterUserLoginsDTO.getAadhaarNo(), masterUserLoginsVo::setAadhaarNo);
			funPoint(masterUserLoginsDTO.getAltEmail(), masterUserLoginsVo::setAltEmail);
			funPoint(masterUserLoginsDTO.getAltMobile(), masterUserLoginsVo::setAltMobile);
			funPoint(masterUserLoginsDTO.getCreatedBy(), masterUserLoginsVo::setCreatedBy);
			funPoint(masterUserLoginsDTO.getCreatedDate(), masterUserLoginsVo::setCreatedDate);
			funPoint(masterUserLoginsDTO.getEmail(), masterUserLoginsVo::setEmail);
			funPoint(masterUserLoginsDTO.getFirstName(), masterUserLoginsVo::setFirstName);
			funPoint(masterUserLoginsDTO.getLastName(), masterUserLoginsVo::setLastName);
			funPoint(masterUserLoginsDTO.getLastPasswordUpdated(), masterUserLoginsVo::setLastPasswordUpdated);
			funPoint(masterUserLoginsDTO.getlUpdate(), masterUserLoginsVo::setlUpdate);
			funPoint(masterUserLoginsDTO.getMobile(), masterUserLoginsVo::setMobile);
			funPoint(masterUserLoginsDTO.getOfficeCode(), masterUserLoginsVo::setOfficeCode);
			funPoint(masterUserLoginsDTO.getParentUserid(), masterUserLoginsVo::setParentUserid);
			funPoint(masterUserLoginsDTO.getPassword(), masterUserLoginsVo::setPassword);
			funPoint(masterUserLoginsDTO.getStatus(), masterUserLoginsVo::setStatus);
			funPoint(masterUserLoginsDTO.getUlId(), masterUserLoginsVo::setUlId);
			funPoint(masterUserLoginsDTO.getUserId(), masterUserLoginsVo::setUserId);
			funPoint(masterUserLoginsDTO.getValidFrom(), masterUserLoginsVo::setValidFrom);
			funPoint(masterUserLoginsDTO.getValidTo(), masterUserLoginsVo::setValidTo);
			list.add(masterUserLoginsVo);
		}
		return list;

	}

}
