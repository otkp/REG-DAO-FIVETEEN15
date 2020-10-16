package org.epragati.master.dto;


import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_state")
public class StateDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String countryId;
	
	private String stateId;
	
	private String stateName;
	
	private String stateStatus;
	
	private boolean allowBiLateralTax;
	
	private String nicStateCode;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the countryId
	 */
	public String getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateStatus
	 */
	public String getStateStatus() {
		return stateStatus;
	}

	/**
	 * @param stateStatus the stateStatus to set
	 */
	public void setStateStatus(String stateStatus) {
		this.stateStatus = stateStatus;
	}


	public boolean isAllowBiLateralTax() {
		return allowBiLateralTax;
	}

	public void setAllowBiLateralTax(boolean allowBiLateralTax) {
		this.allowBiLateralTax = allowBiLateralTax;
	}

	/**
	 * @return the nicStateCode
	 */
	public String getNicStateCode() {
		return nicStateCode;
	}

	/**
	 * @param nicStateCode the nicStateCode to set
	 */
	public void setNicStateCode(String nicStateCode) {
		this.nicStateCode = nicStateCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StateDTO [id=" + id + ", countryId=" + countryId + ", stateId=" + stateId + ", stateName=" + stateName
				+ ", stateStatus=" + stateStatus + "]";
	}
	
}
