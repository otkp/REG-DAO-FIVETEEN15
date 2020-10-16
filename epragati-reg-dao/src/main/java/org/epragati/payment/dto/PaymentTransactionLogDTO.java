package org.epragati.payment.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "payments_log")
public class PaymentTransactionLogDTO implements Serializable , Cloneable{

	private static final long serialVersionUID = 1L;
	
	private PaymentTransactionDTO PaymentTransactionDTO;
	private LocalDateTime modifiedDate;
	/**
	 * @return the paymentTransactionDTO
	 */
	public PaymentTransactionDTO getPaymentTransactionDTO() {
		return PaymentTransactionDTO;
	}
	/**
	 * @param paymentTransactionDTO the paymentTransactionDTO to set
	 */
	public void setPaymentTransactionDTO(PaymentTransactionDTO paymentTransactionDTO) {
		PaymentTransactionDTO = paymentTransactionDTO;
	}
	/**
	 * @return the modifiedDate
	 */
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
}
