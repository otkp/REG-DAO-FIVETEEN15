package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.PanDTO;

/**
 *
 * @author saroj.sahoo
 *
 */
public interface PanResponseDAO extends BaseRepository<PanDTO, Serializable> {
	
	Optional<PanDTO> findByPanNumber(String panNumber);

}
