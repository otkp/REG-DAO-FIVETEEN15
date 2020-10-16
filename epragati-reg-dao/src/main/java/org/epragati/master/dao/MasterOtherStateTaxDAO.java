package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterOtherStateTaxDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterOtherStateTaxDAO extends BaseRepository<MasterOtherStateTaxDTO, Serializable>{

	Optional<MasterOtherStateTaxDTO>findByCovcodeInAndUlwtoGreaterThanEqualAndUlwfromLessThanEqualAndMonthsIn(String covcode ,Integer ulwto ,Integer ulwfrom , Integer months);
}
