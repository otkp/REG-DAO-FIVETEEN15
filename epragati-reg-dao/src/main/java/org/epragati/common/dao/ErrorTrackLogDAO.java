package org.epragati.common.dao;

import java.io.Serializable;

import org.epragati.common.dto.ErrorTrackLogDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorTrackLogDAO extends BaseRepository<ErrorTrackLogDTO, Serializable>{

}
