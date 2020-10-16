package org.epragati.master.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AttendantDetailsDto {

	private String attendantName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String careOf;
	private String gender;
	private ApplicantAddressDTO presentAddress;
	private String mobile; 
	private String aadharNo;
	private AadhaarDetailsResponseDTO aadharResponseForAttendant;
	
	public String getAttendantName() {
		return attendantName;
	}
	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
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
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public AadhaarDetailsResponseDTO getAadharResponseForAttendant() {
		return aadharResponseForAttendant;
	}
	public void setAadharResponseForAttendant(AadhaarDetailsResponseDTO aadharResponseForAttendant) {
		this.aadharResponseForAttendant = aadharResponseForAttendant;
	}

	
	
}
