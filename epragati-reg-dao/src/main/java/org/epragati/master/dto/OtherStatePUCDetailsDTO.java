package org.epragati.master.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class OtherStatePUCDetailsDTO {
	
	@Id
	private String id;
	
	private LocalDate validFrom;
	
	private LocalDate validTo;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the validFrom
	 */
	public LocalDate getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public LocalDate getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	

}
