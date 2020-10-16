package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CardDispatchDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface CardDispatchDetailsDAO extends BaseRepository<CardDispatchDetailsDTO, Serializable>{

	Optional<CardDispatchDetailsDTO> findByPrNo(String prNo);
	
}
