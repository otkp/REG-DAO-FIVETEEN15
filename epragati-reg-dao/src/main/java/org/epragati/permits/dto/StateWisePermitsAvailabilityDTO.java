package org.epragati.permits.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Document(collection = "permits_statewise_availability")
public class StateWisePermitsAvailabilityDTO {

	@Id
	private String id;

	private String stateName;

	private String stateId;

	private Integer totalPermits;

	private Integer issuedPermits;

	private Integer remainingPermits;

	private Integer year;

	private Boolean status;

	private Boolean isRecommendation;

	private Boolean isCounterSignature;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName
	 *            the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId
	 *            the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the totalPermits
	 */
	public Integer getTotalPermits() {
		return totalPermits;
	}

	/**
	 * @param totalPermits
	 *            the totalPermits to set
	 */
	public void setTotalPermits(Integer totalPermits) {
		this.totalPermits = totalPermits;
	}

	/**
	 * @return the issuedPermits
	 */
	public Integer getIssuedPermits() {
		return issuedPermits;
	}

	/**
	 * @param issuedPermits the issuedPermits to set
	 */
	public void setIssuedPermits(Integer issuedPermits) {
		this.issuedPermits = issuedPermits;
	}

	/**
	 * @return the remainingPermits
	 */
	public Integer getRemainingPermits() {
		return remainingPermits;
	}

	/**
	 * @param remainingPermits
	 *            the remainingPermits to set
	 */
	public void setRemainingPermits(Integer remainingPermits) {
		this.remainingPermits = remainingPermits;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the isRecommendation
	 */
	public Boolean getIsRecommendation() {
		return isRecommendation;
	}

	/**
	 * @param isRecommendation
	 *            the isRecommendation to set
	 */
	public void setIsRecommendation(Boolean isRecommendation) {
		this.isRecommendation = isRecommendation;
	}

	/**
	 * @return the isCounterSignature
	 */
	public Boolean getIsCounterSignature() {
		return isCounterSignature;
	}

	/**
	 * @param isCounterSignature
	 *            the isCounterSignature to set
	 */
	public void setIsCounterSignature(Boolean isCounterSignature) {
		this.isCounterSignature = isCounterSignature;
	}

}
