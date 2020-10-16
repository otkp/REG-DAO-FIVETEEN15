package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_payperiod")
public class MasterPayperiodDTO extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String covcode;
	
	private String payperiod;

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
