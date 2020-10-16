package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FcDetailsDTO;
import org.epragati.master.dto.StagingFcDetailsDTO;
import org.epragati.master.vo.FcDetailsVO;
import org.epragati.vcr.vo.ValidityDetailsVo;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class FcDetailsMapper extends BaseMapper<FcDetailsDTO, FcDetailsVO> {

	@Override
	public FcDetailsVO convertEntity(FcDetailsDTO dto) {

		FcDetailsVO fcDetailsVO = new FcDetailsVO();

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
		funPoint(dto.getInspectedMviOfficeName(), fcDetailsVO::setInspectedMviOfficeName);

		return fcDetailsVO;
	}

	@Override
	public FcDetailsDTO convertVO(FcDetailsVO fcDetailsVO) {

		FcDetailsDTO dto = new FcDetailsDTO();

		funPoint(fcDetailsVO.getChassisNo(), dto::setChassisNo);
		funPoint(fcDetailsVO.getEngineNo(), dto::setEngineNo);
		funPoint(fcDetailsVO.getFcIssuedDate(), dto::setFcIssuedDate);
		funPoint(fcDetailsVO.getFcNumber(), dto::setFcNumber);
		funPoint(fcDetailsVO.getFcValidUpto(), dto::setFcValidUpto);
		funPoint(fcDetailsVO.getInspectedMviName(), dto::setInspectedMviName);
		funPoint(fcDetailsVO.getOfficeCode(), dto::setOfficeCode);
		funPoint(fcDetailsVO.getOfficeName(), dto::setOfficeName);
		funPoint(fcDetailsVO.getClassOfVehicle(), dto::setClassOfVehicle);
		funPoint(fcDetailsVO.getVehicleNumber(), dto::setVehicleNumber);
		funPoint(fcDetailsVO.getMfgDate(), dto::setMfgDate);
		funPoint(fcDetailsVO.getInspectedMviOfficeName(), dto::setInspectedMviOfficeName);

		return dto;

	}

	public FcDetailsDTO convertStageEntity(StagingFcDetailsDTO dto) {

		FcDetailsDTO fcDetailsVO = new FcDetailsDTO();

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

	public ValidityDetailsVo convertFcDetailsToValidityDetails(FcDetailsDTO dto) {
		ValidityDetailsVo vo = new ValidityDetailsVo();
		funPoint(dto.getFcNumber(), vo::setFcNumber);
		funPoint(dto.getFcValidUpto(), vo::setFcTo);
		funPoint(dto.getFcvalidfrom(), vo::setFcFrom);
		vo.setFcIssuedDate(dto.getFcIssuedDate());
		return vo;
	}

}
