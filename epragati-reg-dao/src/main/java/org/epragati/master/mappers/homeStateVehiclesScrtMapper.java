package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.homeStateVehiclesScrtDTO;
import org.epragati.stagecarriageservices.vo.homeStateVehiclesScrtVO;
import org.springframework.stereotype.Component;

@Component
public class homeStateVehiclesScrtMapper extends BaseMapper<homeStateVehiclesScrtDTO, homeStateVehiclesScrtVO> {

	@Override
	public homeStateVehiclesScrtVO convertEntity(homeStateVehiclesScrtDTO dto) {
		homeStateVehiclesScrtVO vo = new homeStateVehiclesScrtVO();
		funPoint(dto.getAnnexureNo(), vo::setAnnexureNo);
		funPoint(dto.getBusType(), vo::setBusType);
		funPoint(dto.getToDestination(), vo::setToDestination);
		funPoint(dto.getFromDistance(), vo::setFromDistance);
		funPoint(dto.getIntermediateRoute(), vo::setIntermediateRoute);
		funPoint(dto.getInterStateGoNo(), vo::setInterStateGoNo);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitType(), vo::setPermitType);
		funPoint(dto.getPermitValidity(), vo::setPermitValidity);
		funPoint(dto.getRegNo(), vo::setRegNo);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getRouteInAnnexure(), vo::setRouteInAnnexure);
		funPoint(dto.getFromSource(), vo::setFromSource);
		funPoint(dto.getTaxAmount(), vo::setTaxAmount);
		funPoint(dto.getTaxPointType(), vo::setTaxPointType);
		funPoint(dto.getToDistance(), vo::setToDistance);
		funPoint(dto.getToState(), vo::setToState);
		funPoint(dto.getTotalDistance(), vo::setTotalDistance);
		funPoint(dto.getType(), vo::setType);
			
		return vo;
	}
	
	@Override
	public homeStateVehiclesScrtDTO convertVO(homeStateVehiclesScrtVO vo) {
		homeStateVehiclesScrtDTO dto = new homeStateVehiclesScrtDTO();
		funPoint(vo.getAnnexureNo(),dto::setAnnexureNo);
		funPoint(vo.getBusType(), dto::setBusType);
		funPoint(vo.getToDestination(), dto::setToDestination);
		funPoint(vo.getFromDistance(), dto::setFromDistance);
		funPoint(vo.getIntermediateRoute(), dto::setIntermediateRoute);
		funPoint(vo.getInterStateGoNo(), dto::setInterStateGoNo);
		funPoint(vo.getPermitNo(), dto::setPermitNo);
		funPoint(vo.getPermitType(), dto::setPermitType);
		funPoint(vo.getPermitValidity(), dto::setPermitValidity);
		funPoint(vo.getRegNo(), dto::setRegNo);
		funPoint(vo.getRemarks(), dto::setRemarks);
		funPoint(vo.getRouteInAnnexure(), dto::setRouteInAnnexure);
		funPoint(vo.getFromSource(), dto::setFromSource);
		funPoint(vo.getTaxAmount(), dto::setTaxAmount);
		funPoint(vo.getTaxPointType(), dto::setTaxPointType);
		funPoint(vo.getToDistance(), dto::setToDistance);
		funPoint(vo.getToState(), dto::setToState);
		funPoint(vo.getTotalDistance(), dto::setTotalDistance);
		funPoint(vo.getType(), dto::setType);
		return dto;
		
	}

}
