package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "registration_services_reports")

public class RegServiceReportDTO {
	
	private String applicationNumber;
	
	private List<ServiceEnum> citizenServicesNames;
	
	private String applicationCurrentStatus;
	
	private Integer applicationIteration;
	
	private String vehicleType;
	
	private String ownerType;
	
	private String classOfVehicle;
	
	private String actionRoleName;
	
	private String actionUserName;
	
	private LocalDateTime actionTime;
	
	private String actionStatus;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime lastUpdatedDate;
	
	private String officeCode;
	
	private String officeName;
	
	private Integer districtId;
	
	private String applicantName;
	
	private String applicantFatherName;
	 @JsonInclude(Include.NON_EMPTY)
	private String aadhaarNumber;
	
	private String prNumber;
	
	private String chassisNumber;
	
	private String engineNumber;
	 @JsonInclude(Include.NON_EMPTY)
    private String trNumber;
    
    private String ipAddress;
    
    private String vcrNumber;
    
    private String permitNumber;
    
    private String fitnessNumber;
    
    private String appSource;
    
    private String covDesc;
    
    private String module;
    
    private String reasonForRejection;
    private LocalDate reInspectionDate;
    
   	public String getModule() {
   		return module;
   	}

   	public void setModule(String module) {
   		this.module = module;
   	}

   	public String getCovDesc() {
   		return covDesc;
   	}

   	public void setCovDesc(String covDesc) {
   		this.covDesc = covDesc;
   	}

	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the citizenServicesNames
	 */
	public List<ServiceEnum> getCitizenServicesNames() {
		return citizenServicesNames;
	}

	/**
	 * @param citizenServicesNames the citizenServicesNames to set
	 */
	public void setCitizenServicesNames(List<ServiceEnum> citizenServicesNames) {
		this.citizenServicesNames = citizenServicesNames;
	}

	/**
	 * @return the applicationCurrentStatus
	 */
	public String getApplicationCurrentStatus() {
		return applicationCurrentStatus;
	}

	/**
	 * @param applicationCurrentStatus the applicationCurrentStatus to set
	 */
	public void setApplicationCurrentStatus(String applicationCurrentStatus) {
		this.applicationCurrentStatus = applicationCurrentStatus;
	}

	/**
	 * @return the applicationIteration
	 */
	public Integer getApplicationIteration() {
		return applicationIteration;
	}

	/**
	 * @param applicationIteration the applicationIteration to set
	 */
	public void setApplicationIteration(Integer applicationIteration) {
		this.applicationIteration = applicationIteration;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the ownerType
	 */
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the actionRoleName
	 */
	public String getActionRoleName() {
		return actionRoleName;
	}

	/**
	 * @param actionRoleName the actionRoleName to set
	 */
	public void setActionRoleName(String actionRoleName) {
		this.actionRoleName = actionRoleName;
	}

	/**
	 * @return the actionUserName
	 */
	public String getActionUserName() {
		return actionUserName;
	}

	/**
	 * @param actionUserName the actionUserName to set
	 */
	public void setActionUserName(String actionUserName) {
		this.actionUserName = actionUserName;
	}

	/**
	 * @return the actionTime
	 */
	public LocalDateTime getActionTime() {
		return actionTime;
	}

	/**
	 * @param actionTime the actionTime to set
	 */
	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	/**
	 * @return the actionStatus
	 */
	public String getActionStatus() {
		return actionStatus;
	}

	/**
	 * @param actionStatus the actionStatus to set
	 */
	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	 @JsonInclude(Include.NON_EMPTY)
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the officeName
	 */
	public String getOfficeName() {
		return officeName;
	}

	/**
	 * @param officeName the officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	/**
	 * @return the applicantFatherName
	 */
	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	/**
	 * @param applicantFatherName the applicantFatherName to set
	 */
	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	/**
	 * @return the aadhaarNumber
	 */
	
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	/**
	 * @param aadhaarNumber the aadhaarNumber to set
	 */
	 @JsonInclude(Include.NON_EMPTY)
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	/**
	 * @return the prNumber
	 */
	public String getPrNumber() {
		return prNumber;
	}

	/**
	 * @param prNumber the prNumber to set
	 */
	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}

	/**
	 * @param chassisNumber the chassisNumber to set
	 */
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	/**
	 * @return the engineNumber
	 */
	public String getEngineNumber() {
		return engineNumber;
	}

	/**
	 * @param engineNumber the engineNumber to set
	 */
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	/**
	 * @return the trNumber
	 */
	 @JsonInclude(Include.NON_EMPTY)
	public String getTrNumber() {
		return trNumber;
	}

	/**
	 * @param trNumber the trNumber to set
	 */
	 @JsonInclude(Include.NON_EMPTY)
	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the vcrNumber
	 */
	public String getVcrNumber() {
		return vcrNumber;
	}

	/**
	 * @param vcrNumber the vcrNumber to set
	 */
	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	/**
	 * @return the permitNumber
	 */
	public String getPermitNumber() {
		return permitNumber;
	}

	/**
	 * @param permitNumber the permitNumber to set
	 */
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	/**
	 * @return the fitnessNumber
	 */
	public String getFitnessNumber() {
		return fitnessNumber;
	}

	/**
	 * @param fitnessNumber the fitnessNumber to set
	 */
	public void setFitnessNumber(String fitnessNumber) {
		this.fitnessNumber = fitnessNumber;
	}

	/**
	 * @return the appSource
	 */
	public String getAppSource() {
		return appSource;
	}

	/**
	 * @param appSource the appSource to set
	 */
	public void setAppSource(String appSource) {
		this.appSource = appSource;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	public LocalDate getReInspectionDate() {
		return reInspectionDate;
	}

	public void setReInspectionDate(LocalDate reInspectionDate) {
		this.reInspectionDate = reInspectionDate;
	}
	
	

}
