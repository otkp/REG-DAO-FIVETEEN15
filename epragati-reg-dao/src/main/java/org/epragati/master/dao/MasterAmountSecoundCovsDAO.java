package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterAmountSecoundCovsDTO;
import org.springframework.stereotype.Repository;



@Repository
public interface MasterAmountSecoundCovsDAO extends BaseRepository<MasterAmountSecoundCovsDTO, Serializable>{
	
	Optional<MasterAmountSecoundCovsDTO>findBysecondcovcodeIn(String secondcovcode);
	
}
