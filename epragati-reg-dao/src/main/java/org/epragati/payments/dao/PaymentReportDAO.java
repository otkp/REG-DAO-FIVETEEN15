package org.epragati.payments.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.PaymentReportDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReportDAO extends BaseRepository<PaymentReportDTO, Serializable> {

	/**
	 * 
	 * @param fromDate
	 * @param toDate
	 * @param gatewayTypes
	 * @param officeCodes
	 * @param status
	 * @return
	 * 
	 * 
	 */

//	@Query(value = "{'response.responseTime':{$gte:?0,$lte:?1},'paymentGatewayType':{$in:?2},'officeCode':{$in:?3},'payStatus':?4}", fields = "{'breakPaymentsSave':1, 'moduleCode':1, 'serviceIds':1,  'response.responseTime':1,'feeDetailsDTO':1,'payStatus':1,'officeCode':1}")
	List<PaymentReportDTO> findByResponseResponseTimeBetweenAndPaymentGatewayTypeInAndOfficeCodeInAndPayStatus(
			LocalDateTime fromDate, LocalDateTime toDate, List<Integer> gatewayTypes, List<String> officeCodes,
			String status);

	// @Query(value =
	// "{'lUpdate':{$gte:?0,$lte:?1},'paymentGatewayType':?2,'officeCode':{$in:?3},'payStatus':?4}",
	// fields = "{'breakPaymentsSave':1, 'moduleCode':1, 'serviceIds':1,
	// 'response.responseTime':1,'feeDetailsDTO':1,'payStatus':1,'officeCode':1}")
	List<PaymentReportDTO> findByLUpdateBetweenAndPaymentGatewayTypeAndOfficeCodeInAndPayStatus(LocalDateTime fromDate,
			LocalDateTime toDate, Integer gatewayType, List<String> officeCodes, String status);

	List<PaymentReportDTO> findByCreatedDateBetweenAndPaymentGatewayTypeAndOfficeCodeInAndPayStatus(
			LocalDateTime fromDate, LocalDateTime toDate, Integer gatewayType, List<String> officeCodes, String status);

}
