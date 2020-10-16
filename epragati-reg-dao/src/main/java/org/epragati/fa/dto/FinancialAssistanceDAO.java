package org.epragati.fa.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface FinancialAssistanceDAO extends BaseRepository<FinancialAssistanceDTO, Serializable> {

	Optional<FinancialAssistanceDTO> findByAadharNo(String aadharNo);
	
	Optional<FinancialAssistanceDTO> findByApplicationNumber(String applicationNumber);
	@Query(value="{'vehicleDetails.officeCode':?0,currentRole:?1,lockedDetails:{$exists:false}}")
	List<FinancialAssistanceDTO> findByVehicleDetailsOfficeCodeAndCurrentRole(String officeCode,
			String currentRole);
	
	Optional<FinancialAssistanceDTO> findByPersonalDetailsAadharNo(String aadharNo);
	
	@Query(value="{'personalDetails.presentAddress.district.districtName':?0}")
	List<FinancialAssistanceDTO> findByPersonalDetailsAddressDistrict(String district);
	
	@Query(value="{'personalDetails.presentAddress.district.districtName':?0,personalDetails.presentAddress.mandal.mandalName:?1}")
	List<FinancialAssistanceDTO> findByPersonalDetailsAddressDistrictAndPersonalDetailsAddressMandal(String district,
			String mandal);
	
	@Query(value="{'personalDetails.presentAddress.district.districtName':?0,personalDetails.presentAddress.mandal.mandalName:?1,personalDetails.presentAddress.village.villageName:?2}")
	List<FinancialAssistanceDTO> findByPersonalDetailsAddressDistrictAndPersonalDetailsAddressMandalAndVillage(String district,
			String mandal,String village);
}
