package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterUserLoginsDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface MasterUserLoginsDAO extends BaseRepository<MasterUserLoginsDTO, Serializable> {
	
	/**
	 * 
	 * @param dealerId
	 * @return
	 */
	MasterUserLoginsDTO findByuserIdAndStatusTrue(String dealerId);

}
