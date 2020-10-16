package org.epragati.availabilitycofig.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.availabilitycofig.dto.ServiceAvailabilityConfigDTO;
import org.epragati.common.dao.BaseRepository;

public interface ServiceAvailabilityConfigDAO extends BaseRepository<ServiceAvailabilityConfigDTO, Serializable>{
	
	Optional<ServiceAvailabilityConfigDTO> findByOfficeCodesIn(String officeCode);
}
