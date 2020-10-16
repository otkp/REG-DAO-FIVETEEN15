package org.epragati.permits.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PermitOtherServicesValidityDetailsDTO {

	private String permitnumber;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidUpto;

	private String fcNumber;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidUpto;

	private long taxAmount;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidTill;

	private String seatingCapacity;

	private String permitId;
	
	private String temporaryPermitNumber;

	/**
	 * @return the permitnumber
	 */
	public String getPermitnumber() {
		return permitnumber;
	}

	/**
	 * @param permitnumber
	 *            the permitnumber to set
	 */
	public void setPermitnumber(String permitnumber) {
		this.permitnumber = permitnumber;
	}

	/**
	 * @return the permitValidUpto
	 */
	public LocalDate getPermitValidUpto() {
		return permitValidUpto;
	}

	/**
	 * @param permitValidUpto
	 *            the permitValidUpto to set
	 */
	public void setPermitValidUpto(LocalDate permitValidUpto) {
		this.permitValidUpto = permitValidUpto;
	}

	/**
	 * @return the fcNumber
	 */
	public String getFcNumber() {
		return fcNumber;
	}

	/**
	 * @param fcNumber
	 *            the fcNumber to set
	 */
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}

	/**
	 * @return the fcValidUpto
	 */
	public LocalDate getFcValidUpto() {
		return fcValidUpto;
	}

	/**
	 * @param fcValidUpto
	 *            the fcValidUpto to set
	 */
	public void setFcValidUpto(LocalDate fcValidUpto) {
		this.fcValidUpto = fcValidUpto;
	}

	/**
	 * @return the taxAmount
	 */
	public long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount
	 *            the taxAmount to set
	 */
	public void setTaxAmount(long taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the taxValidTill
	 */
	public LocalDate getTaxValidTill() {
		return taxValidTill;
	}

	/**
	 * @param taxValidTill
	 *            the taxValidTill to set
	 */
	public void setTaxValidTill(LocalDate taxValidTill) {
		this.taxValidTill = taxValidTill;
	}

	/**
	 * @return the seatingCapacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity
	 *            the seatingCapacity to set
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the permitId
	 */
	public String getPermitId() {
		return permitId;
	}

	/**
	 * @param permitId
	 *            the permitId to set
	 */
	public void setPermitId(String permitId) {
		this.permitId = permitId;
	}

	/**
	 * @return the temporaryPermitNumber
	 */
	public String getTemporaryPermitNumber() {
		return temporaryPermitNumber;
	}

	/**
	 * @param temporaryPermitNumber the temporaryPermitNumber to set
	 */
	public void setTemporaryPermitNumber(String temporaryPermitNumber) {
		this.temporaryPermitNumber = temporaryPermitNumber;
	}
	
	
}
