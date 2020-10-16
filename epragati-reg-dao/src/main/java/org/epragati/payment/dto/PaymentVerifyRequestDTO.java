package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.Map;

public class PaymentVerifyRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Map<String,String> payUReqParameters;


	public Map<String, String> getPayUReqParameters() {
		return payUReqParameters;
	}


	public void setPayUReqParameters(Map<String, String> payUReqParameters) {
		this.payUReqParameters = payUReqParameters;
	}

}
