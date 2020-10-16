package org.epragati.cfst.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="second_vehicledata")	
public class ElasticSecondVehicleDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Id
	private String prNumber;
	private String firstName;
	private String lastName;
	private String fatherName; 
	private LocalDate dob;
	private String displayName;
	private String address1;
	private String address2;
	private String address3;
	private String mandal;
	private String district;
	private String classOfVehicle;
	private String officeCode;
	private String officeAddress;
	private Boolean isAadhaarValidate;
	private String aadhaarNo;
	private Boolean isSynchStatus = false;
	private Boolean isTowDone = false;
		
	public Boolean getIsTowDone() {
		return isTowDone;
	}
	public void setIsTowDone(Boolean isTowDone) {
		this.isTowDone = isTowDone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	public Boolean isSynchStatus() {
		return isSynchStatus;
	}
	public void setSynchStatus(Boolean synchStatus) {
		this.isSynchStatus = synchStatus;
	}
	public String getPrNumber() {
		return prNumber;
	}
	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}
	public Boolean getIsAadhaarValidate() {
		return isAadhaarValidate;
	}
	public void setIsAadhaarValidate(Boolean isAadhaarValidate) {
		this.isAadhaarValidate = isAadhaarValidate;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	
	public Boolean getIsSynchStatus() {
		return isSynchStatus;
	}
	/**
	 * @param isSynchStatus the isSynchStatus to set
	 */
	public void setIsSynchStatus(Boolean isSynchStatus) {
		this.isSynchStatus = isSynchStatus;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	/**
	 * @return the createdDate
	 */
	
	
	
}
