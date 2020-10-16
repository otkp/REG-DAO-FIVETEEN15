package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.ApplicantTypeEnum;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_enclosures")
public class EnclosuresDTO extends BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String details;

	private Integer enclosureId;

	private Integer noOfAttachments;

	private String proof;

	private Integer serviceID;

	private String status;

	private boolean isRequired;

	private Integer slNo;

	private List<String> basedOnRole;

	private Boolean isDifferentlyAbled;

	private String Vehicletype;
	private String Vehicletypecategory;

	private String classOfVehicle;
	
	private ApplicantTypeEnum applicantType;


	public String getVehicletype() {
		return Vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		Vehicletype = vehicletype;
	}

	public String getVehicletypecategory() {
		return Vehicletypecategory;
	}

	public void setVehicletypecategory(String vehicletypecategory) {
		Vehicletypecategory = vehicletypecategory;
	}

	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}

	/**
	 * @param slNo
	 *            the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}

	/**
	 * @return the isDifferentlyAbled
	 */
	public Boolean getIsDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	/**
	 * @param isDifferentlyAbled
	 *            the isDifferentlyAbled to set
	 */
	public void setIsDifferentlyAbled(Boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	/**
	 * @return the basedOnRole
	 */
	public List<String> getBasedOnRole() {
		return basedOnRole;
	}

	/**
	 * @param basedOnRole
	 *            the basedOnRole to set
	 */
	public void setBasedOnRole(List<String> basedOnRole) {
		this.basedOnRole = basedOnRole;
	}

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
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details
	 *            the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the enclosureId
	 */
	public Integer getEnclosureId() {
		return enclosureId;
	}

	/**
	 * @param enclosureId
	 *            the enclosureId to set
	 */
	public void setEnclosureId(Integer enclosureId) {
		this.enclosureId = enclosureId;
	}

	/**
	 * @return the noOfAttachments
	 */
	public Integer getNoOfAttachments() {
		return noOfAttachments;
	}

	/**
	 * @param noOfAttachments
	 *            the noOfAttachments to set
	 */
	public void setNoOfAttachments(Integer noOfAttachments) {
		this.noOfAttachments = noOfAttachments;
	}

	/**
	 * @return the proof
	 */
	public String getProof() {
		return proof;
	}

	/**
	 * @param proof
	 *            the proof to set
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}

	/**
	 * @return the serviceID
	 */
	public Integer getServiceID() {
		return serviceID;
	}

	/**
	 * @param serviceID
	 *            the serviceID to set
	 */
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the isRequired
	 */
	public boolean isRequired() {
		return isRequired;
	}

	/**
	 * @param isRequired
	 *            the isRequired to set
	 */
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EnclosuresDTO [id=" + id + ", details=" + details + ", enclosureId=" + enclosureId
				+ ", noOfAttachments=" + noOfAttachments + ", proof=" + proof + ", serviceID=" + serviceID + ", status="
				+ status + ", isRequired=" + isRequired + "]";
	}

	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle
	 *            the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the applicantType
	 */
	public ApplicantTypeEnum getApplicantType() {
		return applicantType;
	}

	/**
	 * @param applicantType the applicantType to set
	 */
	public void setApplicantType(ApplicantTypeEnum applicantType) {
		this.applicantType = applicantType;
	}

	
}
