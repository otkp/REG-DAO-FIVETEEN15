package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "rc_cancellation_details")
public class RCCancellationDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String prNo;

	private String cov;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;

	private String ownerName;

	private String ownerAddress;

	private String mandalName;

	private String financerName;

	private String financerAddress;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;

	private String reasonForCancellation;

	private Boolean isVehicleCondemmed;

	private Boolean isCancelledByCitizen;

	private Integer noOfTimesNoticeGiven;
	
	private String showcaseNo;

	private String mviUserId;
	private String mviName;
	private String aoRemarks;
	private String mviRemarks;
	
	 
	
	/**
	 * @return the mviUserId
	 */
	public String getMviUserId() {
		return mviUserId;
	}

	/**
	 * @param mviUserId the mviUserId to set
	 */
	public void setMviUserId(String mviUserId) {
		this.mviUserId = mviUserId;
	}

	/**
	 * @return the mviName
	 */
	public String getMviName() {
		return mviName;
	}

	/**
	 * @param mviName the mviName to set
	 */
	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getCov() {
		return cov;
	}

	public void setCov(String cov) {
		this.cov = cov;
	}

	public LocalDate getTaxValidity() {
		return taxValidity;
	}

	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public String getFinancerAddress() {
		return financerAddress;
	}

	public void setFinancerAddress(String financerAddress) {
		this.financerAddress = financerAddress;
	}

	public LocalDate getFcValidity() {
		return fcValidity;
	}

	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}

	public LocalDate getPermitValidity() {
		return permitValidity;
	}

	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}

	public String getReasonForCancellation() {
		return reasonForCancellation;
	}

	public void setReasonForCancellation(String reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
	}

	public Boolean getIsVehicleCondemmed() {
		return isVehicleCondemmed;
	}

	public void setIsVehicleCondemmed(Boolean isVehicleCondemmed) {
		this.isVehicleCondemmed = isVehicleCondemmed;
	}

	public Boolean getIsCancelledByCitizen() {
		return isCancelledByCitizen;
	}

	public void setIsCancelledByCitizen(Boolean isCancelledByCitizen) {
		this.isCancelledByCitizen = isCancelledByCitizen;
	}

	public Integer getNoOfTimesNoticeGiven() {
		return noOfTimesNoticeGiven;
	}

	public void setNoOfTimesNoticeGiven(Integer noOfTimesNoticeGiven) {
		this.noOfTimesNoticeGiven = noOfTimesNoticeGiven;
	}

	public String getShowcaseNo() {
		return showcaseNo;
	}

	public void setShowcaseNo(String showcaseNo) {
		this.showcaseNo = showcaseNo;
	}

	public String getAoRemarks() {
		return aoRemarks;
	}

	public void setAoRemarks(String aoRemarks) {
		this.aoRemarks = aoRemarks;
	}

	public String getMviRemarks() {
		return mviRemarks;
	}

	public void setMviRemarks(String mviRemarks) {
		this.mviRemarks = mviRemarks;
	}
	
	
	

}
