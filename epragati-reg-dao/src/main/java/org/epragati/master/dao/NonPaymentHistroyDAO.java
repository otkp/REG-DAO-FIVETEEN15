package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.NonPaymentDetailsHistoryDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface NonPaymentHistroyDAO extends BaseRepository<NonPaymentDetailsHistoryDTO, Serializable>{

}
