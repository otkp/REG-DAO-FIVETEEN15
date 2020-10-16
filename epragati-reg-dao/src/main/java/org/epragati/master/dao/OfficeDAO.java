package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DistrictDTO;
import org.epragati.master.dto.OfficeDTO;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeDAO extends BaseRepository<OfficeDTO, Serializable> {

	Optional<OfficeDTO> findByOfficeCode(String officeCode);

	List<OfficeDTO> findByTypeInAndIsActive(List<String> types, Boolean isActive);

	List<OfficeDTO> findBydistrict(Integer district);
	
	List<OfficeDTO> findByTypeIn(List<String> officeCode);
	
	Optional<OfficeDTO> findByOfficeCodeAndIsActiveTrue(String officeCode);

	List<OfficeDTO> findByDistrictAndReportingoffice(Integer district, String reportingoffice);

	@Query(value = "{'type':{$in:?0},'isActive': true}", fields = "{'officeCode':1}")
	List<OfficeDTO> findByTypeAndIsActiveNative(List<String> officeType);

	List<OfficeDTO> findByDistrictAndTypeIn(Integer district, List<String> list);

	Optional<OfficeDTO> findByOfficeCodeIn(Set<String> officeCode);

	List<OfficeDTO> findByReportingoffice(String officeCode);

	//Optional<OfficeDTO> findBydistrict(String officeCode);

	@Query(value = "{'district': ?0}", fields = "{'officeCode':1,'officeName':1}")
	List<OfficeDTO> findBydistrictNative(Integer district);
	
	@Query(value = "{'type':{$in:?0},\"officeCode\" : {$ne:?1},'isActive': ?2}", fields = "{'officeCode':1,'officeName':1,'district':1,'type':1}")
	List<OfficeDTO> findLimitedDataNative(List<String> types,String nreqofficeCode,boolean isActive);

	List<OfficeDTO> findByDistrictIn(List<Integer> district);
	
	List<OfficeDTO> findByIsActiveTrueAndDistrict(Integer district);

	List<OfficeDTO> findByOfficeCodeIn(List<String> listOfOfficeCodes);

	List<OfficeDTO> findByDistrict(Integer districtId);
}
