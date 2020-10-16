package org.epragati.dispatcher.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "dispatch_details")
public class DispatcherSubmissionDTO  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3958805135310847767L;

	// private Integer slNo;

	@Id
	private String id;
	private String applicationNo;
	private String prNo;
	private String name;
	private String emsNumber;
	private String officeCode;
	private String dispatchedBy;
	private String mobileNo;
	private String pinCode;
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime postedDate;
	private String remarks;
	private Boolean isDateEdit;
	
	/**
	 * @return the isDateEdit
	 */
	public Boolean getIsDateEdit() {
		return isDateEdit;
	}

	/**
	 * @param isDateEdit the isDateEdit to set
	 */
	public void setIsDateEdit(Boolean isDateEdit) {
		this.isDateEdit = isDateEdit;
	}

	private Map<String, String> cardPrintedBy;

	
	/**
	 * @return the cardPrintedBy
	 */
	public Map<String, String> getCardPrintedBy() {
		return cardPrintedBy;
	}

	/**
	 * @param cardPrintedBy the cardPrintedBy to set
	 */
	public void setCardPrintedBy(Map<String, String> cardPrintedBy) {
		this.cardPrintedBy = cardPrintedBy;
	}

	/**
	 * @return the cardPrintedDate
	 */
	public Map<String, LocalDateTime> getCardPrintedDate() {
		return cardPrintedDate;
	}

	/**
	 * @param cardPrintedDate the cardPrintedDate to set
	 */
	public void setCardPrintedDate(Map<String, LocalDateTime> cardPrintedDate) {
		this.cardPrintedDate = cardPrintedDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Map<String, LocalDateTime> cardPrintedDate;


	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate returnDate;

	private String returnReason;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate deliveryDate;
	
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

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime lUpdate;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime createdDate;

	/**
	 * @return the lUpdate
	 */
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}

	/**
	 * @param lUpdate the lUpdate to set
	 */
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmsNumber() {
		return emsNumber;
	}

	public void setEmsNumber(String emsNumber) {
		this.emsNumber = emsNumber;
	}

	public LocalDateTime getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDateTime postedDate) {
		this.postedDate = postedDate;
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

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getDispatchedBy() {
		return dispatchedBy;
	}

	public void setDispatchedBy(String dispatchedBy) {
		this.dispatchedBy = dispatchedBy;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "DispatcherSubmissionDTO [applicationNo=" + applicationNo + ", prNo=" + prNo + ", name=" + name
				+ ", emsNumber=" + emsNumber + ", officeCode=" + officeCode + ", dispatchedBy=" + dispatchedBy
				+ ", mobileNo=" + mobileNo + ", pinCode=" + pinCode + ", postedDate=" + postedDate + ", remarks="
				+ remarks + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
