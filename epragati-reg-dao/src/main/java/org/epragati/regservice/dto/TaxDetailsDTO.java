package org.epragati.regservice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaxDetailsDTO {
	
	private String taxType;
	
	private Long taxAmount;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentDAte;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validUpto;
	
	private String vcrno;
	private String mvi;
	private Long collectedAmount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vcrTaxvalidUpto;
	//@JsonFormat(pattern = "dd-MM-yyyy")
	private String vcrPaymentDate;
	//@JsonFormat(pattern = "dd-MM-yyyy")
	private String vcrBooKedDate;
	public Long getCollectedAmount() {
		return collectedAmount;
	}

	public void setCollectedAmount(Long collectedAmount) {
		this.collectedAmount = collectedAmount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getVcrno() {
		return vcrno;
	}

	public void setVcrno(String vcrno) {
		this.vcrno = vcrno;
	}

	public String getMvi() {
		return mvi;
	}

	public void setMvi(String mvi) {
		this.mvi = mvi;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public LocalDate getPaymentDAte() {
		return paymentDAte;
	}

	public void setPaymentDAte(LocalDate paymentDAte) {
		this.paymentDAte = paymentDAte;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

	/**
	 * @return the vcrTaxvalidUpto
	 */
	public LocalDate getVcrTaxvalidUpto() {
		return vcrTaxvalidUpto;
	}

	/**
	 * @param vcrTaxvalidUpto the vcrTaxvalidUpto to set
	 */
	public void setVcrTaxvalidUpto(LocalDate vcrTaxvalidUpto) {
		this.vcrTaxvalidUpto = vcrTaxvalidUpto;
	}

	/**
	 * @return the vcrPaymentDate
	 */
	public String getVcrPaymentDate() {
		return vcrPaymentDate;
	}

	/**
	 * @param vcrPaymentDate the vcrPaymentDate to set
	 */
	public void setVcrPaymentDate(String vcrPaymentDate) {
		this.vcrPaymentDate = vcrPaymentDate;
	}

	/**
	 * @return the vcrBooKedDate
	 */
	public String getVcrBooKedDate() {
		return vcrBooKedDate;
	}

	/**
	 * @param vcrBooKedDate the vcrBooKedDate to set
	 */
	public void setVcrBooKedDate(String vcrBooKedDate) {
		this.vcrBooKedDate = vcrBooKedDate;
	}

}
