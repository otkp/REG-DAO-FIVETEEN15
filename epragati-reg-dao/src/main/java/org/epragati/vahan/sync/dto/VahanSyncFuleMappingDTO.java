package org.epragati.vahan.sync.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="master_nic_fuel_validations")
public class VahanSyncFuleMappingDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fuelType;
	
	private Integer fuelCode;
	
	private Boolean status;

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return the fuelCode
	 */
	public Integer getFuelCode() {
		return fuelCode;
	}

	/**
	 * @param fuelCode the fuelCode to set
	 */
	public void setFuelCode(Integer fuelCode) {
		this.fuelCode = fuelCode;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
}
