package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.TaxTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxTypeDAO extends BaseRepository<TaxTypeDTO, Serializable> {
	/**
	 * 
	 * @return
	 */
	List<TaxTypeDTO> findByStatusTrue();

}
