package org.epragati.common.dao;

import java.io.Serializable;

import org.epragati.common.dto.RequestDataDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDAO extends BaseRepository<RequestDataDTO, Serializable> {

}
