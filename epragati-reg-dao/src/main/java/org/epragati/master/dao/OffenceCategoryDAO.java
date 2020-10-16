package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.OffenceCategory;
import org.springframework.stereotype.Repository;
import java.lang.String;

@Repository
public interface OffenceCategoryDAO extends BaseRepository<OffenceCategory, Serializable> {

	List<OffenceCategory> findAll();
	OffenceCategory save(OffenceCategory offence);
	Optional<OffenceCategory> findByOffenceCategeory(String offence);
}
