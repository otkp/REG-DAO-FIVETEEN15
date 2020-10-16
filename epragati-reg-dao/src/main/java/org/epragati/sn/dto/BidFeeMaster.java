package org.epragati.sn.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sn_bid_fee_mst")
@CompoundIndexes({
	@CompoundIndex(name = "covCategoryGroupId", def = "{'covCategoryGroupId': 1}")
})
public class BidFeeMaster extends BaseEntity {

	private static final long serialVersionUID = -5533582936606654786L;

	@Id
	private String bidFeeId;

	private Double bidMinIncrementAmount;

	private Long covCategoryGroupId;

	private Double specialNumFee;

	private Double rtaBidFee;

	private Long bidCloseNotifyTime;

	private Boolean bidFeeStatus;


	public String getBidFeeId() {
		return bidFeeId;
	}

	public void setBidFeeId(String bidFeeId) {
		this.bidFeeId = bidFeeId;
	}

	public Double getBidMinIncrementAmount() {
		return bidMinIncrementAmount;
	}

	public void setBidMinIncrementAmount(Double bidMinIncrementAmount) {
		this.bidMinIncrementAmount = bidMinIncrementAmount;
	}

	public Long getCovCategoryGroupId() {
		return covCategoryGroupId;
	}

	public void setCovCategoryGroupId(Long covCategoryGroupId) {
		this.covCategoryGroupId = covCategoryGroupId;
	}

	public Double getSpecialNumFee() {
		return specialNumFee;
	}

	public void setSpecialNumFee(Double specialNumFee) {
		this.specialNumFee = specialNumFee;
	}

	public Double getRtaBidFee() {
		return rtaBidFee;
	}

	public void setRtaBidFee(Double rtaBidFee) {
		this.rtaBidFee = rtaBidFee;
	}

	public Long getBidCloseNotifyTime() {
		return bidCloseNotifyTime;
	}

	public void setBidCloseNotifyTime(Long bidCloseNotifyTime) {
		this.bidCloseNotifyTime = bidCloseNotifyTime;
	}

	public Boolean getBidFeeStatus() {
		return bidFeeStatus;
	}

	public void setBidFeeStatus(Boolean bidFeeStatus) {
		this.bidFeeStatus = bidFeeStatus;
	}

}
