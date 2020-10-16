package org.epragati.civilsupplies.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection ="ration_card_details")
@JsonInclude(Include.NON_NULL)
public class RationCardDetailsDTO {

	private RationCardMemDetailsDTO rationCardDetails;
	
	private String respMessage;
	
	private String aadhaarNo;
	

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public RationCardMemDetailsDTO getRationCardDetails() {
		return rationCardDetails;
	}

	public void setRationCardDetails(RationCardMemDetailsDTO rationCardDetails) {
		this.rationCardDetails = rationCardDetails;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

	
	
	
}
