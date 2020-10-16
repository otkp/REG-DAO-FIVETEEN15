package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RegSchedulerDashboardDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface RegSchedulerDashboardDAO extends BaseRepository<RegSchedulerDashboardDTO, Serializable> {

	List<RegSchedulerDashboardDTO> findByStatusTrue();
}
