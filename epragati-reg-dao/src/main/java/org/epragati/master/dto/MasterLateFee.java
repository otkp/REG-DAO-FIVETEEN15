package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_late_fee")
public class MasterLateFee extends BaseEntity {

	private String id;
	private List<String> covCodes;
	private Integer amount;
	private String status;
	private LocalDate oldLateFeeUpToDate;
	private Integer oldLateFeePerQuater;
	private Integer maxLateQuaters;
	private Integer maxLateFee;
	
	
	
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
	 * @return the covCodes
	 */
	public List<String> getCovCodes() {
		return covCodes;
	}
	/**
	 * @param covCodes the covCodes to set
	 */
	public void setCovCodes(List<String> covCodes) {
		this.covCodes = covCodes;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the oldLateFeeUpToDate
	 */
	public LocalDate getOldLateFeeUpToDate() {
		return oldLateFeeUpToDate;
	}
	/**
	 * @param oldLateFeeUpToDate the oldLateFeeUpToDate to set
	 */
	public void setOldLateFeeUpToDate(LocalDate oldLateFeeUpToDate) {
		this.oldLateFeeUpToDate = oldLateFeeUpToDate;
	}
	/**
	 * @return the oldLateFeePerQuater
	 */
	public Integer getOldLateFeePerQuater() {
		return oldLateFeePerQuater;
	}
	/**
	 * @param oldLateFeePerQuater the oldLateFeePerQuater to set
	 */
	public void setOldLateFeePerQuater(Integer oldLateFeePerQuater) {
		this.oldLateFeePerQuater = oldLateFeePerQuater;
	}
	/**
	 * @return the maxLateFee
	 */
	public Integer getMaxLateFee() {
		return maxLateFee;
	}
	/**
	 * @param maxLateFee the maxLateFee to set
	 */
	public void setMaxLateFee(Integer maxLateFee) {
		this.maxLateFee = maxLateFee;
	}
	/**
	 * @return the maxLateQuaters
	 */
	public Integer getMaxLateQuaters() {
		return maxLateQuaters;
	}
	/**
	 * @param maxLateQuaters the maxLateQuaters to set
	 */
	public void setMaxLateQuaters(Integer maxLateQuaters) {
		this.maxLateQuaters = maxLateQuaters;
	}
	
	
}
