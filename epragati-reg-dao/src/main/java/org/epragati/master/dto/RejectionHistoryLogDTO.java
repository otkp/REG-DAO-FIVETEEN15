package org.epragati.master.dto;

import java.time.LocalDateTime;

public class RejectionHistoryLogDTO {

	private String applicationNo;
	private String module;
	private LocalDateTime actionTime;
	private Boolean isSecondVehicleRejected;
	private String secondVehicleNotRejectedReason;
	private String secondVehicleId;
	private Boolean isInvalidVehicleRejection;
	private String invalidVehicleRejectionReason;
	private Boolean isDocumentRejected;
	private String documentRejectedReason;
	private String actionBy;
	private String role;
	private Integer iterationNo;
	private String classOfVehicle;
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
	 * @return the module
	 */
	public String getModule() {
		return module;
	}
	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}
	/**
	 * @return the actionTime
	 */
	public LocalDateTime getActionTime() {
		return actionTime;
	}
	/**
	 * @param actionTime the actionTime to set
	 */
	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}
	/**
	 * @return the isSecondVehicleRejected
	 */
	public Boolean getIsSecondVehicleRejected() {
		return isSecondVehicleRejected;
	}
	/**
	 * @param isSecondVehicleRejected the isSecondVehicleRejected to set
	 */
	public void setIsSecondVehicleRejected(Boolean isSecondVehicleRejected) {
		this.isSecondVehicleRejected = isSecondVehicleRejected;
	}
	/**
	 * @return the secondVehicleNotRejectedReason
	 */
	public String getSecondVehicleNotRejectedReason() {
		return secondVehicleNotRejectedReason;
	}
	/**
	 * @param secondVehicleNotRejectedReason the secondVehicleNotRejectedReason to set
	 */
	public void setSecondVehicleNotRejectedReason(String secondVehicleNotRejectedReason) {
		this.secondVehicleNotRejectedReason = secondVehicleNotRejectedReason;
	}
	/**
	 * @return the secondVehicleId
	 */
	public String getSecondVehicleId() {
		return secondVehicleId;
	}
	/**
	 * @param secondVehicleId the secondVehicleId to set
	 */
	public void setSecondVehicleId(String secondVehicleId) {
		this.secondVehicleId = secondVehicleId;
	}
	/**
	 * @return the isInvalidVehicleRejection
	 */
	public Boolean getIsInvalidVehicleRejection() {
		return isInvalidVehicleRejection;
	}
	/**
	 * @param isInvalidVehicleRejection the isInvalidVehicleRejection to set
	 */
	public void setIsInvalidVehicleRejection(Boolean isInvalidVehicleRejection) {
		this.isInvalidVehicleRejection = isInvalidVehicleRejection;
	}
	/**
	 * @return the invalidVehicleRejectionReason
	 */
	public String getInvalidVehicleRejectionReason() {
		return invalidVehicleRejectionReason;
	}
	/**
	 * @param invalidVehicleRejectionReason the invalidVehicleRejectionReason to set
	 */
	public void setInvalidVehicleRejectionReason(String invalidVehicleRejectionReason) {
		this.invalidVehicleRejectionReason = invalidVehicleRejectionReason;
	}
	/**
	 * @return the isDocumentRejected
	 */
	public Boolean getIsDocumentRejected() {
		return isDocumentRejected;
	}
	/**
	 * @param isDocumentRejected the isDocumentRejected to set
	 */
	public void setIsDocumentRejected(Boolean isDocumentRejected) {
		this.isDocumentRejected = isDocumentRejected;
	}
	/**
	 * @return the documentRejectedReason
	 */
	public String getDocumentRejectedReason() {
		return documentRejectedReason;
	}
	/**
	 * @param documentRejectedReason the documentRejectedReason to set
	 */
	public void setDocumentRejectedReason(String documentRejectedReason) {
		this.documentRejectedReason = documentRejectedReason;
	}
	/**
	 * @return the actionBy
	 */
	public String getActionBy() {
		return actionBy;
	}
	/**
	 * @param actionBy the actionBy to set
	 */
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
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
	 * @return the iterationNo
	 */
	public Integer getIterationNo() {
		return iterationNo;
	}
	/**
	 * @param iterationNo the iterationNo to set
	 */
	public void setIterationNo(Integer iterationNo) {
		this.iterationNo = iterationNo;
	}
	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}
	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}
	
	
	
}
