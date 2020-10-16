package org.epragati.ticket.dao;

import java.time.LocalDateTime;

public class SuggestionActionRolesDTO {
	private String role;
	private String user;
	private String suggestion;
	private LocalDateTime suggestedDate;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public LocalDateTime getSuggestedDate() {
		return suggestedDate;
	}
	public void setSuggestedDate(LocalDateTime suggestedDate) {
		this.suggestedDate = suggestedDate;
	}
	
	
	
}
