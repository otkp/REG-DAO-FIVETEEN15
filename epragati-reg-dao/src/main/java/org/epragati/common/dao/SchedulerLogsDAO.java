package org.epragati.common.dao;

import java.io.Serializable;

import org.epragati.common.dto.SchedulerLogsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerLogsDAO extends BaseRepository<SchedulerLogsDTO, Serializable>{

}
