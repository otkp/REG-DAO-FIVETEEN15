/**
 * @author Rajesh.Vaddi
 */
package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.AlterationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AlterationDAO extends BaseRepository<AlterationDTO, Serializable> {

	/**
	 * Save AlterationDTO
	 * @return
	 */
	Optional<AlterationDTO> findByApplicationNo(String applicationNo);

	
	
}
