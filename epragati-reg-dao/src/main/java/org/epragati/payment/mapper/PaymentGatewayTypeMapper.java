package org.epragati.payment.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.PaymentGatewayTypeDTO;
import org.epragati.payments.vo.PaymentGatewayTypeVO;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayTypeMapper extends BaseMapper<PaymentGatewayTypeDTO, PaymentGatewayTypeVO>{

	@Override
	public PaymentGatewayTypeVO convertEntity(PaymentGatewayTypeDTO entry) {
		PaymentGatewayTypeVO paymentGatewayTypeVO = new PaymentGatewayTypeVO();
		funPoint(entry.getId(), paymentGatewayTypeVO :: setId);
		funPoint(entry.getName(), paymentGatewayTypeVO::setName);
		funPoint(entry.getGatewayTypeEnum(), paymentGatewayTypeVO::setGatewayTypeEnum);
		return paymentGatewayTypeVO;
	}

	@Override
	public PaymentGatewayTypeDTO convertVO(PaymentGatewayTypeVO vo) {
		PaymentGatewayTypeDTO paymentGatewayTypeDTO = new PaymentGatewayTypeDTO();
		funPoint(vo.getId(), paymentGatewayTypeDTO::setId);
		funPoint(vo.getName(), paymentGatewayTypeDTO::setName);
		funPoint(vo.getGatewayTypeEnum(), paymentGatewayTypeDTO::setGatewayTypeEnum);
				
		return paymentGatewayTypeDTO;
		
	}
}
