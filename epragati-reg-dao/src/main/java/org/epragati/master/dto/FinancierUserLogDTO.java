package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_finacier_user_log")
public class FinancierUserLogDTO extends UserLogDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String updatedPersonAadhar;
	//private String remarks;
	
	public String getUpdatedPersonAadhar() {
		return updatedPersonAadhar;
	}
	public void setUpdatedPersonAadhar(String updatedPersonAadhar) {
		this.updatedPersonAadhar = updatedPersonAadhar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}*/
	 

}
