package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class OwnerDetailsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	private String address;
	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
