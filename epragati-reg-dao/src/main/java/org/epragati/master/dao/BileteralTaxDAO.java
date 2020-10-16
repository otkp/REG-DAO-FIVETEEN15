package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.BileteralTaxDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface BileteralTaxDAO extends BaseRepository<BileteralTaxDTO, Serializable>{

	Optional<BileteralTaxDTO> findByPrNoAndStatusIsTrue(String prNo);
	Optional<BileteralTaxDTO> findByApplicationNo(String applicationNo);
}
