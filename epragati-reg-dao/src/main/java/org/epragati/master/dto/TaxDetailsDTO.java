package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.OwnerTypeEnum;
import org.epragati.tax.vo.TaxTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tax_details")
public class TaxDetailsDTO extends BaseEntity implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -497537964547939263L;
	@Id
	private String id;
	private String cfstApplicationNo;
	private String applicationNo;
	private String trNo;
	private String prNo;
	private String transactionNo;
	private String module;
	private OwnerTypeEnum covCategory;
	private String permitType;
	private String paymentPeriod;
	private LocalDate taxPeriodFrom;
	private LocalDate taxPeriodEnd;
	private Long taxAmount;
	private Long cessFee;
	private LocalDate cessPeriodFrom;
	private LocalDate cessPeriodEnd;
	private LocalDate taxPaidDate;
	// private LocalDateTime createdDate;
	private String classOfVehicle;
	private Boolean secondVehicleTaxPaid;
	private Boolean secondVehicleDiffTaxPaid;
	private Double invoiceValue;
	private Long greenTaxAmount;
	private LocalDate greenTaxPeriodFrom;
	private LocalDate greenTaxPeriodEnd;
	private TaxTypeEnum.TaxPayType payTaxType;
	private List<Map<String, TaxComponentDTO>> taxDetails;
	private Long totalAmount;
	private Long ServiceFee;
	private String taxStatus;
	// private String remarks;
	private String stateCode;
	private String officeCode;
	private Boolean isOnlineCreated = true;
	// private String source;
	private Boolean taxExcemption = Boolean.FALSE;
	// private Boolean isMoved;
	private Boolean applicationNotFound;
	// private String ipAddress;
	private Boolean taxPaidThroughVcr = Boolean.FALSE;
	private String chassisNo;
	private Boolean deductionMode;
	
	private String recordStatus;
	/**
	 * @return the source
	 */
	/*
	 * public String getSource() { return source; }
	 * 
	 *//**
		 * @param source the source to set
		 *//*
			 * public void setSource(String source) { this.source = source; }
			 */

	/**
	 * @return the isOnlineCreated
	 */
	public Boolean getIsOnlineCreated() {
		return isOnlineCreated;
	}

	/**
	 * @param isOnlineCreated the isOnlineCreated to set
	 */
	public void setIsOnlineCreated(Boolean isOnlineCreated) {
		this.isOnlineCreated = isOnlineCreated;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
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
	/**
	 * @return the remarks
	 */
	/*
	 * public String getRemarks() { return remarks; }
	 *//**
		 * @param remarks the remarks to set
		 *//*
			 * public void setRemarks(String remarks) { this.remarks = remarks; }
			 */

	/**
	 * @return the taxStatus
	 */
	public String getTaxStatus() {
		return taxStatus;
	}

	/**
	 * @param taxStatus the taxStatus to set
	 */
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

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
	 * @return the taxDetails
	 */
	public List<Map<String, TaxComponentDTO>> getTaxDetails() {
		return taxDetails;
	}

	/**
	 * @param taxDetails the taxDetails to set
	 */
	public void setTaxDetails(List<Map<String, TaxComponentDTO>> taxDetails) {
		this.taxDetails = taxDetails;
	}

	/**
	 * @return the greenTaxAmount
	 */
	public Long getGreenTaxAmount() {
		return greenTaxAmount;
	}

	/**
	 * @param greenTaxAmount the greenTaxAmount to set
	 */
	public void setGreenTaxAmount(Long greenTaxAmount) {
		this.greenTaxAmount = greenTaxAmount;
	}

	/**
	 * @return the greenTaxPeriodFrom
	 */
	public LocalDate getGreenTaxPeriodFrom() {
		return greenTaxPeriodFrom;
	}

	/**
	 * @param greenTaxPeriodFrom the greenTaxPeriodFrom to set
	 */
	public void setGreenTaxPeriodFrom(LocalDate greenTaxPeriodFrom) {
		this.greenTaxPeriodFrom = greenTaxPeriodFrom;
	}

	/**
	 * @return the greenTaxPeriodEnd
	 */
	public LocalDate getGreenTaxPeriodEnd() {
		return greenTaxPeriodEnd;
	}

	/**
	 * @param greenTaxPeriodEnd the greenTaxPeriodEnd to set
	 */
	public void setGreenTaxPeriodEnd(LocalDate greenTaxPeriodEnd) {
		this.greenTaxPeriodEnd = greenTaxPeriodEnd;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the trNo
	 */
	public String getTrNo() {
		return trNo;
	}

	/**
	 * @param trNo the trNo to set
	 */
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

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
	 * @return the transactionNo
	 */
	public String getTransactionNo() {
		return transactionNo;
	}

	/**
	 * @param transactionNo the transactionNo to set
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the covCategory
	 */
	public OwnerTypeEnum getCovCategory() {
		return covCategory;
	}

	/**
	 * @param covCategory the covCategory to set
	 */
	public void setCovCategory(OwnerTypeEnum covCategory) {
		this.covCategory = covCategory;
	}

	/**
	 * @return the permitType
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType the permitType to set
	 */
	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the paymentPeriod
	 */
	public String getPaymentPeriod() {
		return paymentPeriod;
	}

	/**
	 * @param paymentPeriod the paymentPeriod to set
	 */
	public void setPaymentPeriod(String paymentPeriod) {
		this.paymentPeriod = paymentPeriod;
	}

	/**
	 * @return the taxPeriodFrom
	 */
	public LocalDate getTaxPeriodFrom() {
		return taxPeriodFrom;
	}

	/**
	 * @param taxPeriodFrom the taxPeriodFrom to set
	 */
	public void setTaxPeriodFrom(LocalDate taxPeriodFrom) {
		this.taxPeriodFrom = taxPeriodFrom;
	}

	/**
	 * @return the taxPeriodEnd
	 */
	public LocalDate getTaxPeriodEnd() {
		return taxPeriodEnd;
	}

	/**
	 * @param taxPeriodEnd the taxPeriodEnd to set
	 */
	public void setTaxPeriodEnd(LocalDate taxPeriodEnd) {
		this.taxPeriodEnd = taxPeriodEnd;
	}

	/**
	 * @return the taxAmount
	 */
	public Long getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the cessFee
	 */
	public Long getCessFee() {
		return cessFee;
	}

	/**
	 * @param cessFee the cessFee to set
	 */
	public void setCessFee(Long cessFee) {
		this.cessFee = cessFee;
	}

	/**
	 * @return the cessPeriodFrom
	 */
	public LocalDate getCessPeriodFrom() {
		return cessPeriodFrom;
	}

	/**
	 * @param cessPeriodFrom the cessPeriodFrom to set
	 */
	public void setCessPeriodFrom(LocalDate cessPeriodFrom) {
		this.cessPeriodFrom = cessPeriodFrom;
	}

	/**
	 * @return the cessPeriodEnd
	 */
	public LocalDate getCessPeriodEnd() {
		return cessPeriodEnd;
	}

	/**
	 * @param cessPeriodEnd the cessPeriodEnd to set
	 */
	public void setCessPeriodEnd(LocalDate cessPeriodEnd) {
		this.cessPeriodEnd = cessPeriodEnd;
	}

	/**
	 * @return the taxPaidDate
	 */
	public LocalDate getTaxPaidDate() {
		return taxPaidDate;
	}

	/**
	 * @param taxPaidDate the taxPaidDate to set
	 */
	public void setTaxPaidDate(LocalDate taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	/*
	 * public LocalDateTime getCreatedDate() { return createdDate; } public void
	 * setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
	 */
	/**
	 * @return the classOfVehicle
	 */
	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	/**
	 * @param classOfVehicle the classOfVehicle to set
	 */
	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	/**
	 * @return the secondVehicleTaxPaid
	 */
	public Boolean getSecondVehicleTaxPaid() {
		return secondVehicleTaxPaid;
	}

	/**
	 * @param secondVehicleTaxPaid the secondVehicleTaxPaid to set
	 */
	public void setSecondVehicleTaxPaid(Boolean secondVehicleTaxPaid) {
		this.secondVehicleTaxPaid = secondVehicleTaxPaid;
	}

	/**
	 * @return the secondVehicleDiffTaxPaid
	 */
	public Boolean getSecondVehicleDiffTaxPaid() {
		return secondVehicleDiffTaxPaid;
	}

	/**
	 * @param secondVehicleDiffTaxPaid the secondVehicleDiffTaxPaid to set
	 */
	public void setSecondVehicleDiffTaxPaid(Boolean secondVehicleDiffTaxPaid) {
		this.secondVehicleDiffTaxPaid = secondVehicleDiffTaxPaid;
	}

	/**
	 * @return the invoiceValue
	 */
	public Double getInvoiceValue() {
		return invoiceValue;
	}

	/**
	 * @param invoiceValue the invoiceValue to set
	 */
	public void setInvoiceValue(Double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	/**
	 * @return the payTaxType
	 */
	public TaxTypeEnum.TaxPayType getPayTaxType() {
		return payTaxType;
	}

	/**
	 * @param payTaxType the payTaxType to set
	 */
	public void setPayTaxType(TaxTypeEnum.TaxPayType payTaxType) {
		this.payTaxType = payTaxType;
	}

	/**
	 * @return the taxExcemption
	 */
	public Boolean getTaxExcemption() {
		return taxExcemption;
	}

	/**
	 * @param taxExcemption the taxExcemption to set
	 */
	public void setTaxExcemption(Boolean taxExcemption) {
		this.taxExcemption = taxExcemption;
	}

	/**
	 * @return the totalAmount
	 */
	public Long getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the serviceFee
	 */
	public Long getServiceFee() {
		return ServiceFee;
	}

	/**
	 * @param serviceFee the serviceFee to set
	 */
	public void setServiceFee(Long serviceFee) {
		ServiceFee = serviceFee;
	}

	/**
	 * @return the cfstApplicationNo
	 */
	public String getCfstApplicationNo() {
		return cfstApplicationNo;
	}

	/**
	 * @param cfstApplicationNo the cfstApplicationNo to set
	 */
	public void setCfstApplicationNo(String cfstApplicationNo) {
		this.cfstApplicationNo = cfstApplicationNo;
	}
	/*
		*//**
			 * @return the isMoved
			 */

	/*
	 * public Boolean getIsMoved() { return isMoved; }
	 * 
	 *//**
		 * @param isMoved the isMoved to set
		 *//*
			 * public void setIsMoved(Boolean isMoved) { this.isMoved = isMoved; }
			 */
	public Boolean getApplicationNotFound() {
		return applicationNotFound;
	}

	public void setApplicationNotFound(Boolean applicationNotFound) {
		this.applicationNotFound = applicationNotFound;
	}
	/*
	 * public String getIpAddress() { return ipAddress; } public void
	 * setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
	 */

	public Boolean getTaxPaidThroughVcr() {
		return taxPaidThroughVcr;
	}

	public void setTaxPaidThroughVcr(Boolean taxPaidThroughVcr) {
		this.taxPaidThroughVcr = taxPaidThroughVcr;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}


	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
	}
	

	public String getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
