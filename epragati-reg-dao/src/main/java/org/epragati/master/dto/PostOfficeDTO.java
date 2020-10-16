package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_postal_office")
public class PostOfficeDTO extends BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	
	private Integer district;
	private Integer postOfficeCode;
	private Integer postOfficeId;
	private String postOfficeName;
	private Boolean status;
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
	 * @return the postOfficeCode
	 */
	public Integer getPostOfficeCode() {
		return postOfficeCode;
	}
	/**
	 * @param postOfficeCode the postOfficeCode to set
	 */
	public void setPostOfficeCode(Integer postOfficeCode) {
		this.postOfficeCode = postOfficeCode;
	}
	/**
	 * @return the postOfficeId
	 */
	public Integer getPostOfficeId() {
		return postOfficeId;
	}
	/**
	 * @param postOfficeId the postOfficeId to set
	 */
	public void setPostOfficeId(Integer postOfficeId) {
		this.postOfficeId = postOfficeId;
	}
	/**
	 * @return the postOfficeName
	 */
	public String getPostOfficeName() {
		return postOfficeName;
	}
	/**
	 * @param postOfficeName the postOfficeName to set
	 */
	public void setPostOfficeName(String postOfficeName) {
		this.postOfficeName = postOfficeName;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PostOfficeDTO [id=" + id + ", district=" + district + ", postOfficeCode=" + postOfficeCode
				+ ", postOfficeId=" + postOfficeId + ", postOfficeName=" + postOfficeName + ", status=" + status + "]";
	}
}
