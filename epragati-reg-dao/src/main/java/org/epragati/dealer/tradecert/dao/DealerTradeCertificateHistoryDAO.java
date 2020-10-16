package org.epragati.dealer.tradecert.dao;

import java.io.Serializable;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dealer.tradecert.dto.DealerTradeCertificateHistoryDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerTradeCertificateHistoryDAO extends BaseRepository<DealerTradeCertificateHistoryDTO, Serializable>{

}
