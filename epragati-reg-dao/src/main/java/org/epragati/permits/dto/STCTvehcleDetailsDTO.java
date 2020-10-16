package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;

public class STCTvehcleDetailsDTO  extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Boolean isHiredwithAPSRTC;
	
	private String coordinatorName;
	
	private String coordinatorAddress;

	/**
	 * @return the isHiredwithAPSRTC
	 */
	public Boolean getIsHiredwithAPSRTC() {
		return isHiredwithAPSRTC;
	}

	/**
	 * @param isHiredwithAPSRTC the isHiredwithAPSRTC to set
	 */
	public void setIsHiredwithAPSRTC(Boolean isHiredwithAPSRTC) {
		this.isHiredwithAPSRTC = isHiredwithAPSRTC;
	}

	/**
	 * @return the coordinatorName
	 */
	public String getCoordinatorName() {
		return coordinatorName;
	}

	/**
	 * @param coordinatorName the coordinatorName to set
	 */
	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	/**
	 * @return the coordinatorAddress
	 */
	public String getCoordinatorAddress() {
		return coordinatorAddress;
	}

	/**
	 * @param coordinatorAddress the coordinatorAddress to set
	 */
	public void setCoordinatorAddress(String coordinatorAddress) {
		this.coordinatorAddress = coordinatorAddress;
	}
	
}
