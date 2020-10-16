package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.VcrImageDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VcrImageDAO extends BaseRepository<VcrImageDTO, Serializable> {
	public VcrImageDTO save(VcrImageDTO dto);


}
