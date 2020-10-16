package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.SpeedGunDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
@Repository
public interface SpeedGunVcrDAO extends BaseRepository<SpeedGunDTO, Serializable> {

	Optional<SpeedGunDTO> findByImageIdAndOfficerId(String imageId,String officerId);
	
	Optional<SpeedGunDTO> findByCrtdDtBetweenAndOfficerIdAndRegistrationNo(LocalDateTime fromDate,LocalDateTime toDate,String officerId,String prNo);
}
