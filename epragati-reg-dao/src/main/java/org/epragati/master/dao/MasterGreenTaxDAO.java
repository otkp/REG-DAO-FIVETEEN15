package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterGreenTax;
import org.springframework.stereotype.Repository;
	
@Repository
public interface MasterGreenTaxDAO extends BaseRepository<MasterGreenTax, Serializable>{

	Optional<MasterGreenTax> findByCovcode(String covcode);
}
