package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.FinancierEnclosuresDTO;
import org.epragati.images.vo.ImageInput;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "financier_create_request")
public class FinancierCreateRequestDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3115234390629572343L;

	@Id
	private String finAppNo;

	private String appNo;
	private String userId;
	private String firstName;
	private String firstname;
	private String middleName;
	private String lastName;
	private String email;
	private String mobile;
	private String faxNo;
	private String parentId;
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
	
	private Set<Integer> serviceIds;
	
	private List<ImageInput> imageInput;
	
	
	private List<ActionsDTO> userAction;

	private boolean status;
	private DesignationDTO designation;
	private RolesDTO primaryRole;
	private List<RolesDTO> additionalRoles;

	private MandalDTO mandalDTO;

	private String confirmpassword;
	private String newpassword;
	private Integer rid;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;
	private List<ActionDTO> actionItems;
	private boolean isPasswordResetRequired;

	private String parentUserId;
	private boolean isParent;

	private String aadharNo;

	private String rocNo;

	private String financierPanNo;

	private String panNo;

	private String representativeEmail;

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

	private String stateName;

	private String mandalName;

	private String districtName;

	private String regdNumber;
	private VillageDTO village;
	private String websiteAddress;

	private Integer userLevel;

	private Boolean isAccountNonLocked;

	private LocalDate startDate;
	private LocalDate endDate;

	private String uidToken;

	private String userDesignation;

	private String userDepartment;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;

	private String applicationStatus;

	// private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

	private FinancierEnclosuresDTO financierEnclosers;

	public FinancierEnclosuresDTO getFinancierEnclosers() {
		return financierEnclosers;
	}

	public void setFinancierEnclosers(FinancierEnclosuresDTO financierEnclosers) {
		this.financierEnclosers = financierEnclosers;
	}

	/**
	 * @return the applicationStatus
	 */
	public String getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the enclosures
	 */
	/*
	 * public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
	 * return enclosures; }
	 * 
	 *//**
		 * @param enclosures the enclosures to set
		 *//*
			 * public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>>
			 * enclosures) { this.enclosures = enclosures; }
			 */

	/**
	 * @return the finAppNo
	 */
	public String getFinAppNo() {
		return finAppNo;
	}

	/**
	 * @param finAppNo the finAppNo to set
	 */
	public void setFinAppNo(String finAppNo) {
		this.finAppNo = finAppNo;
	}

	/**
	 * @return the appNo
	 */
	public String getAppNo() {
		return appNo;
	}

	/**
	 * @param appNo the appNo to set
	 */
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
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
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
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
	 * @param lastName the lastName to set
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
	 * @param email the email to set
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
	 * @param mobile the mobile to set
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
	 * @param faxNo the faxNo to set
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
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
	 * @param signatureImageUrl the signatureImageUrl to set
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
	 * @param profileImageUrl the profileImageUrl to set
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
	 * @param qualification the qualification to set
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
	 * @param message the message to set
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
	 * @param empCode the empCode to set
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
	 * @param userName the userName to set
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
	 * @param phoneNo the phoneNo to set
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
	 * @param office the office to set
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
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userAction
	 */
	public List<ActionsDTO> getUserAction() {
		return userAction;
	}

	/**
	 * @param userAction the userAction to set
	 */
	public void setUserAction(List<ActionsDTO> userAction) {
		this.userAction = userAction;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
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
	 * @param designation the designation to set
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
	 * @param primaryRole the primaryRole to set
	 */
	public void setPrimaryRole(RolesDTO primaryRole) {
		this.primaryRole = primaryRole;
	}

	/**
	 * @return the additionalRoles
	 */
	public List<RolesDTO> getAdditionalRoles() {
		return additionalRoles;
	}

	/**
	 * @param additionalRoles the additionalRoles to set
	 */
	public void setAdditionalRoles(List<RolesDTO> additionalRoles) {
		this.additionalRoles = additionalRoles;
	}

	/**
	 * @return the mandalDTO
	 */
	public MandalDTO getMandalDTO() {
		return mandalDTO;
	}

	/**
	 * @param mandalDTO the mandalDTO to set
	 */
	public void setMandalDTO(MandalDTO mandalDTO) {
		this.mandalDTO = mandalDTO;
	}

	/**
	 * @return the confirmpassword
	 */
	public String getConfirmpassword() {
		return confirmpassword;
	}

	/**
	 * @param confirmpassword the confirmpassword to set
	 */
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	/**
	 * @return the newpassword
	 */
	public String getNewpassword() {
		return newpassword;
	}

	/**
	 * @param newpassword the newpassword to set
	 */
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	/**
	 * @return the actionItems
	 */
	public List<ActionDTO> getActionItems() {
		return actionItems;
	}

	/**
	 * @param actionItems the actionItems to set
	 */
	public void setActionItems(List<ActionDTO> actionItems) {
		this.actionItems = actionItems;
	}

	/**
	 * @return the isPasswordResetRequired
	 */
	public boolean isPasswordResetRequired() {
		return isPasswordResetRequired;
	}

	/**
	 * @param isPasswordResetRequired the isPasswordResetRequired to set
	 */
	public void setPasswordResetRequired(boolean isPasswordResetRequired) {
		this.isPasswordResetRequired = isPasswordResetRequired;
	}

	/**
	 * @return the parentUserId
	 */
	public String getParentUserId() {
		return parentUserId;
	}

	/**
	 * @param parentUserId the parentUserId to set
	 */
	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}

	/**
	 * @return the isParent
	 */
	public boolean isParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setParent(boolean isParent) {
		this.isParent = isParent;
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
		return representativeEmail;
	}

	/**
	 * @param representativeEmail the representativeEmail to set
	 */
	public void setRepresentativeEmail(String representativeEmail) {
		this.representativeEmail = representativeEmail;
	}

	/**
	 * @return the doorNo
	 */
	public String getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo the doorNo to set
	 */
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the state
	 */
	public StateDTO getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(StateDTO state) {
		this.state = state;
	}

	/**
	 * @return the mandal
	 */
	public MandalDTO getMandal() {
		return mandal;
	}

	/**
	 * @param mandal the mandal to set
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
	 * @param pincode the pincode to set
	 */
	public void setPincode(PostOfficeDTO pincode) {
		this.pincode = pincode;
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
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the district
	 */
	public DistrictDTO getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(DistrictDTO district) {
		this.district = district;
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
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the mandalName
	 */
	public String getMandalName() {
		return mandalName;
	}

	/**
	 * @param mandalName the mandalName to set
	 */
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	/**
	 * @return the regdNumber
	 */
	public String getRegdNumber() {
		return regdNumber;
	}

	/**
	 * @param regdNumber the regdNumber to set
	 */
	public void setRegdNumber(String regdNumber) {
		this.regdNumber = regdNumber;
	}

	/**
	 * @return the village
	 */
	public VillageDTO getVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(VillageDTO village) {
		this.village = village;
	}

	/**
	 * @return the websiteAddress
	 */
	public String getWebsiteAddress() {
		return websiteAddress;
	}

	/**
	 * @param websiteAddress the websiteAddress to set
	 */
	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	/**
	 * @return the userLevel
	 */
	public Integer getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	/**
	 * @return the isAccountNonLocked
	 */
	public Boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}

	/**
	 * @param isAccountNonLocked the isAccountNonLocked to set
	 */
	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the uidToken
	 */
	public String getUidToken() {
		return uidToken;
	}

	/**
	 * @param uidToken the uidToken to set
	 */
	public void setUidToken(String uidToken) {
		this.uidToken = uidToken;
	}

	/**
	 * @return the userDesignation
	 */
	public String getUserDesignation() {
		return userDesignation;
	}

	/**
	 * @param userDesignation the userDesignation to set
	 */
	public void setUserDesignation(String userDesignation) {
		this.userDesignation = userDesignation;
	}

	/**
	 * @return the userDepartment
	 */
	public String getUserDepartment() {
		return userDepartment;
	}

	/**
	 * @param userDepartment the userDepartment to set
	 */
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
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
	 * @return the imageInput
	 */
	public List<ImageInput> getImageInput() {
		return imageInput;
	}

	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(List<ImageInput> imageInput) {
		this.imageInput = imageInput;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}
	
	

}
