package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitTypeDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitTypeDAO extends BaseRepository<PermitTypeDTO, Serializable> {

	List<PermitTypeDTO> findByPermitTypeInAndTypeofPermit(List<String> permitTypeList, String permitClassCode);

	PermitTypeDTO findByPermitType(String permitType);

}
