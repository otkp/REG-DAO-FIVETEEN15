package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_user_logins")
public class MasterUserLoginsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String userId;

	private String firstName;

	private String lastName;

	private String aadhaarNo;

	private Integer rid; 

	private String mobile;

	private String altMobile;

	private String email;

	private String altEmail;

	private String validFrom;

	private String validTo;

	private String parentUserId;

	private String password;

	private String lastPasswordUpdated;

	private String officeCode;

	private RolesDTO primaryRole; 

	private String additionalRoles;

	private Boolean status;

	private String createdBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.mmm")
	private LocalDateTime createDate;

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
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	/**
	 * @param aadhaarNo the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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
	 * @return the altMobile
	 */
	public String getAltMobile() {
		return altMobile;
	}

	/**
	 * @param altMobile the altMobile to set
	 */
	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
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
	 * @return the altEmail
	 */
	public String getAltEmail() {
		return altEmail;
	}

	/**
	 * @param altEmail the altEmail to set
	 */
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	/**
	 * @return the validFrom
	 */
	public String getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public String getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(String validTo) {
		this.validTo = validTo;
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
	 * @return the lastPasswordUpdated
	 */
	public String getLastPasswordUpdated() {
		return lastPasswordUpdated;
	}

	/**
	 * @param lastPasswordUpdated the lastPasswordUpdated to set
	 */
	public void setLastPasswordUpdated(String lastPasswordUpdated) {
		this.lastPasswordUpdated = lastPasswordUpdated;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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
	public String getAdditionalRoles() {
		return additionalRoles;
	}

	/**
	 * @param additionalRoles the additionalRoles to set
	 */
	public void setAdditionalRoles(String additionalRoles) {
		this.additionalRoles = additionalRoles;
	}

	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createDate
	 */
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MasterUserLoginsDTO [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", aadhaarNo=" + aadhaarNo + ", mobile=" + mobile + ", altMobile=" + altMobile + ", email="
				+ email + ", altEmail=" + altEmail + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", parentUserId=" + parentUserId + ", password=" + password + ", lastPasswordUpdated="
				+ lastPasswordUpdated + ", officeCode=" + officeCode + ", primaryRole=" + primaryRole
				+ ", additionalRoles=" + additionalRoles + ", status=" + status + ", createdBy=" + createdBy
				+ ", createDate=" + createDate + "]";
	}

}
