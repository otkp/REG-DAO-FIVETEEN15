package org.epragati.common.dao;

import java.util.Optional;

import org.epragati.common.dto.PrajaasachivalayamDTO;

public interface PrajaasachivalayamDAO extends BaseDAO<PrajaasachivalayamDTO, String> {
	
	Optional<PrajaasachivalayamDTO> findByApplicationNo(String applicationNo);
}
