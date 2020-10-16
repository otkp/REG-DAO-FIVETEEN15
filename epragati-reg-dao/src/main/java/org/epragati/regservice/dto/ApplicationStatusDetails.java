package org.epragati.regservice.dto;

import java.time.LocalDateTime;

public class ApplicationStatusDetails {

	private String actionBy;
	private LocalDateTime actionTime;
	private String comments;
	private String role;

	public String getActionBy() {
		return actionBy;
	}
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}
	public LocalDateTime getActionTime() {
		return actionTime;
	}
	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
