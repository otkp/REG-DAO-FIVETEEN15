package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.PermitRouteDetailsMapper;
import org.epragati.master.mappers.PermitUtilizationMapper;
import org.epragati.permits.dto.PermitRouteDetails;
import org.epragati.permits.vo.RouteDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteDetailsMapper extends BaseMapper<PermitRouteDetails, RouteDetailsVO> {

	@Autowired
	private PermitRouteDetailsMapper permitRouteDetailsMapper;

	@Autowired
	private PermitRouteTypeMapper permitRouteTypeMapper;
	@Autowired
	private PermitUtilizationMapper permitUtilizationMapper;

	@Override
	public RouteDetailsVO convertEntity(PermitRouteDetails dto) {
		RouteDetailsVO vo = new RouteDetailsVO();
		if (dto.getPermitRouteDetails() != null) {
			vo.setPermitRouteDetails(permitRouteDetailsMapper.convertEntity(dto.getPermitRouteDetails()));
		}
		funPoint(dto.getValidFromRoute(), vo::setValidFromRoute);
		funPoint(dto.getValidToRoute(), vo::setValidToRoute);
		funPoint(dto.getViaRoute(), vo::setViaRoute);
		funPoint(dto.getFromDistrict(), vo::setFromDistrict);
		funPoint(dto.getToDistrict(), vo::setToDistrict);
		if (dto.getRouteType() != null) {
			vo.setRouteType(permitRouteTypeMapper.convertEntity(dto.getRouteType()));
		}
		funPoint(dto.getForwardRoute(), vo::setForwardRoute);
		funPoint(dto.getReturnRoute(), vo::setReturnRoute);
		funPoint(dto.getForwardRouteDate(), vo::setForwardRouteDate);
		funPoint(dto.getReturnRouteDate(), vo::setReturnRouteDate);
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getNoOfDays(), vo::setNoOfDays);
		funPoint(dto.getProhibitedPlaces(), vo::setProhibitedPlaces);
		funPoint(dto.getNoOfRoundTrips(), vo::setNoOfRoundTrips);
		if(dto.getPermitUtilizationForwardDetails()!=null) {
			vo.setPermitUtilizationForwardDetails(permitUtilizationMapper.convertEntity(dto.getPermitUtilizationForwardDetails()));
		}
		if(dto.getPermitUtilizationReturnDetails()!=null) {
			vo.setPermitUtilizationReturnDetails(permitUtilizationMapper.convertEntity(dto.getPermitUtilizationReturnDetails()));
		}
		funPoint(dto.getNoOfRoundTrips(), vo::setNoOfTripsPerDay);
		funPoint(dto.getDayPerTrip(), vo::setDayPerTrip);
		funPoint(dto.getRouteLength(), vo::setRouteLength);
		return vo;
	}

	@Override
	public PermitRouteDetails convertVO(RouteDetailsVO vo) {
		PermitRouteDetails dto = new PermitRouteDetails();
		if (vo.getPermitRouteDetails() != null) {
			dto.setPermitRouteDetails(permitRouteDetailsMapper.convertVO(vo.getPermitRouteDetails()));
		}
		funPoint(vo.getValidFromRoute(), dto::setValidFromRoute);
		funPoint(vo.getValidToRoute(), dto::setValidToRoute);
		funPoint(vo.getViaRoute(), dto::setViaRoute);
		funPoint(vo.getFromDistrict(), dto::setFromDistrict);
		funPoint(vo.getToDistrict(), dto::setToDistrict);
		if (vo.getRouteType() != null) {
			dto.setRouteType(permitRouteTypeMapper.convertVO(vo.getRouteType()));
		}
		funPoint(vo.getForwardRoute(), dto::setForwardRoute);
		funPoint(vo.getReturnRoute(), dto::setReturnRoute);
		funPoint(vo.getForwardRouteDate(), dto::setForwardRouteDate);
		funPoint(vo.getReturnRouteDate(), dto::setReturnRouteDate);
		funPoint(vo.getState(), dto::setState);
		funPoint(vo.getNoOfDays(), dto::setNoOfDays);
		funPoint(vo.getProhibitedPlaces(), dto::setProhibitedPlaces);
		funPoint(vo.getNoOfRoundTrips(), dto::setNoOfRoundTrips);
		if(vo.getPermitUtilizationForwardDetails()!=null) {
			dto.setPermitUtilizationForwardDetails(permitUtilizationMapper.convertVO(vo.getPermitUtilizationForwardDetails()));
		}
		if(vo.getPermitUtilizationReturnDetails()!=null) {
			dto.setPermitUtilizationReturnDetails(permitUtilizationMapper.convertVO(vo.getPermitUtilizationReturnDetails()));
		}
		funPoint(vo.getNoOfRoundTrips(), dto::setNoOfTripsPerDay);
		funPoint(vo.getDayPerTrip(), dto::setDayPerTrip);
		funPoint(vo.getRouteLength(), dto::setRouteLength);
		return dto;
	}
}
