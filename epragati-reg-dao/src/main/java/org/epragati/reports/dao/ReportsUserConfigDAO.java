package org.epragati.reports.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.reports.dto.ReportsUserConfigDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsUserConfigDAO extends BaseRepository<ReportsUserConfigDTO, Serializable> {

	Optional<ReportsUserConfigDTO> findByReportName(String reportName);

}
