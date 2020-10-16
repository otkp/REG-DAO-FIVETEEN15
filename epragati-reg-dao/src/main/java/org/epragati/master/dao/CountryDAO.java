package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CountryDTO;
import org.springframework.stereotype.Repository;

/**
 * @author sairam.cheruku
 *
 */

@Repository
public interface CountryDAO extends BaseRepository<CountryDTO, Serializable>{
	/**
	 * fetching all countries based on status true
	 * @return
	 */
	List<CountryDTO> findByCountryStatusTrue();
	Optional<CountryDTO> findByCountryCode(String name);

}
