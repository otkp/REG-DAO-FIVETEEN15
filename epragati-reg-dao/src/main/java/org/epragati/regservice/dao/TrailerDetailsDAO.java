package org.epragati.regservice.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.TrailerDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */

@Repository
public interface TrailerDetailsDAO extends BaseRepository<TrailerDetailsDTO,  Serializable> {

	Optional<TrailerDetailsDTO> findByChassisNo(String string);

}
