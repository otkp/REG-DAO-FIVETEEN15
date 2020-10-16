package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserLoginHistoryDTO;

public interface UserLoginHistoryDAO extends BaseRepository<UserLoginHistoryDTO, Serializable> {
	Optional<UserLoginHistoryDTO> findTopByUserIdAndStatusOrderByLUpdateDesc(String userName,String status);
}
