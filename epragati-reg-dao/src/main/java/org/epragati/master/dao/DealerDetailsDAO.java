package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerDetailsDTO;
import org.springframework.stereotype.Repository;


@Repository
public interface DealerDetailsDAO extends BaseRepository<DealerDetailsDTO, Serializable> {

}
