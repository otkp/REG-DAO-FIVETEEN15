package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dto.enclosure.FinancerUploadedDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancierUpldDetailsDAO extends BaseRepository<FinancerUploadedDetailsDTO, Serializable> {
	/**
	 * findByRcNo
	 * 
	 * @param rcNo
	 * @return
	 */
	Optional<FinancerUploadedDetailsDTO> findByRcNo(String rcNo);

	/**
	 * findByCreatedBy
	 * 
	 * @param userId
	 * @param pageable
	 * @return
	 */
	Page<FinancerUploadedDetailsDTO> findByCreatedByOrderByCreatedDateDesc(String userId, Pageable pageable);

	/**
	 * findByCreatedDateBetween
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	List<FinancerUploadedDetailsDTO> findByCreatedDateBetween(LocalDate fromDate, LocalDate toDate);

}
