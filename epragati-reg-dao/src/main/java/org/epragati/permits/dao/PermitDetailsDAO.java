package org.epragati.permits.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitDetailsDAO extends BaseRepository<PermitDetailsDTO, Serializable> {

	Optional<PermitDetailsDTO> findByPrNoAndPermitTypeTypeofPermitAndPermitStatus(String prNo, String permitTypeCode,
			String description);

	Optional<PermitDetailsDTO> findByIdAndPermitStatus(String id, String description);

	List<PermitDetailsDTO> findByPrNoAndPermitStatus(String prNo, String description);

	List<PermitDetailsDTO> findByPrNo(String prNo);

	List<PermitDetailsDTO> findByPermitNo(String permitNo);

	Optional<PermitDetailsDTO> findByPrNoAndPermitNoAndPermitTypePermitType(String prNo, String permitNo,
			String permitType);

	Optional<PermitDetailsDTO> findByPermitNoAndPermitStatus(String permitNo, String description);

	List<PermitDetailsDTO> findByPermitNoIn(List<String> permitNoList);

	Optional<PermitDetailsDTO> findByPermitNoAndPermitTypeTypeofPermitAndPermitStatus(String permitNo,
			String permitTypeCode, String description);

	Optional<PermitDetailsDTO> findByPermitStatusInAndPrNo(List<String> statusList, String prNo);

	Optional<PermitDetailsDTO> findByPermitNoAndServiceIdsInAndPermitTypeTypeofPermit(String permitNo, Integer id,
			String permitTypeCode);

	Optional<PermitDetailsDTO> findByPrNoAndPermitNo(String prNo, String permitNo);

	Optional<PermitDetailsDTO> findByPrNoAndPermitStatusAndPermitClassPermitClassId(String prNo, String description,
			Integer id);

	Optional<PermitDetailsDTO> findByPrNoAndPermitNoAndPermitTypePermitTypeAndPermitStatus(String prNo, String permitNo,
			String permitType, String description);

	List<PermitDetailsDTO> findByPrNoInAndPermitClassCodeAndPermitStatus(List<String> prNo, String permitTypeCode,
			String description);

	Optional<PermitDetailsDTO> findByPrNoAndPermitStatusAndPermitTypeTypeofPermitOrderByCreatedDateDesc(String prNo,
			String description, String permitTypeCode);

	Optional<PermitDetailsDTO> findByPrNoAndPermitTypePermitTypeAndPermitStatusAndRouteDetailsStateOrderByCreatedDateDesc(String prNo,
			String permitType, String status, String state);

	List<PermitDetailsDTO> findByPrNoAndPermitStatusAndIsRecommendationLetterTrue(String prNo, String description);

	Optional<PermitDetailsDTO> findByPrNoOrderByCreatedDateDesc(String prNumber);

	List<PermitDetailsDTO> findByCreatedDateBetweenAndPermitTypePermitTypeAndRdtoOfficeDetailsOfficeCode(
			LocalDateTime fromDate, LocalDateTime toDate, String permitType, String officeCode);

	/**
	 * for last5daysCollection
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	List<PermitDetailsDTO> findByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<PermitDetailsDTO> findAllByLUpdateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<PermitDetailsDTO> findAllByCreatedDateBetween(LocalDateTime fromDate, LocalDateTime toDate);


	Optional<PermitDetailsDTO> findTopByPrNoInAndPermitStatusOrderByCreatedDateDesc(List<String> prNo,
			String description);

	Page<PermitDetailsDTO> findByCreatedDateBetweenAndPermitTypeDescriptionAndRdtoOfficeDetailsOfficeCode(
			LocalDateTime fromDate, LocalDateTime toDate, String permitType, String officeCode, Pageable pageble);
	
	Optional<PermitDetailsDTO> findByPrNoAndPermitClassDescriptionOrderByCreatedDateDesc(String prNo, String classDesc);

	@Query(value = "{ 'rdto.officeDetails.officeCode': {$in:?0}, 'rdto.classOfVehicle': {$in:?1} , 'permitStatus': ?2, 'routeDetails.routeType.routeCode': {$in:?3}, 'permitValidityDetails.permitValidTo':{$gte: ?4} }", fields = "{'rdto.applicantDetails.presentAddress':1, 'permitNo':1, 'prNo':1, 'permitType.description': 1, 'routeDetails': 1, 'permitValidityDetails.permitValidFrom' : 1, 'permitValidityDetails.permitValidTo': 1, "
			+ "'rdto.officeDetails.officeName':1,'rdto.classOfVehicleDesc':1,'rdto.applicantDetails.displayName':1, 'rdto.applicantDetails.fatherName':1, "
			+ "'rdto.applicantDetails.presentAdderss.doorNo':1,'rdto.applicantDetails.presentAdderss.streetName':1,'rdto.applicantDetails.presentAdderss.townOrCity':1,"
			+ "'rdto.applicantDetails.presentAdderss.mandal.mandalName':1,'rdto.applicantDetails.presentAdderss.district.districtName':1,'rdto.vahanDetails.chassisNumber':1,"
			+ "'rdto.vahanDetails.engineNumber':1,'rdto.vahanDetails.makersModel':1,'rdto.vahanDetails.makersDesc':1,'rdto.vahanDetails.seatingCapacity':1}")
	Page<PermitDetailsDTO> findByOfficeCodeInAndClassOfVehicleInAndPermitStatusAndPermitRouteCode(
			List<String> officeCodes, List<String> asList, String description, List<String> routeCodes,
			LocalDate valiUpto, Pageable page);
	
	@Query(value = "{ 'rdto.officeDetails.officeCode': {$in:?0}, 'rdto.classOfVehicle': {$in:?1} , 'permitStatus': ?2, 'routeDetails.routeType.routeCode': {$in:?3}, 'permitValidityDetails.permitValidTo':{$gte: ?4} }", 
			fields = "{'rdto.applicantDetails.presentAddress':1, 'permitNo':1, 'prNo':1, 'permitType.description' : 1, 'permitValidityDetails.permitValidFrom' : 1, 'permitValidityDetails.permitValidTo': 1, "
			+ "'rdto.officeDetails.officeName':1,'rdto.classOfVehicleDesc':1,'rdto.applicantDetails.displayName':1, 'rdto.applicantDetails.fatherName':1, "
			+ "'rdto.applicantDetails.presentAdderss.doorNo':1,'rdto.applicantDetails.presentAdderss.streetName':1,'rdto.applicantDetails.presentAdderss.townOrCity':1,"
			+ "'rdto.applicantDetails.presentAdderss.mandal.mandalName':1,'rdto.applicantDetails.presentAdderss.district.districtName':1,'rdto.vahanDetails.chassisNumber':1,"
			+"'rdto.registrationValidity.fcValidity':1,"
			+ "'rdto.vahanDetails.engineNumber':1,'rdto.vahanDetails.makersModel':1,'rdto.vahanDetails.makersDesc':1,'rdto.vahanDetails.seatingCapacity':1}")
	List<PermitDetailsDTO> findByOfficeCodeInAndClassOfVehicleInAndPermitStatusAndPermitRouteCode(
			List<String> officeCodes, List<String> asList, String description, List<String> routeCodes, LocalDate now);

	List<PermitDetailsDTO> findByPrNoInOrderByCreatedDateDesc(String upperCase);

	List<PermitDetailsDTO> findByPermitNoOrderByCreatedDateDesc(String upperCase);

	List<PermitDetailsDTO> findByPrNoInOrderByCreatedDateDesc(List<String> asList);

}
