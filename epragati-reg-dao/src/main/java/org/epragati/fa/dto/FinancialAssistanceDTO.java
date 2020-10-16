package org.epragati.fa.dto;


import java.time.LocalDate;
import java.util.List;

import org.epragati.civilsupplies.dto.CardMemberDetails;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.dto.AadhaarDetailsResponseDTO;
import org.epragati.master.dto.ActionDetailsDTO;
import org.epragati.master.dto.BankDetailsDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "financial_assistance")
public class FinancialAssistanceDTO {
	@Id
	private String applicationNumber;
	
	private String prNo;
	
	private String aadharNo;
	
	private String applicationStatus;
	
	private String caste;
	
	private PersonalDetailsDTO personalDetails;
	
	private DrivingLicenseDetailsDTO drivingLicenseDetails;
	
	private VehicleDetailsDTO vehicleDetails;
	
	private BankDetailsDTO bankDetails;
	
	private AadhaarDetailsResponseDTO aadhaarResponse;
	
   private List<PersonalDetailsDTO> applicantNamedCovs;
	
	private List<PersonalDetailsDTO> familyMembersCovs;
	
	private List<CardMemberDetails> familyMembersDetails;
	
	private List<ActionDetailsDTO> actionDetails;
	
	private ActionDetailsDTO lockedDetails;
	
	private List<ActionDetailsDTO> lockedDetailsLog;

	private String currentRole;
	
	@JsonFormat(pattern="dd-MM-yyy")
	private LocalDate createdDate;
	
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	
	
	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	

	public ActionDetailsDTO getLockedDetails() {
		return lockedDetails;
	}

	public void setLockedDetails(ActionDetailsDTO lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	

	public AadhaarDetailsResponseDTO getAadhaarResponse() {
		return aadhaarResponse;
	}

	public void setAadhaarResponse(AadhaarDetailsResponseDTO aadhaarResponse) {
		this.aadhaarResponse = aadhaarResponse;
	}

	public BankDetailsDTO getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetailsDTO bankDetails) {
		this.bankDetails = bankDetails;
	}

	public PersonalDetailsDTO getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetailsDTO personalDetails) {
		this.personalDetails = personalDetails;
	}

	

	public DrivingLicenseDetailsDTO getDrivingLicenseDetails() {
		return drivingLicenseDetails;
	}

	public void setDrivingLicenseDetails(DrivingLicenseDetailsDTO drivingLicenseDetails) {
		this.drivingLicenseDetails = drivingLicenseDetails;
	}

	public VehicleDetailsDTO getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetailsDTO vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	

	public List<PersonalDetailsDTO> getApplicantNamedCovs() {
		return applicantNamedCovs;
	}

	public void setApplicantNamedCovs(List<PersonalDetailsDTO> applicantNamedCovs) {
		this.applicantNamedCovs = applicantNamedCovs;
	}

	public List<PersonalDetailsDTO> getFamilyMembersCovs() {
		return familyMembersCovs;
	}

	public void setFamilyMembersCovs(List<PersonalDetailsDTO> familyMembersCovs) {
		this.familyMembersCovs = familyMembersCovs;
	}
	

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	public List<ActionDetailsDTO> getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(List<ActionDetailsDTO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public List<ActionDetailsDTO> getLockedDetailsLog() {
		return lockedDetailsLog;
	}

	public void setLockedDetailsLog(List<ActionDetailsDTO> lockedDetailsLog) {
		this.lockedDetailsLog = lockedDetailsLog;
	}

	public List<CardMemberDetails> getFamilyMembersDetails() {
		return familyMembersDetails;
	}

	public void setFamilyMembersDetails(List<CardMemberDetails> familyMembersDetails) {
		this.familyMembersDetails = familyMembersDetails;
	}

	

	

	
}
