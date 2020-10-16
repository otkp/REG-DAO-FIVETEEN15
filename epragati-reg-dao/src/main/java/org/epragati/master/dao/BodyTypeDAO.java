/**
 * @author krishnarjun.pampana
 */
package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.BodyTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyTypeDAO extends BaseRepository<BodyTypeDTO, Serializable> {
	/**
	 * 
	 * @return
	 */
	List<BodyTypeDTO> findByStatusTrue(); 
	/**
	 * 
	 * @param bodyId
	 * @return
	 */
	BodyTypeDTO findByBodyTypeIdAndStatusTrue(Integer bodyId);

}
