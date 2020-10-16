package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterFeedBackQuestionsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterFeedBackQuestionsDAO extends BaseRepository<MasterFeedBackQuestionsDTO, Serializable>{

}
