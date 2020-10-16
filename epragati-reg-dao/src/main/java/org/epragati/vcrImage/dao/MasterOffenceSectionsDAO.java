package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.MasterOffenceSectionsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterOffenceSectionsDAO extends BaseRepository<MasterOffenceSectionsDTO, Serializable>{

	List<MasterOffenceSectionsDTO> findByStatusTrue();
}
