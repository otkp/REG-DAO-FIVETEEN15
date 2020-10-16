package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_users")
public class MasterUsersDTO  extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String userId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String email;

	private String mobile;

	private String faxNo;

	private String landmark;

	private String signatureImageUrl;

	private String profileImageUrl;

	private String qualification;

	private String message;

	private String empCode;

	private String userName;

	private String phoneNo;

	private OfficeDTO office;

	private String password;

	private boolean status;

	private DesignationDTO designation;

	private RolesDTO primaryRole;

	private String additionalRoles;

	private Integer rid;

	private String aadharNo;
	
	private String rocNo;
	
	private String userAction;
	
	private String financierPanNo;
	
	private String panNo;
	
	private String RepresentativeEmail;
	
	private String doorNo;
	
	private StateDTO state;
	
	private MandalDTO mandal;
	
	private PostOfficeDTO pincode;
	
	private String officeContactNo;
	
	private String institutionName;
	
	private LocalDate registrationFirmDate;
	
	private String userRelation;
	
	private String companyType;
	
	private String representativeName;
	
	private String representativeMobileNo;
	
	private String streetName;
	
	private DistrictDTO district;
	
	private String city;
	
	private String officeMail;
	

	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * @param rid
	 *            the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the faxNo
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * @param faxNo
	 *            the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @return the doorNo
	 */
	public String getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo
	 *            the doorNo to set
	 */
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark
	 *            the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the signatureImageUrl
	 */
	public String getSignatureImageUrl() {
		return signatureImageUrl;
	}

	/**
	 * @param signatureImageUrl
	 *            the signatureImageUrl to set
	 */
	public void setSignatureImageUrl(String signatureImageUrl) {
		this.signatureImageUrl = signatureImageUrl;
	}

	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 * @param profileImageUrl
	 *            the profileImageUrl to set
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification
	 *            the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @param empCode
	 *            the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the office
	 */
	public OfficeDTO getOffice() {
		return office;
	}

	/**
	 * @param office
	 *            the office to set
	 */
	public void setOffice(OfficeDTO office) {
		this.office = office;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @param aadharNo
	 *            the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the designation
	 */
	public DesignationDTO getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}

	/**
	 * @return the primaryRole
	 */
	public RolesDTO getPrimaryRole() {
		return primaryRole;
	}

	/**
	 * @param primaryRole
	 *            the primaryRole to set
	 */
	public void setPrimaryRole(RolesDTO primaryRole) {
		this.primaryRole = primaryRole;
	}

	/**
	 * @return the additionalRoles
	 */
	public String getAdditionalRoles() {
		return additionalRoles;
	}

	/**
	 * @param additionalRoles
	 *            the additionalRoles to set
	 */
	public void setAdditionalRoles(String additionalRoles) {
		this.additionalRoles = additionalRoles;
	}

	/**
	 * @return the state
	 */
	public StateDTO getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(StateDTO state) {
		this.state = state;
	}

	/**
	 * @return the district
	 */
	public DistrictDTO getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	/**
	 * @return the mandal
	 */
	public MandalDTO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal
	 *            the mandal to set
	 */
	public void setMandal(MandalDTO mandal) {
		this.mandal = mandal;
	}

	/**
	 * @return the pincode
	 */
	public PostOfficeDTO getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(PostOfficeDTO pincode) {
		this.pincode = pincode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MasterUsersDTO [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile + ", faxNo=" + faxNo
				+ ", doorNo=" + doorNo + ", streetName=" + streetName + ", landmark=" + landmark
				+ ", signatureImageUrl=" + signatureImageUrl + ", profileImageUrl=" + profileImageUrl
				+ ", qualification=" + qualification + ", message=" + message + ", empCode=" + empCode + ", userName="
				+ userName + ", phoneNo=" + phoneNo + ", office=" + office + ", password=" + password + ", aadharNo="
				+ aadharNo + ", status=" + status + ", designation=" + designation + ", primaryRole=" + primaryRole
				+ ", additionalRoles=" + additionalRoles + ", state=" + state + ", district=" + district + ", mandal="
				+ mandal + ", pincode=" + pincode + "]";
	}

	/**
	 * @return the rocNo
	 */
	public String getRocNo() {
		return rocNo;
	}

	/**
	 * @param rocNo the rocNo to set
	 */
	public void setRocNo(String rocNo) {
		this.rocNo = rocNo;
	}

	/**
	 * @return the userAction
	 */
	public String getUserAction() {
		return userAction;
	}

	/**
	 * @param userAction the userAction to set
	 */
	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	/**
	 * @return the financierPanNo
	 */
	public String getFinancierPanNo() {
		return financierPanNo;
	}

	/**
	 * @param financierPanNo the financierPanNo to set
	 */
	public void setFinancierPanNo(String financierPanNo) {
		this.financierPanNo = financierPanNo;
	}

	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}

	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * @return the representativeEmail
	 */
	public String getRepresentativeEmail() {
		return RepresentativeEmail;
	}

	/**
	 * @param representativeEmail the representativeEmail to set
	 */
	public void setRepresentativeEmail(String representativeEmail) {
		RepresentativeEmail = representativeEmail;
	}

	/**
	 * @return the officeContactNo
	 */
	public String getOfficeContactNo() {
		return officeContactNo;
	}

	/**
	 * @param officeContactNo the officeContactNo to set
	 */
	public void setOfficeContactNo(String officeContactNo) {
		this.officeContactNo = officeContactNo;
	}

	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}

	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	/**
	 * @return the registrationFirmDate
	 */
	public LocalDate getRegistrationFirmDate() {
		return registrationFirmDate;
	}

	/**
	 * @param registrationFirmDate the registrationFirmDate to set
	 */
	public void setRegistrationFirmDate(LocalDate registrationFirmDate) {
		this.registrationFirmDate = registrationFirmDate;
	}

	/**
	 * @return the userRelation
	 */
	public String getUserRelation() {
		return userRelation;
	}

	/**
	 * @param userRelation the userRelation to set
	 */
	public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

	/**
	 * @return the companyType
	 */
	public String getCompanyType() {
		return companyType;
	}

	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	/**
	 * @return the representativeName
	 */
	public String getRepresentativeName() {
		return representativeName;
	}

	/**
	 * @param representativeName the representativeName to set
	 */
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	/**
	 * @return the representativeMobileNo
	 */
	public String getRepresentativeMobileNo() {
		return representativeMobileNo;
	}

	/**
	 * @param representativeMobileNo the representativeMobileNo to set
	 */
	public void setRepresentativeMobileNo(String representativeMobileNo) {
		this.representativeMobileNo = representativeMobileNo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the officeMail
	 */
	public String getOfficeMail() {
		return officeMail;
	}

	/**
	 * @param officeMail the officeMail to set
	 */
	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
