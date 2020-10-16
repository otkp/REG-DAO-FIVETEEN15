package org.epragati.vcrImage.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ConsolidateChallanDTO {

	private String type;

	private double quarterlyTax;

	private double lifeTax;

	private double serviceFee;

	private double compoundFee;

	private double permitFee;

	private String vcrNo;

	private String mviName;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate vcrBookedDate;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getQuarterlyTax() {
		return quarterlyTax;
	}

	public void setQuarterlyTax(double quarterlyTax) {
		this.quarterlyTax = quarterlyTax;
	}

	public double getLifeTax() {
		return lifeTax;
	}

	public void setLifeTax(double lifeTax) {
		this.lifeTax = lifeTax;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getCompoundFee() {
		return compoundFee;
	}

	public void setCompoundFee(double compoundFee) {
		this.compoundFee = compoundFee;
	}

	public double getPermitFee() {
		return permitFee;
	}

	public void setPermitFee(double permitFee) {
		this.permitFee = permitFee;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public LocalDate getVcrBookedDate() {
		return vcrBookedDate;
	}

	public void setVcrBookedDate(LocalDate vcrBookedDate) {
		this.vcrBookedDate = vcrBookedDate;
	}

}
