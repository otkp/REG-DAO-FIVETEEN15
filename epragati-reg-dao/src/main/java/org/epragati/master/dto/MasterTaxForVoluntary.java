package org.epragati.master.dto;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_vcr_tptax")
public class MasterTaxForVoluntary {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private List<String> covs;
	private Integer fromGvw;
	private Integer toGvw;
	private Integer fromUlw;
	private Integer toUlw;
	private String fromSeats;
	private String toSeats;
	private Double sevenDaysTax;
	private Double thirtyDaysTax;
	private Double oneYearTax;
	private boolean status;
	private String purpose;
	
	
	public List<String> getCovs() {
		return covs;
	}
	public void setCovs(List<String> covs) {
		this.covs = covs;
	}
	public Integer getFromGvw() {
		return fromGvw;
	}
	public void setFromGvw(Integer fromGvw) {
		this.fromGvw = fromGvw;
	}
	public Integer getToGvw() {
		return toGvw;
	}
	public void setToGvw(Integer toGvw) {
		this.toGvw = toGvw;
	}
	public Integer getFromUlw() {
		return fromUlw;
	}
	public void setFromUlw(Integer fromUlw) {
		this.fromUlw = fromUlw;
	}
	public Integer getToUlw() {
		return toUlw;
	}
	public void setToUlw(Integer toUlw) {
		this.toUlw = toUlw;
	}
	public String getFromSeats() {
		return fromSeats;
	}
	public void setFromSeats(String fromSeats) {
		this.fromSeats = fromSeats;
	}
	public String getToSeats() {
		return toSeats;
	}
	public void setToSeats(String toSeats) {
		this.toSeats = toSeats;
	}
	public Double getSevenDaysTax() {
		return sevenDaysTax;
	}
	public void setSevenDaysTax(Double sevenDaysTax) {
		this.sevenDaysTax = sevenDaysTax;
	}
	public Double getThirtyDaysTax() {
		return thirtyDaysTax;
	}
	public void setThirtyDaysTax(Double thirtyDaysTax) {
		this.thirtyDaysTax = thirtyDaysTax;
	}
	public Double getOneYearTax() {
		return oneYearTax;
	}
	public void setOneYearTax(Double oneYearTax) {
		this.oneYearTax = oneYearTax;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	
	
	
}
