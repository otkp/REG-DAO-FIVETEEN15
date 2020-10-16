package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.QualificationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationDAO extends BaseRepository<QualificationDTO, Serializable>{
	  List<QualificationDTO>	findByStatusTrue();
}
