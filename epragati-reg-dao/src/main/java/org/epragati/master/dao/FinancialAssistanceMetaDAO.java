package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinancialAssistanceMetaDTO;

public interface FinancialAssistanceMetaDAO extends BaseRepository<FinancialAssistanceMetaDTO, Serializable>{

	FinancialAssistanceMetaDTO findById(Integer id);
}
