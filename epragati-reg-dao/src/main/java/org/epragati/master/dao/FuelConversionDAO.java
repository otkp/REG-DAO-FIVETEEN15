package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.FuelConversion;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelConversionDAO extends BaseRepository<FuelConversion,Serializable>{
	
	List<FuelConversion> findByoldFuelAndCovIn(String oldFuel , String cov);
	

}
