package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.CfstSyncResponceDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CfstSyncResponceDAO extends BaseRepository<CfstSyncResponceDTO, Serializable>{

}
