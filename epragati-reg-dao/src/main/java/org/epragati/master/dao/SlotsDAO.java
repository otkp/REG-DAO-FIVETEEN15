package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.SlotsDTO;
import org.springframework.stereotype.Repository;

/**
 * @author sairam.cheruku
 *
 */
@Repository
public interface SlotsDAO extends BaseRepository<SlotsDTO, Serializable>{

	List<SlotsDTO> findByOfficeCode(String officeCode);

	List<SlotsDTO> findByOfficeCodeAndDateBetween(String officeCode, LocalDate localFromDate, LocalDate localToDate);
	
	/**
	 * Find Slot for a Specific Date
	 * @param officeCode
	 * @param date
	 * @return
	 */
	Optional<SlotsDTO> findByOfficeCodeAndDate(String officeCode, LocalDate date);
	
	Optional<SlotsDTO> findByModuleAndOfficeCodeAndDate(String module, String officeCode, LocalDate date);
	
	List<SlotsDTO> findByOfficeCodeAndDateBetweenAndServiceIn(String officeCode,LocalDate localFromDate,LocalDate localToDate,List<String> service);
	

}
