package org.epragati.common.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.VehicleStrengthDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStrengthDAO extends BaseRepository<VehicleStrengthDTO, Serializable>  {

	List<VehicleStrengthDTO> findByVehicleTypeAndStatusTrue(String vehicleType);
}

