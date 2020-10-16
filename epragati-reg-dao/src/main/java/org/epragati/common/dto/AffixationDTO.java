package org.epragati.common.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AffixationDTO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfAffixation;

	private String affixationCenterCode;

	public LocalDate getDateOfAffixation() {
		return dateOfAffixation;
	}

	public void setDateOfAffixation(LocalDate dateOfAffixation) {
		this.dateOfAffixation = dateOfAffixation;
	}


	public String getAffixationCenterCode() {
		return affixationCenterCode;
	}

	public void setAffixationCenterCode(String affixationCenterCode) {
		this.affixationCenterCode = affixationCenterCode;
	}

}
