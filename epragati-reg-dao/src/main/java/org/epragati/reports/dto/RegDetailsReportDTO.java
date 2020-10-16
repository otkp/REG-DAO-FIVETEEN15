package org.epragati.reports.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.master.dto.RegistrationValidityDTO;
import org.epragati.master.dto.VehicleDetailsDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "registration_details_reports")
public class RegDetailsReportDTO {

	@Id
	private String prNo;
	private String trNo;
	private LocalDateTime createdDate;
	private LocalDateTime lastUpdatedDate;
	private RegistrationValidityDTO registrationValidity;
	private Integer districtId;
	private String officeCode;
	private String officeName;
	private String financeType;
	private String financeName;
	private String financeStatus;
	private String applicantName;
	private String fatherName;
	private String aadhaarNumber;
	private String ownerType;
	
	private String taxType;
	private Long taxAmount;
	private LocalDate taxValidityFrom;
	private LocalDate taxValidityTo;
	
	private String vehicleType;
	private VehicleDetailsDTO vehicleDetails;
	
	private String invoiceNumber;
	private Double invoiceAmount;
	
	private String chassisNumber;
	private String classOfVehicle;
	private String chassisStatus;
	private String dealerId;
	
	
	private String permitNumber;
	private LocalDate permitValidityTo;
	private String permitType;
	
	private String fitnessNumber;
	private LocalDate fitnessValidityTo;
	
	private LocalDateTime recordLastUpdated = LocalDateTime.now();
	
	private String applicationNumber;
	
	
	
	
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public LocalDateTime getRecordLastUpdated() {
		return recordLastUpdated;
	}
	public void setRecordLastUpdated(LocalDateTime recordLastUpdated) {
		this.recordLastUpdated = recordLastUpdated;
	}
	public LocalDate getTaxValidityFrom() {
		return taxValidityFrom;
	}
	public void setTaxValidityFrom(LocalDate taxValidityFrom) {
		this.taxValidityFrom = taxValidityFrom;
	}
	public LocalDate getTaxValidityTo() {
		return taxValidityTo;
	}
	public void setTaxValidityTo(LocalDate taxValidityTo) {
		this.taxValidityTo = taxValidityTo;
	}
	public String getPermitType() {
		return permitType;
	}
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}
	
	public LocalDate getPermitValidityTo() {
		return permitValidityTo;
	}
	public void setPermitValidityTo(LocalDate permitValidityTo) {
		this.permitValidityTo = permitValidityTo;
	}
	
	public LocalDate getFitnessValidityTo() {
		return fitnessValidityTo;
	}
	public void setFitnessValidityTo(LocalDate fitnessValidityTo) {
		this.fitnessValidityTo = fitnessValidityTo;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getChassisStatus() {
		return chassisStatus;
	}
	public void setChassisStatus(String chassisStatus) {
		this.chassisStatus = chassisStatus;
	}
	public Long getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getPermitNumber() {
		return permitNumber;
	}
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}
	public String getFitnessNumber() {
		return fitnessNumber;
	}
	public void setFitnessNumber(String fitnessNumber) {
		this.fitnessNumber = fitnessNumber;
	}
	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}
	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}
	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
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
	 * @return the registrationValidity
	 */
	public RegistrationValidityDTO getRegistrationValidity() {
		return registrationValidity;
	}
	/**
	 * @param registrationValidity the registrationValidity to set
	 */
	public void setRegistrationValidity(RegistrationValidityDTO registrationValidity) {
		this.registrationValidity = registrationValidity;
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
	 * @return the financeType
	 */
	public String getFinanceType() {
		return financeType;
	}
	/**
	 * @param financeType the financeType to set
	 */
	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}
	/**
	 * @return the financeName
	 */
	public String getFinanceName() {
		return financeName;
	}
	/**
	 * @param financeName the financeName to set
	 */
	public void setFinanceName(String financeName) {
		this.financeName = financeName;
	}
	/**
	 * @return the financeStatus
	 */
	public String getFinanceStatus() {
		return financeStatus;
	}
	/**
	 * @param financeStatus the financeStatus to set
	 */
	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
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
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
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
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
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
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}
	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
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
	 * @return the vehicleDetails
	 */
	public VehicleDetailsDTO getVehicleDetails() {
		return vehicleDetails;
	}
	/**
	 * @param vehicleDetails the vehicleDetails to set
	 */
	public void setVehicleDetails(VehicleDetailsDTO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the invoiceAmount
	 */
	public Double getInvoiceAmount() {
		return invoiceAmount;
	}
	/**
	 * @param invoiceAmount the invoiceAmount to set
	 */
	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	/**
	 * @return the dealerId
	 */
	public String getDealerId() {
		return dealerId;
	}
	/**
	 * @param dealerId the dealerId to set
	 */
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	
}
