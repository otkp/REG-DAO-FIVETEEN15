package org.epragati.master.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_late_fee_fc")
public class MasterLateeFeeForFC extends BaseEntity{

	private String id;
	private Integer amount;
	private boolean status;
	private LocalDate lateFeeFromDate;

	
	
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
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the lateFeeFromDate
	 */
	public LocalDate getLateFeeFromDate() {
		return lateFeeFromDate;
	}
	/**
	 * @param lateFeeFromDate the lateFeeFromDate to set
	 */
	public void setLateFeeFromDate(LocalDate lateFeeFromDate) {
		this.lateFeeFromDate = lateFeeFromDate;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
