package org.epragati.regservice.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.dto.aadhaar.seed.AadhaarSeedDTO;
import org.epragati.util.Status;
import org.epragati.util.Status.AadhaarSeedStatus;

public interface AadhaarSeedDAO extends BaseRepository<AadhaarSeedDTO, Serializable>{


	List<AadhaarSeedDTO> findByPrNoAndAadharNo(String prNo,String aadharNo);
	
	List<AadhaarSeedDTO> findByPrNo(String prNo);

	List<AadhaarSeedDTO> findByIssuedOfficeCodeAndStatusIn(String officeCode,List<Status.AadhaarSeedStatus> status);

	List<AadhaarSeedDTO> findByLockAndStatusIn(Boolean value, List<Status.AadhaarSeedStatus> status);
	
	List<AadhaarSeedDTO> findByStatusAndPrNo(Status.AadhaarSeedStatus status,String prNo);
	
	Optional<AadhaarSeedDTO> findById(String applicationId);
	
	List<AadhaarSeedDTO> findFirst10ByIssuedOfficeCodeAndStatusOrderByCreatedDateAsc(String officeCode,String status);
	List<AadhaarSeedDTO> findByIssuedOfficeCodeAndCreatedDateBetween(String officeCode,LocalDateTime localDateTimeFromDate,LocalDateTime localDateTimeEndDate);

	Optional<AadhaarSeedDTO> findByPrNoAndStatusInOrderByCreatedDateDesc(String prNo, List<AadhaarSeedStatus> asList);
	Optional<AadhaarSeedDTO> findByStatusInAndPrNo(List<AadhaarSeedStatus> status,String prNo);

}
