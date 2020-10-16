package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VcrFinalServiceDAO extends BaseRepository<VcrFinalServiceDTO, Serializable> {

	Optional<VcrFinalServiceDTO> findByVcrVcrNumber(String vcrNumber);

	List<VcrFinalServiceDTO> findByRegistrationRegNo(String regNo);

	List<VcrFinalServiceDTO> findAllByVcrVcrNumber(String vcrNumber);

	List<VcrFinalServiceDTO> findByRegistrationRegNoAndIsVcrClosedIsFalse(String regNo);

	List<VcrFinalServiceDTO> findByRegistrationTrNoAndIsVcrClosedIsFalse(String trNo);

	List<VcrFinalServiceDTO> findByRegistrationChassisNumberAndIsVcrClosedIsFalse(String chassisNumber);

	List<VcrFinalServiceDTO> findByVcrVcrNumberIgnoreCaseAndIsVcrClosedIsFalse(String vcrNo);

	List<VcrFinalServiceDTO> findByVcrVcrNumberInAndIsVcrClosedIsFalse(List<String> vcrNo);

	List<VcrFinalServiceDTO> findByRegistrationRegApplicationNoAndIsVcrClosedIsFalse(String regApplicationNo);

	List<VcrFinalServiceDTO> findByRegistrationChassisNumberAndOffenceOffenceOffenceDescription(String chassisNumber,
			String offenceDescription);

	List<VcrFinalServiceDTO> findFirst10ByRegistrationRegNoAndCreatedByOrderByCreatedDateDesc(String prgNo,
			String username);

	List<VcrFinalServiceDTO> findFirst10ByRegistrationTrNoAndCreatedByOrderByCreatedDateDesc(String trNo,
			String username);

	List<VcrFinalServiceDTO> findFirst10ByVcrVcrNumberAndCreatedByOrderByCreatedDateDesc(String vcrNumber,
			String username);

	List<VcrFinalServiceDTO> findFirst10ByRegistrationChassisNumberAndCreatedByOrderByCreatedDateDesc(
			String chassisNumber, String username);

	List<VcrFinalServiceDTO> findByPaidDateBetweenAndCreatedByIn(LocalDateTime timewithDate,
			LocalDateTime timewithDate2, List<String> distinctMVI);

	List<VcrFinalServiceDTO> findByRegistrationRegApplicationNo(String regApplicationNo);

	List<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndOfficeCodeIn(LocalDateTime minusDays, LocalDateTime now,
			List<String> officeCode);
	/*
	 * List<VcrFinalServiceDTO>
	 * findByVcrDateOfCheckBetweenAndOfficeCodeInAndRegistrationClasssOfVehicleCovdescription(
	 * LocalDateTime minusDays, LocalDateTime now, List<String> officeCode, String
	 * cov);
	 */


	List<VcrFinalServiceDTO> findFirst2ByRegistrationChassisNumberOrderByCreatedDateDesc(String chassisNumber);

	List<VcrFinalServiceDTO> findFirst2ByRegistrationRegNoOrderByCreatedDateDesc(String prNo);

	List<VcrFinalServiceDTO> findFirst2ByRegistrationTrNoOrderByCreatedDateDesc(String trNo);

	List<VcrFinalServiceDTO> findFirst10ByCreatedByAndRegistrationChassisNumberOrderByCreatedDateDesc(String createdBy,
			String chassisNo);

	List<VcrFinalServiceDTO> findFirst10ByCreatedByAndRegistrationRegNoOrderByCreatedDateDesc(String createdBy,
			String prNo);

	List<VcrFinalServiceDTO> findFirst10ByCreatedByAndRegistrationTrNoOrderByCreatedDateDesc(String createdBy,
			String trNo);

	List<VcrFinalServiceDTO> findByRegistrationTrNo(String trNo);

	List<VcrFinalServiceDTO> findByRegistrationChassisNumber(String chassisNo);

	List<VcrFinalServiceDTO> findByVcrVcrNumberIgnoreCase(String vcrNo);

	List<VcrFinalServiceDTO> findByVcrVcrNumberIn(List<String> listOfVcrs);

	@Query(value = "{  'seizedAndDocumentImpounded.vehicleSeizedDTO.dateOfSeized':{$gte:?0,$lte:?1},'officeCode':{ $in: ?2 }}", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'seizedAndDocumentImpounded.vehicleSeizedDTO.vehicleKeptAt':1,'seizedAndDocumentImpounded.vehicleSeizedDTO.dateOfSeized':1}")
	List<VcrFinalServiceDTO> findBySeizedAndDocumentImpoundedBetweenAndOfficeCodeIn(LocalDateTime fromDate,
			LocalDateTime toDate, List<String> officeCodes);

	@Query(value = "{ 'officeCode':{$in:?0},'vcr.dateOfCheck':{$gte:?1,$lte:?2}  ,'offence.offence.fixedAmount':{$exists:true}  ,'offence.offence.offenceDescription':{$exists:true}  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'officeCode':1,'createdBy':1,'offencetotal':1 ,'offence.offence.fixedAmount':1}")
	List<VcrFinalServiceDTO> findFixedAmountsSum(List<String> officeCodes, LocalDateTime fromDate,
			LocalDateTime toDate);
	
	@Query(value = "{ 'officeCode':{$in:?0},'vcr.dateOfCheck':{$gte:?1,$lte:?2}  ,'iseVcr':true,'offence.offence.fixedAmount':{$exists:true}  ,'offence.offence.offenceDescription':{$exists:true}  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'officeCode':1,'createdBy':1,'offencetotal':1 ,'offence.offence.fixedAmount':1}")
	List<VcrFinalServiceDTO> findFixedAmountsSumBasedOnEvcr(List<String> officeCodes, LocalDateTime fromDate,
				LocalDateTime toDate);
	
	@Query(value = "{ 'vcr.dateOfCheck':{$gte:?0,$lte:?1}  ,'officeCode':{$in:?2},'registration.classsOfVehicle.covdescription':?3  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'officeCode':1,'createdBy':1,'offencetotal':1 ,'offence.offence.fixedAmount':1,'penalty':1,'tax':1,'registration.seatingCapacity':1,'registration.chassisNumber':1}")
	List<VcrFinalServiceDTO> nativeDateofCheckAndCovDesc(LocalDateTime minusDays, LocalDateTime now,
			List<String> officeCode, String cov);

	@Query(value = "{ 'officeCode':{$in:?0},'vcr.dateOfCheck':{$gte:?1,$lte:?2}   ,'offence.offence.offenceDescription':{$exists:true}  }", fields = "{'offence.offence.offenceDescription':1,'officeCode':1}")
	List<VcrFinalServiceDTO> nativeOfficeWiseOffenceCount(List<String> officeCodes, LocalDateTime fromDate,
			LocalDateTime toDate);

	List<VcrFinalServiceDTO> findTop10ByRegistrationRegNoAndIsVcrClosedIsTrueOrderByCreatedDateDesc(String prNo);

	List<VcrFinalServiceDTO> findTop10ByRegistrationTrNoAndIsVcrClosedIsTrueOrderByCreatedDateDesc(String trNo);

	List<VcrFinalServiceDTO> findTop10ByRegistrationChassisNumberAndIsVcrClosedIsTrueOrderByCreatedDateDesc(
			String chassisNo);

	List<VcrFinalServiceDTO> findByVcrVcrNumberIgnoreCaseAndIsVcrClosedIsTrueOrderByCreatedDateDesc(String vcrNo);

	@Query(value = "{'createdBy':{ $in: ?0 },  'vcr.dateOfCheck':{$gte:?1,$lte:?2} , 'paymentType':?3  ,'isVcrClosed':false}", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1,'taxArrears':1,'penaltyArrears':1, 'serviceFee':1,'paymentType':1,'consolidateUpdated':1,'greenTax':1,'releaseOrderFee':1,'deductionMode':1,'voluntaryMode':1}")
	List<VcrFinalServiceDTO> nativeVcrDateAndUserAndPaymentType(List<String> distinctMVI, LocalDateTime fromDate,
			LocalDateTime toDate, String paymentType);

	List<VcrFinalServiceDTO> findByChallanNo(String challanNo);

	List<VcrFinalServiceDTO> findByChallanNoIn(List<String> challanNo);

	@Query(value = "{ 'officeCode':{$in:?0},'vcr.dateOfCheck':{$gte:?1,$lte:?2}   ,'offencetotal':{$exists:true} ,'isVcrClosed':{$exists:true}  ,'registration.classsOfVehicle.covdescription':{$exists:true}}", fields = "{'vcr.dateOfCheck':1,'officeCode':1,'offencetotal':1,'penalty':1,'tax':1,registration.classsOfVehicle.covdescription:1}")
	List<VcrFinalServiceDTO> nativeVcrDateAndOfficeCodeIn(List<String> officeCodes, LocalDateTime fromDate,
			LocalDateTime toDate);

	@Query(value = "{ 'officeCode':{$in:?0},'vcr.dateOfCheck':{$gte:?1,$lte:?2},'vehicleSeized':{$exists:true},'vehicleSeized':true}", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.trNo':1,'isVcrClosed':1,'registration.classsOfVehicle.covdescription':1,'registration.chassisNumber':1,'createdBy':1,'registration.regNo':1,'seizedAndDocumentImpounded.vehicleSeizedDTO':1}")
	List<VcrFinalServiceDTO> nativeVcrDateAndOfficeCodeInAndVehicleSeized(List<String> officeCodes,
			LocalDateTime fromDate, LocalDateTime toDate);

	@Query(value = "{'createdBy':{ $in: ?0 },  'paidDate':{$gte:?1,$lte:?2} , 'paymentType':?3  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1,'serviceFee':1,'paymentType':1,'consolidateUpdated':1,'paidDate':1}")
	List<VcrFinalServiceDTO> nativeVcrPaymentDateAndUserAndPaymentType(List<String> distinctMVI, LocalDateTime fromDate,
			LocalDateTime toDate, String paymentType);
	
	List<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndCreatedByIn(LocalDateTime minusDays, LocalDateTime now,
			List<String> distinctMVI);
	
	Page<VcrFinalServiceDTO> findAllByCreatedByAndVcrDateOfCheckBetweenOrderByCreatedDateDesc(String createdBy,
			LocalDateTime fromDate, LocalDateTime toDate, Pageable page);
	
	
	
	Page<VcrFinalServiceDTO> findByIsVcrClosedFalseAndPaymentDoneFalseAndIsScVcrNoGeneratedFalseAndOfficeCodeAndCreatedByAndCreatedDateBetween(
			String officeCode, String createdBy, LocalDateTime fromDate, LocalDateTime toDate, Pageable pageable);

	Page<VcrFinalServiceDTO> findByIsVcrClosedFalseAndPaymentDoneFalseAndOfficeCodeAndCreatedByAndIsScVcrNoGeneratedTrueAndCreatedDateBetween(
			String officeCode, String userId, LocalDateTime fromDate, LocalDateTime toDate, Pageable previousOrFirst);
	
	
	List<VcrFinalServiceDTO> findByVcrVcrNumberInAndPaymentDoneFalseAndIsScVcrNoGeneratedFalse(List<String> vcrNos);
	
	Optional<VcrFinalServiceDTO> findByIsScNoVcr(String scVcrNo);
	
	@Query(value = "{'createdBy':{ $in: ?0 },  'vcr.dateOfCheck':{$gte:?1,$lte:?2} }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'registration.otherState':1,'registration.unregisteredVehicle':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'mviOfficeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'penaltyArrears':1, 'serviceFee':1, 'greenTax':1, 'paymentType':1,'challanDetails':1 , 'consolidateUpdated':1,  'consolidateUpdatedTime':1 ,'recieptNo':1 ,'releaseOrderFee':1,'deductionMode':1}")
	List<VcrFinalServiceDTO> nativeVcrDateOfCheckBetweenAndCreatedByIn(List<String> distinctMVI, LocalDateTime fromDate,
			LocalDateTime toDate);
	
	@Query(value = "{ 'paidDate':{$gte:?0,$lte:?1} ,'createdBy':{ $in: ?2 } }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,  'seizedAndDocumentImpounded.documentImpoundedDTO':1,'vehicleSeized':1, 'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'fineCollected':1,'penaltyArrears':1, 'serviceFee':1,'paymentType':1,'challanDetails':1 ,'recieptNo':1, 'releaseOrderFee':1}")
	List<VcrFinalServiceDTO> nativePaidDateBetweenAndCreatedByIn(LocalDateTime timewithDate,
			LocalDateTime timewithDate2, List<String> distinctMVI);
	@Query(value = "{ 'paidDate':{$gte:?0,$lte:?1} ,'createdBy':{ $in: ?2 }  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,  'seizedAndDocumentImpounded.documentImpoundedDTO':1,'vehicleSeized':1, 'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'fineCollected':1,'penaltyArrears':1, 'serviceFee':1,'paymentType':1,'challanDetails':1 ,'recieptNo':1, 'releaseOrderFee':1}")
	Page<VcrFinalServiceDTO> findByPaidDateBetweenAndCreatedByIn(LocalDateTime timewithDate,
			LocalDateTime timewithDate2, List<String> distinctMVI, Pageable page);
	@Query(value = "{'createdBy':{ $in: ?0 },  'vcr.dateOfCheck':{$gte:?1,$lte:?2} ,'paidDate':{$exists:?3} }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1, 'seizedAndDocumentImpounded.documentImpoundedDTO':1,'vehicleSeized':1, 'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'penaltyArrears':1,'fineCollected':1, 'serviceFee':1,'paymentType':1,'challanDetails':1,'recieptNo':1, 'releaseOrderFee':1}")
	Page<VcrFinalServiceDTO> nativeVcrDateOfCheckBetweenAndCreatedByInAndPaid(List<String> distinctMVI,
			LocalDateTime fromDate, LocalDateTime toDate, Boolean exist, Pageable page);
	@Query(value = "{'createdBy':{ $in: ?0 },  'vcr.dateOfCheck':{$gte:?1,$lte:?2}  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1, 'seizedAndDocumentImpounded.documentImpoundedDTO':1,'vehicleSeized':1, 'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'penaltyArrears':1,'fineCollected':1, 'serviceFee':1,'paymentType':1,'challanDetails':1,'recieptNo':1, 'releaseOrderFee':1}")
	Page<VcrFinalServiceDTO> nativeVcrDateOfCheckBetweenAndCreatedByIn(List<String> distinctMVI, LocalDateTime fromDate,
			LocalDateTime toDate, Pageable page);
	Page<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndOfficeCodeAndIseVcr(LocalDateTime timewithDate,
			LocalDateTime timewithDate2,String officeCode,Boolean value,Pageable pageRequest);
	
	List<VcrFinalServiceDTO> findByIdIn(List<String> vcrPrintList);
	
	
	@Query(value = "{ 'vcr.dateOfCheck':{$gte:?0,$lte:?1}   ,'isRoadSafety':{$exists:true}}", fields = "{'vcr':1,'officeCode':1,'offence':1,'mviOfficeCode':1,'createdBy':1,'isRoadSafety':1,registration.classsOfVehicle.covdescription:1}")
	List<VcrFinalServiceDTO> nativeVcrDateAndIsRoadSafetyIsTrue(LocalDateTime fromDate,
			LocalDateTime toDate);

	@Query(value = "{ 'vcr.dateOfCheck':{$gte:?0,$lte:?1}   ,'iseVcr':{$exists:true}}", fields = "{'officeCode':1}")
	List<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndIseVcrNative(LocalDateTime timewithDate,
			LocalDateTime timewithDate2, Boolean true1);

	@Query(value = "{ 'vcr.dateOfCheck':{$gte:?0,$lte:?1} ,'officeCode':{ $in: ?2 } ,'iseVcr':{$exists:true}}")
	List<VcrFinalServiceDTO> nativeVcrDateOfCheckBetweenAndOfficeCodeInAndIseVcr(LocalDateTime timewithDate,
			LocalDateTime timewithDate2,List<String> officeCodes, Boolean true1);
	
	@Query(value = "{ 'paidDate':{$gte:?0,$lte:?1} ,'createdBy':{ $in: ?2 }  }", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,  'seizedAndDocumentImpounded.documentImpoundedDTO':1,'vehicleSeized':1, 'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1, 'taxArrears':1, 'fineCollected':1,'penaltyArrears':1, 'serviceFee':1,'paymentType':1,'challanDetails':1 ,'recieptNo':1, 'releaseOrderFee':1}")
	List<VcrFinalServiceDTO> findByPaidDateBetweenAndCreatedByInNative(LocalDateTime timewithDate,
			LocalDateTime timewithDate2, List<String> distinctMVI);
	
	//Optional<VcrFinalServiceDTO> findBySpeedGunDTOImageIdAndSpeedGunDTOOfficerId(String imageId,String officerId);
	
	Page<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndMviOfficeCodeAndIsSpeedGun(LocalDateTime timewithDate,
			LocalDateTime timewithDate2,String officeCode,Boolean value,Pageable pageRequest);

	List<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndCreatedBy(LocalDateTime fromDate, LocalDateTime toDate,
			String userId);

	List<VcrFinalServiceDTO> findByCreatedByAndIsVcrClosed(String userId, Boolean true1);

	List<VcrFinalServiceDTO> findByIsVcrClosedAndPaidDateBetweenAndOfficeCodeIn(Boolean true1, LocalDateTime fromDate,
			LocalDateTime toDate, List<String> listOfOfficeCodes);

	List<VcrFinalServiceDTO> findByCreatedByAndIsVcrClosedAndPaidDateBetween(String userId, Boolean true1,
			LocalDateTime fromDate, LocalDateTime toDate);

	List<VcrFinalServiceDTO> findByIsVcrClosedAndPaidDateBetweenAndCreatedBy(Boolean true1, LocalDateTime fromDate,
			LocalDateTime toDate, String userId);

	List<VcrFinalServiceDTO> findByVcrDateOfCheckBetweenAndIsVcrClosedIsFalseAndMviOfficeCode(LocalDateTime minusDays, LocalDateTime now,
			String officeCode);
	@Query(value ="{ 'challanDetails':{$elemMatch:{'challanNo':?0,challanDate:{$gte:?1, $lte:?2}} }}")
	//@Query(value = "{ 'challanDetails':{$elemMatch:{'challanNo':?0}, {'challanDate':{$gte:?1, $lte:?2}} }}")
	List<VcrFinalServiceDTO> findByChallanDetailsChallanNoAndChallanDetailsChallanDateBetween(String challanNo,LocalDateTime fromDate, LocalDateTime toDate);

	//List<VcrFinalServiceDTO> findByVcrVcrNumberAndIsVcrClosed(String string, boolean b);

	@Query(value = "{'createdBy':{ $in: ?0 },  'vcr.dateOfCheck':{$gte:?1,$lte:?2} , 'paymentType':?3  ,'isVcrClosed':true}", fields = "{'vcr.dateOfCheck':1,'vcr.vcrNumber':1,'registration.regNo':1,'registration.classsOfVehicle.covcode':1,'registration.classsOfVehicle.covdescription':1,'registration.trNo':1,'ownerDetails.fullName':1,'offence.offence.offenceDescription':1,'isVcrClosed':1,'officeCode':1,'createdBy':1,'createdDate':1,'offencetotal':1,'isTaxPaid':1,'paidDate':1,'registration.chassisNumber':1,'challanNo':1,'tresuryAmount':1,'tax':1,'penalty':1,'taxArrears':1,'penaltyArrears':1, 'serviceFee':1,'paymentType':1,'consolidateUpdated':1,'greenTax':1,'releaseOrderFee':1,'deductionMode':1,'voluntaryMode':1, 'challanDetails':1}")
	List<VcrFinalServiceDTO> nativeVcrUserAndDateAndPaymentType(List<String> distinctMVI, LocalDateTime fromDate,
			LocalDateTime toDate, String paymentType);
	
	List<VcrFinalServiceDTO> findByChallanDetailsChallanNoIn(List<String> challanNo);


	
}
