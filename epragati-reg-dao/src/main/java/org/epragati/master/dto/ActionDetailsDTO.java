package org.epragati.master.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "action_details")
public class ActionDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String action;

	// private UsersDTO userDto;

	private String actionBy;
	private List<String> actionByRole;
	private String module;
	private String referenceNumber;
	private String iteration;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS")
	private LocalDateTime actionDatetime;

	private String reason;

	private Boolean isDoneProcess;
	
	private Integer index;
	
	
	
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Boolean getIsDoneProcess() {
		return isDoneProcess;
	}

	public void setIsDoneProcess(Boolean isDoneProcess) {
		this.isDoneProcess = isDoneProcess;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public List<String> getActionByRole() {
		return actionByRole;
	}

	public void setActionByRole(List<String> actionByRole) {
		this.actionByRole = actionByRole;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getIteration() {
		return iteration;
	}

	public void setIteration(String iteration) {
		this.iteration = iteration;
	}

	public LocalDateTime getActionDatetime() {
		return actionDatetime;
	}

	public void setActionDatetime(LocalDateTime actionDatetime) {
		this.actionDatetime = actionDatetime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the action
	 */

}
