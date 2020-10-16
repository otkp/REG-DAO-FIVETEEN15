package org.epragati.cfst.vcr.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public interface VcrDetailsDAO extends BaseRepository<VcrDetailsDto, Serializable>{

	Optional<VcrDetailsDto>	findByRegNoAndVcrNum(String prNo,String vcrNo);

}
