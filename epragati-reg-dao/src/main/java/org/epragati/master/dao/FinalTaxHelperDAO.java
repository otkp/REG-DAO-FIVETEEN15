package org.epragati.master.dao;

import java.io.Serializable;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.master.dto.FinalTaxHelper;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalTaxHelperDAO extends BaseRepository<FinalTaxHelper, Serializable>{
	
	Optional<FinalTaxHelper> findByPrNoInAndStatusIsTrue(String prNo);

	Optional<FinalTaxHelper> findByDistricCodeInAndCovInAndStatusIsTrue(Integer districCode,String cov);
	
	Optional<FinalTaxHelper> findByOfficeCodeInAndCovInAndStatusIsTrue(String officeCode,String cov);
	
	Optional<FinalTaxHelper> findBytrNoInAndStatusIsTrue(String trNo);
	
	Optional<FinalTaxHelper> findByPrNoInAndWeightAltIsTrue(String prNo);
}
