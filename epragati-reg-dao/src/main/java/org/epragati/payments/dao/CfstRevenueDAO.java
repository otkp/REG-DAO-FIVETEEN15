package org.epragati.payments.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.CfstRevenueDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CfstRevenueDAO extends BaseRepository<CfstRevenueDTO, Serializable> {

	List<CfstRevenueDTO> findByTransactionDateBetweenAndDistrictCode(LocalDateTime fromDate, LocalDateTime toDate,
			Integer distCode);

	List<CfstRevenueDTO> findByTransactionDateBetweenAndOfficeCodeIn(LocalDateTime fromDate, LocalDateTime toDate,
			List<String> officeCodes);

}
