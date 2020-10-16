package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FcDetailsDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface FcDetailsDAO extends BaseRepository<FcDetailsDTO, Serializable> {

	List<FcDetailsDTO> findFirst5ByApplicationNoOrderByCreatedDateDesc(String applicationNo);

	Optional<FcDetailsDTO> findByPrNo(String prNo);

	List<FcDetailsDTO> findFirst5ByPrNoOrderByCreatedDateDesc(String PrNo);

	List<FcDetailsDTO> findFirst5ByStatusIsTrueAndPrNoOrderByCreatedDateDesc(String PrNo);

	Optional<FcDetailsDTO> findByPrNoOrderByCreatedDateDesc(String prNo);

	Optional<FcDetailsDTO> findByStatusIsTrueAndPrNoOrderByCreatedDateDesc(String prNo);

	Optional<FcDetailsDTO> findTopByStatusIsTrueAndPrNoInOrderByCreatedDateDesc(List<String> prNo);
	
	List<FcDetailsDTO> findByChassisNoOrderByCreatedDateDesc(String chassisNo);

	List<FcDetailsDTO> findByPrNoInOrderByCreatedDateDesc(String upperCase);
	
}
