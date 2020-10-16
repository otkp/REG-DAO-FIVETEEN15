package org.epragati.sn.numberseries.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.numberseries.dto.RandomNumberLogDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface RandomNumberDAO extends BaseRepository<RandomNumberLogDTO, Serializable> {

}
