package org.epragati.sn.numberseries.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.constants.CovCategory;
import org.epragati.sn.numberseries.dto.PRPoolDTO;
import org.epragati.util.BidNumberType;
import org.epragati.util.NumberPoolStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface PRPoolDAO extends BaseRepository<PRPoolDTO, Serializable> {

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusInAndPrSeriesIdAndNumberTypeNot(String officeCode,
			CovCategory regType, List<NumberPoolStatus> poolStatuses, String prSeriesId, String numberType,
			Pageable pageable);

	Optional<PRPoolDTO> findByOfficeCodeAndRegTypeAndPrNumberAndPrSeries(String officeCode, CovCategory regType,
			Integer prNumber, String prSeries);

	Optional<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusNotInAndPrNumberAndPrSeries(String officeCode,
			CovCategory regType, List<NumberPoolStatus> poolStatuses, Integer prNumber, String prSeries);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusNotInAndPrSeriesAndPrNumberLessThan(String officeCode,
			CovCategory regType, List<NumberPoolStatus> poolStatuses, String prSeries, Integer prNumber);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusAndPrSeries(String officeCode, CovCategory regType,
			NumberPoolStatus poolStatuses, String prSeries);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusAndPrSeriesAndNumberType(String officeCode,
			CovCategory regType, NumberPoolStatus poolStatuses, String prSeries, BidNumberType numType);

	Optional<PRPoolDTO> findByPrNo(String prNo);

	Page<PRPoolDTO> findByOfficeCodeAndRegTypeAndPrSeriesAndPoolStatusNotInAndPrNumberGreaterThan(String officeCode,
			CovCategory regType, String prSeries, NumberPoolStatus poolStatus, Integer prNumber, Pageable pageable);

	Integer countByOfficeCodeAndRegTypeAndPrSeriesAndPoolStatusInAndPrNumberGreaterThan(String officeCode,
			CovCategory regType, String prSeries, NumberPoolStatus poolStatus, Integer prNumber);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusAndNumberType(String officeCode, CovCategory regType,
			NumberPoolStatus poolStatuses, BidNumberType numType);

	List<PRPoolDTO> findByBidProcessStatusAndBidParticipantsNotNull(NumberPoolStatus.BidProcessStatus bidProcessStatus);

	List<PRPoolDTO> findByOfficeNumberSeriesAndPrSeriesAndPrNumberBetween(String officeNumberSeries, String prSeries,
			int from, int to);

	List<PRPoolDTO> findByPrSeriesIdAndPrNumberBetween(String prSeriesId, int fromNumber, int toNumber,
			Pageable pageable);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusInAndPrSeriesIdAndNumberTypeNot(String officeCode,
			CovCategory covCategory, List<NumberPoolStatus> poolStatus, String prSeriesId, String code);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusNotInAndPrSeriesAndNumberTypeNotAndPrNumberLessThan(
			String officeCode, CovCategory regType, List<NumberPoolStatus> poolStatuses, String prSeries, String code,
			Integer prNumber);

	Integer countByOfficeCodeAndRegTypeAndPrSeriesAndPoolStatusInAndNumberTypeNot(String officeCode, CovCategory regType,
			String prSeries, List<NumberPoolStatus> asList, BidNumberType numberType);

	int countByOfficeCodeAndRegTypeAndPrSeriesIdAndAndPoolStatusNotIn(String officeCode, CovCategory regType,
			String prSeriesId, List<NumberPoolStatus> asList);

	List<PRPoolDTO> findByOfficeCodeAndRegTypeAndPoolStatusNotInAndPrSeries(String officeCode, CovCategory regType,
			List<NumberPoolStatus> asList, String prSeries);
	
	int countByOfficeCodeAndPrSeriesIdAndNumberTypeAndPoolStatus(String officeCode, String prSeries, String numberType,NumberPoolStatus status);

	int countByOfficeCodeAndRegTypeAndPrSeriesIdAndPrNumberGreaterThanAndPoolStatusNotIn(String officeCode,
			CovCategory regType, String prSeriesId, Integer currentNumber, List<NumberPoolStatus> asList);
	
	

}
