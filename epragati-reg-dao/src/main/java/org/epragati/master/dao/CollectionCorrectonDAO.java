package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CollectionCorrectionDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionCorrectonDAO extends BaseRepository<CollectionCorrectionDTO, Serializable> {

}
