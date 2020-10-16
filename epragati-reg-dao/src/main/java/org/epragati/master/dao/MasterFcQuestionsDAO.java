package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterFCQuestionsDTO;
import org.springframework.stereotype.Repository;
@Repository
public interface MasterFcQuestionsDAO extends BaseRepository<MasterFCQuestionsDTO, Serializable> {

}
