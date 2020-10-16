package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DriverDetailsDto {

	private String dlNo;
	private String firstIssueOfficeName;
	private String firstIssueOfficeCode;
	private String driverName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String careOf;
	private String gender;
	private ApplicantAddressDTO presentAddress;
	private String mobile; 
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dlIssueDate;
	private String badgeNo;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate nonTransportValidity;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate transportValidity;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate badgeNoIssueDate;
	private String aadharNo;
	private Double driverExperience;
	private List<String> nonTransportCovs;
	private List<String> trasportCovs;
	private AadhaarDetailsResponseDTO aadharResponseForDriver;
	private String officeCode;
	private String officeName;
	
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public String getFirstIssueOfficeName() {
		return firstIssueOfficeName;
	}
	public void setFirstIssueOfficeName(String firstIssueOfficeName) {
		this.firstIssueOfficeName = firstIssueOfficeName;
	}
	public String getFirstIssueOfficeCode() {
		return firstIssueOfficeCode;
	}
	public void setFirstIssueOfficeCode(String firstIssueOfficeCode) {
		this.firstIssueOfficeCode = firstIssueOfficeCode;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCareOf() {
		return careOf;
	}
	public void setCareOf(String careOf) {
		this.careOf = careOf;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ApplicantAddressDTO getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(ApplicantAddressDTO presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDlIssueDate() {
		return dlIssueDate;
	}
	public void setDlIssueDate(LocalDate dlIssueDate) {
		this.dlIssueDate = dlIssueDate;
	}
	public String getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}
	public LocalDate getNonTransportValidity() {
		return nonTransportValidity;
	}
	public void setNonTransportValidity(LocalDate nonTransportValidity) {
		this.nonTransportValidity = nonTransportValidity;
	}
	public LocalDate getTransportValidity() {
		return transportValidity;
	}
	public void setTransportValidity(LocalDate transportValidity) {
		this.transportValidity = transportValidity;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Double getDriverExperience() {
		return driverExperience;
	}
	public void setDriverExperience(Double driverExperience) {
		this.driverExperience = driverExperience;
	}
	public List<String> getNonTransportCovs() {
		return nonTransportCovs;
	}
	public void setNonTransportCovs(List<String> nonTransportCovs) {
		this.nonTransportCovs = nonTransportCovs;
	}
	public List<String> getTrasportCovs() {
		return trasportCovs;
	}
	public void setTrasportCovs(List<String> trasportCovs) {
		this.trasportCovs = trasportCovs;
	}
	/**
	 * @return the badgeNoIssueDate
	 */
	public LocalDate getBadgeNoIssueDate() {
		return badgeNoIssueDate;
	}
	/**
	 * @param badgeNoIssueDate the badgeNoIssueDate to set
	 */
	public void setBadgeNoIssueDate(LocalDate badgeNoIssueDate) {
		this.badgeNoIssueDate = badgeNoIssueDate;
	}
	public AadhaarDetailsResponseDTO getAadharResponseForDriver() {
		return aadharResponseForDriver;
	}
	public void setAadharResponseForDriver(AadhaarDetailsResponseDTO aadharResponseForDriver) {
		this.aadharResponseForDriver = aadharResponseForDriver;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
	
}
