package org.epragati.actions.dao;
/**
 * 
 */
import java.io.Serializable;
import java.util.List;

import org.epragati.actions.dto.CorrectionHeaderInfo;
import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrectionHeaderInfoDAO extends BaseRepository<CorrectionHeaderInfo, Serializable>  {
	
	List<CorrectionHeaderInfo> findByModule(String module);

}
