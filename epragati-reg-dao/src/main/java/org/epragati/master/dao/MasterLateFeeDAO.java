package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterLateFee;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterLateFeeDAO extends BaseRepository<MasterLateFee, Serializable>{

	Optional<MasterLateFee> findByCovCodesIn(String covCodes);
}
