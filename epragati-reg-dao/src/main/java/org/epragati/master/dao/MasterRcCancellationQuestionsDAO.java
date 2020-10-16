package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterRcCancellationQuestionsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRcCancellationQuestionsDAO extends BaseRepository<MasterRcCancellationQuestionsDTO, Serializable> {

}
