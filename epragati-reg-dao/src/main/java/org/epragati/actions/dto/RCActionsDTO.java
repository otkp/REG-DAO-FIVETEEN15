package org.epragati.actions.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.util.Status;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="rc_actions")
public class RCActionsDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prNo;
	private RegistrationDetailsDTO rcDetails;
	private Status.RCActionStatus actionStatus;
	private RCActionsDetailsDTO rcActionsDetails;
	//private SuspensionLogDTO actionDetails;
	private List<RCActionsDetailsDTO> suspensionLogs;
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
	public Status.RCActionStatus getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Status.RCActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}
	
	public RCActionsDetailsDTO getRcActionsDetails() {
		return rcActionsDetails;
	}
	public void setRcActionsDetails(RCActionsDetailsDTO rcActionsDetails) {
		this.rcActionsDetails = rcActionsDetails;
	}
	public List<RCActionsDetailsDTO> getSuspensionLogs() {
		return suspensionLogs;
	}
	public void setSuspensionLogs(List<RCActionsDetailsDTO> suspensionLogs) {
		this.suspensionLogs = suspensionLogs;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
}
