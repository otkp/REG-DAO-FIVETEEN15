package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinanceSeedDetailsDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceSeedDetailsDAO extends BaseRepository<FinanceSeedDetailsDTO,Serializable> {

	List<FinanceSeedDetailsDTO> findByStatusAndOfficeCode(String description, String officeCode);

	List<FinanceSeedDetailsDTO> findByOfficeCodeAndStatusIn(String officeCode, List<String> asList);

}
