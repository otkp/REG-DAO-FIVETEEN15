package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.constants.CovCategory;
import org.epragati.sn.dto.PRDistrictConfigDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PRDistrictConfigDAO extends BaseRepository<PRDistrictConfigDTO, Serializable> {

	Optional<PRDistrictConfigDTO> findByOfficeNumberSeriesAndVehicleType(String officeNumberSeries , CovCategory vehicleType);
	Optional<PRDistrictConfigDTO> findByGenerationTypeAndVehicleType(String officeNumberSeries , CovCategory vehicleType);
	
}
