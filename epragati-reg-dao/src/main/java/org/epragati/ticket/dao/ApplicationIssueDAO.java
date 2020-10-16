package org.epragati.ticket.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationIssueDAO extends BaseRepository<ApplicationIssueDTO, Serializable> {
	
	ApplicationIssueDTO findByIssueNo(String issueNo);
	
	List<ApplicationIssueDTO> findByStatus(String status);
	
	List<ApplicationIssueDTO> findByStatusOrderByLUpdatedDateDesc(String status);
	
	Long countByStatus(String status);
	
	
}