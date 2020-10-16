package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.PostOfficeDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Repository
public interface PostOfficeDAO extends BaseRepository<PostOfficeDTO, Serializable> {
	/**
	 * fetching postal code based on districtId
	 * @param districtId
	 * @return
	 */
	List<PostOfficeDTO> findByDistrict(Integer districtId);

}
