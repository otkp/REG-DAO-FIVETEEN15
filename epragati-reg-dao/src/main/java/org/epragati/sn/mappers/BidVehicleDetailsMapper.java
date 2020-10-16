package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.BidVehicleDetails;
import org.epragati.sn.vo.BidVehicleDetailsVo;
import org.springframework.stereotype.Component;

@Component
public class BidVehicleDetailsMapper extends BaseMapper<BidVehicleDetails, BidVehicleDetailsVo> {

	@Override
	public BidVehicleDetailsVo convertEntity(BidVehicleDetails dto) {

		BidVehicleDetailsVo bidVehicleDetailsVo = new BidVehicleDetailsVo();
		
		funPoint(dto.getBidNumberDtlsId(), bidVehicleDetailsVo::setBidNumberDtlsId);
		funPoint(dto.getBiddingVehicleNumber(), bidVehicleDetailsVo::setBiddingVehicleNumber);
		funPoint(dto.getBidLeftAccepted(), bidVehicleDetailsVo::setBidLeftAccepted);
		funPoint(dto.getAllocatedBidNumberType(), bidVehicleDetailsVo::setAllocatedBidNumberType);
		funPoint(dto.getRemarks(), bidVehicleDetailsVo::setRemarks);

		return bidVehicleDetailsVo;
	}

}
