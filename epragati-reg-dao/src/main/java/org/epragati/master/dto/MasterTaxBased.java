package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_taxbased")
public class MasterTaxBased  extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String covcode;
	
	private String basedon;
	
	private Boolean status;

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
	 * @return the basedon
	 */
	public String getBasedon() {
		return basedon;
	}

	/**
	 * @param basedon the basedon to set
	 */
	public void setBasedon(String basedon) {
		this.basedon = basedon;
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
