package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.ClassOfVehiclesDTO;

public interface ClassOfVehiclesDAO extends BaseRepository<ClassOfVehiclesDTO, Serializable>{

	ClassOfVehiclesDTO findByCovcode(String classOfVehicle);
	List<ClassOfVehiclesDTO> findByCategory(String category);
	List<ClassOfVehiclesDTO> findByCategoryAndIsUnRegistered(String category, boolean isUnRegistered);
	List<ClassOfVehiclesDTO> findByCategoryAndIsRegistered(String category, boolean isRegistered);
	ClassOfVehiclesDTO findByCovdescription(String covdescription);
	
	List<ClassOfVehiclesDTO> findByCategoryAndVoluntaryCovTrue (String category);
}
