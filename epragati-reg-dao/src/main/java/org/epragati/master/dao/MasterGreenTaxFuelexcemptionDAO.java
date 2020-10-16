package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterGreenTaxFuelexcemption;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterGreenTaxFuelexcemptionDAO extends BaseRepository<MasterGreenTaxFuelexcemption, Serializable>{

	Optional<MasterGreenTaxFuelexcemption> findByFuelTypeIn(String fuelType);
}
