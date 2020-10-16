package org.epragati.master.dto;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_sequence")
public class SequenceDTO  {
	
	
	public SequenceDTO(){}
	
	public SequenceDTO(String sequenceName, Long number, String officeCode, Integer year,Integer month){
		this.seqName = sequenceName;
		this.startNum = number;
		this.year = year;
		this.officeCode = officeCode;
		this.month =month;
	}
	
	@Id
	private String id;

	private String seqName;

	private String seqNameFormat;

	private long startNum;

	private long currentNum;

	private long numLenght;

	private Character resetMode;

	private LocalDateTime createdDate;

	private LocalDateTime lastUpdatedOn;

	private Integer status;

	private String constVal;

	private Integer year;

	private String officeCode;
	
	private Integer month;

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
	 * @return the seqName
	 */
	public String getSeqName() {
		return seqName;
	}

	/**
	 * @param seqName the seqName to set
	 */
	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	/**
	 * @return the seqNameFormat
	 */
	public String getSeqNameFormat() {
		return seqNameFormat;
	}

	/**
	 * @param seqNameFormat the seqNameFormat to set
	 */
	public void setSeqNameFormat(String seqNameFormat) {
		this.seqNameFormat = seqNameFormat;
	}

	/**
	 * @return the startNum
	 */
	public long getStartNum() {
		return startNum;
	}

	/**
	 * @param startNum the startNum to set
	 */
	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}

	/**
	 * @return the currentNum
	 */
	public long getCurrentNum() {
		return currentNum;
	}

	/**
	 * @param currentNum the currentNum to set
	 */
	public void setCurrentNum(long currentNum) {
		this.currentNum = currentNum;
	}

	/**
	 * @return the numLenght
	 */
	public long getNumLenght() {
		return numLenght;
	}

	/**
	 * @param numLenght the numLenght to set
	 */
	public void setNumLenght(long numLenght) {
		this.numLenght = numLenght;
	}

	/**
	 * @return the resetMode
	 */
	public Character getResetMode() {
		return resetMode;
	}

	/**
	 * @param resetMode the resetMode to set
	 */
	public void setResetMode(Character resetMode) {
		this.resetMode = resetMode;
	}

	/**
	 * @return the createdDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdatedOn
	 */
	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	/**
	 * @param lastUpdatedOn the lastUpdatedOn to set
	 */
	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the constVal
	 */
	public String getConstVal() {
		return constVal;
	}

	/**
	 * @param constVal the constVal to set
	 */
	public void setConstVal(String constVal) {
		this.constVal = constVal;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	
}