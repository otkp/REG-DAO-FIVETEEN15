package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.DeathPrNoDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathPrNoDAO extends BaseRepository<DeathPrNoDTO, Serializable> {
	
	Optional<DeathPrNoDTO> findByPrNoAndStatus(String prNo,Boolean status);
	
}