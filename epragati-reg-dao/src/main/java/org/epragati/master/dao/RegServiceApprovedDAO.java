package org.epragati.master.dao;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.regservice.dto.RegServiceApprovedDTO;
/**
 * 
 * @author naga.pulaparthi
 *
 */
public interface RegServiceApprovedDAO extends BaseRepository<RegServiceApprovedDTO, Serializable>{

	List<RegServiceApprovedDTO> findByRegistrationDetailsApplicationNoAndServiceIds(String applicationNo,Integer serviceIds);
}
