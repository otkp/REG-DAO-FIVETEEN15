package org.epragati.dao.enclosure;

import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.FinancierEnclosuresDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancierEnclosureDAO extends BaseRepository<FinancierEnclosuresDTO, String> {

	Optional<FinancierEnclosuresDTO> findByApplicationNoAndServiceIdsIn(String applicationNo, List<Integer> serviceIds);

	Optional<FinancierEnclosuresDTO> findByApplicationNo(String applicationNo);

}
