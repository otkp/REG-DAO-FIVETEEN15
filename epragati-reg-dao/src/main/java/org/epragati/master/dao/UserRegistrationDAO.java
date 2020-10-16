package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserRegistrationDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface UserRegistrationDAO extends BaseRepository<UserRegistrationDTO, Serializable>{
	
	
	/**
	 * Find all UserRegistration
	 * @return
	 */
	public List<UserRegistrationDTO> findAll();
	
	/**
	 * Find UserRegistration Based On mandal
	 * @param mandal
	 * @return
	 */
	public UserRegistrationDTO findUserRegistrationByMandal(Integer mandal);


}
