package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitOtherServicesValidityDetailsDTO;
import org.epragati.permits.vo.TPDetailsSearchVO;
import org.springframework.stereotype.Component;

@Component
public class PermitOtherServicesValidityDetailsMapper
		extends BaseMapper<PermitOtherServicesValidityDetailsDTO, TPDetailsSearchVO> {

	@Override
	public TPDetailsSearchVO convertEntity(PermitOtherServicesValidityDetailsDTO dto) {
		TPDetailsSearchVO vo = new TPDetailsSearchVO();
		funPoint(dto.getTaxValidTill(), vo::setTaxValidTill);
		funPoint(dto.getTaxAmount(), vo::setTaxAmount);
		funPoint(dto.getFcNumber(), vo::setFcNumber);
		funPoint(dto.getFcValidUpto(), vo::setFcValidUpto);
		funPoint(dto.getPermitnumber(), vo::setPermitnumber);
		funPoint(dto.getPermitValidUpto(), vo::setPermitValidUpto);
		funPoint(dto.getPermitId(), vo::setPermitId);
		funPoint(dto.getSeatingCapacity(), vo::setSeatingCapacity);
		funPoint(dto.getTemporaryPermitNumber(), vo::setTemporaryPermitNumber);
		return vo;
	}

	@Override
	public PermitOtherServicesValidityDetailsDTO convertVO(TPDetailsSearchVO vo) {
		PermitOtherServicesValidityDetailsDTO dto = new PermitOtherServicesValidityDetailsDTO();
		funPoint(vo.getTaxValidTill(), dto::setTaxValidTill);
		funPoint(vo.getTaxAmount(), dto::setTaxAmount);
		funPoint(vo.getFcNumber(), dto::setFcNumber);
		funPoint(vo.getFcValidUpto(), dto::setFcValidUpto);
		funPoint(vo.getPermitnumber(), dto::setPermitnumber);
		funPoint(vo.getPermitValidUpto(), dto::setPermitValidUpto);
		funPoint(vo.getPermitId(), dto::setPermitId);
		funPoint(vo.getSeatingCapacity(), dto::setSeatingCapacity);
		funPoint(vo.getTemporaryPermitNumber(), dto::setTemporaryPermitNumber);
		return dto;
	}

}
