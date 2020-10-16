package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitMandalExemptionDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitMandalExemptionDAO extends BaseRepository<PermitMandalExemptionDTO, Serializable>{

	Optional<PermitMandalExemptionDTO> findByMandalCodeAndStatusTrue(Integer mandalCode);
	
}
