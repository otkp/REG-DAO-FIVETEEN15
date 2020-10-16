package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;
import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.LoginDetails;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginDetailsDAO extends BaseRepository<LoginDetails, Serializable> {
	Optional<LoginDetails> findByUserNameOrderByLUpdateDesc(String userName);
}
