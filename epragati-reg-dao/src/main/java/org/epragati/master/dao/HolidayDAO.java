package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.HolidayDTO;
import org.epragati.util.payment.ModuleEnum;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sairam.cheruku
 *
 */

@Repository
public interface HolidayDAO extends BaseRepository<HolidayDTO, Serializable> {

	List<HolidayDTO> findByModuleAndHolidayDateBetweenAndHolidayStatusTrue(ModuleEnum reg, LocalDate startDate, LocalDate endDate,Boolean True);
	
	Optional<HolidayDTO> findByHolidayDateAndModuleAndHolidayStatusTrue(LocalDate date, ModuleEnum reg);
	

}
