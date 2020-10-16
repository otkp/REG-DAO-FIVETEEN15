package org.epragati.civilsupplies.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.civilsupplies.dto.RationCardDistrictDTO;
import org.epragati.common.dao.BaseRepository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
public interface RationCardDistrictDAO extends BaseRepository<RationCardDistrictDTO, Serializable> {
	
	Optional<RationCardDistrictDTO> findByAadhaarDistrict(String name);

}
