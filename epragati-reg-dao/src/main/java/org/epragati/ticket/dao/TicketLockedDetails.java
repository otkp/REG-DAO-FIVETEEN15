package org.epragati.ticket.dao;

import java.time.LocalDateTime;

public class TicketLockedDetails {
	private String user;
	private LocalDateTime lockedDate;
	private String role;
	private String ticketNo;
	private String module;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public LocalDateTime getLockedDate() {
		return lockedDate;
	}
	public void setLockedDate(LocalDateTime lockedDate) {
		this.lockedDate = lockedDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
   
}
