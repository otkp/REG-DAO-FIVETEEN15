package org.epragati.cfst.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.cfst.dto.ElasticSecondVehicleDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ElasticSecondVehicleDAO extends BaseRepository<ElasticSecondVehicleDTO, Serializable> {
	List<ElasticSecondVehicleDTO> findByPrNumberIn(List<String> prnumbers);

	List<ElasticSecondVehicleDTO> findByIsSynchStatusFalse();

	Page<ElasticSecondVehicleDTO> findByDistrictAndIsSynchStatusFalse(Pageable page, String district);

	Optional<ElasticSecondVehicleDTO> findByPrNumber(String prNumber);

	List<ElasticSecondVehicleDTO> findByIsTowDoneTrue();

}
