package org.epragati.vahan.sync.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vahan.sync.dto.RegVahanPortDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
@Repository
public interface VahanSyncDAO extends BaseRepository<RegVahanPortDTO, Serializable>{

	List<RegVahanPortDTO> findByIsvahanSyncFalse(Pageable pageable);
	
	Optional<RegVahanPortDTO> findByPrNoAndIsvahanSyncFalse(String prNo);
	
	Optional<RegVahanPortDTO> findByPrNoOrderByLUpdateDesc(String prNo);
	
	List<RegVahanPortDTO> findByIsvahanSyncTrueAndIsErroFoundFalseAndIsPartiallyFalseAndPrNo(String prNo);

}
