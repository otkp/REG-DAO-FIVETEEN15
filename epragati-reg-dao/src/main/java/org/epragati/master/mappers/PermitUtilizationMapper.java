package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitUtilizationDTO;
import org.epragati.permits.vo.PermitUtilizationVO;
import org.springframework.stereotype.Component;

@Component
public class PermitUtilizationMapper extends BaseMapper<PermitUtilizationDTO, PermitUtilizationVO>{

	@Override
	public PermitUtilizationVO convertEntity(PermitUtilizationDTO dto) {
		PermitUtilizationVO vo = new PermitUtilizationVO();
		funPoint(dto.getMviId(), vo::setMviId);
		funPoint(dto.getMviName(), vo::setMviName);
		funPoint(dto.getMviOfficeCode(), vo::setMviOfficeCode);
		funPoint(dto.getPlace(), vo::setPlace);
		funPoint(dto.getUtilizationDate(), vo::setUtilizationDate);
		funPoint(dto.getRouteType(), vo::setRouteType);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getMviOfficeName(), vo::setMviOfficeName);
		return vo;
	}
	
	@Override
	public PermitUtilizationDTO convertVO(PermitUtilizationVO dto) {
		PermitUtilizationDTO vo = new PermitUtilizationDTO();
		funPoint(dto.getMviId(), vo::setMviId);
		funPoint(dto.getMviName(), vo::setMviName);
		funPoint(dto.getMviOfficeCode(), vo::setMviOfficeCode);
		funPoint(dto.getPlace(), vo::setPlace);
		funPoint(dto.getUtilizationDate(), vo::setUtilizationDate);
		funPoint(dto.getRouteType(), vo::setRouteType);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getMviOfficeName(), vo::setMviOfficeName);
		return vo;
	}
}
