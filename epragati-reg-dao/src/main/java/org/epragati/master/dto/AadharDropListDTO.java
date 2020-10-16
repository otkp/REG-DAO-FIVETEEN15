package org.epragati.master.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="master_aadhar_drop")
public class AadharDropListDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Boolean status=Boolean.FALSE;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
