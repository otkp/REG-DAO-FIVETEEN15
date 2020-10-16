package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.ApprovalProcessFlowDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalProcessFlowDAO extends BaseRepository<ApprovalProcessFlowDTO, Serializable> {

	Optional<ApprovalProcessFlowDTO> findByServiceIdAndRole(Integer servicesId, String role);

	List<ApprovalProcessFlowDTO> findByServiceId(Integer servicesId);

	Optional<ApprovalProcessFlowDTO> findByServiceIdAndRoleAndIsFinalTrue(Integer serviceId, String role);
}
