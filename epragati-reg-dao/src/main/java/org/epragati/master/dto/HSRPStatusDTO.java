package org.epragati.master.dto;

public class HSRPStatusDTO {
	
	private boolean trStatus;
	private boolean prStatus;
	private String officeCode;
	
	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}
	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	/**
	 * @return the trStatus
	 */
	public boolean isTrStatus() {
		return trStatus;
	}
	/**
	 * @param trStatus the trStatus to set
	 */
	public void setTrStatus(boolean trStatus) {
		this.trStatus = trStatus;
	}
	/**
	 * @return the prStatus
	 */
	public boolean isPrStatus() {
		return prStatus;
	}
	/**
	 * @param prStatus the prStatus to set
	 */
	public void setPrStatus(boolean prStatus) {
		this.prStatus = prStatus;
	}
}
