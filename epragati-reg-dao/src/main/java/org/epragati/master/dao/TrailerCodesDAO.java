package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.TrailerCodesDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface TrailerCodesDAO extends BaseRepository<TrailerCodesDTO, Serializable>{

	Optional<TrailerCodesDTO> findByRIdAndDistrictIdAndMakerClass(Integer rid, Integer districtId, String makersModel);

}
