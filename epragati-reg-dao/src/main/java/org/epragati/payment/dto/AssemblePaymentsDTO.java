package org.epragati.payment.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assemble_payments")
public class AssemblePaymentsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String feesType;

	private Double amount;

	private String payStatus;

	private double refundAmound;

	private String role;

	private Integer paymentGateway;

	private String officeCode;

	private LocalDate date;

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getFeesType() {
		return feesType;
	}

	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public double getRefundAmound() {
		return refundAmound;
	}

	public void setRefundAmound(double refundAmound) {
		this.refundAmound = refundAmound;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(Integer paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

}
