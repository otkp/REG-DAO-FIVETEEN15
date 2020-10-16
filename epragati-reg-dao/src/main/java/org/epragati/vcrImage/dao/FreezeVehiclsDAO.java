package org.epragati.vcrImage.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.FreezeVehiclsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface FreezeVehiclsDAO extends BaseRepository<FreezeVehiclsDTO, Serializable>{

	FreezeVehiclsDTO findByPrNoIn(String prNo);
	
	FreezeVehiclsDTO findByUserId(String userId);
	
	
}
