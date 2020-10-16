package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RCCancellationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface RCCancellationDAO extends BaseRepository<RCCancellationDTO, Serializable> {

}
