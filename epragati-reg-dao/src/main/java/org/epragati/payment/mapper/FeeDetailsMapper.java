package org.epragati.payment.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.FeeMapper;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.payments.vo.FeeDetailsVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeeDetailsMapper  extends BaseMapper<FeeDetailsDTO, FeeDetailsVO>{

	@Autowired
	private FeeMapper feeMapper;
	
	@Autowired
	private PaymentGatewayTypeMapper PaymentGatewayTypeMapper;
	
	@Override
	public FeeDetailsVO convertEntity(FeeDetailsDTO entry) {
		FeeDetailsVO feeDetailsVO = new FeeDetailsVO();
		if(entry.getFeeDetails() != null)
		{
			feeDetailsVO.setFeeDetails(feeMapper.convertEntity(entry.getFeeDetails()));
		}
		funPoint(entry.getTotalFees(), feeDetailsVO::setTotalFees);
		if(entry.getPaymentGatewayTypeDto() != null)
		{
			feeDetailsVO.setPaymentGatewayTypeVO(PaymentGatewayTypeMapper.convertEntity(entry.getPaymentGatewayTypeDto()));
		}
		
		feeDetailsVO.setPayStatus(entry.getPayStatus());
		feeDetailsVO.setRole(entry.getRole());
		
		return feeDetailsVO;
	}

	@Override
	public FeeDetailsDTO convertVO(FeeDetailsVO vo) {
		FeeDetailsDTO feeDetailsDTO = new FeeDetailsDTO();
		if(vo.getFeeDetails() != null)
		{
			feeDetailsDTO.setFeeDetails(feeMapper.convertVO(vo.getFeeDetails()));
		}
		funPoint(vo.getTotalFees(), feeDetailsDTO::setTotalFees);
		if(vo.getPaymentGatewayTypeVO() != null)
		{
			feeDetailsDTO.setPaymentGatewayTypeDto(PaymentGatewayTypeMapper.convertVO(vo.getPaymentGatewayTypeVO()));
		}
		feeDetailsDTO.setRole(vo.getRole());
		return feeDetailsDTO;
		
	}
	}

