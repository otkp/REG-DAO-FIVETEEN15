package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author naga.pulaparthi
 *
 */

@Repository
public interface ApplicantDetailsDAO extends BaseRepository<ApplicantDetailsDTO, Serializable>{
	
	Optional<ApplicantDetailsDTO> findByApplicantNo(String applicantDetails);

	Optional<ApplicantDetailsDTO> findByUidToken(String uidToken);
	
	List<ApplicantDetailsDTO> findByAadharResponseUidAndUidTokenNotNull(Long aadhaarNo);
	
	List<ApplicantDetailsDTO> findByUidTokenIn(List<String> uidToken);
	
	List<ApplicantDetailsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);
	
	List<ApplicantDetailsDTO> findByAadharNo(String aadhaarNo);

}
