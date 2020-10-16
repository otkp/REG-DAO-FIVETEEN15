package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class InvoiceArrayDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String invoiceNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate invoiceDate;
	private String companyName;
	@JsonFormat(shape = Shape.STRING)
	private Integer invoiceWeight;
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getInvoiceWeight() {
		return invoiceWeight;
	}
	public void setInvoiceWeight(Integer invoiceWeight) {
		this.invoiceWeight = invoiceWeight;
	}

	
}
