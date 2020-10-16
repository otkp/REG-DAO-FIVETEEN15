package org.epragati.permits.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_permit_route_details")
public class PermitRouteDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5900945815569386695L;

	@Id
	private String id;

	private String permitType;

	private String cov;

	private String description;

	private Boolean status;

	private String code;

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
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType
	 *            the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}

	/**
	 * @param cov
	 *            the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
