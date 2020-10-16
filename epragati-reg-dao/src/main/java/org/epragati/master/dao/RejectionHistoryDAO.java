package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RejectionHistoryDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface RejectionHistoryDAO extends BaseRepository<RejectionHistoryDTO, Serializable>{
	
	

}
