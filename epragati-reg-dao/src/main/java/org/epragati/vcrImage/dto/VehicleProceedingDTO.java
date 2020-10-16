package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class VehicleProceedingDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private FromVcrDTO from;
	private ToVcrDTO to;
	private String remarks;
	public FromVcrDTO getFrom() {
		return from;
	}
	public void setFrom(FromVcrDTO from) {
		this.from = from;
	}
	public ToVcrDTO getTo() {
		return to;
	}
	public void setTo(ToVcrDTO to) {
		this.to = to;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
