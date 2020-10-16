package org.epragati.common.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.payment.dto.ChalanaDetailsDTO;

public interface ChalanDetailsDAO extends BaseRepository<ChalanaDetailsDTO, Serializable>{

	List<ChalanaDetailsDTO> findByChalanaNoIn(List<Long> challanSeries);

}
