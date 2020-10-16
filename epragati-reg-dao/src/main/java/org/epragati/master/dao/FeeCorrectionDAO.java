package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FeeCorrectionDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeCorrectionDAO extends BaseRepository<FeeCorrectionDTO, Serializable>{

	Optional<FeeCorrectionDTO> findByChassisNoAndStatusIsTrue(String chassisNo);
	List<FeeCorrectionDTO> findByOfficeCodeAndCurrentRolesIn(String officeCode, String currentRoles);
}
