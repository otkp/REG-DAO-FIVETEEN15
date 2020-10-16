package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitTypeDTO;
import org.epragati.permits.vo.PermitTypeVO;
import org.springframework.stereotype.Component;

@Component
public class PermitTypeMapper extends BaseMapper<PermitTypeDTO, PermitTypeVO> {

	@Override
	public PermitTypeVO convertEntity(PermitTypeDTO dto) {
		PermitTypeVO vo = new PermitTypeVO();
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getPermitType(), vo::setPermitType);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getTypeofPermit(), vo::setTypeofPermit);
		funPoint(dto.getValidityUnit(), vo::setValidityUnit);
		funPoint(dto.getValidityPeriod(), vo::setValidityPeriod);
		funPoint(dto.getRenewalUnit(), vo::setRenewalUnit);
		funPoint(dto.getRenewalPeriod(), vo::setRenewalPeriod);
		funPoint(dto.isAuthorization(), vo::setAuthorization);
		funPoint(dto.getNumberCode(), vo::setNumberCode);
		return vo;
	}

	@Override
	public PermitTypeDTO convertVO(PermitTypeVO vo) {
		PermitTypeDTO dto = new PermitTypeDTO();
		funPoint(vo.getDescription(), dto::setDescription);
		funPoint(vo.getPermitType(), dto::setPermitType);
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getTypeofPermit(), dto::setTypeofPermit);
		funPoint(vo.getValidityUnit(), dto::setValidityUnit);
		funPoint(vo.getValidityPeriod(), dto::setValidityPeriod);
		funPoint(vo.getRenewalUnit(), dto::setRenewalUnit);
		funPoint(vo.getRenewalPeriod(), dto::setRenewalPeriod);
		funPoint(vo.isAuthorization(), dto::setAuthorization);
		funPoint(vo.getNumberCode(), dto::setNumberCode);
		return dto;
	}

}
