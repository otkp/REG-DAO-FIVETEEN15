package org.epragati.dealer.tradecert;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerTradeCertificateNewDAO extends BaseRepository<DealerTradeCertificateNewDto, Serializable> {

	Optional<DealerTradeCertificateNewDto> findByUserId(String name);

	Optional<DealerTradeCertificateNewDto> findByTradeCertificateCommonNumber(String commonNumber);

	
}
