package org.epragati.master.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class OtherStateTaxDetailsDTO {
	
	@Id
	private String id;
	
	private String taxType;
	
	private Double taxAmount;
	
	private LocalDate validFrom;
	
	private LocalDate validTo;

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the taxAmount
	 */
	public Double getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
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
