package org.epragati.ticket.dao;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="enable_cgc")
public class EnableCgcDTO {
	
	private Integer distictId;
	private String districtName;
	private Boolean status;
	public Integer getDistictId() {
		return distictId;
	}
	public void setDistictId(Integer distictId) {
		this.distictId = distictId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
