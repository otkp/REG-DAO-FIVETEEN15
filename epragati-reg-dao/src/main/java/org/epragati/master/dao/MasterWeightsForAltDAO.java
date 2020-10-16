package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterWeightsForAlt;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterWeightsForAltDAO extends BaseRepository<MasterWeightsForAlt, Serializable>{

	Optional<MasterWeightsForAlt> findByToGvwGreaterThanEqualAndFromGvwLessThanEqualAndStatusIsTrue(Integer toGvw , Integer fromGvw);
}
