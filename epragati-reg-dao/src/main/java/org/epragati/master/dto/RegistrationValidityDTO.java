package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistrationValidityDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private LocalDateTime trValidity;
	private LocalDateTime registrationValidity;
	private LocalDateTime QuarterlyTaxValidity;
	private LocalDate taxValidity;
	private LocalDateTime greenTaxValidity;
	private LocalDate cessValidity;
	private LocalDate financeAgreementDate;
	private LocalDate prGeneratedDate;
	private LocalDate trGeneratedDate;
	private String prGeneratedDateStr;
	private String trGeneratedDateStr;
	private LocalDate fcValidity;

	/**
	 * @return the registrationValidity
	 */
	public LocalDateTime getRegistrationValidity() {
		return registrationValidity;
	}

	/**
	 * @param registrationValidity
	 *            the registrationValidity to set
	 */
	public void setRegistrationValidity(LocalDateTime registrationValidity) {
		this.registrationValidity = registrationValidity;
	}

	/**
	 * @return the quarterlyTaxValidity
	 */
	public LocalDateTime getQuarterlyTaxValidity() {
		return QuarterlyTaxValidity;
	}

	/**
	 * @param quarterlyTaxValidity
	 *            the quarterlyTaxValidity to set
	 */
	public void setQuarterlyTaxValidity(LocalDateTime quarterlyTaxValidity) {
		QuarterlyTaxValidity = quarterlyTaxValidity;
	}

	/**
	 * @return the taxValidity
	 */
	public LocalDate getTaxValidity() {
		return taxValidity;
	}

	/**
	 * @param taxValidity
	 *            the taxValidity to set
	 */
	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}

	/**
	 * @return the greenTaxValidity
	 */
	public LocalDateTime getGreenTaxValidity() {
		return greenTaxValidity;
	}

	/**
	 * @param greenTaxValidity
	 *            the greenTaxValidity to set
	 */
	public void setGreenTaxValidity(LocalDateTime greenTaxValidity) {
		this.greenTaxValidity = greenTaxValidity;
	}

	/**
	 * @return the cessValidity
	 */
	public LocalDate getCessValidity() {
		return cessValidity;
	}

	/**
	 * @param cessValidity
	 *            the cessValidity to set
	 */
	public void setCessValidity(LocalDate cessValidity) {
		this.cessValidity = cessValidity;
	}

	/**
	 * @return the trValidity
	 */
	public LocalDateTime getTrValidity() {
		return trValidity;
	}

	/**
	 * @param trValidity
	 *            the trValidity to set
	 */
	public void setTrValidity(LocalDateTime trValidity) {
		this.trValidity = trValidity;
	}

	public LocalDate getFinanceAgreementDate() {
		return financeAgreementDate;
	}

	public void setFinanceAgreementDate(LocalDate financeAgreementDate) {
		this.financeAgreementDate = financeAgreementDate;
	}

	public LocalDate getPrGeneratedDate() {
		return prGeneratedDate;
	}

	public void setPrGeneratedDate(LocalDate prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}

	public LocalDate getTrGeneratedDate() {
		return trGeneratedDate;
	}

	public void setTrGeneratedDate(LocalDate trGeneratedDate) {
		this.trGeneratedDate = trGeneratedDate;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public String getPrGeneratedDateStr() {
		return prGeneratedDateStr;
	}

	public void setPrGeneratedDateStr(String prGeneratedDateStr) {
		this.prGeneratedDateStr = prGeneratedDateStr;
	}

	public String getTrGeneratedDateStr() {
		return trGeneratedDateStr;
	}

	public void setTrGeneratedDateStr(String trGeneratedDateStr) {
		this.trGeneratedDateStr = trGeneratedDateStr;
	}

}
