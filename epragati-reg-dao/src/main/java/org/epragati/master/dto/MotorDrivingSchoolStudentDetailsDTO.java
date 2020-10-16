package org.epragati.master.dto;

import java.time.LocalDate;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "motor_driving_school_studentdetails")
public class MotorDrivingSchoolStudentDetailsDTO extends BaseEntity {
	@Id
	private Double slNo;
	private String studenttName;
	private String fatherName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String mobile;
	private String gender;
	private BloodGroupDTO bloodGrp;
	private String emergencyContactNo;
	private String email;
	private AadhaarDetailsResponseDTO aadhaarDetailsResponseDTO;
	private String aadhaarNo;
	private String llrNo;
	private String schoolId;
	private String batchNo;
	private boolean isExamPassed;
	private Integer daysPresent;

	public Double getSlNo() {
		return slNo;
	}

	public void setSlNo(Double slNo) {
		this.slNo = slNo;
	}

	public String getStudenttName() {
		return studenttName;
	}

	public void setStudenttName(String studenttName) {
		this.studenttName = studenttName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BloodGroupDTO getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(BloodGroupDTO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(String emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AadhaarDetailsResponseDTO getAadhaarDetailsResponseDTO() {
		return aadhaarDetailsResponseDTO;
	}

	public void setAadhaarDetailsResponseDTO(AadhaarDetailsResponseDTO aadhaarDetailsResponseDTO) {
		this.aadhaarDetailsResponseDTO = aadhaarDetailsResponseDTO;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getLlrNo() {
		return llrNo;
	}

	public void setLlrNo(String llrNo) {
		this.llrNo = llrNo;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public boolean isExamPassed() {
		return isExamPassed;
	}

	public void setExamPassed(boolean isExamPassed) {
		this.isExamPassed = isExamPassed;
	}

	public Integer getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(Integer daysPresent) {
		this.daysPresent = daysPresent;
	}

}
