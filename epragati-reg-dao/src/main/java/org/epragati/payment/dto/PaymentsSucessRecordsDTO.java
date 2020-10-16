package org.epragati.payment.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments_success_trac")
public class PaymentsSucessRecordsDTO extends PaymentTransactionDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1697674142824208994L;
	

}
