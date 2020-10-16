package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.sn.numberseries.dto.PremiumNumbersDTO;
import org.epragati.util.RecordStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimesNumbersDAO extends BaseRepository<PremiumNumbersDTO, Serializable> {

	Optional<PremiumNumbersDTO> findByPrimeNumberAndPrimeStatus(Integer primeNumber, RecordStatus primeStatus);
}
