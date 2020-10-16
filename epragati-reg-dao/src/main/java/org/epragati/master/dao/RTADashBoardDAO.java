package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.RTADashboardDTO;
import org.epragati.util.RoleEnum;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Repository
public interface RTADashBoardDAO  extends BaseRepository<RTADashboardDTO, Serializable> {

	Optional<RTADashboardDTO> findByRole(RoleEnum role);
}
