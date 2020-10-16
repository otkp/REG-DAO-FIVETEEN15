package org.epragati.regservice.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.CombinationServicesDTO;

public interface CombinationServicesDAO extends BaseRepository<CombinationServicesDTO, Serializable> {

	Optional<CombinationServicesDTO> findByServiceId(Integer id);

	// CombinationServicesDTO findByServiceId(Integer id);

	List<CombinationServicesDTO> findByStatusTrueOrderByOrderNo();

	Optional<CombinationServicesDTO> findByStatus(boolean serviceId);

	List<CombinationServicesDTO> findByServiceIdIn(Set<Integer> id);

	List<CombinationServicesDTO> findByIsMobileTrue();

	List<CombinationServicesDTO> findByModuleOrderByServiceIdAsc(String module);
}
