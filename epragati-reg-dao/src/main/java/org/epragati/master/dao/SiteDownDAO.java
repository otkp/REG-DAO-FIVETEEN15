package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.SiteDownDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface SiteDownDAO extends BaseRepository<SiteDownDTO, Serializable> {

	Optional<SiteDownDTO> findByStatusTrue();

}
