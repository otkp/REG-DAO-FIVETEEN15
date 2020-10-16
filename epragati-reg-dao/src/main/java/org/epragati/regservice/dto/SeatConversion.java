package org.epragati.regservice.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_conversion_seat")
public class SeatConversion extends BaseEntity{

	private String id;
	private String cov;
	private String covDesc;
	private String category;
	private String convCategory;
	private String seatFrom;
	private String seatTo;
	private boolean taxCal;
	private boolean fcFee;
	private boolean permitCal;
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
	 * @return the cov
	 */
	public String getCov() {
		return cov;
	}
	/**
	 * @param cov the cov to set
	 */
	public void setCov(String cov) {
		this.cov = cov;
	}
	/**
	 * @return the covDesc
	 */
	public String getCovDesc() {
		return covDesc;
	}
	/**
	 * @param covDesc the covDesc to set
	 */
	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the convCategory
	 */
	public String getConvCategory() {
		return convCategory;
	}
	/**
	 * @param convCategory the convCategory to set
	 */
	public void setConvCategory(String convCategory) {
		this.convCategory = convCategory;
	}
	/**
	 * @return the seatFrom
	 */
	public String getSeatFrom() {
		return seatFrom;
	}
	/**
	 * @param seatFrom the seatFrom to set
	 */
	public void setSeatFrom(String seatFrom) {
		this.seatFrom = seatFrom;
	}
	/**
	 * @return the seatTo
	 */
	public String getSeatTo() {
		return seatTo;
	}
	/**
	 * @param seatTo the seatTo to set
	 */
	public void setSeatTo(String seatTo) {
		this.seatTo = seatTo;
	}
	/**
	 * @return the taxCal
	 */
	public boolean isTaxCal() {
		return taxCal;
	}
	/**
	 * @param taxCal the taxCal to set
	 */
	public void setTaxCal(boolean taxCal) {
		this.taxCal = taxCal;
	}
	/**
	 * @return the fcFee
	 */
	public boolean isFcFee() {
		return fcFee;
	}
	/**
	 * @param fcFee the fcFee to set
	 */
	public void setFcFee(boolean fcFee) {
		this.fcFee = fcFee;
	}
	/**
	 * @return the permitCal
	 */
	public boolean isPermitCal() {
		return permitCal;
	}
	/**
	 * @param permitCal the permitCal to set
	 */
	public void setPermitCal(boolean permitCal) {
		this.permitCal = permitCal;
	}

	
}
