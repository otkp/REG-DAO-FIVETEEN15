package org.epragati.payment.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.BreakPaymentsSaveDTO;
import org.epragati.payments.vo.BreakPaymentsSaveVO;
import org.springframework.stereotype.Component;

@Component
public class BreakPaymentsSaveMapper extends BaseMapper<BreakPaymentsSaveDTO, BreakPaymentsSaveVO> {

	@Override
	public BreakPaymentsSaveVO convertEntity(BreakPaymentsSaveDTO entity) {
		BreakPaymentsSaveVO vo = new BreakPaymentsSaveVO();
		funPoint(entity.getBreakPayments(), vo::setBreakPayments);
		funPoint(entity.getGrandTotalFees(), vo::setGrandTotalFees);
		return vo;
	}
	
	@Override
	public BreakPaymentsSaveDTO convertVO(BreakPaymentsSaveVO vo) {
		
		
		BreakPaymentsSaveDTO dto = new BreakPaymentsSaveDTO();
		funPoint(vo.getBreakPayments(), dto::setBreakPayments);
		funPoint(vo.getGrandTotalFees(), dto::setGrandTotalFees);
		return dto;
	}
}
