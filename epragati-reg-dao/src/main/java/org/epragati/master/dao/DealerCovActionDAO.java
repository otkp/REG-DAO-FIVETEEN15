package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.DealerCovActionDTO;


/**
 *
 *
 * @author saikiran.kola
 *
 */

public interface DealerCovActionDAO extends BaseRepository<DealerCovActionDTO, Serializable> {
	/**
	 * get DealerCov Action data based on ActionBy
	 * @param action
	 * @return
	 */

	public DealerCovActionDTO findByactionBy(String action);

	/**
	 * find DealerCoVAction data based on role
	 * @param role
	 * @return
	 */
	public Optional<DealerCovActionDTO> findByrole(Integer role);

	/**
	 * find DelaerCovAction data based on Role and Action
	 * @param role
	 * @param action
	 * @return
	 */
	public Optional<DealerCovActionDTO> findByRoleAndAction(Integer role,Integer action);

}
