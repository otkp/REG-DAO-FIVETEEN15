package org.epragati.mobile.auth.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "mobile_app_otp")
public class AuthenticationOTP_DTO {

	/**
	 * Properties of OTP
	 */

	@Id
	private String id;
	private String aadharNo;
	private String mobileNo;
	private String displayName;
	private String otp;
	private LocalDateTime otpGeneratedTime;
	private String deviceNo;
	private String otpType;

	/**
	 * 
	 * 
	 * @return
	 */

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	/**
	 * @return the otpGeneratedTime
	 */
	public LocalDateTime getOtpGeneratedTime() {
		return otpGeneratedTime;
	}

	/**
	 * @param otpGeneratedTime the otpGeneratedTime to set
	 */
	public void setOtpGeneratedTime(LocalDateTime otpGeneratedTime) {
		this.otpGeneratedTime = otpGeneratedTime;
	}

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
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	/**
	 * @return the otpType
	 */
	public String getOtpType() {
		return otpType;
	}

	/**
	 * @param otpType the otpType to set
	 */
	public void setOtpType(String otpType) {
		this.otpType = otpType;
	}
	
	/**
	 * 
	 * 
	 */

	@Override
	public String toString() {
		return "AuthenticationOTP_DTO [aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + ", displayName=" + displayName
				+ ", otp=" + otp + ", otpGeneratedTime=" + otpGeneratedTime + ", deviceNo=" + deviceNo + ",id=" + id
				+ ",otpType=" + otpType + "]";
	}

}
