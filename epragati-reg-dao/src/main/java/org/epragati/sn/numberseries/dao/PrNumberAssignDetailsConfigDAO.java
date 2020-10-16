package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.numberseries.dto.PrNumberAssignDetailsConfigDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PrNumberAssignDetailsConfigDAO extends BaseRepository<PrNumberAssignDetailsConfigDTO, Serializable> {
	
	Optional<PrNumberAssignDetailsConfigDTO> findByOfficeCodeAndStatusTrue(String officeCode);
}
