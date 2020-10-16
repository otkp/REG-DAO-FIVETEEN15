package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ShowCauseSectionDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowCauseSectionDAO extends BaseRepository<ShowCauseSectionDTO, Serializable>{


	List<ShowCauseSectionDTO> findByStatusTrue();
	
	Optional<ShowCauseSectionDTO> findBySectionCode(String section);

}
