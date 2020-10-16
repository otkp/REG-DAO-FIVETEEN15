package org.epragati.regservice.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.TokenAuthenticationDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenAuthenticationDAO extends BaseRepository<TokenAuthenticationDTO, Serializable> {

	Optional<TokenAuthenticationDTO> findByHash(String hash);

	List<TokenAuthenticationDTO> findByExpirationDateLessThanEqual(LocalDateTime time);

}