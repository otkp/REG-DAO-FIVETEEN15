package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitGoodsDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitGoodsDetailsDAO extends BaseRepository<PermitGoodsDetailsDTO, Serializable> {

	List<PermitGoodsDetailsDTO> findByPermitTypeAndBodyTypeDescIgnoreCase(String permitType, String bodyType);

}
