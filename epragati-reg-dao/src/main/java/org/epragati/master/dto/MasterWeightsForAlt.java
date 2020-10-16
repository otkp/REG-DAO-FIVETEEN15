package org.epragati.master.dto;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_weights_for_alt")
public class MasterWeightsForAlt {

	@Id
	private String id;
	private Integer fromGvw;
	private Integer toGvw;
	private Integer gvw;
	private boolean status;
	public Integer getToGvw() {
		return toGvw;
	}
	public void setToGvw(Integer toGvw) {
		this.toGvw = toGvw;
	}
	public Integer getGvw() {
		return gvw;
	}
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getFromGvw() {
		return fromGvw;
	}
	public void setFromGvw(Integer fromGvw) {
		this.fromGvw = fromGvw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
