package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TaxComponentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String taxName;
	private Double amount;
	private Long penalty;
	private Double quaterAmount;
	private LocalDateTime paidDate;
	private LocalDate validityFrom;
	private LocalDate validityTo;
	private Double taxArrears;
	private Long penaltyArrears;
	/**
	 * @return the taxName
	 */
	public String getTaxName() {
		return taxName;
	}
	/**
	 * @param taxName the taxName to set
	 */
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the penalty
	 */
	public Long getPenalty() {
		return penalty;
	}
	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(Long penalty) {
		this.penalty = penalty;
	}
	/**
	 * @return the quaterAmount
	 */
	public Double getQuaterAmount() {
		return quaterAmount;
	}
	/**
	 * @param quaterAmount the quaterAmount to set
	 */
	public void setQuaterAmount(Double quaterAmount) {
		this.quaterAmount = quaterAmount;
	}
	/**
	 * @return the paidDate
	 */
	public LocalDateTime getPaidDate() {
		return paidDate;
	}
	/**
	 * @param paidDate the paidDate to set
	 */
	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}
	/**
	 * @return the validityFrom
	 */
	public LocalDate getValidityFrom() {
		return validityFrom;
	}
	/**
	 * @param validityFrom the validityFrom to set
	 */
	public void setValidityFrom(LocalDate validityFrom) {
		this.validityFrom = validityFrom;
	}
	/**
	 * @return the validityTo
	 */
	public LocalDate getValidityTo() {
		return validityTo;
	}
	/**
	 * @param validityTo the validityTo to set
	 */
	public void setValidityTo(LocalDate validityTo) {
		this.validityTo = validityTo;
	}
	/**
	 * @return the taxArrears
	 */
	public Double getTaxArrears() {
		return taxArrears;
	}
	/**
	 * @param taxArrears the taxArrears to set
	 */
	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}
	/**
	 * @return the penaltyArrears
	 */
	public Long getPenaltyArrears() {
		return penaltyArrears;
	}
	/**
	 * @param penaltyArrears the penaltyArrears to set
	 */
	public void setPenaltyArrears(Long penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	
	
	
	
}
