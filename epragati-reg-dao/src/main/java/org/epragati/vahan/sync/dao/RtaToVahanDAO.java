package org.epragati.vahan.sync.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vahan.sync.dto.RtaToVahanDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface RtaToVahanDAO extends BaseRepository<RtaToVahanDTO, Serializable>{

}
