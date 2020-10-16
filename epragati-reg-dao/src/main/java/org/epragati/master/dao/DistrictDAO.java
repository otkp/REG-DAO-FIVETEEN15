package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DistrictDTO;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author saroj.sahoo
 *
 */

@Repository
public interface DistrictDAO extends BaseRepository<DistrictDTO, Serializable>{

	public List<DistrictDTO> findByStateId(String stateId);

	//public List<DistrictDTO> findDistinctDistrictIdByDistrictId(Integer district);
	
	public List<DistrictDTO> findByDistrictId(Integer district);
	
	public Optional<DistrictDTO> findByDistrictName(String districtName);
	
	public List<DistrictDTO> findByAllowBiLateralTaxIsTrue();

	public List<DistrictDTO> findByStateIdAndStatus(String stateId, String string);

	public Optional<DistrictDTO> findBydistrictId(Integer district);
	
	@Query(value = "{'stateId': ?0}", fields = "{'districtId':1, 'districtName':1}")
	List<DistrictDTO> findByStateIdNative(String stateId);

	public List<DistrictDTO> findByStatus(String string);
	
	DistrictDTO findByDistrictIdAndStatus(Integer id,String status);

	
}
