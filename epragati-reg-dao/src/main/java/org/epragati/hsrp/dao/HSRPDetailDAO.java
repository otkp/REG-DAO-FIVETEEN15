package org.epragati.hsrp.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.dto.HsrpDetailDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface HSRPDetailDAO extends BaseRepository<HsrpDetailDTO, Serializable> {

	Optional<HsrpDetailDTO> findByAuthorizationRefNo(String authorizationRefNo);

	
	List<HsrpDetailDTO> findByRtaStatusAndHsrpStatusIn(Integer rtaStatus, List<Integer> hsrpStatus);

	Optional<HsrpDetailDTO> findByTrNumber(String trNumber);
	
	Optional<HsrpDetailDTO> findByTrNumberAndVehicleClassType(String trNumber,String vehicleClassType);

	Optional<List<HsrpDetailDTO>> findByHsrpStatusAndCreatedDateBetween(Integer hsrpStatus, LocalDateTime fromDate,
			LocalDateTime toDate);
	
	Optional<HsrpDetailDTO> findByPrNumber(String prNumber);


	Optional<HsrpDetailDTO> findByTransactionNo(String applicationNo);
}
