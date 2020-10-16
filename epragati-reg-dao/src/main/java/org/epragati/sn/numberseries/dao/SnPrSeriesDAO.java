package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.constants.CovCategory;
import org.epragati.sn.numberseries.dto.PRNumberSeriesConfigDTO;
import org.epragati.util.RecordStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface SnPrSeriesDAO extends BaseRepository<PRNumberSeriesConfigDTO, Serializable> {

	Optional<PRNumberSeriesConfigDTO> findByOfficeCodeAndRegTypeAndSeriesStatus(String officeCode, CovCategory regType, RecordStatus seriesStatus);
	
	Optional<PRNumberSeriesConfigDTO> findByOfficeCodeAndRegTypeAndPrSeries(String officeCode, CovCategory regType, String prSeries);
	Optional<PRNumberSeriesConfigDTO> findByOfficeCodeAndRegTypeAndCurrentDateAndSeriesStatus(String officeCode, CovCategory regType, LocalDate today,RecordStatus seriesStatus);
	List<PRNumberSeriesConfigDTO> findByOfficeCodeAndRegTypeAndSeriesStatusIn(String officeCode, CovCategory regType,List<RecordStatus> seriesStatusList);
	
	
}
