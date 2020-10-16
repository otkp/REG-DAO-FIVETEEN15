package org.epragati.master.dao;

import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.OfficeSlotsAvailabilityDTO;

public interface OfficeSlotsAvailabilityDAO extends BaseRepository<OfficeSlotsAvailabilityDTO, String> {

	public Optional<OfficeSlotsAvailabilityDTO> findByModuleId(Integer moduleId);
	public Optional<OfficeSlotsAvailabilityDTO> findByOfficeCode(String officeCode);
}
