package org.epragati.ticket.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EnableCgcDAO extends BaseRepository<EnableCgcDTO, Serializable> {
	
	EnableCgcDTO findByDistictId(Integer districtId);

}
