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
@Document(collection="user_registration_applications")
public class UserRegistrationApplicationsDTO  implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Integer uraId;
	private String applicationNo;
	private Integer serviceId;
	private String variationType;
	private Integer status;
	private LocalDateTime createdDate;
	private LocalDateTime lUpdate;

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
	 * @return the uraId
	 */
	public Integer getUraId() {
		return uraId;
	}


	/**
	 * @param uraId the uraId to set
	 */
	public void setUraId(Integer uraId) {
		this.uraId = uraId;
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
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}


	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}


	/**
	 * @return the variationType
	 */
	public String getVariationType() {
		return variationType;
	}


	/**
	 * @param variationType the variationType to set
	 */
	public void setVariationType(String variationType) {
		this.variationType = variationType;
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
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRegistrationApplicationsDTO [id=" + id + ", uraId=" + uraId + ", applicationNo=" + applicationNo
				+ ", serviceId=" + serviceId + ", variationType=" + variationType + ", status=" + status
				+ ", createdDate=" + createdDate + ", lUpdate=" + lUpdate + "]";
	}

}
