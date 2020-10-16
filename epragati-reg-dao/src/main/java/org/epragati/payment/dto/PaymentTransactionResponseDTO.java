package org.epragati.payment.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.payments.vo.CFMSResponce;
import org.epragati.payments.vo.PayUResponse;
import org.epragati.payments.vo.SBIResponce;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class PaymentTransactionResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String bankTransactionRefNum;
	private String responseDeatils;
	private Boolean isHashValidationSucess;
	private String responseDateStr;

	@JsonFormat(pattern = "dd-MM-yyyy hh:MM:ss")
	private LocalDateTime responseTime;
	
	private SBIResponce sbiResponce;
	
	private PayUResponse payUResponse;
	
	private CFMSResponce cfmsResponce;

	/**
	 * @return the bankTransactionRefNum
	 */
	public String getBankTransactionRefNum() {
		return bankTransactionRefNum;
	}

	/**
	 * @param bankTransactionRefNum
	 *            the bankTransactionRefNum to set
	 */
	public void setBankTransactionRefNum(String bankTransactionRefNum) {
		this.bankTransactionRefNum = bankTransactionRefNum;
	}

	/**
	 * @return the responseDeatils
	 */
	public String getResponseDeatils() {
		return responseDeatils;
	}

	/**
	 * @param responseDeatils
	 *            the responseDeatils to set
	 */
	public void setResponseDeatils(String responseDeatils) {
		this.responseDeatils = responseDeatils;
	}

	/**
	 * @return the responseTime
	 */
	public LocalDateTime getResponseTime() {
		return responseTime;
	}

	/**
	 * @param responseTime
	 *            the responseTime to set
	 */
	public void setResponseTime(LocalDateTime responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * @return the isHashValidationSucess
	 */
	public Boolean getIsHashValidationSucess() {
		return isHashValidationSucess;
	}

	/**
	 * @param isHashValidationSucess
	 *            the isHashValidationSucess to set
	 */
	public void setIsHashValidationSucess(Boolean isHashValidationSucess) {
		this.isHashValidationSucess = isHashValidationSucess;
	}

	/**
	 * @return the sbiResponce
	 */
	public SBIResponce getSbiResponce() {
		return sbiResponce;
	}

	/**
	 * @param sbiResponce the sbiResponce to set
	 */
	public void setSbiResponce(SBIResponce sbiResponce) {
		this.sbiResponce = sbiResponce;
	}

	/**
	 * @return the payUResponse
	 */
	public PayUResponse getPayUResponse() {
		return payUResponse;
	}

	/**
	 * @param payUResponse the payUResponse to set
	 */
	public void setPayUResponse(PayUResponse payUResponse) {
		this.payUResponse = payUResponse;
	}
	
	public String getResponseDateStr() {
		return responseDateStr;
	}

	public void setResponseDateStr(String responseDateStr) {
		this.responseDateStr = responseDateStr;
	}

	/**
	 * @return the cfmsResponce
	 */
	public CFMSResponce getCfmsResponce() {
		return cfmsResponce;
	}

	/**
	 * @param cfmsResponce the cfmsResponce to set
	 */
	public void setCfmsResponce(CFMSResponce cfmsResponce) {
		this.cfmsResponce = cfmsResponce;
	}
	
	
}
