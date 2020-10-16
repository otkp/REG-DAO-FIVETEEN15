package org.epragati.vahan.sync.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vahan.sync.dto.VahanSyncDistrictMappingDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VahanSyncDistrictMappingDAO extends BaseRepository<VahanSyncDistrictMappingDTO, Serializable>{
	
	Optional<VahanSyncDistrictMappingDTO> findByDistrictNameIgnoreCaseAndStateCode(String districtName, String stateId);
	
	List<VahanSyncDistrictMappingDTO> findByDistrictNameIgnoreCase(String districtName);
	List<VahanSyncDistrictMappingDTO> findByDistrictName(String districtName);

}
