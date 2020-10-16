package org.epragati.sn.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ActionsDetails implements Serializable {

	private static final long serialVersionUID = -5774630240687547309L;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
