package org.epragati.payment.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.PaymentTransactionDTO;
import org.epragati.sn.vo.SPNumberPaymentDetailsVO;
import org.epragati.util.payment.GatewayTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class PaymentTransactionMapper extends BaseMapper<PaymentTransactionDTO, SPNumberPaymentDetailsVO>{

	@Override
	public SPNumberPaymentDetailsVO convertEntity(PaymentTransactionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public SPNumberPaymentDetailsVO converLimitedFieldsOfPaymentForSpNumber(
			PaymentTransactionDTO paymentTransactionDTO) {
		
		SPNumberPaymentDetailsVO sPNumberPaymentDetailsVO = new SPNumberPaymentDetailsVO();
		funPoint(paymentTransactionDTO.getRequest().getRequestTime(), sPNumberPaymentDetailsVO::setPaymentDate);
		funPoint(paymentTransactionDTO.getTransactioNo(), sPNumberPaymentDetailsVO::setTransactioNo);
		
		if(paymentTransactionDTO.getPaymentGatewayType() != null){
			GatewayTypeEnum gateway = GatewayTypeEnum.getGatewayTypeEnumById(paymentTransactionDTO.getPaymentGatewayType());
			sPNumberPaymentDetailsVO.setGateWayType(gateway.getDescription());
		}
		
		funPoint(paymentTransactionDTO.getResponse().getResponseTime(), sPNumberPaymentDetailsVO::setResponceDate);
		funPoint(paymentTransactionDTO.getPayStatus(), sPNumberPaymentDetailsVO::setStatus);
		funPoint(paymentTransactionDTO.getResponse().getBankTransactionRefNum(), sPNumberPaymentDetailsVO::setBankRefNumber);
		return sPNumberPaymentDetailsVO;
	}

}
