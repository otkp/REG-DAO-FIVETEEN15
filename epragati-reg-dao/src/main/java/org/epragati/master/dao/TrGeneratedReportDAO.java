package org.epragati.master.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.TrGeneratedReportDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrGeneratedReportDAO extends BaseRepository<TrGeneratedReportDTO, Serializable> {
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'dealerId':?2 }", fields = "{'trGeneratedDate':1,'trNo':1,'applicantDisplayName':1,'classOfVehicleDesc':1,'makersModel':1,'chassisNumber':1,'engineNumber':1,'manufacturedMonthYear':1,'invoiceNo':1,'invoiceDate':1,'invoiceValue':1,'taxType':1,'taxAmount':1,'officeName':1}")
	Page<TrGeneratedReportDTO> findByTrGeneratedDateAndDealerId(LocalDateTime fromDate,LocalDateTime toDate,String dealerId,Pageable page);

	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':?2 }", fields = "{'vehicleType':1,'taxType':1,'taxAmount':1}")
	List<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeNative(LocalDateTime fromDate,LocalDateTime toDate,String officeCode);
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$in:?2} }", fields = "{'vehicleType':1,'taxType':1,'taxAmount':1}")
	List<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeInNative(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode);
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$in:?2} , 'vehicleType':{$in:?3}}", fields = "{'trGeneratedDate':1,'trNo':1,'applicantDisplayName':1,'classOfVehicleDesc':1,'makersModel':1,'chassisNumber':1,'engineNumber':1,'manufacturedMonthYear':1,'invoiceNo':1,'invoiceDate':1,'invoiceValue':1,'taxType':1,'taxAmount':1,'officeName':1,'dealerId':1}")
	Page<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeInAndVehicleTypeInNative(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode,List<String> vehicleType,Pageable page);
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$nin:?2} , 'dealerId':{$in:?3} }", fields = "{'vehicleType':1,'taxType':1,'taxAmount':1}")
	List<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeNotInNative(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode,List<String> userids);
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$nin:?2} , 'vehicleType':{$in:?3} , 'dealerId':{$in:?4} }", fields = "{'trGeneratedDate':1,'trNo':1,'applicantDisplayName':1,'classOfVehicleDesc':1,'makersModel':1,'chassisNumber':1,'engineNumber':1,'manufacturedMonthYear':1,'invoiceNo':1,'invoiceDate':1,'invoiceValue':1,'taxType':1,'taxAmount':1,'officeName':1,'dealerId':1}")
	Page<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeInAndVehicleTypenInNative(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode,List<String> vehicleType,List<String> dealerIds,Pageable page);
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$in:?2} , 'vehicleType':{$in:?3}}", fields = "{'trGeneratedDate':1,'trNo':1,'applicantDisplayName':1,'classOfVehicleDesc':1,'makersModel':1,'chassisNumber':1,'engineNumber':1,'manufacturedMonthYear':1,'invoiceNo':1,'invoiceDate':1,'invoiceValue':1,'taxType':1,'taxAmount':1,'officeName':1,'dealerId':1}")
	List<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeInAndVehicleTypeInNativeList(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode,List<String> vehicleType);
	
	
	@Query(value = "{ 'trGeneratedDate':{$gte:?0,$lte:?1} , 'officeCode':{$nin:?2} , 'vehicleType':{$in:?3} , 'dealerId':{$in:?4} }", fields = "{'trGeneratedDate':1,'trNo':1,'applicantDisplayName':1,'classOfVehicleDesc':1,'makersModel':1,'chassisNumber':1,'engineNumber':1,'manufacturedMonthYear':1,'invoiceNo':1,'invoiceDate':1,'invoiceValue':1,'taxType':1,'taxAmount':1,'officeName':1,'dealerId':1}")
	List<TrGeneratedReportDTO> findByTrGeneratedDateAndOfficeCodeInAndVehicleTypenInNativeList(LocalDateTime fromDate,LocalDateTime toDate,List<String> officeCode,List<String> vehicleType,List<String> dealerIds);


}
