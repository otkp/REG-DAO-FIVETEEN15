package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.OffenceDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface OffenceDAO extends BaseRepository<OffenceDTO, Serializable> {
	
	List<OffenceDTO> findByClassOfVehiclesAndCategory(String classOfVehicles, String category);
	
	Optional<OffenceDTO>findByOffenceDescriptionAndStatusTrue(String offenceDescription);
	
	List<OffenceDTO> findByClassOfVehiclesAndCategoryOrWeight(String classOfVehicles, String category,String weight);
	
	List<OffenceDTO> findByClassOfVehiclesAndCategoryAndWeightInOrderByPriorityAsc(String classOfVehicles, String category,List<String> weight);//Priority

}
