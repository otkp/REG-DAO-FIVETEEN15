package org.epragati.sn.dto;

import java.io.Serializable;

public class SpecialNumberFeeDetails implements Serializable {

	private static final long serialVersionUID = -4037041316290896177L;

	private BidFeeMaster bidFeeMaster;

	private String paymentId;

	private String transactionNo;

	private String refundId;

	private Double totalAmount;

	private Double applicationAmount;
	
	private Double servicesAmount;
	
	private boolean isRefundDone;

	public BidFeeMaster getBidFeeMaster() {
		return bidFeeMaster;
	}

	public void setBidFeeMaster(BidFeeMaster bidFeeMaster) {
		this.bidFeeMaster = bidFeeMaster;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getApplicationAmount() {
		return applicationAmount;
	}

	public void setApplicationAmount(Double applicationAmount) {
		this.applicationAmount = applicationAmount;
	}

	public Double getServicesAmount() {
		return servicesAmount;
	}

	public void setServicesAmount(Double servicesAmount) {
		this.servicesAmount = servicesAmount;
	}

	public boolean getIsRefundDone() {
		return isRefundDone;
	}

	public void setIsRefundDone(boolean isRefundDone) {
		this.isRefundDone = isRefundDone;
	}

	

}
