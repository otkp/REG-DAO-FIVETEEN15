package org.epragati.gstn.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.gstn.dto.GSTNDataDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface GSTNDataDAO extends BaseRepository<GSTNDataDTO, Serializable> {

	/**
	 * 
	 * @param gstinNo
	 * @param string
	 * @param now
	 * @return
	 */
	Optional<GSTNDataDTO> findByGstinNoAndStatusAndLastUpdatedDate(String gstinNo, String status, LocalDate now);

	Optional<GSTNDataDTO> findByGstinNoAndStatusOrderByLastUpdatedDateDesc(String trim, String string);

}
