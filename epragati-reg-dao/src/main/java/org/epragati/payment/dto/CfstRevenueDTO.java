package org.epragati.payment.dto;

import java.time.LocalDateTime;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cfst_revenue")

public class CfstRevenueDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String module;
	private String purpose;

	private String officeCode;

	private Integer districtCode;

	private LocalDateTime transactionDate;

	private double licFee;

	private double regFee;

	private double fcFee;

	private double perFee;

	private double othFee;

	private double serviceFee;

	private double qTax;

	private double greenTax;

	private double lifeTax;

	private double detectionQtax;

	private double detectionQtaxPenalty;

	private double detectionLifeTax;

	private double detectionLifeTaxPenalty;

	private double compoundFee;

	private LocalDateTime paidDate;

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getLicFee() {
		return licFee;
	}

	public void setLicFee(double licFee) {
		this.licFee = licFee;
	}

	public double getRegFee() {
		return regFee;
	}

	public void setRegFee(double regFee) {
		this.regFee = regFee;
	}

	public double getFcFee() {
		return fcFee;
	}

	public void setFcFee(double fcFee) {
		this.fcFee = fcFee;
	}

	public double getPerFee() {
		return perFee;
	}

	public void setPerFee(double perFee) {
		this.perFee = perFee;
	}

	public double getOthFee() {
		return othFee;
	}

	public void setOthFee(double othFee) {
		this.othFee = othFee;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getqTax() {
		return qTax;
	}

	public void setqTax(double qTax) {
		this.qTax = qTax;
	}

	public double getGreenTax() {
		return greenTax;
	}

	public void setGreenTax(double greenTax) {
		this.greenTax = greenTax;
	}

	public double getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(double lifeTax) {
		this.lifeTax = lifeTax;
	}

	public double getDetectionQtax() {
		return detectionQtax;
	}

	public void setDetectionQtax(double detectionQtax) {
		this.detectionQtax = detectionQtax;
	}

	public double getDetectionQtaxPenalty() {
		return detectionQtaxPenalty;
	}

	public void setDetectionQtaxPenalty(double detectionQtaxPenalty) {
		this.detectionQtaxPenalty = detectionQtaxPenalty;
	}

	public double getDetectionLifeTax() {
		return detectionLifeTax;
	}

	public void setDetectionLifeTax(double detectionLifeTax) {
		this.detectionLifeTax = detectionLifeTax;
	}

	public double getDetectionLifeTaxPenalty() {
		return detectionLifeTaxPenalty;
	}

	public void setDetectionLifeTaxPenalty(double detectionLifeTaxPenalty) {
		this.detectionLifeTaxPenalty = detectionLifeTaxPenalty;
	}

	public double getCompoundFee() {
		return compoundFee;
	}

	public void setCompoundFee(double compoundFee) {
		this.compoundFee = compoundFee;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

}
