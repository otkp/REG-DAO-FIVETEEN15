package org.epragati.regservice.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.TrailerCapacityLogDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface TrailerCapacityLogDAO extends BaseRepository<TrailerCapacityLogDTO,Serializable> {
	
	}
