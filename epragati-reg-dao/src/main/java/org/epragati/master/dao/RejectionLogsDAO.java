package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RejectionLogsDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface RejectionLogsDAO  extends BaseRepository<RejectionLogsDTO, Serializable>{

}
