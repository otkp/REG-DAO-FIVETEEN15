package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterStoppageQuationsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MsterStoppageQuationsDAO extends BaseRepository<MasterStoppageQuationsDTO, Serializable>{

	List<MasterStoppageQuationsDTO> findByStatusIsTrue();
}
