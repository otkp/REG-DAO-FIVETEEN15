package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.util.StatusRegistration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StagingRegistrationDetailsDAO extends BaseRepository<StagingRegistrationDetailsDTO, Serializable> {

	/**
	 * 
	 * @param applicationNo
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByApplicationNo(String applicationNo);

	/**
	 * 
	 * @param list
	 * @param userId
	 * @return
	 */

	@Query(value = "{'financeDetails.status': { $in: ?0 }, 'financeDetails.userId' : ?1}", fields = "{'applicationStatus':1 ,'financeDetails':1,'vehicleType':1, 'trNo':1,'applicantDetails':1,'vahanDetails.makersModel':1,'vahanDetails.makersDesc':1,'quotationValue':1,'sanctionedAmount':1,'officeDetails.officeName':1,'taxType':1,'invoiceDetails.invoiceValue':1}")
	public List<StagingRegistrationDetailsDTO> findByFinanceDetailsStatusInAndFinanceDetailsUserId(List<String> list,
			String userId);

	/**
	 * 
	 * @param userName
	 * @param role
	 * @param vehicleType
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByLockedDetailsLockedByAndLockedDetailsLockedByRoleAndVehicleType(
			String userName, String role, String vehicleType);

	

	@Query(value = "{'dealerDetails.dealerId': ?0}", fields = "{'applicationStatus': 1,'applicantDetails.displayName':1,"
			+ " 'applicantDetails.contact.email': 1," + " 'applicantDetails.contact.mobile': 1,"
			+ " 'vahanDetails.makersDesc': 1, " + " 'vahanDetails.makersModel': 1, " + " 'vehicleType': 1,"
			+ " 'invoiceDetails.invoiceNo': 1," + " 'insuranceDetails.company': 1," + " 'officeDetails.officeName': 1, "
			+ " 'taxType': 1," + " 'trNo': 1 ,'stageNo':1}")
	public List<StagingRegistrationDetailsDTO> findByDealerDetailsDealerId(String delaerId);

	/**
	 * 
	 * @param token
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByFinanceDetailsToken(String token);

	/**
	 * 
	 * @param engineNo
	 * @param chasisNo
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByVahanDetailsEngineNumberOrVahanDetailsChassisNumber(
			String engineNo, String chasisNo);

	/**
	 * 
	 * @param trNo
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByTrNo(String trNo);

	/**
	 * 
	 * @param trNumber
	 * @param mobileNo
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByTrNoAndApplicantDetailsContactMobile(String trNumber,
			String mobileNo);

	public Optional<StagingRegistrationDetailsDTO> findByOldPrNoAndApplicantDetailsContactMobile(String trNumber,
			String mobileNo);

	/**
	 * 
	 * @param company
	 * @param policyNumber
	 * @return
	 */
	public List<StagingRegistrationDetailsDTO> findByInsuranceDetailsCompanyAndInsuranceDetailsPolicyNumber(
			String company, String policyNumber);

	/**
	 * 
	 * @param aadhaarNo
	 * @return
	 */
	public List<StagingRegistrationDetailsDTO> findByApplicantDetailsAadharNo(String aadhaarNo);

	/**
	 * 
	 * @return
	 */
	public List<StagingRegistrationDetailsDTO> findByLockedDetailsIsNotNull(Pageable pageable);

	/**
	 * 
	 * @param officeCode
	 * @param applicationStatusForPendingList
	 * @param b
	 * @return
	 */

	@Query(value = "{'officeDetails.officeCode': ?0, 'applicationStatus' :{ $in: ?1 } , 'bodyBuilding' : ?2}", fields = "{'vehicleType':1 , 'flowDetails':1,'applicationStatus':1 ,'bodyBuilding':1}")
	public List<StagingRegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndApplicationStatusInAndBodyBuilding(
			String officeCode, List<StatusRegistration> applicationStatusForPendingList, boolean b);

	/**
	 * 
	 * @param userId
	 * @param role
	 * @param b
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByLockedDetailsLockedByAndLockedDetailsLockedByRoleAndBodyBuilding(
			String userId, String role, boolean b);

	/**
	 * 
	 * @param trNo
	 * @param applicationStatus
	 * @return
	 */
	public Optional<StagingRegistrationDetailsDTO> findByTrNoAndApplicationStatus(String trNo,
			String applicationStatus);

	public List<StagingRegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndApplicationStatusInAndVehicleTypeAndBodyBuilding(
			String officeCode, List<StatusRegistration> applicationStatusForPendingList, String vehicleType, boolean b);

	List<StagingRegistrationDetailsDTO> findByApplicationStatusAndTrGeneratedDateLessThanAndIsFromReassigmentAndPrNoIsNullAndIsTrExpiredIsNull(
			String status, LocalDateTime date, boolean isFromReassigment, Pageable pageable);

	List<StagingRegistrationDetailsDTO> findByApplicationStatusAndIsFromReassigmentAndReassignmentDoneDateLessThanAndPrNoIsNull(
			String status, boolean isFromReassigment, LocalDateTime date, Pageable pageable);

	public Optional<StagingRegistrationDetailsDTO> findByVahanDetailsEngineNumberAndVahanDetailsChassisNumber(
			String engineNo, String chasisNo);

	public Optional<StagingRegistrationDetailsDTO> findByPrNo(String prNo);

	Optional<StagingRegistrationDetailsDTO> findByDealerDetailsDealerIdAndApplicationNo(String dealerId, String trNo);

	Optional<StagingRegistrationDetailsDTO> findByDealerDetailsDealerIdAndTrNo(String dealerId, String trNo);

	Optional<StagingRegistrationDetailsDTO> findByDealerDetailsDealerIdAndVahanDetailsChassisNumberAndVahanDetailsEngineNumber(
			String userId, String chassisNumber, String engineNumber);

	Optional<StagingRegistrationDetailsDTO> findByInvoiceDetailsInvoiceNo(String invoiceNo);

	// @Query(value = "{'financeDetails.status': { $in: ?0 },
	// 'financeDetails.userId' : ?1}", fields = "{'applicationStatus':1
	// ,'pplicationNo':1,'vehicleType':1,
	// 'trNo':1,'applicantDetails':1,'vahanDetails.makersModel':1,'vahanDetails.makersDesc':1,'quotationValue':1,'sanctionedAmount':1,'officeDetails.officeName':1,'taxType':1,'invoiceDetails.invoiceValue':1}")
	List<StagingRegistrationDetailsDTO> findByApplicationStatusInAndApplicationNoNotIn(
			List<String> applicationStatusList, List<String> applicationNos, Pageable pageable);

	

	/**
	 * findBy chassisNumber for VCR Details
	 * 
	 * @param chessisNumber
	 */
	public Optional<StagingRegistrationDetailsDTO> findByVahanDetailsChassisNumber(String chessisNumber);

	

	public List<StagingRegistrationDetailsDTO> findByDealerDetailsDealerIdAndApplicationStatusNotInAndTrNoNotNullAndTrGeneratedDateBetween(
			String id, List<String> status, LocalDateTime fromDate, LocalDateTime toDate, Pageable page);


	public List<StagingRegistrationDetailsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate,
			LocalDateTime toDate);


	public List<StagingRegistrationDetailsDTO> findByFinanceDetailsUserIdInAndFinanceDetailsAgreementDateBetween(
			List<String> users, LocalDateTime fromDate, LocalDateTime toDate);

	public List<StagingRegistrationDetailsDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

		
	public List<StagingRegistrationDetailsDTO> findByApplicationStatus(String description, Pageable pageble);
	
	List<StagingRegistrationDetailsDTO> findByOfficeDetailsOfficeCodeNotInAndAutoApprovalInitiatedDateLessThanAndApplicationStatusInAndClassOfVehicleNotIn(List<String> officeCodeList , LocalDate date,List<String> applicationStatus,List<String> classOfVechicles,Pageable pageable);

	public Integer countByTrGeneratedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	public List<StagingRegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndApplicationStatusAndVehicleTypeOrderByCreatedDateDesc(
			String officeCode, String description, String string);

	public List<StagingRegistrationDetailsDTO> findByOfficeDetailsOfficeCodeAndApplicationStatusInAndSourceIsNullAndVehicleTypeOrderByCreatedDateDesc(
			String officeCode, List<StatusRegistration> listOfStatus, String upperCase);


}
