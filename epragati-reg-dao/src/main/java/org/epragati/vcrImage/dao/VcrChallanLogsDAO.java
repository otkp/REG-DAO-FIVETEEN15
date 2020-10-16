package org.epragati.vcrImage.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.VcrChallanLogsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VcrChallanLogsDAO extends BaseRepository<VcrChallanLogsDTO, Serializable> {

	VcrChallanLogsDTO findByVcrNumber(String vcrNumber);

}
