package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author naga.pulaparthi
 *
 */
@Repository
public interface RegServiceDAO extends BaseRepository<RegServiceDTO, Serializable> {

	Optional<RegServiceDTO> findByApplicationNo(String applicationNo);

	List<RegServiceDTO> findByPrNo(String prNo);

	// Only Single Source
	// @Query(value = "{ \"officeCode\": ?0, \"serviceIds\" :{ $in: ?1 } ,
	// \"currentIndex\" : ?2 , \"source\":{$exists:false} }", fields = "{
	// 'serviceIds':1,'applicationNo' : 1, 'actionDetails':1,
	// 'registrationDetails.vehicleType': 1,'prNo':1,'registrationDetails.prNo':1
	// ,'registrationDetails.classOfVehicle':1,'iterationCount':1 }")
	Optional<RegServiceDTO> findByPrNoOrderByCreatedDateDesc(String prNo);

	List<RegServiceDTO> findByOfficeCodeAndServiceIdsInAndCurrentIndexAndSourceIsNull(String officeCode,
			List<Integer> serviceId, Integer currentIndex);

	Optional<RegServiceDTO> findByApplicationNoAndPrNo(String applicationNo, String prNo);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndServiceTypeInAndApplicationStatusIn(String officeCode,
			List<String> serviceList, List<String> applicationStatus);

	List<RegServiceDTO> findByRegistrationDetailsPrNoAndServiceIdsNotIn(String prNo, Integer serviceIds);

	List<RegServiceDTO> findByRegistrationDetailsApplicationNoAndServiceIds(String applicationNo, Integer serviceIds);

	RegServiceDTO findByRegistrationDetailsFinanceDetailsUserIdAndRegistrationDetailsApplicationNoAndServiceIdsNotIn(
			String userId, String applicationNo, Integer serviceIds);

	RegServiceDTO findByRegistrationDetailsFinanceDetailsUserIdAndRegistrationDetailsTrNoAndServiceIdsNotIn(
			String userId, String trNo, Integer serviceIds);

	RegServiceDTO findByRegistrationDetailsFinanceDetailsUserIdAndRegistrationDetailsPrNoAndServiceIdsNotIn(
			String userId, String prNo, Integer serviceIds);

	RegServiceDTO findByRegistrationDetailsFinanceDetailsUserIdAndRegistrationDetailsVahanDetailsChassisNumberAndRegistrationDetailsVahanDetailsEngineNumberAndServiceIdsNotIn(
			String userId, String chassisNo, String engineNo, Integer serviceIds);

	List<RegServiceDTO> findByApplicationNoIn(String applicationNo);

	List<RegServiceDTO> findByRegistrationDetailsTrNo(String applicationNo);

	// @Query(value = "{ \"mviOfficeCode\": ?0, \"currentRoles\" : { $in: ?1 }
	// ,\"source\":{$exists:false} }", fields = "{ 'serviceIds':1,'applicationNo' :
	// 1, 'actionDetails':1, 'registrationDetails.vehicleType': 1
	// ,'prNo':1,'registrationDetails.prNo':1
	// ,'registrationDetails.classOfVehicle':1,'iterationCount':1}")

	List<RegServiceDTO> findByMviOfficeCodeAndCurrentRolesInAndSourceIsNull(String officeCode,
			List<String> currentRoles);

	@Query(value = "{ 'lockedDetails.lockedBy': ?0, 'lockedDetails.lockedByRole' :  ?1  }", fields = "{ 'serviceIds':1,'serviceType':1,'applicationNo' : 1,  'registrationDetails.vehicleType': 1 ,'prNo':1,'registrationDetails.prNo':1, 'registrationDetails.classOfVehicle':1,'registrationDetails.ownerType':1,'registrationDetails.invoiceDetails.invoiceValue':1,'registrationDetails.isRegVehicleWithPR':1,'iterationCount':1,'createdDate':1,'flowId':1,'vehicleStoppageDetails':1,'mviOfficeCode':1,'applicationStatus':1,'currentRoles':1}")
	List<RegServiceDTO> findByLockedDetailsLockedByAndLockedDetailsLockedByRole(String user, String role);

