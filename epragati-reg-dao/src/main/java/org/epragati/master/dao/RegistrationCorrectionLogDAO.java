package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CollectionCorrectionServiceLogsDTO;
import org.epragati.master.dto.RegistartionCorrectionLogDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface RegistrationCorrectionLogDAO extends BaseRepository<RegistartionCorrectionLogDTO, Serializable>{

	CollectionCorrectionServiceLogsDTO  findByRequestId(String uuid);
	
	List<CollectionCorrectionServiceLogsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);
	
	List<CollectionCorrectionServiceLogsDTO> findAllByTicketNumber(String ticketNumber);
}
