package org.epragati.dispatcher.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RecordsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String prNo;
	private String applicationNo;
	
	private String userName;
	private String emsNumber;
	
	private String mobileNo;
	private Integer pinCode;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime postedDate;

	private String remarks;



	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmsNumber() {
		return emsNumber;
	}

	public void setEmsNumber(String emsNumber) {
		this.emsNumber = emsNumber;
	}

	public LocalDateTime getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDateTime postedDate) {
		this.postedDate = postedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "RecordsDTO [prNo=" + prNo + ", applicationNo=" + applicationNo + ", userName=" + userName
				+ ", emsNumber=" + emsNumber + ", mobileNo=" + mobileNo + ", pinCode=" + pinCode + ", postedDate="
				+ postedDate + ", remarks=" + remarks + "]";
	}

	


}