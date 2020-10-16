package org.epragati.payment.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="enclosures")
public class Enclosures extends BaseEntity{

	/**
	 * @return the refId
	 */
	public String getRefId() {
		return refId;
	}
	/**
	 * @param refId the refId to set
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer enclosureId;
	private String proof;
	private String details;
	private Integer noOfAttachments;
	private String status;
	private Integer serviceID;
	private Boolean isRequired;
	private String refId;
	
	/**
	 * @return the enclosureId
	 */
	public Integer getEnclosureId() {
		return enclosureId;
	}
	/**
	 * @param enclosureId the enclosureId to set
	 */
	public void setEnclosureId(Integer enclosureId) {
		this.enclosureId = enclosureId;
	}
	/**
	 * @return the proof
	 */
	public String getProof() {
		return proof;
	}
	/**
	 * @param proof the proof to set
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the noOfAttachments
	 */
	public Integer getNoOfAttachments() {
		return noOfAttachments;
	}
	/**
	 * @param noOfAttachments the noOfAttachments to set
	 */
	public void setNoOfAttachments(Integer noOfAttachments) {
		this.noOfAttachments = noOfAttachments;
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
	 * @return the serviceID
	 */
	public Integer getServiceID() {
		return serviceID;
	}
	/**
	 * @param serviceID the serviceID to set
	 */
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	/**
	 * @return the isRequired
	 */
	public Boolean getIsRequired() {
		return isRequired;
	}
	/**
	 * @param isRequired the isRequired to set
	 */
	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enclosures [" + (enclosureId != null ? "enclosureId=" + enclosureId + ", " : "")
				+ (proof != null ? "proof=" + proof + ", " : "") + (details != null ? "details=" + details + ", " : "")
				+ (noOfAttachments != null ? "noOfAttachments=" + noOfAttachments + ", " : "")
				+ (status != null ? "status=" + status + ", " : "")
				+ (serviceID != null ? "serviceID=" + serviceID + ", " : "")
				+ (isRequired != null ? "isRequired=" + isRequired : "") + "]";
	}
	
	
}
