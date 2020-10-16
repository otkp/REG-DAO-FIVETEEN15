package org.epragati.master.dto;

import org.epragati.util.Status.SuccessFailStatus;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cfst_responce_data")
public class CfstSyncResponceDTO {
	
	private String prNo;
	
	private SuccessFailStatus status;
	
	private String errors;
	
	private String firstName;
	

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the status
	 */
	public SuccessFailStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(SuccessFailStatus status) {
		this.status = status;
	}

	
	/**
	 * @return the errors
	 */
	public String getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(String errors) {
		this.errors = errors;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

