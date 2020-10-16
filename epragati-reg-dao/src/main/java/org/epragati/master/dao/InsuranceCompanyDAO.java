/**
 * @author krishnarjun.pampana
 */
package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.InsuranceCompanyDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceCompanyDAO extends BaseRepository<InsuranceCompanyDTO, Serializable>{
	/**
	 * .
	 * @return
	 */
	List<InsuranceCompanyDTO> findByStatusTrue(); 
	
	Optional<InsuranceCompanyDTO> findByInsCompidDescription(String insCompidDescription);

}
