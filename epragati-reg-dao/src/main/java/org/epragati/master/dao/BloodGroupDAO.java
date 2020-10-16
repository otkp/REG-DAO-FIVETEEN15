package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.BloodGroupDTO;
import org.springframework.stereotype.Repository;

/**
 * @author sairam.cheruku
 *
 */
@Repository
public interface BloodGroupDAO extends BaseRepository<BloodGroupDTO, Serializable> {
	/**
	 * 
	 * @return
	 */
	 List<BloodGroupDTO>  findByActiveTrue();
}
