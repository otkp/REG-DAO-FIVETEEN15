package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserEnclousersActionsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface UserEnclousersActionsDAO extends BaseRepository<UserEnclousersActionsDTO, Serializable>{
	
	
	/**
	 * Save UserEnclousersActions
	 * @return
	 */
	public  Optional<UserEnclousersActionsDTO> save(Optional<UserEnclousersActionsDTO> optional);
	
	/**
	 * Find all UserEnclousersActions
	 * @return
	 */
	public List<UserEnclousersActionsDTO> findAll();
	
	/**
	 * Find UserEnclousersActions Based On role
	 * @param role
	 * @return
	 */
	public Optional<UserEnclousersActionsDTO> findUserEnclousersActionsByRole(Integer role);

}
