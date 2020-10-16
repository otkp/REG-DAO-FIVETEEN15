package org.epragati.payments.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeDetailsDAO extends BaseRepository<FeeDetailsDTO, Serializable> {

}
