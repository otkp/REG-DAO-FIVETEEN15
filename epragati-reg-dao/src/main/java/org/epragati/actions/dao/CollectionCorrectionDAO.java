package org.epragati.actions.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.actions.dto.CorrectionDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface CollectionCorrectionDAO extends BaseRepository<CorrectionDTO, Serializable>  {
	/**
	 * 
	 * @param applicationType
	 * @return
	 */
	List<CorrectionDTO> findByApplicationTypeAndRolesRoleNameAndStatusTrue(String applicationType,String roleName);	
	
	
//	long count 
}
