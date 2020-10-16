package org.epragati.vcrImage.dto;

import java.time.LocalDateTime;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
public class EVcrPrintedDTO {

	private Boolean isEvcrPrinted;
	private String eVcrPrintedBy;
	private LocalDateTime eVcrPrintedDate;
	public Boolean getIsEvcrPrinted() {
		return isEvcrPrinted;
	}
	public void setIsEvcrPrinted(Boolean isEvcrPrinted) {
		this.isEvcrPrinted = isEvcrPrinted;
	}
	public String geteVcrPrintedBy() {
		return eVcrPrintedBy;
	}
	public void seteVcrPrintedBy(String eVcrPrintedBy) {
		this.eVcrPrintedBy = eVcrPrintedBy;
	}
	public LocalDateTime geteVcrPrintedDate() {
		return eVcrPrintedDate;
	}
	public void seteVcrPrintedDate(LocalDateTime eVcrPrintedDate) {
		this.eVcrPrintedDate = eVcrPrintedDate;
	}
	
	
}
