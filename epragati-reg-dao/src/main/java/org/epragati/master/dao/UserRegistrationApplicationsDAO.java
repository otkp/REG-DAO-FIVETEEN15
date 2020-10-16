package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserRegistrationApplicationsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Repository
public interface UserRegistrationApplicationsDAO extends BaseRepository<UserRegistrationApplicationsDTO, Serializable>{
	
	/**
	 * Find UserEnclousersActions Based On applicationno
	 * @param applicationno
	 * @return
	 */
	public UserRegistrationApplicationsDTO findUserRegistrationApplicationsByApplicationNo(Integer applicationno);


}
