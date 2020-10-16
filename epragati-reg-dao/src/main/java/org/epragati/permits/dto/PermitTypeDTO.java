package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_permit_type")
public class PermitTypeDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String description;

	private String permitType;

	private Boolean status;

	private String typeofPermit;
	
	private String validityUnit;
	
	private Integer validityPeriod;
	
	private String renewalUnit;
	
	private Integer renewalPeriod;
	
	private boolean authorization;
	
	private String numberCode;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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

	/**
	 * @return the typeofPermit
	 */
	public String getTypeofPermit() {
		return typeofPermit;
	}

	/**
	 * @param typeofPermit the typeofPermit to set
	 */
	public void setTypeofPermit(String typeofPermit) {
		this.typeofPermit = typeofPermit;
	}

	/**
	 * @return the validityUnit
	 */
	public String getValidityUnit() {
		return validityUnit;
	}

	/**
	 * @param validityUnit the validityUnit to set
	 */
	public void setValidityUnit(String validityUnit) {
		this.validityUnit = validityUnit;
	}

	/**
	 * @return the validityPeriod
	 */
	public Integer getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * @param validityPeriod the validityPeriod to set
	 */
	public void setValidityPeriod(Integer validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	/**
	 * @return the renewalUnit
	 */
	public String getRenewalUnit() {
		return renewalUnit;
	}

	/**
	 * @param renewalUnit the renewalUnit to set
	 */
	public void setRenewalUnit(String renewalUnit) {
		this.renewalUnit = renewalUnit;
	}

	/**
	 * @return the renewalPeriod
	 */
	public Integer getRenewalPeriod() {
		return renewalPeriod;
	}

	/**
	 * @param renewalPeriod the renewalPeriod to set
	 */
	public void setRenewalPeriod(Integer renewalPeriod) {
		this.renewalPeriod = renewalPeriod;
	}

	/**
	 * @return the authorization
	 */
	public boolean isAuthorization() {
		return authorization;
	}

	/**
	 * @param authorization the authorization to set
	 */
	public void setAuthorization(boolean authorization) {
		this.authorization = authorization;
	}

	/**
	 * @return the numberCode
	 */
	public String getNumberCode() {
		return numberCode;
	}

	/**
	 * @param numberCode the numberCode to set
	 */
	public void setNumberCode(String numberCode) {
		this.numberCode = numberCode;
	}

	
}
