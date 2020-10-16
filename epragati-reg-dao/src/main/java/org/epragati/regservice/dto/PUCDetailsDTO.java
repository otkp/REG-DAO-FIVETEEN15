package org.epragati.regservice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PUCDetailsDTO {
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFrom;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTo;

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}	

}
