package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.OwnershipDTO;
import org.springframework.stereotype.Repository;

/**
 * @author sairam.cheruku
 *
 */
@Repository
public interface OwnershipDAO extends BaseRepository<OwnershipDTO, Serializable>{

public List<OwnershipDTO> findByStatusTrue();
/**
 * 
 * @param codeList
 * @return
 */
public List<OwnershipDTO> findByStatusTrueAndCodeIn(List<String> codeList);

	Optional<OwnershipDTO> findByDescription(String description);

	Optional<OwnershipDTO> findByNicCodes(String nicCode);
}
