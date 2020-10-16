package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RolesDTO;

/**
 *
 * @author saikiran.kola
 *
 */
public interface RolesDAO extends BaseRepository<RolesDTO, Serializable> {

	Optional<RolesDTO> findByName(String name);
	
	List<RolesDTO> findAll();
}
