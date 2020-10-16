package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ShowCauseDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowCauseDetailsDAO extends BaseRepository<ShowCauseDetailsDTO, Serializable> {


	Optional<ShowCauseDetailsDTO> findByScNo(String scNo);
	Optional<ShowCauseDetailsDTO> findByPrNo(String prNo);
	List<ShowCauseDetailsDTO> findByOfficeCodeAndScIssuedDateBetween(String officeCode, LocalDateTime fromDate,
			LocalDateTime toDate);
	
	Page<ShowCauseDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndScStatus(String officecode,LocalDate taxValidity,String cov, String scStatus,Pageable previousOrFirst);
	
	Page<ShowCauseDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndScStatus(String officecode,LocalDate taxValidity,String cov, String scStatus,Pageable previousOrFirst);
	Page<ShowCauseDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndWeightTypeAndScStatus(String officeCode,
			LocalDate taxPeriodEnd, String cov, String weightType, String status, Pageable previousOrFirst);
	Page<ShowCauseDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndWeightTypeAndScStatus(String officeCode,
			LocalDate taxPeriodEnd, String cov, String weightType, String status, Pageable previousOrFirst);
	
}
