package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.OfficeWisePermitsAvilabilityDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeWisePermitsAvilabilityDAO extends BaseRepository<OfficeWisePermitsAvilabilityDTO, Serializable> {

	Optional<OfficeWisePermitsAvilabilityDTO> findByOfficeCodeAndStatusTrue(String officeCode);

}
