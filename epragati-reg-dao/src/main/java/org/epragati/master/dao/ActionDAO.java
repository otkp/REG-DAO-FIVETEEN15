package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ActionDTO;

public interface ActionDAO extends BaseRepository<ActionDTO, Serializable>{
	List<ActionDTO> findAll();
}
