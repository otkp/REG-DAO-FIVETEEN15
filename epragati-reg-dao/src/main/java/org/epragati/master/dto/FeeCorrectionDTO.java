package org.epragati.master.dto;

import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fee_corrections")
@CompoundIndexes({ @CompoundIndex(name = "trNo_and_status", def = "{'trNo': 1, 'status': 1}"),
		@CompoundIndex(name = "prNo_and_status", def = "{'prNo': 1, 'status': 1}"),
		@CompoundIndex(name = "chassisNo_and_status", def = "{'chassisNo': 1, 'status': 1}"),
		@CompoundIndex(name = "officeCode_and_currentRoles", def = "{'officeCode': 1, 'currentRoles': 1}"), })
public class FeeCorrectionDTO extends BaseEntity {

	@Id
	private String id;
	private String applicationNo;
	private String trNo;
	private String prNo;
	private String chassisNo;

	private List<FeeDetailsDTO> feeDetails;
	private String officeCode;
	private String role;
	private List<ActionDetailsDTO> actiondetails;
	private LockedDetailsDTO lockedDetails;
	private Set<String> currentRoles;
	private boolean status;
	private boolean approved;
	private String applicationType;
	private boolean isStageCarriage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public List<FeeDetailsDTO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeeDetailsDTO> feeDetails) {
		this.feeDetails = feeDetails;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<ActionDetailsDTO> getActiondetails() {
		return actiondetails;
	}

	public void setActiondetails(List<ActionDetailsDTO> actiondetails) {
		this.actiondetails = actiondetails;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Set<String> getCurrentRoles() {
		return currentRoles;
	}

	public void setCurrentRoles(Set<String> currentRoles) {
		this.currentRoles = currentRoles;
	}

	public LockedDetailsDTO getLockedDetails() {
		return lockedDetails;
	}

	public void setLockedDetails(LockedDetailsDTO lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	/**
	 * @return the applicationType
	 */
	public String getApplicationType() {
		return applicationType;
	}

	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	/**
	 * @return the isStageCarriage
	 */
	public boolean isStageCarriage() {
		return isStageCarriage;
	}

	/**
	 * @param isStageCarriage the isStageCarriage to set
	 */
	public void setStageCarriage(boolean isStageCarriage) {
		this.isStageCarriage = isStageCarriage;
	}

}
