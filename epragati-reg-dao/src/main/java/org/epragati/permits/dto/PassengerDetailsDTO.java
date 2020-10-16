package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;

public class PassengerDetailsDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String passengerName;

	private String representativeName;

	private Integer age;

	private String address;

	private String mobile;

	private String emergencyContactName;

	private String emergencyContactNumber;

	private Integer seatNo;

	/**
	 * @return the passengerName
	 */
	public String getPassengerName() {
		return passengerName;
	}

	/**
	 * @param passengerName
	 *            the passengerName to set
	 */
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	/**
	 * @return the representativeName
	 */
	public String getRepresentativeName() {
		return representativeName;
	}

	/**
	 * @param representativeName
	 *            the representativeName to set
	 */
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @return the emergencyContactName
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * @param emergencyContactName
	 *            the emergencyContactName to set
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	/**
	 * @return the emergencyContactNumber
	 */
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	/**
	 * @param emergencyContactNumber
	 *            the emergencyContactNumber to set
	 */
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	/**
	 * @return the seatNo
	 */
	public Integer getSeatNo() {
		return seatNo;
	}

	/**
	 * @param seatNo
	 *            the seatNo to set
	 */
	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

}
