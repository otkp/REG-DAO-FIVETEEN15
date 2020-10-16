package org.epragati.permits.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.permits.dto.PermitClassDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface PermitClassDAO extends BaseRepository<PermitClassDTO, Serializable> {

	List<PermitClassDTO> findByStatusTrueAndRequiredInRenewalTrue();

	List<PermitClassDTO> findByStatusTrueAndReqiredExtensionOfValidityTrue();

	List<PermitClassDTO> findByStatusTrueAndInRlServicesTrue();

	List<PermitClassDTO> findByStatusTrueAndInRlServicesFalse();
	
}
