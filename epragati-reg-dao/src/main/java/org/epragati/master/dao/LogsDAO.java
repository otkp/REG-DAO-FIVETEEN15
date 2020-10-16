package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.LogsDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface LogsDAO extends BaseRepository<LogsDTO, Serializable>{

	LogsDTO findByApplicationNo(String applicationNo);
	
}
