package org.epragati.payment.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 
 * @author naga.pulaparthi
 *
 */

public class PaymentTransactionRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String requestDeatils;
	
	@JsonFormat(pattern = "dd-MM-yyyy hh:MM:ss")
	private LocalDateTime requestTime;

	public String getRequestDeatils() {
		return requestDeatils;
	}

	public void setRequestDeatils(String requestDeatils) {
		this.requestDeatils = requestDeatils;
	}



	/**
	 * @return the requestTime
	 */
	public LocalDateTime getRequestTime() {
		return requestTime;
	}

	/**
	 * @param requestTime the requestTime to set
	 */
	public void setRequestTime(LocalDateTime requestTime) {
		this.requestTime = requestTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentTransactionRequestDTO [requestDeatils=" + requestDeatils + ", requestTime=" + requestTime + "]";
	}
}
