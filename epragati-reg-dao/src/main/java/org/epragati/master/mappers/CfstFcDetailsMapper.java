package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.vo.CfstFcDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class CfstFcDetailsMapper extends BaseMapper<FcDetailsDTO, CfstFcDetailsVO> {

	@Override
	public CfstFcDetailsVO convertEntity(FcDetailsDTO dto) {

		CfstFcDetailsVO fcDetailsVO = new CfstFcDetailsVO();

		funPoint(dto.getChassisNo(), fcDetailsVO::setChassisNo);
		funPoint(dto.getEngineNo(), fcDetailsVO::setEngineNo);
		funPoint(dto.getFcIssuedDate(), fcDetailsVO::setFcIssuedDate);
		funPoint(dto.getFcNumber(), fcDetailsVO::setFcNumber);
		funPoint(dto.getFcValidUpto(), fcDetailsVO::setFcValidUpto);
		funPoint(dto.getInspectedMviName(), fcDetailsVO::setInspectedMviName);
		funPoint(dto.getOfficeCode(), fcDetailsVO::setOfficeCode);
		funPoint(dto.getOfficeName(), fcDetailsVO::setOfficeName);
		funPoint(dto.getClassOfVehicle(), fcDetailsVO::setClassOfVehicle);
		funPoint(dto.getVehicleNumber(), fcDetailsVO::setVehicleNumber);
		funPoint(dto.getMfgDate(), fcDetailsVO::setMfgDate);
		funPoint(dto.getApplicationNo(), fcDetailsVO::setApplicationNo);
		funPoint(dto.getTrNo(), fcDetailsVO::setTrNo);
		funPoint(dto.getPrNo(), fcDetailsVO::setPrNo);
		funPoint(dto.getInspectedDate(), fcDetailsVO::setInspectedDate);

		return fcDetailsVO;
	}

	

}
