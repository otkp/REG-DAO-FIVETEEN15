package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RTOCorrections;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface CorrectionsDAO extends BaseRepository<RTOCorrections, Serializable> { 

}

