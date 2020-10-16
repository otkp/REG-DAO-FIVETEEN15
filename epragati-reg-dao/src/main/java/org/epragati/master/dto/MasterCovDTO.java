package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "master_cov")
public class MasterCovDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String _id;
	
	private Integer cid;
	
	private String covcode;
	
	private String covdescription;
	
	private String category;
	
	private Boolean panrequired;
	
	private Boolean invalidCov;
	
	private Boolean isSecondVehicle;
	
	private Boolean bsAllowed;
	
	private Boolean dealerCov;
	
	private String builderCov;

	private boolean isChassis;
	
	private boolean isRequireCard;
	
	private Integer nicCovCode;
	
	private Boolean isConstructionVehicle;
	
	private boolean isNonPayment;
	
	private String groupCategory;
	
	/**
	 * 
	 * @return the nicCovCode
	 */
	public Integer getNicCovCode() {
		return nicCovCode;
	}

	/**
	 * @param nicCovCode the nicCovCode to set
	 */
	public void setNicCovCode(Integer nicCovCode) {
		this.nicCovCode = nicCovCode;
	}

	public boolean isChassis() {
		return isChassis;
	}

	public void setChassis(boolean isChassis) {
		this.isChassis = isChassis;
	}

	public String getBuilderCov() {
		return builderCov;
	}

	public void setBuilderCov(String builderCov) {
		this.builderCov = builderCov;
	}

	/**
	 * @return the dealerCov
	 */
	public Boolean getDealerCov() {
		return dealerCov;
	}

	/**
	 * @param dealerCov the dealerCov to set
	 */
	public void setDealerCov(Boolean dealerCov) {
		this.dealerCov = dealerCov;
	}

	/**
	 * @return the isSecondVehicle
	 */
	public Boolean getIsSecondVehicle() {
		return isSecondVehicle;
	}

	/**
	 * @param isSecondVehicle the isSecondVehicle to set
	 */
	public void setIsSecondVehicle(Boolean isSecondVehicle) {
		this.isSecondVehicle = isSecondVehicle;
	}
	

	

	/**
	 * @return the invalidCov
	 */
	public Boolean getInvalidCov() {
		return invalidCov;
	}

	/**
	 * @param invalidCov the invalidCov to set
	 */
	public void setInvalidCov(Boolean invalidCov) {
		this.invalidCov = invalidCov;
	}

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * @return the covcode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covcode the covcode to set
	 */
	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	/**
	 * @return the covdescription
	 */
	public String getCovdescription() {
		return covdescription;
	}

	/**
	 * @param covdescription the covdescription to set
	 */
	public void setCovdescription(String covdescription) {
		this.covdescription = covdescription;
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
	 * @return the panrequired
	 */
	public Boolean getPanrequired() {
		return panrequired;
	}

	/**
	 * @param panrequired the panrequired to set
	 */
	public void setPanrequired(Boolean panrequired) {
		this.panrequired = panrequired;
	}
	
	public Boolean getBsAllowed() {
		return bsAllowed;
	}

	public void setBsAllowed(Boolean bsAllowed) {
		this.bsAllowed = bsAllowed;
	}

	public boolean isRequireCard() {
		return isRequireCard;
	}

	public void setRequireCard(boolean isRequireCard) {
		this.isRequireCard = isRequireCard;
	}

	
	public Boolean isConstructionVehicle() {
		return isConstructionVehicle;
	}

	public void setConstructionVehicle(Boolean isConstructionVehicle) {
		this.isConstructionVehicle = isConstructionVehicle;
	}
	
	

	public String getGroupCategory() {
		return groupCategory;
	}

	public void setGroupCategory(String groupCategory) {
		this.groupCategory = groupCategory;
	}

	/**
	 * @return the isNonPayment
	 */
	public boolean isNonPayment() {
		return isNonPayment;
	}

	/**
	 * @param isNonPayment the isNonPayment to set
	 */
	public void setNonPayment(boolean isNonPayment) {
		this.isNonPayment = isNonPayment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MasterCOV [_id=" + _id + ", cid=" + cid + ", covcode=" + covcode + ", covdescription=" + covdescription
				+ ", category=" + category + ", panrequired=" + panrequired + "]";
	}
   
}
