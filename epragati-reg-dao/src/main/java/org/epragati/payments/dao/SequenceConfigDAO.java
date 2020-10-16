package org.epragati.payments.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.SequenceConfigDTO;

/**
 * 
 * @author pbattula
 *
 */
public interface SequenceConfigDAO extends BaseRepository<SequenceConfigDTO, Serializable>{
	
	/**
	 * Get Service Details based on Sequence Id
	 * @param sequenceId
	 * @return
	 */
	Optional<SequenceConfigDTO> findById(Long sequenceId);
	
	/**
	 * Get Service Details based on Sequence Name
	 * @param sequenceName
	 * @return
	 */
	Optional<SequenceConfigDTO> findByName(String sequenceName);
}