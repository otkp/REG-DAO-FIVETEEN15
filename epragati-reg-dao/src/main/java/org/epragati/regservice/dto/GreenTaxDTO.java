package org.epragati.regservice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class GreenTaxDTO {
	
	private String challanNo;
	
	private Long taxAmount;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validUpto;

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public LocalDate getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}

}
