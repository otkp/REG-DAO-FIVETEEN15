package org.epragati.master.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.StatusDTO;

/**
 *
 * @author saikiran.kola
 *
 */
public interface StatusDAO extends BaseRepository<StatusDTO, Serializable> {
	/**
	 * get all Status data
	 */

	public List<StatusDTO> findAll();

	/**
	 * find Status data based on Created date
	 *
	 * @param date
	 * @return
	 */
	public Optional<StatusDTO> findBycreatedDate(Timestamp date);

	/**
	 * get all Status data based on Id and Status
	 *
	 * @param sId
	 * @param status
	 * @return
	 */
	public Optional<StatusDTO> findBysIdAndStatus(Integer sId, Integer status);
}
