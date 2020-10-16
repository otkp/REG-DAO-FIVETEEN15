package org.epragati.payments.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.CFMSPendingTransactionsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CFMSPendingTransactionsDAO extends BaseRepository<CFMSPendingTransactionsDTO, Serializable> {

	Optional<CFMSPendingTransactionsDTO> findByTransactinNo(String transactionNo);

}
