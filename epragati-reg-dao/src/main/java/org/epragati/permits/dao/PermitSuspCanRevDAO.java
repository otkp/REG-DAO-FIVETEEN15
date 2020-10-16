package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitSuspCanRevDTO;
import org.epragati.util.Status;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitSuspCanRevDAO extends BaseRepository<PermitSuspCanRevDTO, Serializable>{

	Optional<PermitSuspCanRevDTO> findOneByPrNoOrderByPermitActionsActionDateDesc(String prNo);
	
	List<PermitSuspCanRevDTO> findByActionStatusAndOfficeCode(Status.RCActionStatus actionStatus,String officeCode);
	
	List<PermitSuspCanRevDTO> findByActionStatusAndOfficeCodeAndPrNoIn(Status.RCActionStatus actionStatus,String officeCode,List<String> prNos);
	
}
