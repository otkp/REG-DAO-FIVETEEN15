package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.ServicesInvalidDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesInvalidDetailsDAO extends BaseRepository<ServicesInvalidDetailsDTO, Serializable> {

}
