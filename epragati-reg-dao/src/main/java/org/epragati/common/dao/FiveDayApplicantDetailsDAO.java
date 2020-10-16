package org.epragati.common.dao;

import org.epragati.common.dto.ApplicantDetails_last5d;
import org.springframework.stereotype.Repository;

@Repository
public interface FiveDayApplicantDetailsDAO extends BaseRepository<ApplicantDetails_last5d, String> {

}
