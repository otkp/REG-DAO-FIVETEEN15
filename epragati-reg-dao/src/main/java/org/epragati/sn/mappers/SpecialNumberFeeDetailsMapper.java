package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.SpecialNumberFeeDetails;
import org.epragati.sn.vo.SpecialNumberFeeDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpecialNumberFeeDetailsMapper extends BaseMapper<SpecialNumberFeeDetails, SpecialNumberFeeDetailsVo> {
	
	@Autowired
	private BidFeeMasterMapper bidFeeMasterMapper;

	@Override
	public SpecialNumberFeeDetailsVo convertEntity(SpecialNumberFeeDetails dto) {

		SpecialNumberFeeDetailsVo specialNumberFeeDetailsVo = new SpecialNumberFeeDetailsVo();

		funPoint(dto.getPaymentId(), specialNumberFeeDetailsVo::setPaymentId);
		funPoint(dto.getRefundId(), specialNumberFeeDetailsVo::setRefundId);
		funPoint(dto.getTotalAmount(), specialNumberFeeDetailsVo::setTotalAmount);
		funPoint(dto.getApplicationAmount(), specialNumberFeeDetailsVo::setApplicationAmount);
		
		
		if(dto.getBidFeeMaster() != null){
			
			specialNumberFeeDetailsVo.setBidFeeMaster(bidFeeMasterMapper.convertEntity(dto.getBidFeeMaster()));
		}

		return specialNumberFeeDetailsVo;
	}

}
