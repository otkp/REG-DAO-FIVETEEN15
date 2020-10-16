package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StagingRegServiceDetailsAutoApprovalDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
@Repository
public interface StagingRegServiceDetailsAutoApprovalLogDAO extends BaseRepository<StagingRegServiceDetailsAutoApprovalDTO, Serializable>{
	Page<StagingRegServiceDetailsAutoApprovalDTO>	findByAutoApprovalsDateBetweenAndOfficeCode(LocalDate fromDate, LocalDate toDate,String officeCode,Pageable page);
	Page<StagingRegServiceDetailsAutoApprovalDTO>   findByAutoApprovalsDate(LocalDate autoApprovalsDate,Pageable page);
	Page<StagingRegServiceDetailsAutoApprovalDTO> findByAutoApprovalsDateBetween(LocalDate fromDate, LocalDate toDate,
			Pageable previousOrFirst);
	Page<StagingRegServiceDetailsAutoApprovalDTO> findByOfficeCode(String officeCode, Pageable previousOrFirst);
	List<StagingRegServiceDetailsAutoApprovalDTO> findByAutoApprovalsDateBetween(LocalDate fromDate, LocalDate toDate);
	List<StagingRegServiceDetailsAutoApprovalDTO>	findByAutoApprovalsDateBetweenAndOfficeCode(LocalDate fromDate, LocalDate toDate,String officeCode);
	List<StagingRegServiceDetailsAutoApprovalDTO>   findByAutoApprovalsDateAndOfficeCode(LocalDate autoApprovalsDate,String officeCode);
	List<StagingRegServiceDetailsAutoApprovalDTO> findByAutoApprovalsDate(LocalDate minusMonths);
	void deleteByApplicationNoIn(List<String> list);

}
