package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.common.dto.BaseEntity;

public class PrBackUpDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String fromPrNo;
	private String toPrNo;
	private LocalDateTime prUpdatedDate;
	public LocalDateTime getPrUpdatedDate() {
		return prUpdatedDate;
	}
	public void setPrUpdatedDate(LocalDateTime prUpdatedDate) {
		this.prUpdatedDate = prUpdatedDate;
	}
	public String getFromPrNo() {
		return fromPrNo;
	}
	public void setFromPrNo(String fromPrNo) {
		this.fromPrNo = fromPrNo;
	}
	public String getToPrNo() {
		return toPrNo;
	}
	public void setToPrNo(String toPrNo) {
		this.toPrNo = toPrNo;
	}
}
