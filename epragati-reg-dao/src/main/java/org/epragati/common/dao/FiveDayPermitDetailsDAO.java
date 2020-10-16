package org.epragati.common.dao;

import org.epragati.permits.dto.PermitDetails_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayPermitDetailsDAO extends BaseRepository<PermitDetails_last5d, String> {

}
