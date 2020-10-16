package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterTaxExcemptionsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterTaxExcemptionsDAO extends BaseRepository<MasterTaxExcemptionsDTO, Serializable> {

	/**
	 * 
	 * @param keyvalue
	 * @param covcode
	 * @return
	 */
	Optional<MasterTaxExcemptionsDTO> findByKeyvalueOrCovcode(String keyvalue, String covcode);

	/**
	 * 
	 * @param keyvalue
	 * @return
	 */
	Optional<MasterTaxExcemptionsDTO> findByKeyvalue(String keyvalue);

	/**
	 * 
	 * @param keyvalue
	 * @param seatto
	 * @param seatfrom
	 * @return
	 */
	Optional<MasterTaxExcemptionsDTO> findByKeyvalueAndSeattoGreaterThanEqualAndSeatfromLessThanEqual(String keyvalue,
			Integer seatto, Integer seatfrom);
	
	
	Optional<MasterTaxExcemptionsDTO> findByChassisNosIn(String chassisNos);
}
