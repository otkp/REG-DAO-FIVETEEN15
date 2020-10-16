package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.TrSeriesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TrSeriesDAO extends BaseRepository<TrSeriesDTO, Serializable> {

	Optional<TrSeriesDTO> findBytrDistrictId(Integer trDistrictId);

	

}
