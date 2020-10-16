package org.epragati.payment.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_cov")
/*@CompoundIndexes({ 
	@CompoundIndex(name = "covcode", def = "{'covcode': 1}")
})*/
public class ClassOfVehiclesDTO extends BaseEntity{

	private String _id;
	private Integer cid;
	private String covcode;
	private String covdescription;
	private String category;
	private Boolean panrequired;
	/*private LocalDateTime createdate;
	private LocalDateTime lupdate;*/
	private boolean isChassis = false;
	private boolean isRegistered = false;
	private boolean isUnRegistered = false;
	private Boolean isConstructionVehicle;
	private boolean voluntaryCov = false;
	    
	
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
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * @return the covCode
	 */
	public String getCovcode() {
		return covcode;
	}

	/**
	 * @param covCode
	 *            the covCode to set
	 */
	public void setCovcode(String covCode) {
		this.covcode = covCode;
	}

	/**
	 * @return the covdescription
	 */
	public String getCovdescription() {
		return covdescription;
	}

	/**
	 * @param covdescription
	 *            the covdescription to set
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
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the panrequired
	 */
	public boolean isPanrequired() {
		return panrequired;
	}

	/**
	 * @param panrequired
	 *            the panrequired to set
	 */
	public void setPanrequired(boolean panrequired) {
		this.panrequired = panrequired;
	}

	/**
	 * @return the createdate
	 *//*
	public LocalDateTime getCreatedate() {
		return createdate;
	}

	*//**
	 * @param createdate
	 *            the createdate to set
	 *//*
	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	*//**
	 * @return the lupdate
	 *//*
	public LocalDateTime getLupdate() {
		return lupdate;
	}

	*//**
	 * @param lupdate
	 *            the lupdate to set
	 *//*
	public void setLupdate(LocalDateTime lupdate) {
		this.lupdate = lupdate;
	}*/
	
	public boolean isChassis() {
		return isChassis;
	}

	public void setChassis(boolean isChassis) {
		this.isChassis = isChassis;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public boolean isUnRegistered() {
		return isUnRegistered;
	}

	public void setUnRegistered(boolean isUnRegistered) {
		this.isUnRegistered = isUnRegistered;
	}

	public Boolean isConstructionVehicle() {
		return isConstructionVehicle;
	}

	public void setConstructionVehicle(Boolean isConstructionVehicle) {
		this.isConstructionVehicle = isConstructionVehicle;
	}

	public boolean isVoluntaryCov() {
		return voluntaryCov;
	}

	public void setVoluntaryCov(boolean voluntaryCov) {
		this.voluntaryCov = voluntaryCov;
	}
	

}
