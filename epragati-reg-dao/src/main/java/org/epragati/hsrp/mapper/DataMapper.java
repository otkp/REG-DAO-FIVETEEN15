package org.epragati.hsrp.mapper;

import org.epragati.common.dto.HsrpDetailDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.vo.DataVO;
import org.springframework.stereotype.Component;

@Component
public class DataMapper extends BaseMapper<HsrpDetailDTO, DataVO> {

	@Override
	public DataVO convertEntity(HsrpDetailDTO dto) {

		DataVO dataVO = new DataVO();
		funPoint(dto.getRtoCode(), dataVO::setRtoCode);
		funPoint(dto.getRtoName(), dataVO::setRtoName);
		funPoint(dto.getAffixationCenterCode(), dataVO::setAffixationCenterCode);
		funPoint(dto.getTransactionNo(), dataVO::setTransactionNo);
		// not changed to localdata
		funPoint(dto.getTransactionDate(), dataVO::setTransactionDate);
		funPoint(dto.getAuthorizationRefNo(), dataVO::setAuthorizationRefNo);
		funPoint(dto.getAuthorizationDate(), dataVO::setAuthorizationDate);
		funPoint(dto.getEngineNo(), dataVO::setEngineNo);
		funPoint(dto.getChassisNo(), dataVO::setChassisNo);
		funPoint(dto.getPrNumber(), dataVO::setPrNumber);
		funPoint(dto.getOwnerName(), dataVO::setOwnerName);
		funPoint(dto.getOwnerAddress(), dataVO::setOwnerAddress);
		funPoint(dto.getOwnerEmailId(), dataVO::setOwnerEmailId);
		funPoint(dto.getOwnerPinCode(), dataVO::setOwnerPinCode);
		funPoint(dto.getMobileNo(), dataVO::setMobileNo);
		funPoint(dto.getVehicleType(), dataVO::setVehicleType);
		funPoint(dto.getTransType(), dataVO::setTransType);
		funPoint(dto.getVehicleClassType(), dataVO::setVehicleClassType);
		funPoint(dto.getMfrsName(), dataVO::setMfrsName);
		funPoint(dto.getModelName(), dataVO::setModelName);
		funPoint(dto.getHsrpFee(), dataVO::setHsrpFee);
		funPoint(dto.getOldNewFlag(), dataVO::setOldNewFlag);
		funPoint(dto.getGovtVehicleTag(), dataVO::setGovtVehicleTag);
		funPoint(dto.getTimeStamp(), dataVO::setTimeStamp);
		funPoint(dto.getTrNumber(), dataVO::setTrNumber);
		funPoint(dto.getDealerName(), dataVO::setDealerName);
		funPoint(dto.getDealerMail(), dataVO::setDealerMail);
		funPoint(dto.getDealerRtoCode(), dataVO::setDealerRtoCode);
		funPoint(dto.getRegDate(), dataVO::setRegDate);
		funPoint(dto.getPaymentsId(), dataVO::setPaymentsId);
		//iteration_no need to come
		return dataVO;
	}
	
	@Override
	public HsrpDetailDTO convertVO(DataVO dataVO) {

		HsrpDetailDTO hsrpDetailDTO = new HsrpDetailDTO();
		funPoint(dataVO.getRtoCode(), hsrpDetailDTO::setRtoCode);
		funPoint(dataVO.getRtoName(), hsrpDetailDTO::setRtoName);
		funPoint(dataVO.getAffixationCenterCode(), hsrpDetailDTO::setAffixationCenterCode);
		funPoint(dataVO.getTransactionNo(), hsrpDetailDTO::setTransactionNo);
		// not changed to localdata
		funPoint(dataVO.getTransactionDate(), hsrpDetailDTO::setTransactionDate);
		funPoint(dataVO.getAuthorizationRefNo(), hsrpDetailDTO::setAuthorizationRefNo);
		funPoint(dataVO.getAuthorizationDate(), hsrpDetailDTO::setAuthorizationDate);
		funPoint(dataVO.getEngineNo(), hsrpDetailDTO::setEngineNo);
		funPoint(dataVO.getChassisNo(), hsrpDetailDTO::setChassisNo);
		funPoint(dataVO.getPrNumber(), hsrpDetailDTO::setPrNumber);
		funPoint(dataVO.getOwnerName(), hsrpDetailDTO::setOwnerName);
		funPoint(dataVO.getOwnerAddress(), hsrpDetailDTO::setOwnerAddress);
		funPoint(dataVO.getOwnerEmailId(), hsrpDetailDTO::setOwnerEmailId);
		funPoint(dataVO.getOwnerPinCode(), hsrpDetailDTO::setOwnerPinCode);
		funPoint(dataVO.getMobileNo(), hsrpDetailDTO::setMobileNo);
		funPoint(dataVO.getVehicleType(), hsrpDetailDTO::setVehicleType);
		funPoint(dataVO.getTransType(), hsrpDetailDTO::setTransType);
		funPoint(dataVO.getVehicleClassType(), hsrpDetailDTO::setVehicleClassType);
		funPoint(dataVO.getMfrsName(), hsrpDetailDTO::setMfrsName);
		funPoint(dataVO.getModelName(), hsrpDetailDTO::setModelName);
		funPoint(dataVO.getHsrpFee(), hsrpDetailDTO::setHsrpFee);
		funPoint(dataVO.getOldNewFlag(), hsrpDetailDTO::setOldNewFlag);
		funPoint(dataVO.getGovtVehicleTag(), hsrpDetailDTO::setGovtVehicleTag);
		funPoint(dataVO.getTimeStamp(), hsrpDetailDTO::setTimeStamp);
		funPoint(dataVO.getTrNumber(), hsrpDetailDTO::setTrNumber);
		funPoint(dataVO.getDealerName(), hsrpDetailDTO::setDealerName);
		funPoint(dataVO.getDealerMail(), hsrpDetailDTO::setDealerMail);
		funPoint(dataVO.getDealerRtoCode(), hsrpDetailDTO::setDealerRtoCode);
		funPoint(dataVO.getRegDate(), hsrpDetailDTO::setRegDate);
		funPoint(dataVO.getPaymentsId(), hsrpDetailDTO::setPaymentsId);
		return hsrpDetailDTO;
	}

}
