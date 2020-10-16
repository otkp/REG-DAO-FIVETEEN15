package org.epragati.vcrImage.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.vcrImage.dto.TreasuryDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TreasuryDAO extends BaseRepository<TreasuryDTO, Serializable> {

	List<TreasuryDTO> findByOfficeCodeIn(List<String> officeCode);
	
	List<TreasuryDTO> findByOfficeCodeNotIn(List<String> officeCode);

}
