package org.epragati.master.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.UserLogDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogDAO extends BaseRepository<UserLogDTO, Serializable> {

}
