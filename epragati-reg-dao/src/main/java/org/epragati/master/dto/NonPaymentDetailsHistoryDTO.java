package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="non_payment_report_details_history")
public class NonPaymentDetailsHistoryDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 761280745603354005L;


	@Id
	private String id;
	
	
	private NonPaymentDetailsDTO nonPayment;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public NonPaymentDetailsDTO getNonPayment() {
		return nonPayment;
	}


	public void setNonPayment(NonPaymentDetailsDTO nonPayment) {
		this.nonPayment = nonPayment;
	}
	
	
}
