package org.epragati.ticket.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportUserDAO extends BaseRepository<SupportUserCreationDTO, Serializable>{
	
	
	SupportUserCreationDTO findByUserIdAndPassword(String userid,String password);
	
	SupportUserCreationDTO findByUserId(String userId);
	
	SupportUserCreationDTO findByUserIdOrEmpIdOrMobileNumber(String userId,String empid,String mobileNo);
	
	List<SupportUserCreationDTO>  findAllByOrderByUserIdAsc();

}
