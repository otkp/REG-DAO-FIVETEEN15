package org.epragati.dao.enclosure;

import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.CitizenEnclosuresDTO;

public interface CitizenEnclosuresDAO extends BaseRepository<CitizenEnclosuresDTO, String> {

	Optional<CitizenEnclosuresDTO> findByApplicationNoAndServiceIdsIn(String applicationNo, Set<Integer> serviceIds);

	public Optional<CitizenEnclosuresDTO> findByApplicationNo(String applicationNo);

	Optional<CitizenEnclosuresDTO> findByApplicationNoAndServiceIdsInOrderByLUpdateDesc(String applicationNo,
			Set<Integer> serviceIds);

}
