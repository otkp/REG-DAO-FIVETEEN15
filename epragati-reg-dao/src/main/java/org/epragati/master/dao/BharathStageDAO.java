package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.BharathStageDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface BharathStageDAO extends BaseRepository<BharathStageDTO, Serializable>{
	Optional<BharathStageDTO> findByBharathStage(String bharathStage);

}
