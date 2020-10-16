package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StagingRegistrationDetailsHistoryLogDto;
import org.springframework.stereotype.Repository;

@Repository
public interface StagingRegistrationDetailsHistoryLogDAO  extends BaseRepository<StagingRegistrationDetailsHistoryLogDto, Serializable>{

}
