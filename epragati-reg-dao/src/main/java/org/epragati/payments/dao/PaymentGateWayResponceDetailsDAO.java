package org.epragati.payments.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.PaymentGateWayResponceDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentGateWayResponceDetailsDAO extends BaseRepository<PaymentGateWayResponceDetailsDTO, Serializable>{

}
