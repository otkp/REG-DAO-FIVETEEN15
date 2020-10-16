package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.RegServicesFeedBack;
import org.springframework.stereotype.Repository;

@Repository
public interface RegServicesFeedBackDAO extends BaseRepository<RegServicesFeedBack , Serializable>{

	Optional<RegServicesFeedBack> findByApplicationNo(String applicationNo);
}
