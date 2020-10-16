package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitRouteDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitRouteDetailsDAO extends BaseRepository<PermitRouteDetailsDTO, Serializable> {

	List<PermitRouteDetailsDTO> findByCovAndPermitType(String classOfVehicle, String permitType);

}
