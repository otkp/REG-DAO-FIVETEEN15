package org.epragati.vcrImage.dto;

import java.time.LocalDateTime;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
public class SpeedGunPrintDTO {
	
	private Boolean isSpeedGunVcrPrinted;
	
	private String SpeedGunVcrPrintedBy;
	
	private LocalDateTime SpeedGunVcrPrintedDate;

	public Boolean getIsSpeedGunVcrPrinted() {
		return isSpeedGunVcrPrinted;
	}

	public void setIsSpeedGunVcrPrinted(Boolean isSpeedGunVcrPrinted) {
		this.isSpeedGunVcrPrinted = isSpeedGunVcrPrinted;
	}

	public String getSpeedGunVcrPrintedBy() {
		return SpeedGunVcrPrintedBy;
	}

	public void setSpeedGunVcrPrintedBy(String speedGunVcrPrintedBy) {
		SpeedGunVcrPrintedBy = speedGunVcrPrintedBy;
	}

	public LocalDateTime getSpeedGunVcrPrintedDate() {
		return SpeedGunVcrPrintedDate;
	}

	public void setSpeedGunVcrPrintedDate(LocalDateTime speedGunVcrPrintedDate) {
		SpeedGunVcrPrintedDate = speedGunVcrPrintedDate;
	}
	
	
	
}
