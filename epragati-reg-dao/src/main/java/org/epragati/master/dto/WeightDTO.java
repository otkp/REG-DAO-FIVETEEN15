package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_weight")
public class WeightDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3157155719428399477L;

	private String weighttype;

	private String weightdescription;

	private Double fromvalue;

	private Double tovalue;

	private Boolean status;

	/**
	 * @return the weighttype
	 */
	public String getWeighttype() {
		return weighttype;
	}

	/**
	 * @param weighttype
	 *            the weighttype to set
	 */
	public void setWeighttype(String weighttype) {
		this.weighttype = weighttype;
	}

	/**
	 * @return the weightdescription
	 */
	public String getWeightdescription() {
		return weightdescription;
	}

	/**
	 * @param weightdescription
	 *            the weightdescription to set
	 */
	public void setWeightdescription(String weightdescription) {
		this.weightdescription = weightdescription;
	}

	/**
	 * @return the fromvalue
	 */
	public Double getFromvalue() {
		return fromvalue;
	}

	/**
	 * @param fromvalue
	 *            the fromvalue to set
	 */
	public void setFromvalue(Double fromvalue) {
		this.fromvalue = fromvalue;
	}

	/**
	 * @return the tovalue
	 */
	public Double getTovalue() {
		return tovalue;
	}

	/**
	 * @param tovalue
	 *            the tovalue to set
	 */
	public void setTovalue(Double tovalue) {
		this.tovalue = tovalue;
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

}
