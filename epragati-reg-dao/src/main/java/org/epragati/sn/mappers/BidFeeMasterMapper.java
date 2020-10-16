package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.BidFeeMaster;
import org.epragati.sn.vo.BidFeeMasterVO;
import org.springframework.stereotype.Component;

@Component
public class BidFeeMasterMapper extends BaseMapper<BidFeeMaster, BidFeeMasterVO>{

	@Override
	public BidFeeMasterVO convertEntity(BidFeeMaster dto) {
		
		BidFeeMasterVO bidFeeMasterVO = new BidFeeMasterVO();
		
		funPoint(dto.getBidFeeId(), bidFeeMasterVO::setBidFeeId);
		funPoint(dto.getBidMinIncrementAmount(), bidFeeMasterVO::setBidMinIncrementAmount);
		funPoint(dto.getCovCategoryGroupId(), bidFeeMasterVO::setCovCategoryGroupId);
		funPoint(dto.getSpecialNumFee(), bidFeeMasterVO::setSpecialNumFee);
		funPoint(dto.getRtaBidFee(), bidFeeMasterVO::setRtaBidFee);
		funPoint(dto.getBidCloseNotifyTime(), bidFeeMasterVO::setBidCloseNotifyTime);
		funPoint(dto.getBidFeeStatus(), bidFeeMasterVO::setBidFeeStatus);
		funPoint(dto.getRemarks(), bidFeeMasterVO::setRemarks);
		
		return bidFeeMasterVO;
	}

}
