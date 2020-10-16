package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "permit_mandal_exemption")
public class PermitMandalExemptionDTO extends BaseEntity implements Serializable,Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String mandalName;
	
	private Integer mandalCode;
	
	private String covcode;
	
	private Boolean status;
	
	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public Integer getMandalCode() {
		return mandalCode;
	}

	public void setMandalCode(Integer mandalCode) {
		this.mandalCode = mandalCode;
	}

	public String getCovcode() {
		return covcode;
	}

	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
