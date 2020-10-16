package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_permit_class")
public class PermitClassDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Integer permitClassId;

	private String description;

	private Boolean status;

	private String code;

	private String requiredInRenewal;
	private Integer serviceId;
	
	private Boolean reqiredExtensionOfValidity;
	
	private Boolean inRlServices;

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
	 * @return the permitClassId
	 */
	public Integer getPermitClassId() {
		return permitClassId;
	}

	/**
	 * @param permitClassId
	 *            the permitClassId to set
	 */
	public void setPermitClassId(Integer permitClassId) {
		this.permitClassId = permitClassId;
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

	/**
	 * @return the requiredInRenewal
	 */
	public String getRequiredInRenewal() {
		return requiredInRenewal;
	}

	/**
	 * @param requiredInRenewal
	 *            the requiredInRenewal to set
	 */
	public void setRequiredInRenewal(String requiredInRenewal) {
		this.requiredInRenewal = requiredInRenewal;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the reqiredExtensionOfValidity
	 */
	public Boolean getReqiredExtensionOfValidity() {
		return reqiredExtensionOfValidity;
	}

	/**
	 * @param reqiredExtensionOfValidity the reqiredExtensionOfValidity to set
	 */
	public void setReqiredExtensionOfValidity(Boolean reqiredExtensionOfValidity) {
		this.reqiredExtensionOfValidity = reqiredExtensionOfValidity;
	}

	/**
	 * @return the inRlServices
	 */
	public Boolean getInRlServices() {
		return inRlServices;
	}

	/**
	 * @param inRlServices the inRlServices to set
	 */
	public void setInRlServices(Boolean inRlServices) {
		this.inRlServices = inRlServices;
	}
	
	
}
