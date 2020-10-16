package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterCovDTO;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface MasterCovDAO extends BaseRepository<MasterCovDTO, Serializable> {
	/**
	 * 
	 * @param covCode
	 * @return
	 */
	List<MasterCovDTO> findByCovcodeInAndDealerCovTrue(List<String> covCode);

	/**
	 * To fetch invalid covs for RTA mvi end
	 * 
	 * @param covCode
	 * @return
	 */
	Optional<List<MasterCovDTO>> findByInvalidCov(Boolean invalidCov);

	/**
	 * To find cov description by covCode(to print cov full name in form-23 pdf)
	 * 
	 * @param covCode
	 * @return
	 */
	MasterCovDTO findByCovcode(String covCode);

	/**
	 * 
	 * @param builderCov
	 * @param category
	 * @return
	 */


	


	List<MasterCovDTO> findByCategoryAndIsChassisTrue(String category);

	List<MasterCovDTO> findByCovcodeInAndDealerCovTrueAndCategory(List<String> covCode, String category);

	MasterCovDTO findByCovdescription(String classOfVehicle);

	boolean existsByCovcode(String covCode);

	List<MasterCovDTO> findByNicCovCode(Integer nicCovCode);
	
	List<MasterCovDTO> findByCovcodeIn(List<String> covCode);
	
	@Query(value = "{'category': {$in:?0}})", fields = "{'covcode':1,'covdescription':2}")
	List<MasterCovDTO> findByCategoryIn(List<String> category);
}
