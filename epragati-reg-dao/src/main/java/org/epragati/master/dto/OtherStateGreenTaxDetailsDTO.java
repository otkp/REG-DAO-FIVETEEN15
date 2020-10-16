package org.epragati.master.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class OtherStateGreenTaxDetailsDTO {

	@Id
	private String id;
	
	private String greenTaxChallanNumber;
	
	private Double greenTaxAmount;
	
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
	 * @return the greenTaxChallanNumber
	 */
	public String getGreenTaxChallanNumber() {
		return greenTaxChallanNumber;
	}

	/**
	 * @param greenTaxChallanNumber the greenTaxChallanNumber to set
	 */
	public void setGreenTaxChallanNumber(String greenTaxChallanNumber) {
		this.greenTaxChallanNumber = greenTaxChallanNumber;
	}

	/**
	 * @return the greenTaxAmount
	 */
	public Double getGreenTaxAmount() {
		return greenTaxAmount;
	}

	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Double greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
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
