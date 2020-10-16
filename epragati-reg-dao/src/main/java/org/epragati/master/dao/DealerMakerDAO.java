package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerMakerDTO;

/**
 *
 * @author saikiran.kola
 *
 */
public interface DealerMakerDAO extends BaseRepository<DealerMakerDTO, Serializable> {

	/**
	 * Find Dealers Based On MandalDTO
	 *
	 * @param mandalId
	 * @return
	 */
	public Optional<DealerMakerDTO> findBymmId(String mandalId);

	List<DealerMakerDTO> findByRIdAndStatusTrue(Integer dealerUserId);

	public Optional<DealerMakerDTO> findByRId(Integer rId);

}
