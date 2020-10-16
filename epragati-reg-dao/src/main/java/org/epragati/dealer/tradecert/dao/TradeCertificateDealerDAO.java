package org.epragati.dealer.tradecert.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.dealer.tradecert.TradeCertificateDealerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeCertificateDealerDAO extends BaseRepository<TradeCertificateDealerDto, Serializable> {

	Optional<TradeCertificateDealerDto> findByUserId(String name);

	Optional<TradeCertificateDealerDto> findByTradeCertificateID(String id);

	List<TradeCertificateDealerDto> findByCommonNumber(String no);

	List<TradeCertificateDealerDto> findByUserIdAndCovAndPaymentStatusIn(String name, String cov, List<String> status);

	Page<TradeCertificateDealerDto> findByUserIdOrderByCreatedDateDesc(String name, Pageable pagable);

	List<TradeCertificateDealerDto> findByUserIdAndTradeValidityStatus(String name, String status);

	Optional<TradeCertificateDealerDto> findByUserIdAndTradeCertificateID(String user, String id);

	/**
	 * applying pagiation
	 */

	Page<TradeCertificateDealerDto> findByUserIdAndPaymentStatusOrderByCreatedDateDesc(String name, String PaymentStaus,
			Pageable pagable);

	Page<TradeCertificateDealerDto> findByUserIdAndPaymentStatusInOrderByCreatedDateDesc(String name,
			List<String> PaymentStaus, Pageable pagable);
}