	Optional<RegServiceDTO> findByToken(String token);

	@Query(value = "{ 'lockedDetails': { $exists: true, $ne: [] }  }")
	List<RegServiceDTO> findByLockedDetailsIsNotNull(Pageable pageable);

	List<RegServiceDTO> findByPrNoAndServiceTypeIn(String prNo, List<ServiceEnum> services);

	RegServiceDTO findByFinanceDetailsUserIdAndPrNoAndServiceIdsInAndCurrentIndexIsNull(String userId, String prNo,
			Integer serviceId);

	RegServiceDTO findByFinanceDetailsUserIdAndTrNoAndServiceIdsInAndCurrentIndexIsNull(String userId, String trNo,
			Integer ServiceId);

	RegServiceDTO findByFinanceDetailsUserIdAndApplicationNoAndServiceIdsInAndCurrentIndexIsNull(String userId,
			String applicationNo, Integer id);

	List<RegServiceDTO> findByRegistrationDetailsVahanDetailsChassisNumberAndRegistrationDetailsVahanDetailsEngineNumberAndApplicationStatusInAndServiceIdsIn(
			String chassisNumber, String engineNumber, List<StatusRegistration> applicationStatus,
			List<Integer> servicesIds);

	List<RegServiceDTO> findByRegistrationDetailsApplicationNoAndServiceIdsIn(String applicationNo,
			List<Integer> serviceIds);

	Optional<RegServiceDTO> findByApplicationNoAndBuyerDetailsTokenNo(String aaplicationNo, String tokenNo);

	@Query(value = "{'hptStatus':{$in:?0},  'financeDetails.userId':{$in:?1}, 'serviceIds':?2 , 'applicationStatus':{$nin:?3}, 'isHPTDone':false}", fields = "{'registrationDetails.prNo':1,'prNo':1,'applicationStatus':1 , 'financeDetails':1, 'serviceIds':1,'officeDetails':1,'registrationDetails.trNo':1,'registrationDetails.vehicleType':1,'registrationDetails.applicantDetails':1,'registrationDetails.prGeneratedDate':1}")
	List<RegServiceDTO> findByHptStatusInAndFinanceDetailsUserIdNotNullAndServiceIdsInAndApplicationStatusNotInAndIsHPTDoneFalse(
			List<String> statusList, List<String> userId, Integer id, List<StatusRegistration> applicationStatus);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotIn(String prNo, ServiceEnum sericeType);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotInAndCreatedDateNotNull(String prNo, ServiceEnum sericeType);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotIn(String prNo, List<ServiceEnum> sericeTypeList);

	@Query(value = "{ 'officeCode': ?0, 'currentRoles' : { $in: ?1 } ,'source':{$exists:false} }", fields = "{'officeCode':1,'officeDetails':1,'currentRoles':1,'source':1, 'serviceIds':1,'applicationNo' : 1, 'actionDetails':1, 'registrationDetails.vehicleType': 1 ,'prNo':1,'registrationDetails.prNo':1, 'registrationDetails.classOfVehicle':1,'iterationCount':1,'registrationDetails.applicantDetails':1,'flowId':1,'mviDone':1,'applicationStatus':1}")

	List<RegServiceDTO> findTop70ByOfficeCodeAndCurrentRolesInAndSourceIsNull(String officeCode, List<String> asList);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndServiceIdsAndApplicationStatus(String officeCode, Integer id,
			String string);

	List<RegServiceDTO> findFirst20ByPrNoInAndAadhaarNoOrderByCreatedDateDesc(List<String> prNos, String aadharNo);

	List<RegServiceDTO> findByRegistrationDetailsVehicleTypeAndServiceIdsInAndRegistrationDetailsApplicationStatus(
			String code, List<Integer> servicesIds, String status);

	List<RegServiceDTO> findByRegistrationDetailsTrNoAndServiceIdsNotNull(String trNo);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotInAndSourceIsNull(String prNo, List<ServiceEnum> sericeType);

