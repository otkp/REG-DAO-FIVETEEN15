package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.AadharSeedingMatrixDTO;


public interface AadharSeedingMatrixDAO extends BaseRepository<AadharSeedingMatrixDTO, Serializable> {
	/**
	 * 
	 * @param code
	 * @return
	 */
	Optional<AadharSeedingMatrixDTO> findByCode(String code);
}
