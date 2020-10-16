package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterBileteralTaxStatesConfig;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterBileteralTaxStatesConfigDAO extends BaseRepository<MasterBileteralTaxStatesConfig, Serializable>{

	Optional<MasterBileteralTaxStatesConfig> findByStateName(String stateName);
}
