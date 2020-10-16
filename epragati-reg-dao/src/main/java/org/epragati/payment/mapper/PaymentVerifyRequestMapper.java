package org.epragati.payment.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.PaymentVerifyRequestDTO;
import org.epragati.payments.vo.PaymentVerifyRequest;
import org.springframework.stereotype.Component;

@Component
public class PaymentVerifyRequestMapper extends BaseMapper<PaymentVerifyRequestDTO, PaymentVerifyRequest>{

	@Override
	public PaymentVerifyRequest convertEntity(PaymentVerifyRequestDTO dto) {
		PaymentVerifyRequest vo = new PaymentVerifyRequest();
		funPoint(dto.getPayUReqParameters(), vo::setPayUReqParameters);
		return vo;
	}
	@Override
	public PaymentVerifyRequestDTO convertVO(PaymentVerifyRequest vo) {
		PaymentVerifyRequestDTO dto = new PaymentVerifyRequestDTO();
		funPoint(vo.getPayUReqParameters(), dto::setPayUReqParameters);
		return dto;
	}

}
