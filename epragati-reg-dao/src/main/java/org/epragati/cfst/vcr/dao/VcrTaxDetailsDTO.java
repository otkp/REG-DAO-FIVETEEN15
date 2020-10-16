package org.epragati.cfst.vcr.dao;

import java.util.List;

public class VcrTaxDetailsDTO {

	private String vcrNo;
	
	private String regnNo;
	
	private String vehicles;
	
	private String challanNo;
	
	private String paymtDate;
		
	private Double cfAmnt;
	
	private Double taxAmt;
	
	private String bookDate;
		
	private String mviCode;
	
	private String mviName;
	
	private String officeCode;
	
	private String manVcrNo;
	
	private List<String> vcrNosList;
	private String trNo;
	private String chassisNo;
	
	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String getMviCode() {
		return mviCode;
	}

	public void setMviCode(String mviCode) {
		this.mviCode = mviCode;
	}

	public String getMviName() {
		return mviName;
	}

	public void setMviName(String mviName) {
		this.mviName = mviName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getManVcrNo() {
		return manVcrNo;
	}

	public void setManVcrNo(String manVcrNo) {
		this.manVcrNo = manVcrNo;
	}

	public String getVcrNo() {
		return vcrNo;
	}

	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}

	public String getRegnNo() {
		return regnNo;
	}

	public void setRegnNo(String regnNo) {
		this.regnNo = regnNo;
	}

	public String getVehicles() {
		return vehicles;
	}

	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public String getPaymtDate() {
		return paymtDate;
	}

	public void setPaymtDate(String paymtDate) {
		this.paymtDate = paymtDate;
	}

	public Double getCfAmnt() {
		return cfAmnt;
	}

	public void setCfAmnt(Double cfAmnt) {
		this.cfAmnt = cfAmnt;
	}

	public Double getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(Double taxAmt) {
		this.taxAmt = taxAmt;
	}

	public List<String> getVcrNosList() {
		return vcrNosList;
	}

	public void setVcrNosList(List<String> vcrNosList) {
		this.vcrNosList = vcrNosList;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	
}
