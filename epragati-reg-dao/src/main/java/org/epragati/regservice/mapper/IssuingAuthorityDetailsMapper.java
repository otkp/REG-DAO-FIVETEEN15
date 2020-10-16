package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.OfficeMapper;
import org.epragati.regservice.dto.IssuingAuthorityDetailsDTO;
import org.epragati.regservice.vo.IssuingAuthorityDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class IssuingAuthorityDetailsMapper extends BaseMapper<IssuingAuthorityDetailsDTO, IssuingAuthorityDetailsVO>{
	
	@Autowired
	private OfficeMapper officeMapper;

	@Override
	public IssuingAuthorityDetailsVO convertEntity(IssuingAuthorityDetailsDTO dto) {
		IssuingAuthorityDetailsVO vo = new IssuingAuthorityDetailsVO();
		if (dto.getOfficeDetails() != null) {
			vo.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
		}
		funPoint(dto.getRole(), vo::setRole);
		funPoint(dto.getUserId(), vo::setUserId);
		return vo;
	}
	
	@Override
	public IssuingAuthorityDetailsDTO convertVO(IssuingAuthorityDetailsVO vo) {
		IssuingAuthorityDetailsDTO dto = new IssuingAuthorityDetailsDTO();
		if (vo.getOfficeDetails() != null) {
			dto.setOfficeDetails(officeMapper.convertVO(vo.getOfficeDetails()));
		}
		funPoint(vo.getRole(), dto::setRole);
		funPoint(vo.getUserId(), dto::setUserId);
		return dto;
	}

}
