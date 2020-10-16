package org.epragati.regservice.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.master.dto.OfficeDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class IssuingAuthorityDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OfficeDTO officeDetails;
	
	private String userId;
	
	private String role;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDateTime approveDate;

	/**
	 * @return the officeDetails
	 */
	public OfficeDTO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeDTO officeDetails) {
		this.officeDetails = officeDetails;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the approveDate
	 */
	public LocalDateTime getApproveDate() {
		return approveDate;
	}

	/**
	 * @param approveDate the approveDate to set
	 */
	public void setApproveDate(LocalDateTime approveDate) {
		this.approveDate = approveDate;
	}

}
