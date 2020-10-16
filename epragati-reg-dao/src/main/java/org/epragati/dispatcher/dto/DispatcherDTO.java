package org.epragati.dispatcher.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="registration_details")
public class DispatcherDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String applicationNo;

	private String operation;
	
	private LocalDateTime prGeneratedDate;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public LocalDateTime getPrGeneratedDate() {
		return prGeneratedDate;
	}
	public void setPrGeneratedDate(LocalDateTime prGeneratedDate) {
		this.prGeneratedDate = prGeneratedDate;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	@Override
	public String toString() {
		return "DispatcherDTO [applicationNo=" + applicationNo + ", operation=" + operation + ", prGeneratedDate="
				+ prGeneratedDate + "]";
	}
	

	
}
