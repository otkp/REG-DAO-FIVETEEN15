package org.epragati.sn.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.util.AmountEncryptDecrypt;

public class BidHistory implements Serializable {


	private static final long serialVersionUID = -4788361424955518232L;

	private String secBidAmount;

	private String bidAmount;

	private Boolean isFinalBid;

	private String remarks;

	private LocalDateTime createdDatetime;

	public Double getSecBidAmount() {
		return AmountEncryptDecrypt.decryptAmount(secBidAmount);
	}

	public void setSecBidAmount(Double secBidAmount) {
		this.secBidAmount = AmountEncryptDecrypt.encryptAmount(secBidAmount);
	}
	
	public void setSecBidAmount(String secBidAmount) {
		this.secBidAmount = AmountEncryptDecrypt.encryptAmount(secBidAmount);
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
	
	public Boolean getIsFinalBid() {
		return isFinalBid;
	}

	public void setIsFinalBid(Boolean isFinalBid) {
		this.isFinalBid = isFinalBid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(LocalDateTime createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
