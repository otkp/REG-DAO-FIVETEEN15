package org.epragati.common.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HsrpPayConfirmationDTO {

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentReceivedDate;

	private String orderNumber;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate orderDate;
	
	private String transactionStatus;
	
	private String hsrpfee;

	
	public String getHsrpfee() {
		return hsrpfee;
	}

	public void setHsrpfee(String hsrpfee) {
		this.hsrpfee = hsrpfee;
	}

	public LocalDate getPaymentReceivedDate() {
		return paymentReceivedDate;
	}

	public void setPaymentReceivedDate(LocalDate paymentReceivedDate) {
		this.paymentReceivedDate = paymentReceivedDate;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

}
