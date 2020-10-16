package org.epragati.uidailogin.entity;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginStatusTypeDao extends BaseRepository<LoginStatusType, Serializable> {
	
	Optional<LoginStatusType> findByUdaiLoginStatus(Boolean status);

}
