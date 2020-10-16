package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterPayperiodDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterPayperiodDAO extends BaseRepository<MasterPayperiodDTO, Serializable> {

	Optional<MasterPayperiodDTO>findByCovcode(String covcode);

	List<MasterPayperiodDTO> findByPayperiodIn(List<String> payperiod);
}
