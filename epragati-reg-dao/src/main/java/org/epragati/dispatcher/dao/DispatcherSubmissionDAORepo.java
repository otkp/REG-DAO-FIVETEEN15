package org.epragati.dispatcher.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.constants.DispatchEnum;
import org.epragati.constants.DispatchEnum.DispatchCardReasonEnum;
import org.epragati.dispatcher.dto.DispatcherSubmissionDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatcherSubmissionDAORepo extends BaseRepository<DispatcherSubmissionDTO,Serializable> {

	DispatcherSubmissionDTO findByEmsNumber(String emsNo);
	
	
	List<DispatcherSubmissionDTO> findByPostedDateBetweenAndOfficeCode(LocalDateTime fromDate,LocalDateTime toDate,String officeCode);


	List<DispatcherSubmissionDTO> findByPrNoAndOfficeCode(String applicationNo,String officeCode);

	List<DispatcherSubmissionDTO> findByOfficeCode(String officeCode);

	List<DispatcherSubmissionDTO> findByPrNo(String prNo); 
	
	long countByPostedDateBetweenAndOfficeCode(LocalDateTime fromDate, LocalDateTime toDate,String officeCode);




	Optional<DispatcherSubmissionDTO> findByPrNoOrderByLUpdateDesc(String regNo);
	
	Optional<DispatcherSubmissionDTO> findByPrNoOrderByCreatedDateDesc(String regNo);


	//List<DispatcherSubmissionDTO> findByDeliveryDateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	Page<DispatcherSubmissionDTO> findByDeliveryDateBetweenAndOfficeCodeOrderByPrNoAsc(LocalDateTime fromDate,
			LocalDateTime toDate, String officeCode, Pageable pagable1);

	Page<DispatcherSubmissionDTO> findByReturnDateBetweenAndOfficeCodeOrderByPrNoAsc(LocalDateTime fromDate,
			LocalDateTime toDate, String officeCode, Pageable pagable1);

	Page<DispatcherSubmissionDTO> findByCardPrintedDateBetweenAndOfficeCodeOrderByPrNoAsc(LocalDateTime fromDate,
			LocalDateTime toDate ,String officeCode, Pageable pagable1);


	Page<DispatcherSubmissionDTO> findByPostedDateBetweenAndOfficeCode(LocalDateTime fromDate, LocalDateTime toDate,
			String officeCode, Pageable pagable);


	Optional<DispatcherSubmissionDTO> findByPrNoOrderByIdDesc(String regNo);


	Page<DispatcherSubmissionDTO> findByReturnDateBetweenAndRemarksAndReturnReasonInAndOfficeCodeOrderByPrNoAsc(
			LocalDateTime plusDays, LocalDateTime toDate, String reqType, List<String> asList, String officeCode,
			Pageable pagable1);
	
	List<DispatcherSubmissionDTO> findByDeliveryDateBetweenAndOfficeCodeOrderByPrNoAsc(LocalDate fromDate,
			LocalDate toDate, String officeCode);
	
	List<DispatcherSubmissionDTO> findByReturnDateBetweenAndOfficeCode(
			LocalDate plusDays, LocalDate toDate, String officeCode
			);


	//Optional<T>
}
