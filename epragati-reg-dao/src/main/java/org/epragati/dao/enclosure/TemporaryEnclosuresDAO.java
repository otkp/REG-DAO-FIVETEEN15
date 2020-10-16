package org.epragati.dao.enclosure;

import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.TemporaryEnclosuresDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporaryEnclosuresDAO extends BaseRepository<TemporaryEnclosuresDTO, String> {

	public Optional<TemporaryEnclosuresDTO> findByApplicationNoAndCreatedByAndStatusIsFalse(String applicationNo,String createdBy);
	
	public List<TemporaryEnclosuresDTO> findByApplicationNoAndStatusIsFalse(String applicationNo);
	public List<TemporaryEnclosuresDTO> findByApplicationNo(String applicationNo);
	
	public Optional<TemporaryEnclosuresDTO> findByApplicationNoAndCreatedByAndStatusIsTrue(String applicationNo,String createdBy);
}
