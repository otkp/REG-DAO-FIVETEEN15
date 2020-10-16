package org.epragati.sn.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.dto.BidConfigMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface BidConfigMasterDAO extends BaseRepository<BidConfigMaster, Serializable> {

	Optional<BidConfigMaster> findByConfigStatus(String configStatus);
}
