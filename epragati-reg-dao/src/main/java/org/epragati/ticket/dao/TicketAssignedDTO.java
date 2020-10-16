package org.epragati.ticket.dao;

import java.time.LocalDateTime;

public class TicketAssignedDTO {

	private String assignedBy;
	private String assignedTo;
	private LocalDateTime assignedDate;
	private String assignComments;
	private Boolean isTicketAssigned = Boolean.TRUE;

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public LocalDateTime getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(LocalDateTime assignedDate) {
		this.assignedDate = assignedDate;
	}

	public String getAssignComments() {
		return assignComments;
	}

	public void setAssignComments(String assignComments) {
		this.assignComments = assignComments;
	}

	public Boolean getIsTicketAssigned() {
		return isTicketAssigned;
	}

	public void setIsTicketAssigned(Boolean isTicketAssigned) {
		this.isTicketAssigned = isTicketAssigned;
	}

}
