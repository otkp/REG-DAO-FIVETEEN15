package org.epragati.payment.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author pbattula
 *
 */
@Document
public class GateWaySBIPaymentDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String modeofPayment;
	
	private String successURL;
	
	private String fauilureURL;
	
	public String getModeofPayment() {
		return modeofPayment;
	}
	public void setModeofPayment(String modeofPayment) {
		this.modeofPayment = modeofPayment;
	}
	public String getSuccessURL() {
		return successURL;
	}
	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}
	public String getFauilureURL() {
		return fauilureURL;
	}
	public void setFauilureURL(String fauilureURL) {
		this.fauilureURL = fauilureURL;
	}
}
