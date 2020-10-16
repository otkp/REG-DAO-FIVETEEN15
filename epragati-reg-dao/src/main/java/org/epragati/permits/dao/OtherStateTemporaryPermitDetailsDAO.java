package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.OtherStateTemporaryPermitDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sairam.cheruku
 *
 */

@Repository
public interface OtherStateTemporaryPermitDetailsDAO
		extends BaseRepository<OtherStateTemporaryPermitDetailsDTO, Serializable> {

	Optional<OtherStateTemporaryPermitDetailsDTO> findByPrNoOrderByCreatedDateDesc(String prNo);

}
