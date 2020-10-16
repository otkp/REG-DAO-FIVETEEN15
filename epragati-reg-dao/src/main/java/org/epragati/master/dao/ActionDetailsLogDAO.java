package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ActionDetailsLogDTO;
import org.epragati.regservice.dto.ActionDetails;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface ActionDetailsLogDAO extends BaseRepository<ActionDetailsLogDTO, Serializable> {

	void save(ActionDetails action);

}
