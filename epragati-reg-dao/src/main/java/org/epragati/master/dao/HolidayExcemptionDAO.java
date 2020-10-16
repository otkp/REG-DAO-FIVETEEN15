package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.HolidayExcemptionDTO;
import org.springframework.stereotype.Repository;
import java.lang.String;

@Repository
public interface HolidayExcemptionDAO  extends BaseRepository<HolidayExcemptionDTO, Serializable>{

	List<HolidayExcemptionDTO>  findByExcemptionDateBetweenAndHolidayTypeTrue(LocalDate fromDate,LocalDate toDate);
	
	Optional<HolidayExcemptionDTO> findByExcemptionDateAndHolidayTypeTrue(LocalDate date);
}
