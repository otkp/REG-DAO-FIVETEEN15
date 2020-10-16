package org.epragati.common.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NotifyAffixationDTO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate hsrpAvailabilityDate;

	private String affixationCenterCode;

	public String getAffixationCenterCode() {
		return affixationCenterCode;
	}

	public void setAffixationCenterCode(String affixationCenterCode) {
		this.affixationCenterCode = affixationCenterCode;
	}

	public LocalDate getHsrpAvailabilityDate() {
		return hsrpAvailabilityDate;
	}

	public void setHsrpAvailabilityDate(LocalDate hsrpAvailabilityDate) {
		this.hsrpAvailabilityDate = hsrpAvailabilityDate;
	}

}
