package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterStoppageRevocationQuationsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MsterStoppageRevocationQuationsDAO extends BaseRepository<MasterStoppageRevocationQuationsDTO, Serializable>{
	List<MasterStoppageRevocationQuationsDTO> findByStatusIsTrue();
}
