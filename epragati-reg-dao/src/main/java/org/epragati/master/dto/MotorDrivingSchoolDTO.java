package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.vo.RepresentativeDetailsVO;
import org.epragati.regservice.dto.PUCDetailsDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "motor_driving_school_details")

public class MotorDrivingSchoolDTO extends BaseEntity {
	@Id
	private String applicationNo;
	private String userId;
	private String schoolId;
	private String aadharNo;
	private String schoolName;
	private String schoolRegNumber;
	private String username;
	private String mobile;
	private String landLine;
	private String totalAreaOfSchool;
	private ApplicantAddressDTO schoolAddress;
	private String email;
	private String website;
	private String schoolType;
	private String officeCode;
	private String applicationStatus;
	private List<ActionDetailsDTO> actionDetails;
	private List<ActionDetailsDTO> actionDetailsLog;
	// private representativeDetails;
	private List<RepresentativeDetailsVO>  representativeDetails;
	private List<String> prNos;
	private String ownerName;
	private List<DriverDetailsDto> driverDetails;
	private List<MotorDrivingSchoolStudentDetailsDTO> studentDetails;
	public AadhaarDetailsResponseDTO ownerAadharResponse;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private StaffDetailsDTO staffDetails;
	private PUCDetailsDTO pucDetails;
	private InsuranceDetailsDTO insuranceDetails;
	private String panNumber;
	private String gstiNumber;
	private Boolean dualControllerFacility;
	private StaffDetailsDTO staffDetailsDTO;
	private StaffDetailsDTO instructorDetails;
	private RegistrationDetailsDTO registrationDetails;
	
	

	
	
	public StaffDetailsDTO getInstructorDetails() {
		return instructorDetails;
	}
	public void setInstructorDetails(StaffDetailsDTO instructorDetails) {
		this.instructorDetails = instructorDetails;
	}
	public StaffDetailsDTO getStaffDetailsDTO() {
		return staffDetailsDTO;
	}
	public void setStaffDetailsDTO(StaffDetailsDTO staffDetailsDTO) {
		this.staffDetailsDTO = staffDetailsDTO;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getGstiNumber() {
		return gstiNumber;
	}
	public void setGstiNumber(String gstiNumber) {
		this.gstiNumber = gstiNumber;
	}
	public Boolean getDualControllerFacility() {
		return dualControllerFacility;
	}
	public void setDualControllerFacility(Boolean dualControllerFacility) {
		this.dualControllerFacility = dualControllerFacility;
	}
	public InsuranceDetailsDTO getInsuranceDetails() {
		return insuranceDetails;
	}
	public void setInsuranceDetails(InsuranceDetailsDTO insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
	public PUCDetailsDTO getPucDetails() {
		return pucDetails;
	}
	public void setPucDetails(PUCDetailsDTO pucDetails) {
		this.pucDetails = pucDetails;
	}
	public StaffDetailsDTO getStaffDetails() {
		return staffDetails;
	}
	public void setStaffDetails(StaffDetailsDTO staffDetails) {
		this.staffDetails = staffDetails;
	}

	private List<LockedDetailsDTO> lockedDetails;

	public List<LockedDetailsDTO> getLockedDetails() {
		return lockedDetails;
	}
	public void setLockedDetails(List<LockedDetailsDTO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}
	//public List<MotorDrivingSchoolRepresentativeDTO> representativeDetails;
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolRegNumber() {
		return schoolRegNumber;
	}
	public void setSchoolRegNumber(String schoolRegNumber) {
		this.schoolRegNumber = schoolRegNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public String getTotalAreaOfSchool() {
		return totalAreaOfSchool;
	}
	public void setTotalAreaOfSchool(String totalAreaOfSchool) {
		this.totalAreaOfSchool = totalAreaOfSchool;
	}
	public ApplicantAddressDTO getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(ApplicantAddressDTO schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
	public List<ActionDetailsDTO> getActionDetails() {
		return actionDetails;
	}
	public void setActionDetails(List<ActionDetailsDTO> actionDetails) {
		this.actionDetails = actionDetails;
	}
	public List<ActionDetailsDTO> getActionDetailsLog() {
		return actionDetailsLog;
	}
	public void setActionDetailsLog(List<ActionDetailsDTO> actionDetailsLog) {
		this.actionDetailsLog = actionDetailsLog;
	}
	public List<String> getPrNos() {
		return prNos;
	}
	public void setPrNos(List<String> prNos) {
		this.prNos = prNos;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public List<DriverDetailsDto> getDriverDetails() {
		return driverDetails;
	}
	public void setDriverDetails(List<DriverDetailsDto> driverDetails) {
		this.driverDetails = driverDetails;
	}
	public List<MotorDrivingSchoolStudentDetailsDTO> getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(List<MotorDrivingSchoolStudentDetailsDTO> studentDetails) {
		this.studentDetails = studentDetails;
	}
	public AadhaarDetailsResponseDTO getOwnerAadharResponse() {
		return ownerAadharResponse;
	}
	public void setOwnerAadharResponse(AadhaarDetailsResponseDTO ownerAadharResponse) {
		this.ownerAadharResponse = ownerAadharResponse;
	}
	
	public List<RepresentativeDetailsVO> getRepresentativeDetails() {
		return representativeDetails;
	}
	public void setRepresentativeDetails(List<RepresentativeDetailsVO> representativeDetails) {
		this.representativeDetails = representativeDetails;
	}
	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public RegistrationDetailsDTO getRegistrationDetails() {
		return registrationDetails;
	}
	public void setRegistrationDetails(RegistrationDetailsDTO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}


}
