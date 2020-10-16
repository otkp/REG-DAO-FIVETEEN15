/**
 * 
 */
package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MandalDTO;
import org.springframework.stereotype.Repository;

/**
 * @author kumaraswamy.asari
 *
 */
@Repository
public interface MandalDAO extends BaseRepository<MandalDTO, Serializable>{ 
	
	Optional<MandalDTO> findByMandalCode(Integer mandalCode);

	public List<MandalDTO> findByDistrictId(Integer districtId);
	
	List<MandalDTO> findByDistrictIdAndTransportOfice(Integer districtId,String officeCode);
	
	List<MandalDTO> findByDistrictIdAndTransportOficeIn(Integer districtId,List<String> officeCode);
	
	Optional<MandalDTO> findBymandalName(String mandalName);

	List<MandalDTO> findByDistrictIdOrderByMandalNameAsc(Integer districtCode);


}
