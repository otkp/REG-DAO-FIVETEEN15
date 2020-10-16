package org.epragati.reports.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.epragati.common.dao.BaseRepository;
import org.epragati.reports.dto.RegistrationCountReportDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationCountReportDAO extends BaseRepository<RegistrationCountReportDTO, Serializable> {
	
	String DISTID="distId";
	String OFFICECODE="officeCode";
	String COUNTDATE="countDate";
	String COUNT="count";
	String VEHICLETYPE="vehicleType";
	String OFFICENAME="officeName";
	String GROUPCATEGORY="groupCategory";
	String COVDESCRIPTION="covdescription";
	String COVCODE="covcode";
	
	Optional<RegistrationCountReportDTO> findByOfficeCodeAndCovcodeAndCountDate(String officeCode,String covcode,LocalDate countCaluclatedDate);
	
	List<RegistrationCountReportDTO> findByCountDate(LocalDate countDate);
	
	List<RegistrationCountReportDTO> findByDistIdAndCountDateOrderByOfficeCode(Integer distId,LocalDate countDate);
	List<RegistrationCountReportDTO> findByOfficeCodeAndCountDateOrderByOfficeCode(String officeCode,LocalDate countDate);

	default Aggregation getGroupWiseCountAggregation(String officeCode,String vehicleType, LocalDate countDate) {
		Aggregation agg = newAggregation(

				match(Criteria.where(OFFICECODE).is(officeCode).and(VEHICLETYPE).is(vehicleType).and(COUNTDATE).is(countDate)),
			group(GROUPCATEGORY).sum(COUNT).as(COUNT),
				project(COUNT).and(GROUPCATEGORY).previousOperation(),
				sort(Sort.Direction.ASC, GROUPCATEGORY)

		);
		return agg;
	}
//	/COVDESCRIPTION,COVCODE

	default Aggregation getAllfiledsWiseCountAggregation(String officeCode,String vehicleType,LocalDate countDate,String groupCategory) {	
		Aggregation agg = newAggregation(
				match(Criteria.where(OFFICECODE).is(officeCode).and(VEHICLETYPE).is(vehicleType).and(GROUPCATEGORY).is(groupCategory).and(COUNTDATE).is(countDate)),
				group(COVDESCRIPTION).sum(COUNT).as(COUNT),
				project(COUNT).and(COVDESCRIPTION).previousOperation(),
				sort(Sort.Direction.ASC, COVDESCRIPTION)

				);
		return agg;
	}
}
