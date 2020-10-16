package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterLateeFeeForFC;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterLateeFeeForFCDAO extends BaseRepository<MasterLateeFeeForFC, Serializable>{

	Optional<MasterLateeFeeForFC> findByStatusTrue();
}
