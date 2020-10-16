package org.epragati.payments.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.PaymentTransactionLogDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTransactionLogDAO extends BaseRepository<PaymentTransactionLogDTO, Serializable>{

}
