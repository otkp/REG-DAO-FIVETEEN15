package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class FeeDetailsDTO implements Serializable{

	private List<FeesDTO> feeDetails;
	private Double totalFees;
	private PaymentGatewayTypeDTO paymentGatewayTypeDto;
	private String payStatus;
	private double refundAmound;
	private String role;
	
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public List<FeesDTO> getFeeDetails() {
		return feeDetails;
	}
	public void setFeeDetails(List<FeesDTO> feeDetails) {
		this.feeDetails = feeDetails;
	}
	public Double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}
	public PaymentGatewayTypeDTO getPaymentGatewayTypeDto() {
		return paymentGatewayTypeDto;
	}
	public void setPaymentGatewayTypeDto(PaymentGatewayTypeDTO paymentGatewayTypeDto) {
		this.paymentGatewayTypeDto = paymentGatewayTypeDto;
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
	
}
