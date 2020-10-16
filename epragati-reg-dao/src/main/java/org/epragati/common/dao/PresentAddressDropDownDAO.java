package org.epragati.common.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dto.PresentAddressDropDownDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface PresentAddressDropDownDAO extends BaseRepository<PresentAddressDropDownDTO, Serializable> {

	Optional<PresentAddressDropDownDTO> findByOwnerTypeAndAddressDropDownEnabledTrue(String ownerType);
	
	Optional<PresentAddressDropDownDTO> findByIsDeclarationEnabledTrue();
	
}
