package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MakersDTO;

/**
 *
 * @author saikiran.kola
 *
 */
public interface MakersDAO extends BaseRepository<MakersDTO, Serializable> {
	/**
	 * 
	 * @param mmId
	 * @return
	 */
	List<MakersDTO> findByStatusTrueAndMidIn(List<Integer> mmId);
	
	List<MakersDTO> findByStatusTrue();
	
	 public Optional<MakersDTO> findBymid(Integer mId);

	List<MakersDTO> findByMidInAndStatusTrue(List<Integer> mmIdList);
	
	Optional<MakersDTO> findTop1ByOrderByMidDesc();
	
	Optional<MakersDTO> findByMakername(String makername);
	
	
}