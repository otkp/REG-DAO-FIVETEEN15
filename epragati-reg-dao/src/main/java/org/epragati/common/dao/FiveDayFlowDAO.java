package org.epragati.common.dao;

import org.epragati.common.dto.Flow_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayFlowDAO extends BaseRepository<Flow_last5d, String> {

}
	