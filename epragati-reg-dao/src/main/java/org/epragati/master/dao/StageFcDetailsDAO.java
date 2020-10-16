package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StagingFcDetailsDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface StageFcDetailsDAO extends BaseRepository<StagingFcDetailsDTO, Serializable> {

}
