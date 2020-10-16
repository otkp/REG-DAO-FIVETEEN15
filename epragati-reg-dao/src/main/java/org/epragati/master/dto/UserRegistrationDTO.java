package org.epragati.master.dto;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="user_registration")
public class UserRegistrationDTO  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Integer rId;
	private String name;
	private String repName;
	private String address1;
	private String address2;
	private Integer village;
	private Integer mandal;
	private Integer district;
	private String pan;
	private String tin;
	private String email;
	private String altEmail;
	private Integer mobile;
	private Integer alMobile; 
	private String repEmail;
	private Integer repMobile;
	private Integer repAltMobile;
	private Integer phone;
	private String repAadhaar;
	private String rtaOffice;
	private Integer userId;
	private Integer userType;
	private Integer status;
	private String createdBy;
	private LocalDateTime createddate;
	private LocalDateTime lUpdate;
	private String applicationNo;
	
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
	 * @return the rId
	 */
	public Integer getrId() {
		return rId;
	}
	/**
	 * @param rId the rId to set
	 */
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the repName
	 */
	public String getRepName() {
		return repName;
	}
	/**
	 * @param repName the repName to set
	 */
	public void setRepName(String repName) {
		this.repName = repName;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the village
	 */
	public Integer getVillage() {
		return village;
	}
	/**
	 * @param village the village to set
	 */
	public void setVillage(Integer village) {
		this.village = village;
	}
	/**
	 * @return the mandal
	 */
	public Integer getMandal() {
		return mandal;
	}
	/**
	 * @param mandal the mandal to set
	 */
	public void setMandal(Integer mandal) {
		this.mandal = mandal;
	}
	/**
	 * @return the district
	 */
	public Integer getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(Integer district) {
		this.district = district;
	}
	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}
	/**
	 * @return the tin
	 */
	public String getTin() {
		return tin;
	}
	/**
	 * @param tin the tin to set
	 */
	public void setTin(String tin) {
		this.tin = tin;
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
	 * @return the mobile
	 */
	public Integer getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the alMobile
	 */
	public Integer getAlMobile() {
		return alMobile;
	}
	/**
	 * @param alMobile the alMobile to set
	 */
	public void setAlMobile(Integer alMobile) {
		this.alMobile = alMobile;
	}
	/**
	 * @return the repEmail
	 */
	public String getRepEmail() {
		return repEmail;
	}
	/**
	 * @param repEmail the repEmail to set
	 */
	public void setRepEmail(String repEmail) {
		this.repEmail = repEmail;
	}
	/**
	 * @return the repMobile
	 */
	public Integer getRepMobile() {
		return repMobile;
	}
	/**
	 * @param repMobile the repMobile to set
	 */
	public void setRepMobile(Integer repMobile) {
		this.repMobile = repMobile;
	}
	/**
	 * @return the repAltMobile
	 */
	public Integer getRepAltMobile() {
		return repAltMobile;
	}
	/**
	 * @param repAltMobile the repAltMobile to set
	 */
	public void setRepAltMobile(Integer repAltMobile) {
		this.repAltMobile = repAltMobile;
	}
	/**
	 * @return the phone
	 */
	public Integer getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	/**
	 * @return the repAadhaar
	 */
	public String getRepAadhaar() {
		return repAadhaar;
	}
	/**
	 * @param repAadhaar the repAadhaar to set
	 */
	public void setRepAadhaar(String repAadhaar) {
		this.repAadhaar = repAadhaar;
	}
	/**
	 * @return the rtaOffice
	 */
	public String getRtaOffice() {
		return rtaOffice;
	}
	/**
	 * @param rtaOffice the rtaOffice to set
	 */
	public void setRtaOffice(String rtaOffice) {
		this.rtaOffice = rtaOffice;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userType
	 */
	public Integer getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
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
	 * @return the createddate
	 */
	public LocalDateTime getCreateddate() {
		return createddate;
	}
	/**
	 * @param createddate the createddate to set
	 */
	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}
	/**
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}
	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRegistrationDTO [id=" + id + ", rId=" + rId + ", name=" + name + ", repName=" + repName
				+ ", address1=" + address1 + ", address2=" + address2 + ", village=" + village + ", mandal=" + mandal
				+ ", district=" + district + ", pan=" + pan + ", tin=" + tin + ", email=" + email + ", altEmail="
				+ altEmail + ", mobile=" + mobile + ", alMobile=" + alMobile + ", repEmail=" + repEmail + ", repMobile="
				+ repMobile + ", repAltMobile=" + repAltMobile + ", phone=" + phone + ", repAadhaar=" + repAadhaar
				+ ", rtaOffice=" + rtaOffice + ", userId=" + userId + ", userType=" + userType + ", status=" + status
				+ ", createdBy=" + createdBy + ", createddate=" + createddate + ", lUpdate=" + lUpdate
				+ ", applicationNo=" + applicationNo + "]";
	}
	
}
