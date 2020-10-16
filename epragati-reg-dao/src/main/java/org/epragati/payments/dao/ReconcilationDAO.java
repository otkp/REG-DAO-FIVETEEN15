package org.epragati.payments.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.ReconcilationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ReconcilationDAO extends BaseRepository<ReconcilationDTO, Serializable> {

}
