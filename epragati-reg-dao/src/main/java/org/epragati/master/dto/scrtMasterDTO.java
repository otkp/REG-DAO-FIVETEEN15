package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_home_state_scrt")
public class scrtMasterDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String regNo;

	private String interStateGoNo;

	private String annexureNo;

	private int routeInAnnexure;
	
	private int minBusesPerDay;
	
	private int maxBusesPerDay;
	
	private int minTripsPerDay;
	
	private int maxTripsPerDay;

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
	 * @return the minBusesPerDay
	 */
	public int getMinBusesPerDay() {
		return minBusesPerDay;
	}

	/**
	 * @param minBusesPerDay the minBusesPerDay to set
	 */
	public void setMinBusesPerDay(int minBusesPerDay) {
		this.minBusesPerDay = minBusesPerDay;
	}

	/**
	 * @return the maxBusesPerDay
	 */
	public int getMaxBusesPerDay() {
		return maxBusesPerDay;
	}

	/**
	 * @param maxBusesPerDay the maxBusesPerDay to set
	 */
	public void setMaxBusesPerDay(int maxBusesPerDay) {
		this.maxBusesPerDay = maxBusesPerDay;
	}

	/**
	 * @return the minTripsPerDay
	 */
	public int getMinTripsPerDay() {
		return minTripsPerDay;
	}

	/**
	 * @param minTripsPerDay the minTripsPerDay to set
	 */
	public void setMinTripsPerDay(int minTripsPerDay) {
		this.minTripsPerDay = minTripsPerDay;
	}

	/**
	 * @return the maxTripsPerDay
	 */
	public int getMaxTripsPerDay() {
		return maxTripsPerDay;
	}

	/**
	 * @param maxTripsPerDay the maxTripsPerDay to set
	 */
	public void setMaxTripsPerDay(int maxTripsPerDay) {
		this.maxTripsPerDay = maxTripsPerDay;
	}

	
}
