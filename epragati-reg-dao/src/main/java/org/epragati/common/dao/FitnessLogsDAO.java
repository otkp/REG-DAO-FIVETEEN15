package org.epragati.common.dao;

import java.io.Serializable;

import org.epragati.regservice.dto.FitnessApprovedlogs;
import org.springframework.stereotype.Repository;
@Repository
public interface FitnessLogsDAO  extends BaseRepository<FitnessApprovedlogs, Serializable>  {

}

