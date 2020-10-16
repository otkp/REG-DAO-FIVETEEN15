package org.epragati.regservice.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "office_slot_availability")
public class OfficeSlotsAvailabilityDTO extends BaseEntity {

	private Integer noOfDays;

	private Integer perHour;
	
	private Integer noOfHours;

	private Integer moduleId;

	private String officeCode;
	
	private Boolean isActive;

	private int[] allowedReTestDays;

	private List<String> slotsTime;

	private Double isFastFiling;

	/**
	 * @return the noOfDays
	 */
	public Integer getNoOfDays() {
		return noOfDays;
	}

	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}


	/**
	 * @return the perHour
	 */
	public Integer getPerHour() {
		return perHour;
	}

	/**
	 * @param perHour the perHour to set
	 */
	public void setPerHour(Integer perHour) {
		this.perHour = perHour;
	}

	/**
	 * @return the moduleId
	 */
	public Integer getModuleId() {
		return moduleId;
	}

	/**
	 * @param moduleId the moduleId to set
	 */
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}


	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the allowedReTestDays
	 */
	public int[] getAllowedReTestDays() {
		return allowedReTestDays;
	}

	/**
	 * @param allowedReTestDays the allowedReTestDays to set
	 */
	public void setAllowedReTestDays(int[] allowedReTestDays) {
		this.allowedReTestDays = allowedReTestDays;
	}

	/**
	 * @return the slotsTime
	 */
	public List<String> getSlotsTime() {
		return slotsTime;
	}

	/**
	 * @param slotsTime the slotsTime to set
	 */
	public void setSlotsTime(List<String> slotsTime) {
		this.slotsTime = slotsTime;
	}

	/**
	 * @return the isFastFiling
	 */
	public Double getIsFastFiling() {
		return isFastFiling;
	}

	/**
	 * @param isFastFiling the isFastFiling to set
	 */
	public void setIsFastFiling(Double isFastFiling) {
		this.isFastFiling = isFastFiling;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the noOfHours
	 */
	public Integer getNoOfHours() {
		return noOfHours;
	}

	/**
	 * @param noOfHours the noOfHours to set
	 */
	public void setNoOfHours(Integer noOfHours) {
		this.noOfHours = noOfHours;
	}	
	
}