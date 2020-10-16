package org.epragati.stagecarriageservices.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.stagecarriages.dto.MasterStageCarriageTaxDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterStageCarriageTaxDAO extends BaseRepository<MasterStageCarriageTaxDTO, Serializable> {

	Optional<MasterStageCarriageTaxDTO> findByPrNoAndStatusIsTrue(String prNo);
	
}
