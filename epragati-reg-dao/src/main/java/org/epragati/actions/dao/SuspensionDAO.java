package org.epragati.actions.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.actions.dto.RCActionsDTO;
import org.epragati.common.dao.BaseRepository;
import org.epragati.util.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface SuspensionDAO extends BaseRepository<RCActionsDTO, Serializable> {
	List<RCActionsDTO> findByActionStatusOrderByRcActionsDetailsActionDateDesc(Status.RCActionStatus actionStatus);

	Optional<RCActionsDTO> findOneByPrNoOrderByRcActionsDetailsActionDateDesc(String prNo);

	List<RCActionsDTO> findByActionStatusAndOfficeCode(Status.RCActionStatus actionStatus, String officeCode);

	List<RCActionsDTO> findByActionStatusAndOfficeCodeAndPrNoIn(Status.RCActionStatus actionStatus, String officeCode,
			List<String> prNos);

	Page<RCActionsDTO> findByRcActionsDetailsFromDateBetweenAndOfficeCodeAndActionStatusIn(LocalDate fromDate,
			LocalDate toDate, String officeCode, List<String> reportStatus, Pageable page);

	Page<RCActionsDTO> findByRcActionsDetailsFromDateBetweenAndOfficeCodeAndRcActionsDetailsActionByAndActionStatusIn(
			LocalDate fromDate, LocalDate toDate, String officeCode, String userId, List<String> reportStatus,
			Pageable page);

	Optional<RCActionsDTO> findByPrNoOrderByLUpdateDesc(String prNo);

}