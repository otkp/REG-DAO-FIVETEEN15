package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_greenTax")
public class MasterGreenTax extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String covcode;
	private Float taxamount;
	private String CovCategory;
	private Integer ageOfVehicle;
	private Integer ageOfIncrement;
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
	 * @return the taxamount
	 */
	public Float getTaxamount() {
		return taxamount;
	}
	/**
	 * @param taxamount the taxamount to set
	 */
	public void setTaxamount(Float taxamount) {
		this.taxamount = taxamount;
	}
	/**
	 * @return the covCategory
	 */
	public String getCovCategory() {
		return CovCategory;
	}
	/**
	 * @param covCategory the covCategory to set
	 */
	public void setCovCategory(String covCategory) {
		CovCategory = covCategory;
	}
	/**
	 * @return the ageOfVehicle
	 */
	public Integer getAgeOfVehicle() {
		return ageOfVehicle;
	}
	/**
	 * @param ageOfVehicle the ageOfVehicle to set
	 */
	public void setAgeOfVehicle(Integer ageOfVehicle) {
		this.ageOfVehicle = ageOfVehicle;
	}
	/**
	 * @return the ageOfIncrement
	 */
	public Integer getAgeOfIncrement() {
		return ageOfIncrement;
	}
	/**
	 * @param ageOfIncrement the ageOfIncrement to set
	 */
	public void setAgeOfIncrement(Integer ageOfIncrement) {
		this.ageOfIncrement = ageOfIncrement;
	}
	
	
}
