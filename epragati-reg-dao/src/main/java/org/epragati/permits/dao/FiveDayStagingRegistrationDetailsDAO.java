package org.epragati.permits.dao;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.dto.StagingRegistrationDetails_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayStagingRegistrationDetailsDAO extends BaseRepository<StagingRegistrationDetails_last5d, String> {

}
