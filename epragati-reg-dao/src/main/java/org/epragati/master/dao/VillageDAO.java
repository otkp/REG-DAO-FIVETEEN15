package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.VillageDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface VillageDAO extends BaseRepository<VillageDTO, Serializable> {

	List<VillageDTO> findByMandalId(Integer mandalId);

	List<VillageDTO> findByMandalIdAndStatusIgnoreCase(Integer mandalId, String status);

	Optional<VillageDTO> findByVillageName(String villageName);

	List<VillageDTO> findByMandalIdAndStatusIgnoreCaseOrderByVillageNameAsc(Integer mandalId, String string);

}
