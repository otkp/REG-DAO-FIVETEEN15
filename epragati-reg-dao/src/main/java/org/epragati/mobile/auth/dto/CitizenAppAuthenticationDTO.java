package org.epragati.mobile.auth.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="mobile_app_user")	
/**
 * 
 * @author roshan.jugalkishor
 *
 */
public class CitizenAppAuthenticationDTO {

	/**
	 * 
	 * Properties
	 */

	@Id
	private String id; 
	private String aadharNo;
	private String firstName;
	private String lastName;
	private String fatherName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private String dlNo;
	private Integer noOfVehicals;
	private String mobileNo;
	private String password;
	private AuthenticationOTP_DTO otpDetails;
	private String deviceNo;
	private String status;
	private Boolean isdeactivate = Boolean.FALSE;
	private LocalDateTime isdeactivateDate;
	private LocalDateTime createdDate; 
	private LocalDateTime lUpdate;

	/**
	 * 
	 * Getter Setter Method
	 * 
	 * @return
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getFatherName() {
		return fatherName;
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

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public Integer getNoOfVehicals() {
		return noOfVehicals;
	}

	public void setNoOfVehicals(Integer noOfVehicals) {
		this.noOfVehicals = noOfVehicals;
	}
	

	public AuthenticationOTP_DTO getOtpDetails() {
		return otpDetails;
	}

	public void setOtpDetails(AuthenticationOTP_DTO otpDetails) {
		this.otpDetails = otpDetails;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Boolean getIsdeactivate() {
		return isdeactivate;
	}

	public void setIsdeactivate(Boolean isdeactivate) {
		this.isdeactivate = isdeactivate;
	}

	/**
	 * @return the isdeactivateDate
	 */
	public LocalDateTime getIsdeactivateDate() {
		return isdeactivateDate;
	}

	/**
	 * @param isdeactivateDate the isdeactivateDate to set
	 */
	public void setIsdeactivateDate(LocalDateTime isdeactivateDate) {
		this.isdeactivateDate = isdeactivateDate;
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
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	/***
	 * 
	 * toString() method of properties.....
	 * 
	 */

	@Override
	public String toString() {
		return "CitizenAppAuthenticationDTO [aadharNo=" + aadharNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", fatherName=" + fatherName + ", dob=" + dob + ", dlNo=" + dlNo + ", noOfVehicals="
				+ noOfVehicals + ", mobileNo=" + mobileNo + ", password=" + password + ", otpDetails=" + otpDetails
				+ ", deviceNo=" + deviceNo + ", status=" + status + ", isdeactivate=" + isdeactivate
				+ ",isdeactivateDate=" + isdeactivateDate + ",createdDate="
				+ createdDate + ",lUpdate=" + lUpdate + "]";
	}

	
}
