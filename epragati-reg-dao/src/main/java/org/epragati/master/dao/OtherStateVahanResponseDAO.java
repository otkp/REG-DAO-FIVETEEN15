package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.OtherStateVahanResponseDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherStateVahanResponseDAO extends BaseRepository<OtherStateVahanResponseDTO, Serializable>{
	
	Optional<OtherStateVahanResponseDTO> findByOtherStateVahanRegDtoPrNoOrderByLUpdateDesc(String prNo);

}
