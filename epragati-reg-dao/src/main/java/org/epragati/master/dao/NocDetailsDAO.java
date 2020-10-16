package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.NOCDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface NocDetailsDAO extends BaseRepository<NOCDetailsDTO, Serializable> {

}
