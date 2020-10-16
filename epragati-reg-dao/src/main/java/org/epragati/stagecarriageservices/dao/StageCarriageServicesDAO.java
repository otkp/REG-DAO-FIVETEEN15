package org.epragati.stagecarriageservices.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.epragati.common.dao.BaseRepository;
import org.epragati.stagecarriages.dto.MasterStageCarriagesServicesDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface StageCarriageServicesDAO extends BaseRepository<MasterStageCarriagesServicesDTO, Serializable> {

	
	List<MasterStageCarriagesServicesDTO> findByStatusTrue();
	Optional<MasterStageCarriagesServicesDTO> findByServiceIdIn(Set<Integer> serviceIds);
}
