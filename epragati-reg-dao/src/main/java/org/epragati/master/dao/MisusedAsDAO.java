package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MisusedAsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MisusedAsDAO extends BaseRepository<MisusedAsDTO, Serializable> {

}
