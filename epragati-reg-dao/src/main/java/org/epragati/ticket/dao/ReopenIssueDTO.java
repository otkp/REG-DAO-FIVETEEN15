package org.epragati.ticket.dao;

import java.time.LocalDateTime;

public class ReopenIssueDTO {

	private String reOpenBy;
	private String reOpenComment;
	private String status;
	private LocalDateTime reOpenDate;
	private String ticketNo;

	public String getReOpenBy() {
		return reOpenBy;
	}

	public void setReOpenBy(String reOpenBy) {
		this.reOpenBy = reOpenBy;
	}

	public String getReOpenComment() {
		return reOpenComment;
	}

	public void setReOpenComment(String reOpenComment) {
		this.reOpenComment = reOpenComment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getReOpenDate() {
		return reOpenDate;
	}

	public void setReOpenDate(LocalDateTime reOpenDate) {
		this.reOpenDate = reOpenDate;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

}
