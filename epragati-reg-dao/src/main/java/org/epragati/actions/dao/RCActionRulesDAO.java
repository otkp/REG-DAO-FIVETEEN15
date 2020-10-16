package org.epragati.actions.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.actions.dto.RCActionRulesDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCActionRulesDAO extends BaseRepository<RCActionRulesDTO, Serializable> {
	
	List<RCActionRulesDTO> findBySource(String sectionName);

}
