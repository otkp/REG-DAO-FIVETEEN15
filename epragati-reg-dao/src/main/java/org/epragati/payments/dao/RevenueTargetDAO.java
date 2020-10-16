package org.epragati.payments.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.RevenueTargetDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueTargetDAO extends BaseRepository<RevenueTargetDTO, Serializable> {

	List<RevenueTargetDTO> findByYearAndMonthIn(Integer month, List<Integer> months);

}
