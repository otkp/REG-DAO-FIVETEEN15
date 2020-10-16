package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "applicant_details")
@JsonIgnoreProperties(ignoreUnknown = true)
/*@CompoundIndexes({ 
	@CompoundIndex(name = "aadharNo", def = "{'aadharNo': 1}")
})*/
public class ApplicantDetailsDTO extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String applicantNo;

	private String displayName;

	private String firstName;

	private String lastName;

	private String middleName;

	private String fatherName;

	private ContactDTO contact;

	private Boolean isDifferentlyAbled = false;

	private ApplicantAddressDTO presentAddress;
	private ApplicantAddressDTO otherStateAddress;

	private AadhaarDetailsResponseDTO aadharResponse;

	private Boolean isAadhaarValidated = false;

	private ApplicationTypeDTO applicantionType;

	private String status;

	private QualificationDTO qualification;

	private BloodGroupDTO bloodGrp;

	private String nationality;

	private Boolean sameAsAadhar = false;

	//@Indexed(name = "aadharNo")
	private String aadharNo;

	private String gender;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	
	private Boolean isAvailablePresentAddrsProof = false;
	
	private String presentAddrsProofBelongsTo;
	
	private String nameOfPresentAddrsProofBelongsTo;
	
	private String representativeName;
	
	private String entityName;
	
	private String regId;
	
	private String uidToken;
	
	private String applicantType;
	
	private String presentAddressFrom;
	
	private ContactDTO ownerContact;
	
	public String getPresentAddressFrom() {
		return presentAddressFrom;
	}


	public void setPresentAddressFrom(String presentAddressFrom) {
		this.presentAddressFrom = presentAddressFrom;
	}


	
	public String getRegId() {
		return regId;
	}


	public void setRegId(String regId) {
		this.regId = regId;
	}


	public String getDisplayName() {
		return displayName;
	}
	
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public String getMiddleName() {
		return middleName;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public ContactDTO getContact() {
		return contact;
	}

	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	public ApplicantAddressDTO getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(ApplicantAddressDTO presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Boolean getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	public void setIsAadhaarValidated(Boolean isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public QualificationDTO getQualification() {
		return qualification;
	}

	public void setQualification(QualificationDTO qualification) {
		this.qualification = qualification;
	}

	public BloodGroupDTO getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(BloodGroupDTO bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getSameAsAadhar() {
		return sameAsAadhar;
	}

	public void setSameAsAadhar(Boolean sameAsAadhar) {
		this.sameAsAadhar = sameAsAadhar;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AadhaarDetailsResponseDTO getAadharResponse() {
		return aadharResponse;
	}

	public void setAadharResponse(AadhaarDetailsResponseDTO aadharResponse) {
		this.aadharResponse = aadharResponse;
	}

	public ApplicationTypeDTO getApplicantionType() {
		return applicantionType;
	}

	public void setApplicantionType(ApplicationTypeDTO applicantionType) {
		this.applicantionType = applicantionType;
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
	
	/**
	 * @return the isAvailablePresentAddrsProof
	 */
	public Boolean getIsAvailablePresentAddrsProof() {
		return isAvailablePresentAddrsProof;
	}

	/**
	 * @param isAvailablePresentAddrsProof the isAvailablePresentAddrsProof to set
	 */
	public void setIsAvailablePresentAddrsProof(Boolean isAvailablePresentAddrsProof) {
		this.isAvailablePresentAddrsProof = isAvailablePresentAddrsProof;
	}

	/**
	 * @return the presentAddrsProofBelongsTo
	 */
	public String getPresentAddrsProofBelongsTo() {
		return presentAddrsProofBelongsTo;
	}

	/**
	 * @param presentAddrsProofBelongsTo the presentAddrsProofBelongsTo to set
	 */
	public void setPresentAddrsProofBelongsTo(String presentAddrsProofBelongsTo) {
		this.presentAddrsProofBelongsTo = presentAddrsProofBelongsTo;
	}

	public String getNameOfPresentAddrsProofBelongsTo() {
		return nameOfPresentAddrsProofBelongsTo;
	}

	public void setNameOfPresentAddrsProofBelongsTo(String nameOfPresentAddrsProofBelongsTo) {
		this.nameOfPresentAddrsProofBelongsTo = nameOfPresentAddrsProofBelongsTo;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	public ApplicantAddressDTO getOtherStateAddress() {
		return otherStateAddress;
	}


	public void setOtherStateAddress(ApplicantAddressDTO otherStateAddress) {
		this.otherStateAddress = otherStateAddress;
	}


	public String getUidToken() {
		return uidToken;
	}


	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}


	public String getApplicantType() {
		return applicantType;
	}


	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}


	/**
	 * @return the ownerContact
	 */
	public ContactDTO getOwnerContact() {
		return ownerContact;
	}


	/**
	 * @param ownerContact the ownerContact to set
	 */
	public void setOwnerContact(ContactDTO ownerContact) {
		this.ownerContact = ownerContact;
	}

	
}