package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MandalMappingDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface MandalMappingDAO extends BaseRepository<MandalMappingDTO, Serializable>{

	Optional<MandalMappingDTO> findByActualOfficeAndStatusTrue(String office);
	
}
