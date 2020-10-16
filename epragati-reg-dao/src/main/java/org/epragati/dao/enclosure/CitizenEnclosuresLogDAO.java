package org.epragati.dao.enclosure;

import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.CitizenEnclosuresLogsDTO;

public interface CitizenEnclosuresLogDAO extends BaseRepository<CitizenEnclosuresLogsDTO, String> {
	
	List<CitizenEnclosuresLogsDTO> findByapplicationNo(String applicationNo);
}