	List<RegServiceDTO> findByRegistrationDetailsApplicationNoAndServiceIdsAndSourceIsNull(String applicationNo,
			Integer serviceIds);

	List<RegServiceDTO> findByServiceIdsAndApplicationStatusIn(Integer serviceId,
			List<StatusRegistration> applicationStatus);

	List<RegServiceDTO> findByOfficeCodeAndApplicationStatusAndOtherStateNOCStatus(String officeCode,
			StatusRegistration status, StatusRegistration nocStatus);

	List<RegServiceDTO> findByApplicationStatusAndOtherStateNOCStatusAndApprovedDateNotNull(StatusRegistration status,
			StatusRegistration nocStatus);

	List<RegServiceDTO> findByprNoAndServiceIdsAndSourceIsNull(String prNo, Integer serviceIds);

	List<RegServiceDTO> findByServiceIdsAndRegistrationDetailsInvoiceDetailsInvoiceNo(Integer serviceId,
			String invoiceNo);

	List<RegServiceDTO> findByRegistrationDetailsVahanDetailsChassisNumberAndRegistrationDetailsVahanDetailsEngineNumber(String chassisNo,String engineNo);
	
	List<RegServiceDTO> findFirst5ByPrNoAndApplicationStatusAndServiceIdsNotNull(String prNo, String description);

	Optional<RegServiceDTO> findByPrNoAndServiceTypeInAndApplicationStatusOrderByCreatedDateDesc(String prNo,
			List<ServiceEnum> asList, String description);

	List<RegServiceDTO> findByApplicationStatusInAndApplicationNoNotIn(List<String> applicationStatusList,
			List<String> applicationNos, Pageable pageable);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotInAndSourceIsNullOrderByCreatedDateDesc(String prNo,
			List<ServiceEnum> listOfServices);

	List<RegServiceDTO> findByRegistrationDetailsVahanDetailsChassisNumberAndServiceIdsInAndSourceIsNull(
			String chassisNumber, List<Integer> servicesIds);

	long countByPrNoAndServiceTypeInAndApplicationStatus(String prNo, List<ServiceEnum> asList, String description);

	Integer countByOfficeDetailsOfficeCodeAndActionDetailsUserIdAndActionDetailsStatusAndActionDetailsLUpdateTimeBetween(
			String officeCode, String actionBy, String string, LocalDateTime ldt, LocalDateTime ldt1);

	List<RegServiceDTO> findByApplicationNoAndServiceTypeIn(String applicationNo, List<ServiceEnum> serviceIds);

	List<RegServiceDTO> findByTrNoAndServiceTypeIn(String trNo, List<ServiceEnum> serviceIds);

	@Query(value = "{ 'createdDate': {$gte:?0,$lte:?1}, 'serviceIds': {$in:?2} , 'applicationStatus' :?3 , 'createdBy':{$in:?4} ,  'gatewayType':?5 ,'feeDetails':{$exists:true}}", fields = "{'applicationNo':1,'applicationStatus':1,'prNo':1,'trNo':1,'flowId':1,'mviDone':1,'feeDetails':1,'createdDate':1,'serviceIds':1,'createdBy':1,'otherStateTemporaryPermitDetails':1}")

	List<RegServiceDTO> findByCreatedDateGreaterThanEqualAndCreatedDateLessThanEqualAndServiceIdsInAndApplicationStatusAndCreatedByInAndFeeDetailsIsNotNullAndOtherStateTemporaryPermitDetailsTemporaryPermitDetailsPermitNoIsNotNull(
			LocalDateTime fromDate, LocalDateTime toDate, List<Integer> serviceIds, String status, List<String> userId,
			String cash);

	Optional<RegServiceDTO> findByPrNoAndServiceTypeInAndApplicationStatusIn(String prNo, List<ServiceEnum> asList,
			List<String> description);

	long countByFreshRcdetailsFinancerUserIdAndApplicationStatusInAndServiceIds(String userId,
			List<StatusRegistration> status, Integer serviceId);

