package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class InvoiceDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String invoiceNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate invoiceDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoiceDateForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate purchaseDateForOther;
	
	public LocalDate getInvoiceDateForOther() {
		return invoiceDateForOther;
	}

	public void setInvoiceDateForOther(LocalDate invoiceDateForOther) {
		this.invoiceDateForOther = invoiceDateForOther;
	}

	public LocalDate getPurchaseDateForOther() {
		return purchaseDateForOther;
	}

	public void setPurchaseDateForOther(LocalDate purchaseDateForOther) {
		this.purchaseDateForOther = purchaseDateForOther;
	}

	private Double invoiceValue;

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
	 * @return the invoiceNo
	 */
	public String getInvoiceNo() {
		return invoiceNo;
	}

	/**
	 * @param invoiceNo the invoiceNo to set
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 * @return the invoiceDate
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the invoiceValue
	 */
	public Double getInvoiceValue() {
		return invoiceValue;
	}

	/**
	 * @param invoiceValue the invoiceValue to set
	 */
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InvoiceDetailsDTO [id=" + id + ", invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate
				+ ", invoiceValue=" + invoiceValue + "]";
	}
	
}
