package org.epragati.reports.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.reports.dto.RegDetailsReportDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface RegDetailsReportDAO extends BaseRepository<RegDetailsReportDTO, Serializable> { 

	Optional<RegDetailsReportDTO> findBychassisNumber(String chassisNo);

	// Query(value = "{ 'registrationValidity.prGeneratedDate': {$gte:?0,$lte:?1},'officeCode':?2}")
		List<RegDetailsReportDTO> findByRegistrationValidityPrGeneratedDateBetweenAndOfficeCode(LocalDate fromDate,
				LocalDate toDate, String officeCode);
}
