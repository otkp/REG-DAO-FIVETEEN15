package org.epragati.civilsupplies.dao;

import java.io.Serializable;

import org.epragati.civilsupplies.dto.RationCardDetailsDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Repository
public interface RationCardDetailsDAO extends BaseRepository<RationCardDetailsDTO, Serializable>  {

}
