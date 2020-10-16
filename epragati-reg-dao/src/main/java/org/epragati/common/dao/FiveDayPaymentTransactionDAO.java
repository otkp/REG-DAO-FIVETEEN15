package org.epragati.common.dao;

import org.epragati.payment.dto.PaymentTransaction_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayPaymentTransactionDAO extends BaseRepository<PaymentTransaction_last5d, String> {

}
	