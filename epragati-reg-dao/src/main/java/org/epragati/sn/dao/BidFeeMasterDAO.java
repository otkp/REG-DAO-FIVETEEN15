package org.epragati.sn.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.dto.BidFeeMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface BidFeeMasterDAO extends BaseRepository<BidFeeMaster,Serializable>{
	
	Optional<BidFeeMaster> findByCovCategoryGroupId(Long covCategoryGroupId);

}
