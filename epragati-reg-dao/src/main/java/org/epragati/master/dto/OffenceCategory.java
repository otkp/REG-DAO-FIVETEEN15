package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_offence_categeory")
public class OffenceCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String offenceCategeory;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOffenceCategeory() {
		return offenceCategeory;
	}
	public void setOffenceCategeory(String offenceCategeory) {
		this.offenceCategeory = offenceCategeory;
	}
	
	

}
