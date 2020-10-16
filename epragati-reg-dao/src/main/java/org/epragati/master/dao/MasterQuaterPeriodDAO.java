package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterQuaterPeriodDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterQuaterPeriodDAO extends BaseRepository<MasterQuaterPeriodDTO, Serializable> {

	Optional<MasterQuaterPeriodDTO> findByQuaterMonths(Integer month);
}
