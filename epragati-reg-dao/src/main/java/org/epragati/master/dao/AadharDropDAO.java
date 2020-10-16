package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.AadharDropListDTO;

/**
 * yugandhar peddi
 */
public interface AadharDropDAO extends BaseRepository<AadharDropListDTO,Serializable> {
List<AadharDropListDTO> findByStatusIsTrue();
Optional<AadharDropListDTO> findByName(String name);
}