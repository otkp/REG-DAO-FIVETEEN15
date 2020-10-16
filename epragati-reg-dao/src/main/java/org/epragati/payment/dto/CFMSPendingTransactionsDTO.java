package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cfms_pending_transactions_details")
public class CFMSPendingTransactionsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String transactinNo;

	private String status;

	private PaymentTransactionResponseDTO response;

	private List<PaymentTransactionResponseDTO> responseLog;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the response
	 */
	public PaymentTransactionResponseDTO getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(PaymentTransactionResponseDTO response) {
		this.response = response;
	}

	/**
	 * @return the responseLog
	 */
	public List<PaymentTransactionResponseDTO> getResponseLog() {
		return responseLog;
	}

	/**
	 * @param responseLog
	 *            the responseLog to set
	 */
	public void setResponseLog(List<PaymentTransactionResponseDTO> responseLog) {
		this.responseLog = responseLog;
	}

	/**
	 * @return the transactinNo
	 */
	public String getTransactinNo() {
		return transactinNo;
	}

	/**
	 * @param transactinNo
	 *            the transactinNo to set
	 */
	public void setTransactinNo(String transactinNo) {
		this.transactinNo = transactinNo;
	}

}
