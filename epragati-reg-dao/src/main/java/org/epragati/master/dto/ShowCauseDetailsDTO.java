package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "show_cause_details")
public class ShowCauseDetailsDTO extends  BaseShowCauseEntity implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	//private String id;
	private String prNo;
	
	
	private String scNo;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime scIssuedDate;
	
	private String scIssuedBy;
	
	private String scPurpose;
	
	private String status;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate ackDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate expDate;
	
	private String expRemark;
	
	private String mviName;
	
	private String approvedBy; 
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime approvedDate;
	
	private LocalDateTime lastUpdatedDate;
	
	private String lastUpdatedUser;
	
	private String scStatus;
	
	private String satisfied;
	
	private ShowCauseSectionDTO scType;
	
	private String demendNo;
	
	private LocalDate printDate;
	
	private LocalDate rePrintDate;
	
	private Integer printCount;
	
	private Integer rePrintCount;
	
	private Integer penality;
	
	private String penalityArrears;
	
	private Double tax;
	
	private String taxArrears;
	
	private Integer totalAmount;

	private String scIssuedByName;
	
	private String scIssuedByRole;
	
	private String scApprovedByName;
	
	private String scApprovedByRole;
	
	private List<ActionDetailsDTO> actionDetails;
	
	private String scReason;
	
	private String covDescription;
	
	private List<String> issuenceStage;
	
	private LocalDateTime paymentDoneDate;
	
	private Double taxPaidAmount;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime showCauseClosedDate;
	

	

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getScNo() {
		return scNo;
	}

	public void setScNo(String scNo) {
		this.scNo = scNo;
	}

	public LocalDateTime getScIssuedDate() {
		return scIssuedDate;
	}

	public void setScIssuedDate(LocalDateTime scIssuedDate) {
		this.scIssuedDate = scIssuedDate;
	}

	public String getScIssuedBy() {
		return scIssuedBy;
	}

	public void setScIssuedBy(String scIssuedBy) {
		this.scIssuedBy = scIssuedBy;
	}

	public String getScPurpose() {
		return scPurpose;
	}

	public void setScPurpose(String scPurpose) {
		this.scPurpose = scPurpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAckDate() {
		return ackDate;
	}

	public void setAckDate(LocalDate ackDate) {
		this.ackDate = ackDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getExpRemark() {
		return expRemark;
	}

	public void setExpRemark(String expRemark) {
		this.expRemark = expRemark;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public String getScStatus() {
		return scStatus;
	}

	public void setScStatus(String scStatus) {
		this.scStatus = scStatus;
	}

	public String getSatisfied() {
		return satisfied;
	}

	public void setSatisfied(String satisfied) {
		this.satisfied = satisfied;
	}

	public ShowCauseSectionDTO getScType() {
		return scType;
	}

	public void setScType(ShowCauseSectionDTO scType) {
		this.scType = scType;
	}

	public String getDemendNo() {
		return demendNo;
	}

	public void setDemendNo(String demendNo) {
		this.demendNo = demendNo;
	}

	public LocalDate getPrintDate() {
		return printDate;
	}

	public void setPrintDate(LocalDate printDate) {
		this.printDate = printDate;
	}

	public LocalDate getRePrintDate() {
		return rePrintDate;
	}

	public void setRePrintDate(LocalDate rePrintDate) {
		this.rePrintDate = rePrintDate;
	}

	public Integer getPrintCount() {
		return printCount;
	}

	public void setPrintCount(Integer printCount) {
		this.printCount = printCount;
	}

	public Integer getRePrintCount() {
		return rePrintCount;
	}

	public void setRePrintCount(Integer rePrintCount) {
		this.rePrintCount = rePrintCount;
	}

	public Integer getPenality() {
		return penality;
	}

	public void setPenality(Integer penality) {
		this.penality = penality;
	}

	public String getPenalityArrears() {
		return penalityArrears;
	}

	public void setPenalityArrears(String penalityArrears) {
		this.penalityArrears = penalityArrears;
	}

	public String getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(String taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}


	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String getScIssuedByName() {
		return scIssuedByName;
	}

	public void setScIssuedByName(String scIssuedByName) {
		this.scIssuedByName = scIssuedByName;
	}

	public String getScIssuedByRole() {
		return scIssuedByRole;
	}

	public void setScIssuedByRole(String scIssuedByRole) {
		this.scIssuedByRole = scIssuedByRole;
	}

	public String getScApprovedByName() {
		return scApprovedByName;
	}

	public void setScApprovedByName(String scApprovedByName) {
		this.scApprovedByName = scApprovedByName;
	}

	public String getScApprovedByRole() {
		return scApprovedByRole;
	}

	public void setScApprovedByRole(String scApprovedByRole) {
		this.scApprovedByRole = scApprovedByRole;
	}

	public List<ActionDetailsDTO> getActionDetails() {
		return actionDetails;
	}

	public void setActionDetails(List<ActionDetailsDTO> actionDetails) {
		this.actionDetails = actionDetails;
	}

	public String getScReason() {
		return scReason;
	}

	public void setScReason(String scReason) {
		this.scReason = scReason;
	}

	public String getCovDescription() {
		return covDescription;
	}

	public void setCovDescription(String covDescription) {
		this.covDescription = covDescription;
	}

	public List<String> getIssuenceStage() {
		return issuenceStage;
	}

	public void setIssuenceStage(List<String> issuenceStage) {
		this.issuenceStage = issuenceStage;
	}

	public LocalDateTime getPaymentDoneDate() {
		return paymentDoneDate;
	}

	public void setPaymentDoneDate(LocalDateTime paymentDoneDate) {
		this.paymentDoneDate = paymentDoneDate;
	}

	public Double getTaxPaidAmount() {
		return taxPaidAmount;
	}

	public void setTaxPaidAmount(Double taxPaidAmount) {
		this.taxPaidAmount = taxPaidAmount;
	}

	public LocalDateTime getShowCauseClosedDate() {
		return showCauseClosedDate;
	}

	public void setShowCauseClosedDate(LocalDateTime showCauseClosedDate) {
		this.showCauseClosedDate = showCauseClosedDate;
	}
	
	

}