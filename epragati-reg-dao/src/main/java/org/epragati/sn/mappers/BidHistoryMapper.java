package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.BidHistory;
import org.epragati.sn.vo.BidHistoryVo;
import org.springframework.stereotype.Component;

@Component
public class BidHistoryMapper extends BaseMapper<BidHistory, BidHistoryVo> {

	@Override
	public BidHistoryVo convertEntity(BidHistory dto) {

		BidHistoryVo bidHistoryVo = new BidHistoryVo();

		funPoint(dto.getBidAmount(), bidHistoryVo::setBidAmount);
		funPoint(dto.getCreatedDatetime(), bidHistoryVo::setCreatedDatetime);
		funPoint(dto.getIsFinalBid(), bidHistoryVo::setIsFinalBid);
		funPoint(dto.getRemarks(), bidHistoryVo::setRemarks);
		funPoint(dto.getSecBidAmount(), bidHistoryVo::setSecBidAmount);

		return bidHistoryVo;
	}

}
