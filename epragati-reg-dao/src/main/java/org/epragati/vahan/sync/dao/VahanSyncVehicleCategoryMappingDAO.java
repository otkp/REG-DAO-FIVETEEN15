package org.epragati.vahan.sync.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vahan.sync.dto.VahanSyncVehicleCategoryMappingDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface VahanSyncVehicleCategoryMappingDAO extends BaseRepository<VahanSyncVehicleCategoryMappingDTO, Serializable>{

	Optional<VahanSyncVehicleCategoryMappingDTO> findByCovCodeInAndWeightTypeInAndStatusIsTrue(List<String> covlist , List<String> wegiht);
	
	
}
