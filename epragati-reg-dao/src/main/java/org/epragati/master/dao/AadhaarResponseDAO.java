package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;
import java.util.UUID;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.AadhaarDetailsResponseDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarResponseDAO extends BaseRepository<AadhaarDetailsResponseDTO, Serializable> {

	Optional<AadhaarDetailsResponseDTO> findByUuId(UUID uuId);

	/**
	 * 
	 * @param uidToken
	 * @return
	 */
	Optional<AadhaarDetailsResponseDTO> findByUidToken(String uidToken);
	
	
	Optional<AadhaarDetailsResponseDTO> findByUid(Long aadhaarNo);
	
}
