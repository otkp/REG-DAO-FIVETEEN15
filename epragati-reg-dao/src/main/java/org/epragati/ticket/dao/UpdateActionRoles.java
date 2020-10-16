package org.epragati.ticket.dao;

import java.time.LocalDateTime;

public class UpdateActionRoles {

	private String role;
	private String ticket;
	private String moduletype;
	private String userId;
	private String comment;
	private String actionStatus;
	private LocalDateTime createLocalDate;

	public LocalDateTime getCreateLocalDate() {
		return createLocalDate;
	}

	public void setCreateLocalDate(LocalDateTime createLocalDate) {
		this.createLocalDate = createLocalDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getModuletype() {
		return moduletype;
	}

	public void setModuletype(String moduletype) {
		this.moduletype = moduletype;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

}
