package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InsuranceDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	
	private String company;
	
	private String policyType;
	
	private String policyNumber;
	
	private Integer tenure;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate cancelledDate;
	private String cancelledReason;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate validTill;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate validFrom;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validTillForOther;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate validFromForOther;

	public LocalDate getValidFromForOther() {
		return validFromForOther;
	}

	public void setValidFromForOther(LocalDate validFromForOther) {
		this.validFromForOther = validFromForOther;
	}

	public LocalDate getValidTillForOther() {
		return validTillForOther;
	}

	public void setValidTillForOther(LocalDate validTillForOther) {
		this.validTillForOther = validTillForOther;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
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

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the cancelledDate
	 */
	public LocalDate getCancelledDate() {
		return cancelledDate;
	}

	/**
	 * @param cancelledDate the cancelledDate to set
	 */
	public void setCancelledDate(LocalDate cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	/**
	 * @return the cancelledReason
	 */
	public String getCancelledReason() {
		return cancelledReason;
	}

	/**
	 * @param cancelledReason the cancelledReason to set
	 */
	public void setCancelledReason(String cancelledReason) {
		this.cancelledReason = cancelledReason;
	}
	
}
