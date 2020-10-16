package org.epragati.permits.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.util.Status;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="permit_susp_canc_Rev_details")
public class PermitSuspCanRevDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String prNo;
	private RegistrationDetailsDTO rcDetails;
	private Status.permitSuspCanRevStatus actionStatus;
	private PermitActionsDTO permitActions;
	private List<PermitDetailsDTO> permitDetailsDTO;
	private List<String> permitNums;
	private List<String> appliedCov;
	private String officeCode;
	
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public RegistrationDetailsDTO getRcDetails() {
		return rcDetails;
	}
	public void setRcDetails(RegistrationDetailsDTO rcDetails) {
		this.rcDetails = rcDetails;
	}
	public Status.permitSuspCanRevStatus getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Status.permitSuspCanRevStatus actionStatus) {
		this.actionStatus = actionStatus;
	}
	public PermitActionsDTO getPermitActions() {
		return permitActions;
	}
	public void setPermitActions(PermitActionsDTO permitActions) {
		this.permitActions = permitActions;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	public List<PermitDetailsDTO> getPermitDetailsDTO() {
		return permitDetailsDTO;
	}
	public void setPermitDetailsDTO(List<PermitDetailsDTO> permitDetailsDTO) {
		this.permitDetailsDTO = permitDetailsDTO;
	}
	public List<String> getAppliedCov() {
		return appliedCov;
	}
	public void setAppliedCov(List<String> appliedCov) {
		this.appliedCov = appliedCov;
	}
	public List<String> getPermitNums() {
		return permitNums;
	}
	public void setPermitNums(List<String> permitNums) {
		this.permitNums = permitNums;
	}
	
	
}
