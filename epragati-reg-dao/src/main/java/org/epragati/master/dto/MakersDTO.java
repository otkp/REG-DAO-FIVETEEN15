package org.epragati.master.dto;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saikiran.kola
 *
 */
@Document(collection = "master_makers")
public class MakersDTO extends BaseEntity {

	@Id
	private String id;

	private Integer mid;

	private Integer rId;

	private String makername;

	private boolean status = false;
	
	private String createdOfficeCode;

	public String getCreatedOfficeCode() {
		return createdOfficeCode;
	}

	public void setCreatedOfficeCode(String createdOfficeCode) {
		this.createdOfficeCode = createdOfficeCode;
	}


	/**
	 * @return the mid
	 */
	public Integer getMid() {
		return mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}


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
	 * @return the rId
	 */
	public Integer getrId() {
		return rId;
	}

	/**
	 * @param rId the rId to set
	 */
	public void setrId(Integer rId) {
		this.rId = rId;
	}

	/**
	 * @return the makername
	 */
	public String getMakername() {
		return makername;
	}

	/**
	 * @param makername the makername to set
	 */
	public void setMakername(String makername) {
		this.makername = makername;
	}

	/**
	 * @return the status
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
