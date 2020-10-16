package org.epragati.master.dto;

import java.time.LocalDateTime;

public class ClassOfVehiclesLogDTO {

	private String fromCov;
	private String toCov;
	private LocalDateTime from;
	private LocalDateTime to;
	private Integer currentcovNo;
	private boolean isCurrentcov;
	
	public String getFromCov() {
		return fromCov;
	}
	public void setFromCov(String fromCov) {
		this.fromCov = fromCov;
	}
	
	public String getToCov() {
		return toCov;
	}
	public void setToCov(String toCov) {
		this.toCov = toCov;
	}
	public LocalDateTime getFrom() {
		return from;
	}
	public void setFrom(LocalDateTime from) {
		this.from = from;
	}
	public LocalDateTime getTo() {
		return to;
	}
	public void setTo(LocalDateTime to) {
		this.to = to;
	}
	public boolean isCurrentcov() {
		return isCurrentcov;
	}
	public void setCurrentcov(boolean isCurrentcov) {
		this.isCurrentcov = isCurrentcov;
	}
	public Integer getCurrentcovNo() {
		return currentcovNo;
	}
	public void setCurrentcovNo(Integer currentcovNo) {
		this.currentcovNo = currentcovNo;
	}
	
	
}
