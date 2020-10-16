package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitDistrictMappingDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitDistrictMappingDAO extends BaseRepository<PermitDistrictMappingDTO, Serializable> {

	List<PermitDistrictMappingDTO> findByDistrictCode(Integer districtId);


}
