package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.epragati.util.StatusRegistration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "non_payment_report_details")
public class NonPaymentDetailsDTO extends BaseShowCauseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String prNo;
	
	private Boolean isScNoGenerated = Boolean.FALSE;
	
	private StatusRegistration applicationStatus;
	
	private Boolean isScNoIssuedByCco = Boolean.FALSE;
	
	private String mandalName = StringUtils.EMPTY;
	
	private Double taxArrears;
	
	private Double penaltyArrears;
	
	private Double taxAmount;
	
	private Double penaltyAmount;
	
	private Double totalFee;
	
	private String scNo;
	
	private String mviName;
	
	private String sectionCode;
	
	private String approvedBy;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate approvedDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate scNoIssuedOn;
	
	private boolean isTaxPaid;
	
	private LocalDateTime taxPaidDate;
	
	private boolean isTaxPaidByVcr;
	
	private boolean isTaxPaidByPayTax;
	
	private Integer pendingQuaters;
	
	private String taxPenalityPercentage;
	
	private String penalityPercentage;
	
	

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

	/**
	 * @return the isTaxPaid
	 */
	public boolean isTaxPaid() {
		return isTaxPaid;
	}

	/**
	 * @param isTaxPaid the isTaxPaid to set
	 */
	public void setTaxPaid(boolean isTaxPaid) {
		this.isTaxPaid = isTaxPaid;
	}

	/**
	 * @return the taxPaidDate
	 */
	public LocalDateTime getTaxPaidDate() {
		return taxPaidDate;
	}

	/**
	 * @param taxPaidDate the taxPaidDate to set
	 */
	public void setTaxPaidDate(LocalDateTime taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	/**
	 * @return the isTaxPaidByVcr
	 */
	public boolean isTaxPaidByVcr() {
		return isTaxPaidByVcr;
	}

	/**
	 * @param isTaxPaidByVcr the isTaxPaidByVcr to set
	 */
	public void setTaxPaidByVcr(boolean isTaxPaidByVcr) {
		this.isTaxPaidByVcr = isTaxPaidByVcr;
	}

	/**
	 * @return the isTaxPaidByPayTax
	 */
	public boolean isTaxPaidByPayTax() {
		return isTaxPaidByPayTax;
	}

	/**
	 * @param isTaxPaidByPayTax the isTaxPaidByPayTax to set
	 */
	public void setTaxPaidByPayTax(boolean isTaxPaidByPayTax) {
		this.isTaxPaidByPayTax = isTaxPaidByPayTax;
	}

	public Double getTaxArrears() {
		return taxArrears;
	}

	public void setTaxArrears(Double taxArrears) {
		this.taxArrears = taxArrears;
	}

	public Double getPenaltyArrears() {
		return penaltyArrears;
	}

	public void setPenaltyArrears(Double penaltyArrears) {
		this.penaltyArrears = penaltyArrears;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Boolean getIsScNoGenerated() {
		return isScNoGenerated;
	}

	public void setIsScNoGenerated(Boolean isScNoGenerated) {
		this.isScNoGenerated = isScNoGenerated;
	}

	

	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Boolean getIsScNoIssuedByCco() {
		return isScNoIssuedByCco;
	}

	public void setIsScNoIssuedByCco(Boolean isScNoIssuedByCco) {
		this.isScNoIssuedByCco = isScNoIssuedByCco;
	}

	public String getMandalName() {
		return mandalName;
	}

	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}

	public String getScNo() {
		return scNo;
	}

	public void setScNo(String scNo) {
		this.scNo = scNo;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public LocalDate getScNoIssuedOn() {
		return scNoIssuedOn;
	}

	public void setScNoIssuedOn(LocalDate scNoIssuedOn) {
		this.scNoIssuedOn = scNoIssuedOn;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(Double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	public Integer getPendingQuaters() {
		return pendingQuaters;
	}

	public void setPendingQuaters(Integer pendingQuaters) {
		this.pendingQuaters = pendingQuaters;
	}

	public String getTaxPenalityPercentage() {
		return taxPenalityPercentage;
	}

	public void setTaxPenalityPercentage(String taxPenalityPercentage) {
		this.taxPenalityPercentage = taxPenalityPercentage;
	}

	public String getPenalityPercentage() {
		return penalityPercentage;
	}

	public void setPenalityPercentage(String penalityPercentage) {
		this.penalityPercentage = penalityPercentage;
	}
	
	
	
}
