package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.VcrGoodsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface VcrGoodsDao extends BaseRepository<VcrGoodsDTO, Serializable> {

	public List<VcrGoodsDTO> findAll();
}
