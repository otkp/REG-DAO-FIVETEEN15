package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.EductaionInstituteVehicleDetailsDto;
import org.springframework.stereotype.Repository;

@Repository
public interface EductaionInstituteVehicleDetailsDao extends BaseRepository<EductaionInstituteVehicleDetailsDto, Serializable>{

	Optional<EductaionInstituteVehicleDetailsDto> findByApplicationNo(String applicationNo);
	
	Optional<EductaionInstituteVehicleDetailsDto> findByprNo(String prNo);
	
	Optional<EductaionInstituteVehicleDetailsDto> findByprNoIgnoreCase(String prNo);
	
	List<EductaionInstituteVehicleDetailsDto> findByUserId(String userId);
	
	Optional<EductaionInstituteVehicleDetailsDto> findBydriverDetailsDlNo(String dlNo);
}
