package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.NonPaymentDetailsDTO;
import org.epragati.util.StatusRegistration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NonPaymentDetailsDAO extends BaseRepository<NonPaymentDetailsDTO, Serializable> {

	// @Query(value = "{'officeCode':?0, 'taxValidity' : ?1 }", fields =
	// "{'cov':1}")

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndIsScNoIssuedByCcoFalse(String officeCode,
			LocalDate taxPeriodEnd, String cov, Pageable previousOrFirst);

	Optional<NonPaymentDetailsDTO> findByOfficeCodeAndApplicationStatusInAndPrNo(String officeCode,
			List<StatusRegistration> statusRegistration, String prNo);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndAndApplicationStatus(String officeCode,
			StatusRegistration statusRegistration, Pageable pagable);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndAndApplicationStatusAndMandalName(String officeCode,
			StatusRegistration statusRegistration, String Mandalname, Pageable pagable);

	Optional<NonPaymentDetailsDTO> findByOfficeCodeAndApplicationStatusInAndScNo(String officeCode,
			List<StatusRegistration> statusRegistration, String scNo);

	Optional<NonPaymentDetailsDTO> findByPrNo(String prNo);

	Integer countByOfficeCodeAndAndApplicationStatus(String officeCode, StatusRegistration status);

	Optional<NonPaymentDetailsDTO> findByScNo(String scNo);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanEqualAndCovDescAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndIsScNoIssuedByCcoFalse(String officeCode,
			LocalDate taxPeriodEnd, String cov, Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndMandalNameAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName, Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndMandalNameAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName, Pageable previousOrFirst);

	@Query(value = "{'cov':?0, 'officeCode': ?1}", fields = "{'regApplicationNo':1}")
	List<NonPaymentDetailsDTO> findByCovAndOfficeCodeNative(String cov, String officeCode);
	
	Optional<NonPaymentDetailsDTO> findByRegApplicationNo(String regApplicationNo);

	@Query(value = "{'officeCode':?0, 'taxValidity':{$eq:?1},'cov': ?2, 'isScNoGenerated': false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1,'weightType':1}")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndIsScNoIssuedByCcoFalseNative(String officeCode,
			LocalDate taxPeriodEnd, String cov);
	@Query(value = "{'officeCode':?0, 'taxValidity':{$lt:?1},'cov': ?2, 'isScNoGenerated':false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1,'weightType':1}")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndIsScNoIssuedByCcoFalseNative(String officeCode,
			LocalDate taxPeriodEnd, String cov);

	@Query(value = "{'officeCode':?0, 'taxValidity': {$eq:?1},'cov': ?2, 'mandalName': ?3, 'isScNoGenerated': false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1 ,'weightType':1 }")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndMandalNameAndIsScNoIssuedByCcoFalseNative(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName);
	@Query(value = "{'officeCode':?0, 'taxValidity': {$lt:?1},'cov': ?2, 'mandalName': ?3, 'isScNoGenerated': false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1 ,'weightType' :1}")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndMandalNameAndIsScNoIssuedByCcoFalseNative(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName);
	
	@Query(value = "{'officeCode':?0, 'taxValidity':{$eq:?1},'cov': ?2, 'weightType':?3 , 'isScNoGenerated': false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1, 'weightType':1}")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndWeightTypeAndIsScNoIssuedByCcoFalseNative(
			String officeCode, LocalDate taxPeriodEnd, String cov, String weightType);
	
	@Query(value = "{'officeCode':?0, 'taxValidity':{$lt:?1},'cov': ?2, 'weightType':?3 ,'isScNoGenerated':false}", fields = "{'prNo':1,'cov':1,'taxValidity':1,'ownerName':1,'ownerAddress':1,'mandalName':1,'financerName':1,'financerAddress':1,'fcValidity':1,'permitValidity':1,'gvw':1,'mobileNo':1, 'weightType':1 }")
	List<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndWeightTypeAndIsScNoIssuedByCcoFalseNative(
			String officeCode, LocalDate taxPeriodEnd, String cov, String weightType);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndWeightTypeAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String weightType, Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndWeightTypeAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String weightType, Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityEqualsAndCovAndMandalNameAndWeightTypeAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName, String weightType,
			Pageable previousOrFirst);

	Page<NonPaymentDetailsDTO> findByOfficeCodeAndTaxValidityLessThanAndCovAndMandalNameAndWeightTypeAndIsScNoIssuedByCcoFalse(
			String officeCode, LocalDate taxPeriodEnd, String cov, String mandalName, String weightType,
			Pageable previousOrFirst);
}
