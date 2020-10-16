package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.GeneratedPrDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedPrDetailsDAO extends BaseRepository<GeneratedPrDetailsDTO, Serializable>{

	List<GeneratedPrDetailsDTO> findByPrNo(String prNo);
	//Optional<GeneratedPrDetailsDTO> findByApplicationNo(String applicationNO);
	//Optional<GeneratedPrDetailsDTO>findByPrNoAndOfficeCode(String prNo,String officeCode);
	//Page<GeneratedPrDetailsDTO> findByIsVerifiedIsNull(Pageable pageable);
	
}
