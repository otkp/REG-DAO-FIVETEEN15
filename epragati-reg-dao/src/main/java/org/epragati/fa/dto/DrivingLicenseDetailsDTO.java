package org.epragati.fa.dto;

import java.time.LocalDate;
import java.util.List;

public class DrivingLicenseDetailsDTO {
	private String dlNo;
	private String issuedOfficeName;
	private LocalDate nonTransportValidityEnd;
	private LocalDate transportValidityEnd;
	private List<String> covs;
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getIssuedOfficeName() {
		return issuedOfficeName;
	}
	public void setIssuedOfficeName(String issuedOfficeName) {
		this.issuedOfficeName = issuedOfficeName;
	}
	public LocalDate getNonTransportValidityEnd() {
		return nonTransportValidityEnd;
	}
	public void setNonTransportValidityEnd(LocalDate nonTransportValidityEnd) {
		this.nonTransportValidityEnd = nonTransportValidityEnd;
	}
	public LocalDate getTransportValidityEnd() {
		return transportValidityEnd;
	}
	public void setTransportValidityEnd(LocalDate transportValidityEnd) {
		this.transportValidityEnd = transportValidityEnd;
	}
	public List<String> getCovs() {
		return covs;
	}
	public void setCovs(List<String> covs) {
		this.covs = covs;
	}
	
	
}
