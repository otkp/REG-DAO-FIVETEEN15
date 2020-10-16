package org.epragati.permits.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "permit_validations")
public class PermitValidationsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> covList;

	private boolean status;

	private CovValidationDTO validations;

	private boolean bodyTypeBasedGoodsDetails;

	private boolean otherStateSpecialPermit;

	private String taxType;

	/**
	 * @return the covList
	 */
	public List<String> getCovList() {
		return covList;
	}

	/**
	 * @param covList the covList to set
	 */
	public void setCovList(List<String> covList) {
		this.covList = covList;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the validations
	 */
	public CovValidationDTO getValidations() {
		return validations;
	}

	/**
	 * @param validations the validations to set
	 */
	public void setValidations(CovValidationDTO validations) {
		this.validations = validations;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the bodyTypeBasedGoodsDetails
	 */
	public boolean isBodyTypeBasedGoodsDetails() {
		return bodyTypeBasedGoodsDetails;
	}

	/**
	 * @param bodyTypeBasedGoodsDetails the bodyTypeBasedGoodsDetails to set
	 */
	public void setBodyTypeBasedGoodsDetails(boolean bodyTypeBasedGoodsDetails) {
		this.bodyTypeBasedGoodsDetails = bodyTypeBasedGoodsDetails;
	}

	/**
	 * @return the otherStateSpecialPermit
	 */
	public boolean isOtherStateSpecialPermit() {
		return otherStateSpecialPermit;
	}

	/**
	 * @param otherStateSpecialPermit the otherStateSpecialPermit to set
	 */
	public void setOtherStateSpecialPermit(boolean otherStateSpecialPermit) {
		this.otherStateSpecialPermit = otherStateSpecialPermit;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
