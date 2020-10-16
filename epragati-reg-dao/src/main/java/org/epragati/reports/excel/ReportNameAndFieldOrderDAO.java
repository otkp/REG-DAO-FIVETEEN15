package org.epragati.reports.excel;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportNameAndFieldOrderDAO extends BaseRepository<ReportNameAndFieldOrderDTO, Serializable> {

	Optional<ReportNameAndFieldOrderDTO> findByReportName(String reportName);
}
