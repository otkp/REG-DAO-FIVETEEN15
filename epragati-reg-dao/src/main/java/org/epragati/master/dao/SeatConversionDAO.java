package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.SeatConversion;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatConversionDAO extends BaseRepository<SeatConversion , Serializable>{

	Optional<SeatConversion> findByCovAndCategory(String cov , String category);
}
