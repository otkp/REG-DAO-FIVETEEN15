package org.epragati.common.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "hsrp_tr_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class HsrpReportDataSyncDto extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String applicationId;
	private VahanDetailsDto vahanDetails;
	private String trNo;
	private String prNo;
	private String vehicleType;
	private String classOfVehicle;
	private String classOfVehicleDesc;
	private Double hsrpfee;
	
	
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getClassOfVehicleDesc() {
		return classOfVehicleDesc;
	}
	public void setClassOfVehicleDesc(String classOfVehicleDesc) {
		this.classOfVehicleDesc = classOfVehicleDesc;
	}
	public Double getHsrpfee() {
		return hsrpfee;
	}
	public void setHsrpfee(Double hsrpfee) {
		this.hsrpfee = hsrpfee;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public VahanDetailsDto getVahanDetails() {
		return vahanDetails;
	}
	public void setVahanDetails(VahanDetailsDto vahanDetails) {
		this.vahanDetails = vahanDetails;
	}
	@Override
	public String toString() {
		return "HsrpReportDataSyncDto [applicationId=" + applicationId + ", vahanDetails=" + vahanDetails + ", trNo="
				+ trNo + ", prNo=" + prNo + ", vehicleType=" + vehicleType + ", classOfVehicle=" + classOfVehicle
				+ ", classOfVehicleDesc=" + classOfVehicleDesc + ", hsrpfee=" + hsrpfee + ", getTrNo()=" + getTrNo()
				+ ", getPrNo()=" + getPrNo() + ", getVehicleType()=" + getVehicleType() + ", getClassOfVehicle()="
				+ getClassOfVehicle() + ", getClassOfVehicleDesc()=" + getClassOfVehicleDesc() + ", getHsrpfee()="
				+ getHsrpfee() + ", getApplicationId()=" + getApplicationId() + ", getVahanDetails()="
				+ getVahanDetails() + ", getCreatedBy()=" + getCreatedBy() + ", getModifiedBy()=" + getModifiedBy()
				+ ", getUpdatedBy()=" + getUpdatedBy() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getModifiedDate()=" + getModifiedDate() + ", getlUpdate()=" + getlUpdate() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
