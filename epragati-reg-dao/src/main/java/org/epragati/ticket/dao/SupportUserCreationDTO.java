package org.epragati.ticket.dao;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "support_users")
public class SupportUserCreationDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String empId;
	private String empDesgn;
	@Id
	private String userId;
	private List<String> district;
	private List<Integer> districtId;
	private List<String> module;
	private String role;
	private String mobileNumber;
	private String aadharNumber;
	private String empEmail;
	private String status;
	private String password;
	private PrimaryRoleUser primaryRoleUser;
	private List<PrimaryRoleUser> additionalRoleUser;
	private Boolean updatePassword = Boolean.TRUE;

	public Boolean getUpdatePassword() {
		return updatePassword;
	}

	public void setUpdatePassword(Boolean updatePassword) {
		this.updatePassword = updatePassword;
	}

	public PrimaryRoleUser getPrimaryRoleUser() {
		return primaryRoleUser;
	}

	public void setPrimaryRoleUser(PrimaryRoleUser primaryRoleUser) {
		this.primaryRoleUser = primaryRoleUser;
	}

	public List<PrimaryRoleUser> getAdditionalRoleUser() {
		return additionalRoleUser;
	}

	public void setAdditionalRoleUser(List<PrimaryRoleUser> additionalRoleUser) {
		this.additionalRoleUser = additionalRoleUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpDesgn() {
		return empDesgn;
	}

	public void setEmpDesgn(String empDesgn) {
		this.empDesgn = empDesgn;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userid) {
		this.userId = userid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getDistrict() {
		return district;
	}

	public void setDistrict(List<String> district) {
		this.district = district;
	}

	public List<Integer> getDistrictId() {
		return districtId;
	}

	public void setDistrictId(List<Integer> districtId) {
		this.districtId = districtId;
	}

	public List<String> getModule() {
		return module;
	}

	public void setModule(List<String> module) {
		this.module = module;
	}

}
