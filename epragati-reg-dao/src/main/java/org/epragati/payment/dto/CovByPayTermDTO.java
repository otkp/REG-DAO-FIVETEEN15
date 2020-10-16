package org.epragati.payment.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_payperiod")

public class CovByPayTermDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private String _id;
	private Integer cid;
	private String covcode;
	private String covdescription;
	private String payperiod;

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
	 * @return the payperiod
	 */
	public String getPayperiod() {
		return payperiod;
	}

	/**
	 * @param payperiod the payperiod to set
	 */
	public void setPayperiod(String payperiod) {
		this.payperiod = payperiod;
	}

	

}
