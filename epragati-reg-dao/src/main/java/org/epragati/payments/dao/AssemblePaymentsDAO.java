package org.epragati.payments.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.AssemblePaymentsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AssemblePaymentsDAO extends BaseRepository<AssemblePaymentsDTO, Serializable> {

	
}
