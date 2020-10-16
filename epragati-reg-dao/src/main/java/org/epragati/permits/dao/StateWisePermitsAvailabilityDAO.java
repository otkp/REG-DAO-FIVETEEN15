package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.StateWisePermitsAvailabilityDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Repository
public interface StateWisePermitsAvailabilityDAO extends BaseRepository<StateWisePermitsAvailabilityDTO, Serializable> {

	/**
	 * 
	 * @return
	 */
	List<StateWisePermitsAvailabilityDTO> findByStatusTrue();

	/**
	 * 
	 * @param state
	 * @return
	 */
	Optional<StateWisePermitsAvailabilityDTO> findByStateNameAndStatusTrueAndIsRecommendationTrue(String state);
}
