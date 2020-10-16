package org.epragati.regservice.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="trailer_details")
public class TrailerDetailsDTO  extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String applicationNo;
	
	private String chassisNo;
	
	private String cov;
	
	private String loginId;
	
	private Integer rId;
	
	private String status;
	
	//private LocalDate createdDate;
	//disscussed with sahoo and commented

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
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

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the createdDate
	 */
/*	public LocalDate getCreatedDate() {
		return createdDate;
	}

	*//**
	 * @param createdDate the createdDate to set
	 *//*
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
*/
}
