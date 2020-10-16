package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterFreshRcMviQuestions;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterFreshrcMviQuestionsDAO  extends BaseRepository<MasterFreshRcMviQuestions,Serializable>{

	List<MasterFreshRcMviQuestions> findByRole(String role);

}
