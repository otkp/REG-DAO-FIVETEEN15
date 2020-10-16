package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BaseShowCauseEntity extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cov;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;

	private String ownerName;

	private String ownerAddress;

	private String financerName;

	private String financerAddress;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate quarterEndDate;

	private Integer pendingQuarters;

	private String officeCode;

	private String permitNo;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	
	private String fatherName;
	
	private String covDesc;
	
	private String officeName;
	
	private Integer districtId;
	
	private String districtName;
	
	private String mobileNo;
	
	private String regApplicationNo;
	
	private String weightType;
	
	private Integer gvw;
	
	
	
	public Integer getGvw() {
		return gvw;
	}

	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getCovDesc() {
		return covDesc;
	}

	public void setCovDesc(String covDesc) {
		this.covDesc = covDesc;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFinancerAddress() {
		return financerAddress;
	}

	public void setFinancerAddress(String financerAddress) {
		this.financerAddress = financerAddress;
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

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
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

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public LocalDate getQuarterEndDate() {
		return quarterEndDate;
	}

	public void setQuarterEndDate(LocalDate quarterEndDate) {
		this.quarterEndDate = quarterEndDate;
	}

	public Integer getPendingQuarters() {
		return pendingQuarters;
	}

	public void setPendingQuarters(Integer pendingQuarters) {
		this.pendingQuarters = pendingQuarters;
	}

}
