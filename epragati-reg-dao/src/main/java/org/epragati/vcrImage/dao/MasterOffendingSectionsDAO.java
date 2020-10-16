package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.MasterOffendingSectionsDTO;

public interface MasterOffendingSectionsDAO extends BaseRepository<MasterOffendingSectionsDTO, Serializable>{

	List<MasterOffendingSectionsDTO> findByStatusTrue();
}
