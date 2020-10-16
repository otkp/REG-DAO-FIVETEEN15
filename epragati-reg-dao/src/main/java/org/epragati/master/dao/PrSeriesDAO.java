package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.PrSeriesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PrSeriesDAO extends BaseRepository<PrSeriesDTO, Serializable>{

	
	Optional<PrSeriesDTO> findByPrDistrictId(Integer districtId);
}