	@Query(value = "{ 'freshRcdetails.financerUserId': ?0, 'applicationStatus' : { $in: ?1 } ,'serviceIds': ?2 }", fields = "{'applicationNo':1,'applicationStatus':1,'prNo':1,'trNo':1,'flowId':1,'mviDone':1}")
	List<RegServiceDTO> findByFreshRcdetailsFinancerUserIdAndApplicationStatusInAndServiceIdsNative(String userId,
			List<StatusRegistration> status, Integer serviceId);

	List<RegServiceDTO> findByOtherStateTemporaryPermitDetailsTemporaryPermitDetailsPermitNoIn(List<String> permitNo);

	// getOtherStateTemporaryPermitDetails().getTemporaryPermitDetails().getPermitNo()

	List<RegServiceDTO> findFirst10ByLockedDetailsLockedByAndLockedDetailsLockedByRoleOrderByCreatedDateAsc(String user,
			String role);

	List<RegServiceDTO> findByDtcOfficeCodeAndCurrentRolesInAndSourceIsNull(String dtcOfficeCode,
			List<String> currentRoles);

	Integer countByActionDetailsLUpdateBetweenAndOfficeCodeAndActionDetailsUserIdAndActionDetailsRoleAndActionDetailsStatusIn(
			LocalDateTime fromDate, LocalDateTime toDate, String officeCode, String userId, String role,
			List<String> status);

	Page<RegServiceDTO> findAllByCreatedByAndCreatedDateBetweenOrderByCreatedDateDesc(String createdBy,
			LocalDateTime fromDate, LocalDateTime toDate, Pageable page);
	
	List<RegServiceDTO> findByApplicationStatus(String description, Pageable pageble);

	@Query(value = "{ \"applicationStatus\" : ?0 ,\"approvedDate\" : {$gte:?1,$lte:?2}, serviceIds:{$in: ?3 } }", fields = "{applicationNo:1}")
	List<RegServiceDTO> findApplicationStatusAndApprovedDateAndserviceIdsNativeLK(StatusRegistration applicationStatus,LocalDateTime fromDateTime, LocalDateTime toDateTime,
			List<Integer> servicesIds);
	
	List<RegServiceDTO> findByAutoApprovalInitiatedDateLessThanAndServiceIdsAndApplicationStatusInAndOfficeCodeNotInAndSourceIsNullAndAutoActionStatusNotIn(
			LocalDate date, Integer serviceIds, List<String> applicationstatus, List<String> officeCode,List<String> autoactionstatus,
			Pageable pageable);

	Optional<RegServiceDTO>  findByApplicationNoAndApplicationStatusNotIn(String applicationNo, List<String> payStatusList);

	@Query(value = "{ 'createdDate': {$gte:?0,$lte:?1}, 'serviceIds': {$in:?2} , 'applicationStatus' :?3  ,'createdBy':{$exists:true},'otherStateTemporaryPermitDetails.feeDetails.feeDetails':{$exists:true}}", fields = "{'applicationNo':1,'applicationStatus':1,'prNo':1,'trNo':1,'flowId':1,'mviDone':1,'feeDetails':1,'createdDate':1,'registrationDetails.classOfVehicle':1,'registrationDetails.classOfVehicleDesc':1,'serviceIds':1,'createdBy':1,'consolidateUpdated':1,'challanDetails':1, 'officeCode':1,'consolidateUpdatedTime':1 ,'recieptNo':1,'otherStateTemporaryPermitDetails':1}")
	List<RegServiceDTO> findByCreatedDateGreaterThanEqualAndCreatedDateLessThanEqualAndServiceIdsInAndApplicationStatusAndFeeDetailsIsNotNull(
			LocalDateTime fromDate, LocalDateTime toDate, List<Integer> serviceIds, String status);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndServiceIdsAndApplicationStatusAndCreatedDateBetweenOrderByCreatedDateDesc(
			String officeCode, Integer id, String string,LocalDateTime fromDate, LocalDateTime toDate);

