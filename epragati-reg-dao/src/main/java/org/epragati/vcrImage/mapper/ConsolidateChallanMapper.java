package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.ConsolidateChallanVO;
import org.epragati.vcrImage.dto.ConsolidateChallanDTO;
import org.springframework.stereotype.Service;

@Service
public class ConsolidateChallanMapper extends BaseMapper<ConsolidateChallanDTO, ConsolidateChallanVO> {

	@Override
	public ConsolidateChallanVO convertEntity(ConsolidateChallanDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsolidateChallanDTO convertVO(ConsolidateChallanVO vo) {
		ConsolidateChallanDTO dto = new ConsolidateChallanDTO();
		funPoint(vo.getCompoundFee(), dto::setCompoundFee);
		funPoint(vo.getLifeTax(), dto::setLifeTax);
		funPoint(vo.getMviName(), dto::setMviName);
		funPoint(vo.getPermitFee(), dto::setPermitFee);
		funPoint(vo.getQuarterlyTax(), dto::setQuarterlyTax);
		funPoint(vo.getServiceFee(), dto::setServiceFee);
		funPoint(vo.getType(), dto::setType);
		funPoint(vo.getVcrBookedDate(), dto::setVcrBookedDate);
		funPoint(vo.getVcrNo(), dto::setVcrNo);
		return dto;
	}
}