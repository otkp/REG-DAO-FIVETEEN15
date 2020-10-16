package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RegistrationDetailsLogDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationDetailLogDAO extends BaseRepository<RegistrationDetailsLogDTO, Serializable> {

	Optional<RegistrationDetailsLogDTO> findTopByRegiDetailsApplicationNoOrderByLogCreatedDateTimeDesc(
			String applicationNo);

	Optional<RegistrationDetailsLogDTO> findTopByRegiDetailsPrNoAndRegiDetailsMovedSourceOrderByLogCreatedDateTimeDesc(
			String prNo, String aadharseeding);

	List<RegistrationDetailsLogDTO> findAllByRegiDetailsPrNoIn(List<String> prNO);
}
