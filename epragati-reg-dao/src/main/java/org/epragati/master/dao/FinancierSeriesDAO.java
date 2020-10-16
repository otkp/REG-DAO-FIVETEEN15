package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinancierSeriesDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface FinancierSeriesDAO extends BaseRepository<FinancierSeriesDTO, Serializable> {


}
