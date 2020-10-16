package org.epragati.payments.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.PaymentTransactionDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTransactionDAO extends BaseRepository<PaymentTransactionDTO, String> {

	Optional<PaymentTransactionDTO> findTopByApplicationFormRefNumOrderByIdDesc(String applicationFormRefNum);

	Optional<PaymentTransactionDTO> findTopByApplicationFormRefNumAndTransactioNo(String applicationFormRefNum,
			String transactioNo);

	List<PaymentTransactionDTO> findByApplicationFormRefNumIn(List<String> applicationFormRefNum);

	List<PaymentTransactionDTO> findByApplicationFormRefNum(String applicationFormRefNum);

	Optional<PaymentTransactionDTO> findByTransactioNo(String transactioNo);

	List<PaymentTransactionDTO> findByRequestRequestTimeBetween(LocalDateTime startDate, LocalDateTime endDate);

	List<PaymentTransactionDTO> findByApplicationFormRefNumAndPayStatus(String applicationFormRefNum, String payStatus);

	Optional<PaymentTransactionDTO> findTopByApplicationFormRefNumAndSbiTransactionNumber(String applicationFormRefNum,
			String transactioNo);

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	Optional<List<PaymentTransactionDTO>> findByResponseResponseTimeBetweenAndPayStatus(LocalDateTime startDate,
			LocalDateTime endDate, String status);

	Optional<List<PaymentTransactionDTO>> findByResponseResponseTimeBetweenAndPayStatusAndPaymentGatewayType(
			LocalDateTime startDate, LocalDateTime endDate, String status, Integer payId);

	Optional<List<PaymentTransactionDTO>> findByResponseResponseTimeBetweenAndPayStatusAndOfficeCode(
			LocalDateTime startDate, LocalDateTime endDate, String status, String offCode);

	Optional<PaymentTransactionDTO> findTopByOrderByApplicationFormRefNumDesc(String applicationNo);

	List<PaymentTransactionDTO> findByPayStatusAndApplicationFormRefNum(String status, String applicationFormRefNum);

	List<PaymentTransactionDTO> findByPaymentGatewayTypeAndPayStatusAndResponseResponseTimeBetween(Integer id,
			String description, LocalDateTime localDateTime, LocalDateTime localDateTime2);

	List<PaymentTransactionDTO> findByPaymentGatewayTypeAndPayStatusAndRequestRequestTimeBetween(Integer id,
			String description, LocalDateTime localDateTime, LocalDateTime localDateTime2);

	List<PaymentTransactionDTO> findByApplicationFormRefNumAndPayStatusAndModuleCode(String applicationFormRefNum,
			String payStatus, String moduleCode);

	List<PaymentTransactionDTO> findByRequestRequestTimeBetweenAndPayStatus(LocalDateTime startDate,
			LocalDateTime endDate, String status);

	List<PaymentTransactionDTO> findByRequestRequestTimeBetweenAndPayStatusAndModuleCodeNotIn(
			LocalDateTime localDateTime, LocalDateTime localDateTime2, String description, List<String> module);

	List<PaymentTransactionDTO> findByPayStatusAndOfficeCodeAndResponseResponseTimeBetween(String payStatus,
			String officeCode, LocalDateTime startDate, LocalDateTime endDate);

	List<PaymentTransactionDTO> findByPayStatusAndOfficeCodeAndPaymentGatewayTypeAndResponseResponseTimeBetween(
			String payStatus, String officeCode, Integer gateWayId, LocalDateTime startDate, LocalDateTime endDate);

	List<PaymentTransactionDTO> findByResponseResponseTimeBetweenAndPayStatusAndOfficeCodeIn(LocalDateTime startDate,
			LocalDateTime endDate, String status, List<String> offCode);

	List<PaymentTransactionDTO> findByApplicationFormRefNumAndModuleCode(String applicationFormNo, String code);

	Optional<PaymentTransactionDTO> findByApplicationFormRefNumOrderByRequestRequestTimeDesc(String applicationFormNo);

	Optional<PaymentTransactionDTO> findByApplicationFormRefNumAndModuleCodeAndPaymentTransactionNo(
			String applicationFormNo, String code, String paymentTransactionNo);

	Optional<PaymentTransactionDTO> findByApplicationFormRefNumAndPaymentTransactionNo(String applicationFormRefNum,
			String paymentTransactionNo);

	List<PaymentTransactionDTO> findByApplicationFormRefNumAndPayStatusAndModuleCodeNotIn(String applicationNo,
			String description, List<String> moduleCode);

	@Query(value = "{ 'moduleCode': ?0, 'payStatus' :  ?1  }", fields = "{ 'transactioNo':1,'moduleCode':1,'applicationFormRefNum' : 1}")
	List<PaymentTransactionDTO> findByModuleCodeAndPayStatus(String moduleCode, String payStatus);

	Page<PaymentTransactionDTO> findByPayStatusAndResponseResponseTimeBetween(String status, LocalDateTime startDate,
			LocalDateTime endDate, Pageable pageable);

	/*
	 * @Query(value =
	 * "{'response.responseTime':{$gte:?0,$lte:?1},'paymentGatewayType':{$in:?2},'officeCode':{$in:?3},'payStatus':?4}",
	 * fields =
	 * "{'transactioNo':1,'breakPaymentsSave':1,  'response.responseTime':1,'feeDetailsDTO':1,'payStatus':1,'officeCode':1}"
	 * )
	 */
	Page<PaymentTransactionDTO> findByResponseResponseTimeBetweenAndPaymentGatewayTypeInAndOfficeCodeInAndPayStatus(
			LocalDateTime fromDate, LocalDateTime toDate, List<Integer> payStatus, List<String> officeCodes,
			String status, Pageable pageable);

	List<PaymentTransactionDTO> findByResponseResponseTimeBetweenAndPaymentGatewayTypeInAndOfficeCodeInAndPayStatus(
			LocalDateTime fromDate, LocalDateTime toDate, List<Integer> gateWayType, List<String> officeCodes,
			String status);

	/**
	 * For lastfiveDaysTransactionCollection
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	List<PaymentTransactionDTO> findByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<PaymentTransactionDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);
	
	List<PaymentTransactionDTO> findByResponseResponseTimeBetween(LocalDateTime fromDate, LocalDateTime toDate);
	Optional<PaymentTransactionDTO> findByApplicationFormRefNumAndPayStatusIn(String applicationFormRefNum, List<String> payStatus);
}
