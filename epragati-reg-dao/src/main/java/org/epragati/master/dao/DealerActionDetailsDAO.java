package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerActionDetailsDTO;
import org.epragati.util.StatusRegistration;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerActionDetailsDAO extends BaseRepository<DealerActionDetailsDTO, Serializable> {

	Optional<DealerActionDetailsDTO> findByDealerUserIdOrderByLUpdateDesc(String dealerUserId);

	Optional<DealerActionDetailsDTO> findByDealerUserIdAndApplicationStatusOrderByLUpdateDesc(String userId,
			StatusRegistration revoked);

	List<DealerActionDetailsDTO> findByApplicationStatus(StatusRegistration suspend);

	List<DealerActionDetailsDTO> findByApplicationStatusOrderByLUpdateDesc(StatusRegistration suspend);

}
