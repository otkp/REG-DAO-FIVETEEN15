package org.epragati.sn.dto;

import java.io.Serializable;

import org.epragati.util.BidNumberType;

public class BidVehicleDetails implements Serializable {

	private static final long serialVersionUID = 616496637762053844L;

	private String bidNumberDtlsId;
	private String numberPoolId;
	private Integer biddingVehicleNumber;

	private BidNumberType bidNumberType;

	private BidNumberType allocatedBidNumberType;

	private Boolean bidLeftAccepted;

	private String remarks;

	public String getBidNumberDtlsId() {
		return bidNumberDtlsId;
	}

	public void setBidNumberDtlsId(String bidNumberDtlsId) {
		this.bidNumberDtlsId = bidNumberDtlsId;
	}

	public String getNumberPoolId() {
		return numberPoolId;
	}

	public void setNumberPoolId(String numberPoolId) {
		this.numberPoolId = numberPoolId;
	}

	public Integer getBiddingVehicleNumber() {
		return biddingVehicleNumber;
	}

	public void setBiddingVehicleNumber(Integer biddingVehicleNumber) {
		this.biddingVehicleNumber = biddingVehicleNumber;
	}

	public BidNumberType getBidNumberType() {
		return bidNumberType;
	}

	public void setBidNumberType(BidNumberType bidNumberType) {
		this.bidNumberType = bidNumberType;
	}

	public BidNumberType getAllocatedBidNumberType() {
		return allocatedBidNumberType;
	}

	public void setAllocatedBidNumberType(BidNumberType allocatedBidNumberType) {
		this.allocatedBidNumberType = allocatedBidNumberType;
	}

	public Boolean getBidLeftAccepted() {
		return bidLeftAccepted;
	}

	public void setBidLeftAccepted(Boolean bidLeftAccepted) {
		this.bidLeftAccepted = bidLeftAccepted;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
