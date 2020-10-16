package org.epragati.common.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.FlowDTO;

public interface FlowDAO extends BaseRepository<FlowDTO, Serializable>{
	
	List<FlowDTO> findByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<FlowDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<FlowDTO> findAllByCreatedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);


}
