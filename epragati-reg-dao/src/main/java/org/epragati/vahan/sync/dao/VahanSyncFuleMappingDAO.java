package org.epragati.vahan.sync.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vahan.sync.dto.VahanSyncFuleMappingDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VahanSyncFuleMappingDAO extends BaseRepository<VahanSyncFuleMappingDTO, Serializable>{
	Optional<VahanSyncFuleMappingDTO> findByFuelTypeAndStatusTrue(String fuelType);
}
