package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.dto.TaxDetails_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FTaxDetailsDAO extends BaseRepository<TaxDetails_last5d, Serializable> {
	
}
