package org.epragati.regservice.dto;

import java.time.LocalDate;

import org.epragati.util.StatusRegistration;

public class Comments {
	private String userId;
	private String role;
	private String comments;
	private LocalDate date;
	private StatusRegistration status;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public StatusRegistration getStatus() {
		return status;
	}
	public void setStatus(StatusRegistration status) {
		this.status = status;
	}
	
}
