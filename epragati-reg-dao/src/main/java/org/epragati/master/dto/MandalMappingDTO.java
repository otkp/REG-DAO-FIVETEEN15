package org.epragati.master.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "master_aadhaar_mandal_mapping")
public class MandalMappingDTO {
	
	private String actualOffice;
	
	private List<String> reportingOffice;
	
	private Boolean status;

	public String getActualOffice() {
		return actualOffice;
	}

	public void setActualOffice(String actualOffice) {
		this.actualOffice = actualOffice;
	}

	public List<String> getReportingOffice() {
		return reportingOffice;
	}

	public void setReportingOffice(List<String> reportingOffice) {
		this.reportingOffice = reportingOffice;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	

}
