package org.epragati.sn.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.dto.CovCategoryMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface CovCategoryMasterDAO extends BaseRepository<CovCategoryMaster, Serializable> {

	Optional<CovCategoryMaster> findByCovCode(String covCode);
	
	List<CovCategoryMaster> findByCovCodeIn(List<String> covCodes);

}
