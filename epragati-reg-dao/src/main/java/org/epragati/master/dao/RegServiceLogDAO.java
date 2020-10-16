package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.RegServiceLogsDTO;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author naga.pulaparthi
 *
 */
@Repository
public interface RegServiceLogDAO extends BaseRepository<RegServiceLogsDTO, Serializable>{

}
