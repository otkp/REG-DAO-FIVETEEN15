package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerCovDTO;

/**
 *
 * @author saikiran.kola
 *
 */
public interface DealerCovDAO extends BaseRepository<DealerCovDTO, Serializable> {
	/**
	 * get all DealerCov data
	 */

	@Override
	public List<DealerCovDTO> findAll();

	/**
	 * find DealerCov data based on covId
	 *
	 * @param covId
	 * @return
	 */
	public Optional<DealerCovDTO> findBycovId(Integer covId);

	/**
	 * find DealerCov data based on dcId and RId
	 *
	 * @param dcId
	 * @param rId
	 * @return
	 */
	public Optional<DealerCovDTO> findBydcIdAndRId(Integer dcId, Integer rId);
	/**
	 * 
	 * @return
	 */
	List<DealerCovDTO> findByRIdAndStatusTrue(Integer dealerUserId);

	public List<DealerCovDTO> findByRId(Integer rid);

	public List<DealerCovDTO> findByCovIdInAndRIdAndStatusTrue(List<String> trailesCovs, Integer dealerId);

}
