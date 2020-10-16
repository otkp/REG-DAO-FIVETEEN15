package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.numberseries.dto.PrNumberAssignDetailsConfigLogDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PrNumberAssignDetailsConfigLogDAO extends BaseRepository<PrNumberAssignDetailsConfigLogDTO, Serializable> {
	
	Optional<PrNumberAssignDetailsConfigLogDTO> findByOfficeCodeAndCurrentDate(String reportingoffice, LocalDate now);
}
