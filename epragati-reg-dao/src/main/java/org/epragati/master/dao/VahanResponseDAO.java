package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.VahanDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saroj.sahoo
 *
 */
@Repository
public interface VahanResponseDAO extends BaseRepository<VahanDetailsDTO, Serializable> {

	List<VahanDetailsDTO> findByChassisNumberOrEngineNumber(String chasisNo, String engineNo);
	
	List<VahanDetailsDTO> findByChassisNumberAndEngineNumber(String chasisNo, String engineNo);
	
	Optional<VahanDetailsDTO> findByAppNo(String appNo);
	
}
