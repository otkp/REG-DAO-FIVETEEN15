package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerRegDTO;
import org.epragati.util.StatusRegistration;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerRegDAO extends BaseRepository<DealerRegDTO, Serializable> {

	Optional<DealerRegDTO> findByApplicationNo(String applicationNo);

	Optional<DealerRegDTO> findByGstnDataGstinNoOrderByCreatedDateDesc(String gstnNo);

	List<DealerRegDTO> findByOfficeCodeInAndServiceIdsInAndApplicationStatusIn(List<String> officeCodesList,
			List<Integer> asList, List<StatusRegistration> statusList);

	List<DealerRegDTO> findByLockedDetailsLockedByAndLockedDetailsLockedByRoleAndIsMVIDoneFalse(String userId,
			String name);

	Optional<DealerRegDTO> findByDealerUserIdOrderByCreatedDate(String dealerUserId);

	List<DealerRegDTO> findByOfficeCodeInAndServiceIdsInAndApplicationStatusInAndIsMVIDoneFalse(
			List<String> officeCodesList, List<Integer> asList, List<StatusRegistration> statusList);

	List<DealerRegDTO> findByOfficeCodeInAndServiceIdsInAndApplicationStatusInAndIsMVIDoneTrue(
			List<String> officeCodesList, List<Integer> asList, List<StatusRegistration> statusList);

}