	List<RegServiceDTO> findByApplicationNoAndApplicationStatusOrderByCreatedDateDesc(String applicationNo,
			StatusRegistration approved);

	List<RegServiceDTO> findByPrNoAndApplicationStatusOrderByCreatedDateDesc(String prNo, StatusRegistration approved);

	List<RegServiceDTO> findByRegistrationDetailsVahanDetailsChassisNumberAndApplicationStatusOrderByCreatedDateDesc(
			String chassisNo, StatusRegistration approved);
	
	@Query(value = "{ 'prNo' : ?0 }", fields = "{'applicationNo':1,'serviceType':1,'applicationStatus':1,'prNo':1,'createdDate':1,'trNo':1,'registrationDetails.vahanDetails.chassisNumber':1,'registrationDetails.vahanDetails.engineNumber':1,'registrationDetails.applicantDetails.displayName':1,'actionDetails':1}")
	List<RegServiceDTO> findByPrNoOrderByCreatedDateDescNative(String prNo, Sort sort);

	List<RegServiceDTO> findByRegistrationDetailsVahanDetailsChassisNumberOrderByCreatedDateDesc(String chassisNo);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndServiceIdsAndApplicationStatusInAndCreatedDateBetweenOrderByCreatedDateDesc(
			String officeCode, Integer id, List<String> asList, LocalDateTime fromDate, LocalDateTime toDate);
	
	
	@Query(value = "{ 'mviOfficeCode': ?0, 'applicationStatus' : { $in: ?1 } ,'serviceIds': { $in: ?2 } }", fields = "{'applicationNo':1,'registrationDetails.vahanDetails':1,'prNo':1,'registrationDetails.applicantDetails.firstName':1,'registrationDetails.applicantDetails.lastName':1,'registrationDetails.applicantDetails.contact.mobile':1,'registrationDetails.officeDetails.officeName':1,'mviOfficeDetails.officeName':1,'slotDetails.slotDate':1,'serviceType':1,'registrationDetails.classOfVehicleDesc':1}")
	List<RegServiceDTO> findByMviOfficeCodeAndApplicationStatusInAndServiceIdsInAndSourceIsNullNative(String mviOfficeCode,List<StatusRegistration> status, List<Integer> serviceId);
	
	@Query(value = "{serviceIds:{$in:?0},applicationStatus:{$in:?1},approvedDate:{$gte:?2,$lte:?3}}",fields = "{_id:1,prNo:1,aadhaarNo:1,'registrationDetails.applicantDetails.displayName':1,"
			+ "approvedDate:1,taxDetails:1,'registrationDetails.classOfVehicle':1,'registrationDetails.classOfVehicleDesc':1,'registrationDetails.vehicleType':1}")
	List<RegServiceDTO> findByServiceIdsInAndApplicationStatusInAndApprovedDateBetween(Set<Integer> serviceId,List<String> applicationStatus,LocalDateTime fromDate,LocalDateTime toDate);

	List<RegServiceDTO> findByPrNoAndServiceTypeNotInAndApplicationStatusNotInAndCreatedDateNotNull(String prNo,
			ServiceEnum serviceEnumById, List<String> asList);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndCreatedDateBetween(String officeCode,
			LocalDateTime fromDate, LocalDateTime toDate);

	//List<RegServiceDTO> findByOfficeCodeAndPrNoAndCurrentIndexAndTransactionTypeAndSourceIsNull(String officeCode, String prNo,Integer currentIndex,String transactionType);
	Optional<RegServiceDTO> findByApplicationNoAndOfficeCodeAndCurrentIndexAndApplicationStatusIn(String applicationNo,
			String officeCode,Integer currentIndex,List<String> applicationStatus);

	List<RegServiceDTO> findByOfficeDetailsOfficeCodeAndServiceIdsAndApplicationStatusNotInAndCreatedDateBetweenOrderByCreatedDateDesc(
			String officeCode, Integer id, List<String> status,LocalDateTime fromDate, LocalDateTime toDate);
	
}
