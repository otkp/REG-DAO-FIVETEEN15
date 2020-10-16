package org.epragati.common.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ActionsDetailsDTO implements Serializable {

	private static final long serialVersionUID = -4153544430359039007L;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss.SSS")
	private LocalDateTime actionDatetime;

	private String action;

	private String actionBy;

	private String reason;

	public LocalDateTime getActionDatetime() {
		return actionDatetime;
	}

	public void setActionDatetime(LocalDateTime actionDatetime) {
		this.actionDatetime = actionDatetime;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
