package org.epragati.sn.dto;

import java.io.Serializable;

public class CustomerDetails implements Serializable {

	private static final long serialVersionUID = -2992933588761970611L;

	private String firstName;

	private String lastName;

	private String mobileNo;

	private String emailId;

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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDetails [" + (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (mobileNo != null ? "mobileNo=" + mobileNo + ", " : "")
				+ (emailId != null ? "emailId=" + emailId : "") + "]";
	}

}
