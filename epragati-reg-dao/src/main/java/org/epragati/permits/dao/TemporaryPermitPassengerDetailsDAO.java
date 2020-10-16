package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.TemporaryPermitPassengerDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Repository
public interface TemporaryPermitPassengerDetailsDAO
		extends BaseRepository<TemporaryPermitPassengerDetailsDTO, Serializable> {
	
	Optional<TemporaryPermitPassengerDetailsDTO> findByPrNoAndOtherServicesDetailsTemporaryPermitNumber(String prNo,String tpccNum);

}
