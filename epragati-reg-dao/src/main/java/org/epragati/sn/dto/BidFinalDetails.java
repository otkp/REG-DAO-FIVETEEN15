package org.epragati.sn.dto;

import java.io.Serializable;

import org.epragati.util.AmountEncryptDecrypt;

public class BidFinalDetails implements Serializable {

	private static final long serialVersionUID = -7379788237128575187L;

	private String paymentId;

	private String transactionNo;

	private String refundId;

	private String bidAmount;

	private Double rtaAmount;

	private String totalAmount;
	
	private boolean isRefundDone;
	
	private Double bidAmountNumber;
	
	

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

	public Double getBidAmount() {
		return AmountEncryptDecrypt.decryptAmount(bidAmount);
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = AmountEncryptDecrypt.encryptAmount(bidAmount);
	}
	
	public void setBidAmount(String bidAmount) {
		this.bidAmount = AmountEncryptDecrypt.encryptAmount(bidAmount);
	}

	public Double getRtaAmount() {
		return rtaAmount;
	}

	public void setRtaAmount(Double rtaAmount) {
		this.rtaAmount = rtaAmount;
	}

	public Double getTotalAmount() {
		return AmountEncryptDecrypt.decryptAmount(totalAmount);
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = AmountEncryptDecrypt.encryptAmount(totalAmount);
	}
	
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = AmountEncryptDecrypt.encryptAmount(totalAmount);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean getIsRefundDone() {
		return isRefundDone;
	}

	public void setIsRefundDone(boolean isRefundDone) {
		this.isRefundDone = isRefundDone;
	}

	/**
	 * @return the bidAmountNumber
	 */
	public Double getBidAmountNumber() {
		return bidAmountNumber;
	}

	/**
	 * @param bidAmountNumber the bidAmountNumber to set
	 */
	public void setBidAmountNumber(Double bidAmountNumber) {
		this.bidAmountNumber = bidAmountNumber;
	}

	
	
}
