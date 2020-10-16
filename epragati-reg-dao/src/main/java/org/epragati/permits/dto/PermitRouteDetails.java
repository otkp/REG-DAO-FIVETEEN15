package org.epragati.permits.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PermitRouteDetails extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PermitRouteDetailsDTO permitRouteDetails;

	private String validFromRoute;

	private String validToRoute;

	private String fromDistrict;

	private String toDistrict;

	private String viaRoute;

	private String state;

	private PermitRouteTypeDTO routeType;

	private String forwardRoute;

	private String returnRoute;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate forwardRouteDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate returnRouteDate;

	private String noOfDays;

	private String prohibitedPlaces;
	
	private Integer noOfRoundTrips;
	
	private List<PermitUtilizationDTO> permitUtilizationForwardDetails;
	private List<PermitUtilizationDTO> permitUtilizationReturnDetails;
	
	private Integer noOfTripsPerDay;

	private Integer dayPerTrip;

	private Integer routeLength;

	/**
	 * @return the permitRouteDetails
	 */
	public PermitRouteDetailsDTO getPermitRouteDetails() {
		return permitRouteDetails;
	}

	/**
	 * @param permitRouteDetails the permitRouteDetails to set
	 */
	public void setPermitRouteDetails(PermitRouteDetailsDTO permitRouteDetails) {
		this.permitRouteDetails = permitRouteDetails;
	}

	/**
	 * @return the validFromRoute
	 */
	public String getValidFromRoute() {
		return validFromRoute;
	}

	/**
	 * @param validFromRoute the validFromRoute to set
	 */
	public void setValidFromRoute(String validFromRoute) {
		this.validFromRoute = validFromRoute;
	}

	/**
	 * @return the validToRoute
	 */
	public String getValidToRoute() {
		return validToRoute;
	}

	/**
	 * @param validToRoute the validToRoute to set
	 */
	public void setValidToRoute(String validToRoute) {
		this.validToRoute = validToRoute;
	}

	/**
	 * @return the fromDistrict
	 */
	public String getFromDistrict() {
		return fromDistrict;
	}

	/**
	 * @param fromDistrict the fromDistrict to set
	 */
	public void setFromDistrict(String fromDistrict) {
		this.fromDistrict = fromDistrict;
	}

	/**
	 * @return the toDistrict
	 */
	public String getToDistrict() {
		return toDistrict;
	}

	/**
	 * @param toDistrict the toDistrict to set
	 */
	public void setToDistrict(String toDistrict) {
		this.toDistrict = toDistrict;
	}

	/**
	 * @return the viaRoute
	 */
	public String getViaRoute() {
		return viaRoute;
	}

	/**
	 * @param viaRoute the viaRoute to set
	 */
	public void setViaRoute(String viaRoute) {
		this.viaRoute = viaRoute;
	}

	/**
	 * @return the routeType
	 */
	public PermitRouteTypeDTO getRouteType() {
		return routeType;
	}

	/**
	 * @param routeType the routeType to set
	 */
	public void setRouteType(PermitRouteTypeDTO routeType) {
		this.routeType = routeType;
	}

	/**
	 * @return the forwardRoute
	 */
	public String getForwardRoute() {
		return forwardRoute;
	}

	/**
	 * @param forwardRoute the forwardRoute to set
	 */
	public void setForwardRoute(String forwardRoute) {
		this.forwardRoute = forwardRoute;
	}

	/**
	 * @return the returnRoute
	 */
	public String getReturnRoute() {
		return returnRoute;
	}

	/**
	 * @param returnRoute the returnRoute to set
	 */
	public void setReturnRoute(String returnRoute) {
		this.returnRoute = returnRoute;
	}

	/**
	 * @return the forwardRouteDate
	 */
	public LocalDate getForwardRouteDate() {
		return forwardRouteDate;
	}

	/**
	 * @param forwardRouteDate the forwardRouteDate to set
	 */
	public void setForwardRouteDate(LocalDate forwardRouteDate) {
		this.forwardRouteDate = forwardRouteDate;
	}

	/**
	 * @return the returnRouteDate
	 */
	public LocalDate getReturnRouteDate() {
		return returnRouteDate;
	}

	/**
	 * @param returnRouteDate the returnRouteDate to set
	 */
	public void setReturnRouteDate(LocalDate returnRouteDate) {
		this.returnRouteDate = returnRouteDate;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the noOfDays
	 */
	public String getNoOfDays() {
		return noOfDays;
	}

	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	/**
	 * @return the prohibitedPlaces
	 */
	public String getProhibitedPlaces() {
		return prohibitedPlaces;
	}

	/**
	 * @param prohibitedPlaces the prohibitedPlaces to set
	 */
	public void setProhibitedPlaces(String prohibitedPlaces) {
		this.prohibitedPlaces = prohibitedPlaces;
	}

	public Integer getNoOfRoundTrips() {
		return noOfRoundTrips;
	}

	public void setNoOfRoundTrips(Integer noOfRoundTrips) {
		this.noOfRoundTrips = noOfRoundTrips;
	}

	public List<PermitUtilizationDTO> getPermitUtilizationForwardDetails() {
		return permitUtilizationForwardDetails;
	}

	public void setPermitUtilizationForwardDetails(List<PermitUtilizationDTO> permitUtilizationForwardDetails) {
		this.permitUtilizationForwardDetails = permitUtilizationForwardDetails;
	}

	public List<PermitUtilizationDTO> getPermitUtilizationReturnDetails() {
		return permitUtilizationReturnDetails;
	}

	public void setPermitUtilizationReturnDetails(List<PermitUtilizationDTO> permitUtilizationReturnDetails) {
		this.permitUtilizationReturnDetails = permitUtilizationReturnDetails;
	}

	/**
	 * @return the noOfTripsPerDay
	 */
	public Integer getNoOfTripsPerDay() {
		return noOfTripsPerDay;
	}

	/**
	 * @param noOfTripsPerDay the noOfTripsPerDay to set
	 */
	public void setNoOfTripsPerDay(Integer noOfTripsPerDay) {
		this.noOfTripsPerDay = noOfTripsPerDay;
	}

	/**
	 * @return the dayPerTrip
	 */
	public Integer getDayPerTrip() {
		return dayPerTrip;
	}

	/**
	 * @param dayPerTrip the dayPerTrip to set
	 */
	public void setDayPerTrip(Integer dayPerTrip) {
		this.dayPerTrip = dayPerTrip;
	}

	/**
	 * @return the routeLength
	 */
	public Integer getRouteLength() {
		return routeLength;
	}

	/**
	 * @param routeLength the routeLength to set
	 */
	public void setRouteLength(Integer routeLength) {
		this.routeLength = routeLength;
	}

	
}
