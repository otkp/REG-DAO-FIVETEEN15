package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "officeWise_permits_avilability")
public class OfficeWisePermitsAvilabilityDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String officeCode;

	private Integer totalPermits;

	private Integer bookedPermits;

	private Integer remainingPermits;

	private boolean status;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode
	 *            the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the totalPermits
	 */
	public Integer getTotalPermits() {
		return totalPermits;
	}

	/**
	 * @param totalPermits
	 *            the totalPermits to set
	 */
	public void setTotalPermits(Integer totalPermits) {
		this.totalPermits = totalPermits;
	}

	/**
	 * @return the bookedPermits
	 */
	public Integer getBookedPermits() {
		return bookedPermits;
	}

	/**
	 * @param bookedPermits
	 *            the bookedPermits to set
	 */
	public void setBookedPermits(Integer bookedPermits) {
		this.bookedPermits = bookedPermits;
	}

	/**
	 * @return the remainingPermits
	 */
	public Integer getRemainingPermits() {
		return remainingPermits;
	}

	/**
	 * @param remainingPermits
	 *            the remainingPermits to set
	 */
	public void setRemainingPermits(Integer remainingPermits) {
		this.remainingPermits = remainingPermits;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

}
