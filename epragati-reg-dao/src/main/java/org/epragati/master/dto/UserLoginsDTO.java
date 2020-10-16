package org.epragati.master.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author saikiran.kola
 *
 */
@Document(collection = "master_user_login")
public class UserLoginsDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Integer ulId;

	private String userId;

	private String firstName;

	private String lastName;

	private String aadhaarNo;

	private String mobile;

	private String altMobile;

	private String email;

	private String altEmail;

	private String validFrom;

	private String validTo;

	private String parentUserid;

	private String password;

	private String lastPasswordUpdated;

	private String officeCode;

	private Integer status;

	private String createdBy;

	private LocalDateTime createdDate;

	private LocalDateTime lUpdate;

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public String getAltEmail() {
		return altEmail;
	}

	public String getAltMobile() {
		return altMobile;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLastPasswordUpdated() {
		return lastPasswordUpdated;
	}

	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	public String getMobile() {
		return mobile;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public String getParentUserid() {
		return parentUserid;
	}

	public String getPassword() {
		return password;
	}

	public Integer getStatus() {
		return status;
	}

	public Integer getUlId() {
		return ulId;
	}

	public String getUserId() {
		return userId;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLastPasswordUpdated(String lastPasswordUpdated) {
		this.lastPasswordUpdated = lastPasswordUpdated;
	}

	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public void setParentUserid(String parentUserid) {
		this.parentUserid = parentUserid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUlId(Integer ulId) {
		this.ulId = ulId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

}
