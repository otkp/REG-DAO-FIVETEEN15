package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitValidationsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitValidationsDAO extends BaseRepository<PermitValidationsDTO, Serializable> {

	/**
	 * 
	 * @param cov
	 * @return
	 */
	Optional<PermitValidationsDTO> findByCovListIn(String cov);

	/**
	 * 
	 * @param cov
	 * @return
	 */
	Optional<PermitValidationsDTO> findByOtherStateSpecialPermitTrue();

	/**
	 * 
	 * @param desc
	 * @return
	 */
	Optional<PermitValidationsDTO> findByTaxType(String desc);

}
