package org.epragati.regservice.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_conversion_cov")
public class ClassOfVehicleConversion extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String cov;
	private String covDesc;
	private String category;
	private String newCov;
	private String newcovDesc;
	private String convCategory;
	private String newCategory;
	
	private boolean taxCal;
	private boolean fcFee;
	private boolean permitCal;

	
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
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}
	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}
	/**
	 * @return the covDesc
	 */
	public String getCovDesc() {
		return covDesc;
	}
	/**
	 * @param covDesc the covDesc to set
	 */
	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the newCov
	 */
	public String getNewCov() {
		return newCov;
	}
	/**
	 * @param newCov the newCov to set
	 */
	public void setNewCov(String newCov) {
		this.newCov = newCov;
	}
	/**
	 * @return the newcovDesc
	 */
	public String getNewcovDesc() {
		return newcovDesc;
	}
	/**
	 * @param newcovDesc the newcovDesc to set
	 */
	public void setNewcovDesc(String newcovDesc) {
		this.newcovDesc = newcovDesc;
	}
	/**
	 * @return the convCategory
	 */
	public String getConvCategory() {
		return convCategory;
	}
	/**
	 * @param convCategory the convCategory to set
	 */
	public void setConvCategory(String convCategory) {
		this.convCategory = convCategory;
	}
	/**
	 * @return the newCategory
	 */
	public String getNewCategory() {
		return newCategory;
	}
	/**
	 * @param newCategory the newCategory to set
	 */
	public void setNewCategory(String newCategory) {
		this.newCategory = newCategory;
	}
	/**
	 * @return the taxCal
	 */
	public boolean isTaxCal() {
		return taxCal;
	}
	/**
	 * @param taxCal the taxCal to set
	 */
	public void setTaxCal(boolean taxCal) {
		this.taxCal = taxCal;
	}
	/**
	 * @return the fcFee
	 */
	public boolean isFcFee() {
		return fcFee;
	}
	/**
	 * @param fcFee the fcFee to set
	 */
	public void setFcFee(boolean fcFee) {
		this.fcFee = fcFee;
	}
	/**
	 * @return the permitCal
	 */
	public boolean isPermitCal() {
		return permitCal;
	}
	/**
	 * @param permitCal the permitCal to set
	 */
	public void setPermitCal(boolean permitCal) {
		this.permitCal = permitCal;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((newCov == null) ? 0 : newCov.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassOfVehicleConversion other = (ClassOfVehicleConversion) obj;
		if (newCov == null) {
			if (other.newCov != null)
				return false;
		} else if (!newCov.equals(other.newCov))
			return false;
		return true;
	}
	
	
	
}
