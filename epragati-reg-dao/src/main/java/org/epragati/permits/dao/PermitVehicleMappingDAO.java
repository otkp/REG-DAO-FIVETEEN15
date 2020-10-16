package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitVehicleMappingDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitVehicleMappingDAO extends BaseRepository<PermitVehicleMappingDTO, Serializable> {

	List<PermitVehicleMappingDTO> findByCovAndStatusTrue(String classofVehicle);
	
	List<PermitVehicleMappingDTO> findByPermitTypeAndStatusTrue(String permitType);

}
