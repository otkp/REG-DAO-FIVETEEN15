package org.epragati.permits.dao;

import org.epragati.common.dao.BaseRepository;
import org.epragati.common.dto.RegistrationDetails_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayRegistrationDetailDAO extends BaseRepository<RegistrationDetails_last5d, String> {

}
