package org.epragati.vcrImage.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VcrCorrectionLogDTO {

	private String fieldName;
	private String from;
	private String to;
	private Integer intFrom;
	private Integer intTo;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String userName;
	private String role;
	private LocalDateTime updateDate;
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getIntFrom() {
		return intFrom;
	}
	public void setIntFrom(Integer intFrom) {
		this.intFrom = intFrom;
	}
	public Integer getIntTo() {
		return intTo;
	}
	public void setIntTo(Integer intTo) {
		this.intTo = intTo;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}
