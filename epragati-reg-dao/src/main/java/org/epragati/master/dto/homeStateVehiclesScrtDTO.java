package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "home_state_vehicles_scrt")
public class homeStateVehiclesScrtDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String regNo;
	
	private String interStateGoNo;
	
	private String annexureNo;
	
	private int routeInAnnexure;

	private String toState;
	
	private String fromSource;
	
	private List<String> intermediateRoute;
	
	private String toDestination;
	
	private long fromDistance;
	
	private long toDistance;
	
	private long totalDistance;
	
	private String type;
	
	private String busType;
	
	private String permitType;
	
	private String permitNo;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	
	private String taxPointType;
	
	private long taxAmount;
	
	

	
	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}

	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	/**
	 * @return the interStateGoNo
	 */
	public String getInterStateGoNo() {
		return interStateGoNo;
	}

	/**
	 * @param interStateGoNo the interStateGoNo to set
	 */
	public void setInterStateGoNo(String interStateGoNo) {
		this.interStateGoNo = interStateGoNo;
	}

	/**
	 * @return the annexureNo
	 */
	public String getAnnexureNo() {
		return annexureNo;
	}

	/**
	 * @param annexureNo the annexureNo to set
	 */
	public void setAnnexureNo(String annexureNo) {
		this.annexureNo = annexureNo;
	}

	/**
	 * @return the routeInAnnexure
	 */
	public int getRouteInAnnexure() {
		return routeInAnnexure;
	}

	/**
	 * @param routeInAnnexure the routeInAnnexure to set
	 */
	public void setRouteInAnnexure(int routeInAnnexure) {
		this.routeInAnnexure = routeInAnnexure;
	}

	/**
	 * @return the toState
	 */
	public String getToState() {
		return toState;
	}

	/**
	 * @param toState the toState to set
	 */
	public void setToState(String toState) {
		this.toState = toState;
	}

	
	/**
	 * @return the intermediateRoute
	 */
	public List<String> getIntermediateRoute() {
		return intermediateRoute;
	}

	/**
	 * @param intermediateRoute the intermediateRoute to set
	 */
	public void setIntermediateRoute(List<String> intermediateRoute) {
		this.intermediateRoute = intermediateRoute;
	}

	

	

	/**
	 * @return the fromSource
	 */
	public String getFromSource() {
		return fromSource;
	}

	/**
	 * @param fromSource the fromSource to set
	 */
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}

	/**
	 * @return the toDestination
	 */
	public String getToDestination() {
		return toDestination;
	}

	/**
	 * @param toDestination the toDestination to set
	 */
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}

	/**
	 * @return the fromDistance
	 */
	public long getFromDistance() {
		return fromDistance;
	}

	/**
	 * @param fromDistance the fromDistance to set
	 */
	public void setFromDistance(long fromDistance) {
		this.fromDistance = fromDistance;
	}

	/**
	 * @return the toDistance
	 */
	public long getToDistance() {
		return toDistance;
	}

	/**
	 * @param toDistance the toDistance to set
	 */
	public void setToDistance(long toDistance) {
		this.toDistance = toDistance;
	}

	/**
	 * @return the totalDistance
	 */
	public long getTotalDistance() {
		return totalDistance;
	}

	/**
	 * @param totalDistance the totalDistance to set
	 */
	public void setTotalDistance(long totalDistance) {
		this.totalDistance = totalDistance;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the busType
	 */
	public String getBusType() {
		return busType;
	}

	/**
	 * @param busType the busType to set
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the permitValidity
	 */
	public LocalDate getPermitValidity() {
		return permitValidity;
	}

	/**
	 * @param permitValidity the permitValidity to set
	 */
	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}

	/**
	 * @return the taxPointType
	 */
	public String getTaxPointType() {
		return taxPointType;
	}

	/**
	 * @param taxPointType the taxPointType to set
	 */
	public void setTaxPointType(String taxPointType) {
		this.taxPointType = taxPointType;
	}

	/**
	 * @return the taxAmount
	 */
	public long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(long taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	 
	
	
	
	
	

}
