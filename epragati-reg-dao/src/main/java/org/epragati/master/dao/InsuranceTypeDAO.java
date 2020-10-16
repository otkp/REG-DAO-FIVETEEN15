package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.InsuranceTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceTypeDAO extends BaseRepository<InsuranceTypeDTO, Serializable>{

	List<InsuranceTypeDTO> findByStatusTrue();

	Optional<InsuranceTypeDTO> findByNicCode(Integer nicCode);
}
