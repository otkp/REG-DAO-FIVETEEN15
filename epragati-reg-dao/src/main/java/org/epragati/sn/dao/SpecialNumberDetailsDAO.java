package org.epragati.sn.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.dto.SpecialNumberDetailsDTO;
import org.epragati.util.BidStatus;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialNumberDetailsDAO extends BaseRepository<SpecialNumberDetailsDTO, Serializable> {

	Optional<SpecialNumberDetailsDTO> findTopByVehicleDetailsApplicationNumberOrderByCreatedDateDesc(String stagAppNo);
	
	//List<SpecialNumberDetailsDTO> findByVehicleDetailsApplicationNumberAndBidStatus(String applicationNumber,BidStatus bidStatus);

	Optional<SpecialNumberDetailsDTO> findBySpecialNumberAppId(String specialNumberAppId);

	List<SpecialNumberDetailsDTO> findBySpecialNumberAppIdIn(List<String> specialNumberAppId);

	List<SpecialNumberDetailsDTO> findByBidStatusIn(List<BidStatus> bidStatus);
	
	//List<SpecialNumberDetailsDTO> findByBidStatusInAndCreatedDateGreaterThan(List<BidStatus> bidStatus,LocalDateTime createdDate);
	
	List<SpecialNumberDetailsDTO> findByBidStatusInAndSpecialNumberFeeDetailsIsRefundDoneAndCreatedDateGreaterThan(List<BidStatus> bidStatus,boolean isRefundDone, LocalDateTime createdDate);
	
	List<SpecialNumberDetailsDTO> findByBidStatusInAndBidFinalDetailsIsRefundDoneAndCreatedDateGreaterThan(List<BidStatus> bidStatus,boolean isRefundDone, LocalDateTime createdDate);

	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberAndCustomerDetailsMobileNoAndPasscodeOrderByCreatedDateDesc(
			String trNumber, String mobileNo, String passcode);
	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberAndCustomerDetailsMobileNoAndBidStatus(
			String trNumber, String mobileNo,BidStatus bidStatus);

	List<SpecialNumberDetailsDTO> findByVehicleDetailsRtaOfficeOfficeCodeAndActionsDetailsLogActionAndCreatedDateBetween(
			String officeCode, String bidStatus, LocalDateTime fromDate, LocalDateTime toDate);

	List<SpecialNumberDetailsDTO> findByActionsDetailsLogActionAndCreatedDateBetween(String bidStatus,
			LocalDateTime fromDate, LocalDateTime toDate);

	/**
	 * fetching records based on the Biding Status is Pending to release the Special Numbers 
	 * @param bidStatus
	 * @return 
	 */
	
	List<SpecialNumberDetailsDTO> findByBidStatus(BidStatus bidStatus);
	
	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberOrderByCreatedDateDesc(String trNumber);
	
	Optional<SpecialNumberDetailsDTO> findTopByVehicleDetailsTrNumberAndCustomerDetailsMobileNoOrderByCreatedDateDesc(String trNumber,String mobileNo);

	List<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumber(String trNo);

	List<SpecialNumberDetailsDTO> findBySelectedPrSeriesAndVehicleDetailsRtaOfficeOfficeNumberSeries(String prNo,
			String officeNumberSeries);

	List<SpecialNumberDetailsDTO> findByCreatedDateBetweenAndVehicleDetailsRtaOfficeOfficeNumberSeries(
			LocalDateTime localDateTime, LocalDateTime localDateTime2, String officeNumberSeries);
	
	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberAndBidStatus(
			String trNumber, BidStatus bidStatus );
	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberAndBidStatusAndCreatedDateGreaterThan(String trNumber,
				BidStatus bidStatus,LocalDateTime reassigmentDoneDate);
	
	
	@Query(value = "{ createdDate:{$gte:?0,$lte:?1},'actionsDetailsLog.action':?2}", fields = "{'vehicleDetails.classOfVehicle.covcode':1,'vehicleDetails.classOfVehicle.covdescription':1,"
			+ "'specialNumberFeeDetails.applicationAmount':1,'specialNumberFeeDetails.servicesAmount':1,'specialNumberFeeDetails.isRefundDone':1,'specialNumberFeeDetails.totalAmount':1,"
			+ "'bidFinalDetails.bidAmount':1,'bidFinalDetails.isRefundDone':1,'actionsDetailsLog.action':1}")
	List<SpecialNumberDetailsDTO> findByAllCovsDataNative(LocalDateTime fromDate,LocalDateTime toDate,String action);
	
	@Query(value = "{'vehicleDetails.classOfVehicle.covcode':?0,\"actionsDetailsLog.action\":?1,createdDate:{$gte:?2,$lte:?3},}", fields = "{'vehicleDetails.classOfVehicle.covcode':1,'vehicleDetails.classOfVehicle.covdescription':1,"
			+ "'specialNumberFeeDetails.applicationAmount':1,'specialNumberFeeDetails.servicesAmount':1,'specialNumberFeeDetails.isRefundDone':1,'specialNumberFeeDetails.totalAmount':1,"
			+ "'bidFinalDetails.bidAmount':1,'bidFinalDetails.isRefundDone':1,'actionsDetailsLog.action':1}")
	List<SpecialNumberDetailsDTO> findBySpecificCovsDataNative(String covCode,String action,LocalDateTime fromDate,LocalDateTime toDate);

	Optional<SpecialNumberDetailsDTO> findByVehicleDetailsTrNumberAndCustomerDetailsMobileNoAndSelectedPrSeriesAndBidStatusIn(
			String trNo, String mobileNo, String selectedPrNo, List<String> asList);

	List<SpecialNumberDetailsDTO> findBySelectedPrSeriesAndBidStatusIn(String selectedPrNo,List<BidStatus> bidStatus);

	
}
