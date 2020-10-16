package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CategoryDTO;
import org.springframework.stereotype.Repository;

/**
 * @author sairam.cheruku
 *
 */

@Repository
public interface CategoryDAO extends BaseRepository<CategoryDTO, Serializable> {
	
	/**
	 * 
	 * @return
	 */
	List<CategoryDTO> findByStatusTrue();

}
