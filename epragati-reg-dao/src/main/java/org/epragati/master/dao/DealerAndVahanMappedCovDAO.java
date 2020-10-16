package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerAndVahanMappedCovDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface DealerAndVahanMappedCovDAO extends BaseRepository<DealerAndVahanMappedCovDTO, Serializable>{
	
	List<DealerAndVahanMappedCovDTO> findByDealerCovTypeIn(List<String> dealerCovTypeList);
	
	List<DealerAndVahanMappedCovDTO> findByVahanCovType(String vahanCovType);

}
