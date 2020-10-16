package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StagingRegistrationDetailsHistoryDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface StagingRegistrationDetailsHistoryDAO extends BaseRepository<StagingRegistrationDetailsHistoryDTO, Serializable>{

}
