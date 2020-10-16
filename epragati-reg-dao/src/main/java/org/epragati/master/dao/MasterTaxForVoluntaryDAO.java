package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.MasterTaxForVoluntary;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterTaxForVoluntaryDAO extends BaseRepository<MasterTaxForVoluntary, Serializable>{

	Optional<MasterTaxForVoluntary> findByCovsAndToGvwGreaterThanEqualAndFromGvwLessThanEqualAndStatusTrue(String cov,
			Integer toGvw, Integer fromGvw);
	Optional<MasterTaxForVoluntary> findByCovsAndToUlwGreaterThanEqualAndFromUlwLessThanEqualAndStatusTrue(String cov,
			Integer toUlw, Integer fromUlw);
	Optional<MasterTaxForVoluntary> findByCovsAndToSeatsGreaterThanEqualAndFromSeatsLessThanEqualAndStatusTrue(String cov,
			String toSeats, String fromSeats);
}
