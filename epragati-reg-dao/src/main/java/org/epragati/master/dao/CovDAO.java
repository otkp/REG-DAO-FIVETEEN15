package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CovDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CovDAO extends BaseRepository<CovDTO, Serializable> {


}
