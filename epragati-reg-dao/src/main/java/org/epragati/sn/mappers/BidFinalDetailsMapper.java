package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.BidFinalDetails;
import org.epragati.sn.vo.BidFinalDetailsVo;
import org.springframework.stereotype.Component;

@Component
public class BidFinalDetailsMapper extends BaseMapper<BidFinalDetails, BidFinalDetailsVo>{

	@Override
	public BidFinalDetailsVo convertEntity(BidFinalDetails dto) {
		
		BidFinalDetailsVo bidFinalDetailsVo =new BidFinalDetailsVo();
		
		funPoint(dto.getBidAmount(), bidFinalDetailsVo::setBidAmount);
		funPoint(dto.getPaymentId(), bidFinalDetailsVo::setPaymentId);
		funPoint(dto.getRefundId(), bidFinalDetailsVo::setRefundId);
		funPoint(dto.getRtaAmount(), bidFinalDetailsVo::setRtaAmount);
		funPoint(dto.getTotalAmount(), bidFinalDetailsVo::setTotalAmount);
		
		return bidFinalDetailsVo;
	}

}
