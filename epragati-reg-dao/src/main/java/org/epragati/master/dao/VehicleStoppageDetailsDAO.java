package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.VehicleStoppageDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStoppageDetailsDAO extends BaseRepository<VehicleStoppageDetailsDTO, Serializable> {

	List<VehicleStoppageDetailsDTO> findByStausTrueAndRtoCompletedTrue();
}
