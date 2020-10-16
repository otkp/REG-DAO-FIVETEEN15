package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitRouteTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitRouteTypeDAO extends BaseRepository<PermitRouteTypeDTO, Serializable> {

	Optional<PermitRouteTypeDTO> findByRouteType(String routeType);

	List<PermitRouteTypeDTO> findByCovAndStatusTrue(String cov);

	List<PermitRouteTypeDTO> findByCovAndStatusTrueAndAuthorizationTrue(String cov);

}
