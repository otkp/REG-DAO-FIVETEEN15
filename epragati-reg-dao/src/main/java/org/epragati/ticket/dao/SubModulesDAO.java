package org.epragati.ticket.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubModulesDAO  extends BaseRepository<SubModulesDTO, Serializable>{

	SubModulesDTO findByticketModule(String module);
}
