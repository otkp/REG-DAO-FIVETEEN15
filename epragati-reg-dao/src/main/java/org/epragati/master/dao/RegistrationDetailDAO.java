package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDetailDAO extends BaseRepository<RegistrationDetailsDTO, Serializable> {

	Optional<RegistrationDetailsDTO> findByApplicationNo(String id);

	/**
	 * 
	 * @param userId
	 * @param id
	 * @return
	 */
	RegistrationDetailsDTO findByDealerDetailsDealerIdAndApplicationNo(String userId, String id);

	/**
	 * 
	 * @param userId
	 * @param trNo
	 * @return
	 */
	RegistrationDetailsDTO findByDealerDetailsDealerIdAndTrNo(String userId, String trNo);

	/**
	 * 
	 * @param userId
	 * @param chassisNumber
	 * @param engineNumber
	 * @return
	 */
	RegistrationDetailsDTO findByDealerDetailsDealerIdAndVahanDetailsChassisNumberAndVahanDetailsEngineNumber(
			String userId, String chassisNumber, String engineNumber);

	/**
	 * @param aadharNo
	 * @return
	 */
	List<RegistrationDetailsDTO> findByApplicantDetailsAadharNoAndApplicantDetailsIsAadhaarValidatedTrue(
			String aadharNo);

	/**
	 * 
	 * @return
	 */
	// Page<RegistrationDetailsDTO>
	// findByPrNoNotNullAndIsCfstSyncFalseOrIsCfstSyncNull(Pageable pageable);

	Page<RegistrationDetailsDTO> findByIsCfstSyncFalse(Pageable pageable);

	/**
	 * 
	 * @param prNo
	 * @return
	 */
	Optional<RegistrationDetailsDTO> findByPrNo(String prNo);

	List<RegistrationDetailsDTO> findAllByPrNo(String prNo);

	/**
	 * 
	 * @param prNo
	 * @return
	 */
	List<RegistrationDetailsDTO> findByPrNoIn(List<String> prNo);

	/**
	 * 
	 * @param EngineNo
	 * @return
	 */
	
	
	
	/**
	 * 
	 * @param prNo
	 * @param aadhaarNo
	 * @return
	 */
	Optional<RegistrationDetailsDTO> findByTrNo(String TrNo);


	Optional<RegistrationDetailsDTO> findTopByVahanDetailsChassisNumberAndVahanDetailsEngineNumberOrderByLUpdateDesc(
			String chassisNo, String EngineNo);

	Optional<RegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndPrNo(String officeCode, String prNo);

	List<RegistrationDetailsDTO> findByInsuranceDetailsCompanyAndInsuranceDetailsPolicyNumber(String company,
			String policyNumber);

	List<RegistrationDetailsDTO> findByCreatedDateBetween(LocalDateTime ld1, LocalDateTime ld);

	Optional<RegistrationDetailsDTO> findByVahanDetailsChassisNumberAndVahanDetailsEngineNumberAndNocDetailsIsNull(
			String ChassisNo, String EngineNo);

	Optional<RegistrationDetailsDTO> findByPermitDetailsPermitNo(String permitNo);

	/**
	 * 
	 * @param prNo
	 * @return
	 */
	Optional<RegistrationDetailsDTO> findByPrNoAndVehicleType(String prNo);

	List<RegistrationDetailsDTO> findByPrNoInAndPermitActionStatus(List<String> prNo, String permitStatus);

	List<RegistrationDetailsDTO> findByPrNoInAndPermitActionStatusAndOfficeDetailsOfficeCode(List<String> prNo,
			String permitStatus, String officeCode);

	Optional<RegistrationDetailsDTO> findByPrNoAndIsCardPrintedAndIsCardDispatchedAndOfficeDetailsOfficeCode(
			String prNo, boolean b, boolean c, String officeCode);

	List<RegistrationDetailsDTO> findByCardPrintedDateBetweenAndIsCardDispatchedAndIsCardPrintedAndOfficeDetailsOfficeCode(
			LocalDateTime fromDate, LocalDateTime toDate, boolean b, boolean c, String officeCode);

	List<RegistrationDetailsDTO> findByIsCardDispatchedAndIsCardPrintedAndOfficeDetailsOfficeCodeAndApplicationStatus(
			boolean b, boolean c, String officeCode, Pageable pageable, String applicationStatus);

	long countByCardPrintedDateBetweenAndIsCardDispatchedAndIsCardPrintedAndOfficeDetailsOfficeCode(
			LocalDateTime fromDate, LocalDateTime toDate, boolean b, boolean c, String officeCode);

	long countByIsCardDispatchedAndIsCardPrintedAndOfficeDetailsOfficeCodeAndApplicationStatus(boolean b, boolean c,
			String officeCode, String applicationStatus);

	/**
	 * for reg
	 */
	List<RegistrationDetailsDTO> findByPrNoInAndActionStatus(List<String> prNo, String permitStatus);

	List<RegistrationDetailsDTO> findByApplicantDetailsAadharNoInAndApplicantDetailsIsAadhaarValidatedTrue(
			String aadharNo);

	List<RegistrationDetailsDTO> findByApplicantDetailsAadharNoInAndApplicantDetailsIsAadhaarValidatedTrue(
			List<String> aadharNo);

	List<RegistrationDetailsDTO> findByPrNoAndNocDetailsIsNull(String prNo);

	Optional<RegistrationDetailsDTO> findByVahanDetailsEngineNumberOrderByCreatedDateDesc(String upperCase);

	Optional<RegistrationDetailsDTO> findByVahanDetailsChassisNumberOrderByCreatedDateDesc(String upperCase);

	List<RegistrationDetailsDTO> findByVahanDetailsChassisNumberOrVahanDetailsEngineNumber(String ChassisNo,
			String EngineNo);

	List<RegistrationDetailsDTO> findByInvoiceDetailsInvoiceNo(String invoiceNo);

	boolean existsByApplicationNo(String regNo);

	boolean existsByPrNo(String prNumber);

	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalse(Pageable pageable);

	/**
	 * 
	 * @param fromDate
	 * @param toDate
	 * @param vehicleType
	 * @return
	 **/
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseAndPrGeneratedDateGreaterThan(
			Pageable pageable, LocalDateTime ld);

	Optional<RegistrationDetailsDTO> findByVahanDetailsChassisNumber(String chessisNo);

	@Query(value = "{'isvahanSync':false, 'prNo' : {$exists:true } ,'isvahanSyncSkip':false,'prGeneratedDate':{$gt:?0} }", fields = "{'_id':1,'isvahanSyncSkip':1}")
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseAndPrGeneratedDateGreaterThanNative(LocalDateTime ld,Pageable pageable);
	Optional<RegistrationDetailsDTO> findByPrNoAndIsvahanSyncFalse(String prNo);

	List<RegistrationDetailsDTO> findByDealerDetailsDealerId(String id, Pageable page);

	Optional<RegistrationDetailsDTO> findByVahanDetailsChassisNumberAndVahanDetailsEngineNumberAndInsuranceDetailsCompanyAndInsuranceDetailsPolicyNumber(
			String ChassisNo, String EngineNo, String company, String policyNumber);

	/**
	 * for last 5 days reg detail Collection
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	List<RegistrationDetailsDTO> findByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<RegistrationDetailsDTO> findByPrNoInAndNocDetailsIsNull(List<String> collect);

	List<RegistrationDetailsDTO> findByDealerDetailsDealerIdAndTrGeneratedDateBetween(String id, LocalDateTime fromDate,
			LocalDateTime toDate, Pageable page);

	List<RegistrationDetailsDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<RegistrationDetailsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate,
			LocalDateTime toDate);
	
	Optional<RegistrationDetailsDTO> findByIsScNoGeneratedTrue();
	
	List<RegistrationDetailsDTO> findByVahanDetailsChassisNumberAndVahanDetailsEngineNumber(String upperCase,
			String upperCase2);
	
	@Query(value = "{'nocDetails':{$exists:true},'prNo' : {$exists:true } ,'isvahanSync':false, 'isvahanSyncSkip':false}")
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndNocDetailsIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseNative(Pageable pageable);
	
	@Query(value = "{'nocDetails':{$exists:true},'prNo' : {$exists:true } ,'isvahanSync':false, 'isvahanSyncSkip':false}",fields = "{'_id':1,'isvahanSyncSkip':1}")
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndNocDetailsIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseWithFieldsNative(Pageable pageable);
	
	
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseAndPrGeneratedDateLessThan(
			Pageable pageable, LocalDateTime ld);
	
	List<RegistrationDetailsDTO> findByPrNoInAndNocDetailsIsNullAndIsScNoGeneratedFalse(List<String> collect);

	@Query(value = "{'prNo':?0, 'nocDetails' : {$exists:false } ,'isScNoGenerated':false }", fields = "{'prNo':1,'officeDetails':1,'classOfVehicle':1,'applicantDetails':1,'financeDetails':1,'taxvalidity':1,'fcValidity':1}")
	Optional<RegistrationDetailsDTO> findByPrNoAndNocDetailsIsNullAndIsScNoGeneratedFalseOrderByLUpdate(String prNo,Sort sort);

	
	List<RegistrationDetailsDTO>findByPrNoAndNocDetailsIsNullAndIsScNoGeneratedFalse(String prNo);
	
	Optional<RegistrationDetailsDTO> findByPrNoAndApplicationStatusNotInAndOwnerTypeNotIn(String prNo,
			List<String> expectedStatus, List<String> ownerStatus);

	List<RegistrationDetailsDTO> findByFinanceDetailsUserIdInAndFinanceDetailsAgreementDateBetween(List<String> users,
			LocalDateTime fromDate, LocalDateTime toDate);

	Optional<RegistrationDetailsDTO> findByPrNoInAndApplicationStatusNotIn(List<String> prNo,
			List<String> expectedStatus);

	Optional<RegistrationDetailsDTO> findFirstByPrNoOrderByCreatedDateDesc(String prNo);
	
	Optional<RegistrationDetailsDTO> findByPrNoOrderByCreatedDateDesc(String prNo);
	
	@Query(value="{'prGeneratedDate':{$lte:?0,$gte:?1}}",fields="{'prNo':1}")
	List<RegistrationDetailsDTO> findByPrGeneratedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);
	//ApplicationStatus
	
	long countByOfficeDetailsOfficeCodeAndClassOfVehicleAndIsActiveAndPrGeneratedDateLessThan(String officeCode,String classOfVehicle,boolean isActive,LocalDateTime toDate);

	List<RegistrationDetailsDTO> findByPrGeneratedDateBetweenAndApplicantTypeIsNullAndHsrpfeeIsNotNullOrderByCreatedDateDesc(
			LocalDateTime fromDate, LocalDateTime toDate);

	Integer countByPrGeneratedDateBetweenAndApplicantTypeIsNullAndHsrpfeeIsNotNullOrderByCreatedDateDesc(
			LocalDateTime fromDate, LocalDateTime toDate);
	
	Optional<RegistrationDetailsDTO> findByPrNoAndApplicantDetailsAadharNoOrderByCreatedDateDesc(String prNo,String aadharNo);
	
	@Query(value = "{'isvahanSync':false, 'prNo' : {$exists:true } ,'isvahanSyncSkip':false,'prGeneratedDate':{$lt:?0} }", fields = "{'_id':1,'isvahanSyncSkip':1}")
	List<RegistrationDetailsDTO> findByPrNoIsNotNullAndIsvahanSyncFalseAndIsvahanSyncSkipFalseAndPrGeneratedDateLessThanNative(LocalDateTime ld,Pageable pageable);
	
	@Query(value="{'officeDetails.officeCode':?0, 'classOfVehicle': ?1, 'isActive':true ,'applicationNo': {$nin:?2} }",fields="{'_id':1}")
	List<RegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndClassOfVehicleAndIsActiveAndApplicationNoNotInNativeWithId(String officeCode, String cov,List<String> applications);
	
	@Query(value="{'prNo':?0 }",fields="{'officeDetails.officeCode':1}")
	List<RegistrationDetailsDTO> findByPrNoNative(String prNo,Sort sort);
	Optional<RegistrationDetailsDTO> findByPrNoOrderByLUpdateDesc(String prNo);
	Optional<RegistrationDetailsDTO> findByVahanDetailsChassisNumberOrderByLUpdateDesc(String chasisNo);

}
