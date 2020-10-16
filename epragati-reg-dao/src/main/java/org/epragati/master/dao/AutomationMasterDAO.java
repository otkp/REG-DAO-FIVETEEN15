package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.AutomationDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface AutomationMasterDAO extends BaseRepository<AutomationDTO, Serializable>{
    /**
     * 
     * @param ownerType
     * @return
     */
	Optional<AutomationDTO> findByOwnerTypeAndIsOwnerTypeEnabledTrue(String ownerType);
	
}
