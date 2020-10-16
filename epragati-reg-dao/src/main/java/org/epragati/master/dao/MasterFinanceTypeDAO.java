package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterFinanceTypeDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Repository
public interface MasterFinanceTypeDAO extends BaseRepository<MasterFinanceTypeDTO, Serializable> {

	List<MasterFinanceTypeDTO> findByStatus(Boolean status);

}
