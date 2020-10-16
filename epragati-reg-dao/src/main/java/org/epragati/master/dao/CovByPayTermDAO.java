package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.CovByPayTermDTO;

public interface CovByPayTermDAO extends BaseRepository<CovByPayTermDTO, Serializable> {

	List<CovByPayTermDTO> findByPayperiodIn(List<String> payPeriod);
}
