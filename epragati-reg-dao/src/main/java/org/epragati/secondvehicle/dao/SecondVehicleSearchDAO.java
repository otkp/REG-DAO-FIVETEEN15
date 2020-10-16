package org.epragati.secondvehicle.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.secondvehicle.dto.SecondVehicleSearchResultsDTO;

public interface SecondVehicleSearchDAO extends BaseRepository<SecondVehicleSearchResultsDTO, Serializable> {

	public Optional<SecondVehicleSearchResultsDTO>  findByApplicationNo(String applicationNo);
 	
}
