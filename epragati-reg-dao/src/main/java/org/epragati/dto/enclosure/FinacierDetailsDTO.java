package org.epragati.dto.enclosure;

import java.time.LocalDateTime;

public class FinacierDetailsDTO {

	private String userId;

	private String financierName;

	private String parentFinancierName;

	private String actionTaken;

	private String actionTakenBy;

	private LocalDateTime actionTakenTime;

	/**
	 * @return the parentFinancierName
	 */
	public String getParentFinancierName() {
		return parentFinancierName;
	}

	/**
	 * @param parentFinancierName the parentFinancierName to set
	 */
	public void setParentFinancierName(String parentFinancierName) {
		this.parentFinancierName = parentFinancierName;
	}

	/**
	 * @return the actionTaken
	 */
	public String getActionTaken() {
		return actionTaken;
	}

	/**
	 * @param actionTaken the actionTaken to set
	 */
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	/**
	 * @return the actionTakenBy
	 */
	public String getActionTakenBy() {
		return actionTakenBy;
	}

	/**
	 * @param actionTakenBy the actionTakenBy to set
	 */
	public void setActionTakenBy(String actionTakenBy) {
		this.actionTakenBy = actionTakenBy;
	}

	/**
	 * @return the actionTakenTime
	 */
	public LocalDateTime getActionTakenTime() {
		return actionTakenTime;
	}

	/**
	 * @param actionTakenTime the actionTakenTime to set
	 */
	public void setActionTakenTime(LocalDateTime actionTakenTime) {
		this.actionTakenTime = actionTakenTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFinancierName() {
		return financierName;
	}

	public void setFinancierName(String financierName) {
		this.financierName = financierName;
	}

}
