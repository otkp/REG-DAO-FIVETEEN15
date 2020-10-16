package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.TaxDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxDetailsDAO extends BaseRepository<TaxDetailsDTO, Serializable> {

	List<TaxDetailsDTO> findByApplicationNo(String applicationNo);

	List<TaxDetailsDTO> findFirst10ByApplicationNoOrderByCreatedDateDesc(String applicationNo);

	List<TaxDetailsDTO> findFirst50ByApplicationNoOrderByCreatedDateDesc(String applicationNo);

	List<TaxDetailsDTO> findFirst10ByPrNoOrderByCreatedDateDesc(String prNo);

	List<TaxDetailsDTO> findFirst10ByApplicationNoAndTrNoOrderByCreatedDateDesc(String applicationNo, String trNo);

	List<TaxDetailsDTO> findFirst10ByApplicationNoAndPaymentPeriodInOrderByCreatedDateDesc(String applicationNo,
			List<String> paymentPeriods);

	Optional<TaxDetailsDTO> findByApplicationNoOrderByCreatedDateDesc(String applicationNo);

	List<TaxDetailsDTO> findFirst10ByPrNoAndTaxStatusAndPaymentPeriodInOrderByCreatedDateDesc(String applicationNo,
			String taxStatus, List<String> paymentPeriods);

	List<TaxDetailsDTO> findFirst10ByPrNoAndPaymentPeriodInOrderByCreatedDateDesc(String prNo, List<String> taxTypes);

	List<TaxDetailsDTO> findFirst10ByChassisNoOrderByCreatedDateDesc(String chassisNo);

	/**
	 * for Last Five days Collections
	 * 
	 * @param fromDate
	 * @param toDate
	 */
	List<TaxDetailsDTO> findByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	Page<TaxDetailsDTO> findByPaymentPeriodAndTaxPeriodEndLessThanEqualAndTaxStatusAndClassOfVehicle(String desc,
			LocalDate taxPeriodEnd, String code, String classOfVehicle, Pageable previousOrFirst);

	List<TaxDetailsDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<TaxDetailsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<TaxDetailsDTO> findByPrNoIn(List<String> prNos);

	Optional<TaxDetailsDTO> findTopByApplicationNoOrderByCreatedDateDesc(String applicationNo);

	@Query(value = "{ 'applicationNo': ?0  }", fields = "{ 'taxDetails':1,'classOfVehicle':1 ,'createdDate':1}")
	List<TaxDetailsDTO> findByApplicationNoOrderByCreatedDateDescnative(String appNo);

	List<TaxDetailsDTO> findByApplicationNoInOrderByCreatedDateDesc(List<String> asList);

	Optional<TaxDetailsDTO> findTopByApplicationNoAndPaymentPeriodInOrderByCreatedDateDesc(String applicationNo, List<String> paymentPeriod);
	
	@Query(value = "{'prNo':?0 ,'paymentPeriod':{$in:?1}})",fields="{'applicationNo':1,'prNo':1,'taxPeriodEnd':1,'taxPaidDate':1,'createdDate':1,'paymentPeriod':1}")
	List<TaxDetailsDTO> findByTaxRecordFromTaxDetails(String prNo, List<String> paymentPeriod);
}
