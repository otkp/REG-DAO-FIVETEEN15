package org.epragati.master.dao;

import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinanceDetailsDTO;

/**
 * 
 * @author pbattula
 *
 */

public interface FinanceDetailsDAO extends BaseRepository<FinanceDetailsDTO, String> {

	Optional<FinanceDetailsDTO> findByApplicationNo(String applicationNo);

}
