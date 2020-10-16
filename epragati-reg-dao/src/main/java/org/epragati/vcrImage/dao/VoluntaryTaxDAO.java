package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.util.payment.GatewayTypeEnum;
import org.epragati.vcrImage.dto.VoluntaryTaxDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntaryTaxDAO extends BaseRepository<VoluntaryTaxDTO, Serializable> {

	Optional<VoluntaryTaxDTO> findByTrNoOrderByCreatedDateDesc(String trNo);

	Optional<VoluntaryTaxDTO> findByRegNoOrderByCreatedDateDesc(String trNo);
	
	Optional<VoluntaryTaxDTO> findByApplicationNo(String applicationNo);
	
	List<VoluntaryTaxDTO> findFirst2ByRegNoOrderByCreatedDateDesc(String prNo);
	

	List<VoluntaryTaxDTO> findFirst2ByTrNoOrderByCreatedDateDesc(String inputNumber);

	List<VoluntaryTaxDTO> findFirst2ByChassisNoOrderByCreatedDateDesc(String inputNumber);
	
	Optional<VoluntaryTaxDTO> findByChassisNoOrderByCreatedDateDesc(String chassisNo);

	/**
	 * 
	 * @param mviList
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	@Query(value = "{'actions.userId':{ $in: ?0 },  'createdDate':{$lte:?1,$gte:?2} , 'gatewayType':?3  }", fields = "{'tax':1,'taxType':1,'actions':1,'serviceFee':1,'penalty':1,'createdDate':1 , 'taxArrears':1, 'penaltyArrears':1 ,'consolidateUpdated':1,'chassisNo':1,'regNo':1,'trNo':1}")
	List<VoluntaryTaxDTO> nativeUserAndCreatedDateAndGateWay(List<String> mviList, LocalDateTime fromDate,
			LocalDateTime toDate, GatewayTypeEnum cash);

	@Query(value = "{'actions.userId':{ $in: ?0 },  'createdDate':{$lte:?1,$gte:?2} }", fields = "{'tax':1,'taxType':1,'actions':1,'serviceFee':1,'penalty':1,'createdDate':1 ,'consolidateUpdated':1}")
	List<VoluntaryTaxDTO> nativeUserAndCreatedDate(List<String> mviList, LocalDateTime fromDate, LocalDateTime toDate);

	List<VoluntaryTaxDTO> findByApplicationNoIn(List<String> voluntaryConsolidateList);
	Page<VoluntaryTaxDTO> findAllByCreatedByAndCreatedDateBetweenOrderByCreatedDateDesc(String mviName,
			LocalDateTime fromdate, LocalDateTime toDate, Pageable page);

	@Query(value = "{ 'officeCode':{$in:?0},'createdDate':{$gte:?1,$lte:?2}    }", fields = "{'tax':1,'taxType':1,'userId':1,'officeCode':1,'classOfVehicle':1,'actions':1,'serviceFee':1,'penalty':1,'createdDate':1 , 'taxArrears':1, 'penaltyArrears':1 ,'consolidateUpdated':1,'chassisNo':1,'regNo':1,'trNo':1}")
	List<VoluntaryTaxDTO> findByOfficeCodeAndCreatedDate(List<String> officeCode, LocalDateTime fromDate, LocalDateTime toDate);

}
