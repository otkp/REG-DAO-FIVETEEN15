package org.epragati.reports.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.reports.dto.ReportsRoleConfigDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRoleConfigDAO extends BaseRepository<ReportsRoleConfigDTO, Serializable> {

	/**
	 * 
	 * @param type
	 * @return
	 */
	Optional<ReportsRoleConfigDTO> findByType(String type);
}
