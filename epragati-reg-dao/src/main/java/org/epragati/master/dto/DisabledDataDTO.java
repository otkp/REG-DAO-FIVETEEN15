package org.epragati.master.dto;

public class DisabledDataDTO {

	private boolean disabled;
	private String disabledComment;
	private String disabilityCov;
	/**
	 * @return the disabled
	 */
	public boolean isDisabled() {
		return disabled;
	}
	/**
	 * @param disabled the disabled to set
	 */
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	/**
	 * @return the disabledComment
	 */
	public String getDisabledComment() {
		return disabledComment;
	}
	/**
	 * @param disabledComment the disabledComment to set
	 */
	public void setDisabledComment(String disabledComment) {
		this.disabledComment = disabledComment;
	}
	/**
	 * @return the disabilityCov
	 */
	public String getDisabilityCov() {
		return disabilityCov;
	}
	/**
	 * @param disabilityCov the disabilityCov to set
	 */
	public void setDisabilityCov(String disabilityCov) {
		this.disabilityCov = disabilityCov;
	}

}
