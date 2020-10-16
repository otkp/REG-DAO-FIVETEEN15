package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.ClassOfVehicleConversion;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassOfVehicleConversionDAO extends BaseRepository<ClassOfVehicleConversion, Serializable>{

	List<ClassOfVehicleConversion> findByCovAndNewCategory(String cov , String newCategory);
	
	
	
	Optional<ClassOfVehicleConversion> findByNewCovAndNewCategoryAndCovAndCategory(String newCov , String newCategory,String cov,String category);
}
