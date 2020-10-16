package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.BidConfigMaster;
import org.epragati.sn.vo.BidConfigMasterVO;
import org.springframework.stereotype.Component;

@Component
public class BidConfigMasterMapper extends BaseMapper<BidConfigMaster, BidConfigMasterVO> {

	@Override
	public BidConfigMasterVO convertEntity(BidConfigMaster dto) {
		BidConfigMasterVO vo = new BidConfigMasterVO();
		funPoint(dto.getBidStartTime(), vo::setBidStartTime);
		funPoint(dto.getBidEndTime(), vo::setBidEndTime);
		funPoint(dto.getSpecialNumberRegStartTime(), vo::setSpecialNumberRegStartTime);
		funPoint(dto.getSpecialNumberRegEndTime(), vo::setSpecialNumberRegEndTime);
		funPoint(dto.getConfigStatus(), vo::setConfigStatus);
		funPoint(dto.getBidCloseNotifyTime(), vo::setBidCloseNotifyTime);
		funPoint(dto.getRemarks(), vo::setRemarks);
		
		funPoint(dto.getBidConfigId(), vo::setBidConfigId);
		funPoint(dto.getBidMaxAllowDays(), vo::setBidMaxAllowDays);
		funPoint(dto.getBidMaxIteration(), vo::setBidMaxIteration);
		funPoint(dto.getDateValueToHoliday(), vo::setDateValueToHoliday);
		funPoint(dto.getIpNoToAccesSchedulers(), vo::setIpNoToAccesSchedulers);
		funPoint(dto.getMaxNumbersForDay(), vo::setMaxNumbersForDay);
		funPoint(dto.getNumberGenerationType(), vo::setNumberGenerationType);
		//funPoint(dto.getOldVersionDataConfigDetails(), vo::setOldVersionDataConfigDetails);
		funPoint(dto.getPassCodeResentMaxCount(), vo::setPassCodeResentMaxCount);
		funPoint(dto.getPassCodeResentMinTimeInterVal(), vo::setPassCodeResentMinTimeInterVal);
		funPoint(dto.getSchedulerAuthToken(), vo::setSchedulerAuthToken);
		funPoint(dto.isRunningBidClosingProcess(), vo::setRunningBidClosingProcess);
		funPoint(dto.getTotalNumberForWindow(), vo::setTotalNumberForWindow);
		funPoint(dto.getNumberAssignType(), vo::setNumberAssignType);

		return vo;
	}

}
