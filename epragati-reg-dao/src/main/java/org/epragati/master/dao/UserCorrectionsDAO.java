package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserCorrectionsDTO;

public interface UserCorrectionsDAO extends BaseRepository<UserCorrectionsDTO, Serializable> {
	Optional<UserCorrectionsDTO> findByUserId(String userId);
}
