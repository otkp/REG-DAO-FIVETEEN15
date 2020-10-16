package org.epragati.common.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_vehicle_strength_covs")
public class VehicleStrengthDTO {
	
	private String vehicleType;
	
	private String cov;
	
	private String covDesc;
	
	private String subCov;
	
	private Boolean status;
	
	private String subCovDesc;
	
	private Integer count;
	

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getSubCovDesc() {
		return subCovDesc;
	}

	public void setSubCovDesc(String subCovDesc) {
		this.subCovDesc = subCovDesc;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public String getCovDesc() {
		return covDesc;
	}

	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}

	public String getSubCov() {
		return subCov;
	}

	public void setSubCov(String subCov) {
		this.subCov = subCov;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
}
