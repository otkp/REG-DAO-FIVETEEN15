/*package org.epragati.reports.dao;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.epragati.actions.dto.RCActionsDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsDAO extends BaseRepository<RCActionsDTO, Serializable> {


	Page<RCActionsDTO> findByrcActionsDetailsFromDateBetweenAndOfficeCodeIn(LocalDateTime fromDate,
			LocalDateTime toDate, String officeCode, Pageable pageable);

	Page<RCActionsDTO> findByrcActionsDetailsFromDateBetweenAndOfficeCode(LocalDateTime fromDate, LocalDateTime toDate,
			String officeCode, Pageable pageable);
	
	

}*/