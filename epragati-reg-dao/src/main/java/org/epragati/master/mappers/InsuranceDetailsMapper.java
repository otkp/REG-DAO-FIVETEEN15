package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.InsuranceDetailsDTO;
import org.epragati.master.vo.InsuranceDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class InsuranceDetailsMapper extends BaseMapper<InsuranceDetailsDTO, InsuranceDetailsVO> {

	@Override
	public InsuranceDetailsVO convertEntity(InsuranceDetailsDTO dto) {
		InsuranceDetailsVO insuranceDetailsVO = new InsuranceDetailsVO();
		funPoint(dto.getCompany(), insuranceDetailsVO::setCompany);
		funPoint(dto.getId(), insuranceDetailsVO::setId);
		funPoint(dto.getPolicyNumber(), insuranceDetailsVO::setPolicyNumber);
		funPoint(dto.getPolicyType(), insuranceDetailsVO::setPolicyType);
		funPoint(dto.getTenure(), insuranceDetailsVO::setTenure);
		funPoint(dto.getValidTill(), insuranceDetailsVO::setValidTill);
		funPoint(dto.getValidFrom(), insuranceDetailsVO::setValidFrom);
		funPoint(dto.getValidTillForOther(), insuranceDetailsVO::setValidTillForOther);
		funPoint(dto.getValidFromForOther(), insuranceDetailsVO::setValidFromForOther);
		return insuranceDetailsVO;
	}

	public InsuranceDetailsVO dashBoardLimitedFields(InsuranceDetailsDTO dto) {
		InsuranceDetailsVO insuranceDetailsVO = new InsuranceDetailsVO();
		funPoint(dto.getCompany(), insuranceDetailsVO::setCompany);
		return insuranceDetailsVO;
		
	}
	@Override
	public InsuranceDetailsDTO convertVO(InsuranceDetailsVO vo) {
		InsuranceDetailsDTO insuranceDetailsDTO = new InsuranceDetailsDTO();
		funPoint(vo.getCompany(), insuranceDetailsDTO::setCompany);
		funPoint(vo.getId(), insuranceDetailsDTO::setId);
		funPoint(vo.getPolicyNumber(), insuranceDetailsDTO::setPolicyNumber);
		funPoint(vo.getPolicyType(), insuranceDetailsDTO::setPolicyType);
		funPoint(vo.getTenure(), insuranceDetailsDTO::setTenure);
		funPoint(vo.getValidTill(), insuranceDetailsDTO::setValidTill);
		funPoint(vo.getValidFrom(), insuranceDetailsDTO::setValidFrom);
		funPoint(vo.getValidTillForOther(), insuranceDetailsDTO::setValidTillForOther);
		funPoint(vo.getValidFromForOther(), insuranceDetailsDTO::setValidFromForOther);
		return insuranceDetailsDTO;
	}

}
