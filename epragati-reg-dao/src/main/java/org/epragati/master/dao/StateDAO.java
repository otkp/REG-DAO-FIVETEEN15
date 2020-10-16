package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StateDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface StateDAO extends BaseRepository<StateDTO, Serializable> {

	public List<StateDTO> findByCountryId(String countryId);

	public List<StateDTO> findByAllowBiLateralTaxIsTrue();

	public Optional<StateDTO> findByStateName(String stateName);

	public List<StateDTO> findByStateIdIn(List<String> id);
	
	Optional<StateDTO> findByNicStateCode(String nicStateId);
	
	public Optional<StateDTO> findByStateNameIgnoreCase(String stateName);

}
