package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.BsiiiAllowedDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface BsiiiAllowedDAO extends BaseRepository<BsiiiAllowedDTO, Serializable>{
	public Optional<BsiiiAllowedDTO> findByChassisNoAndEngineNo(String chassisNo ,String engineNo);

}
