package org.epragati.payments.dao;

import org.epragati.master.dto.SequenceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class AutoIncrementDAOImpl implements AutoIncrementDAO{
	

	private static final Logger logger = LoggerFactory.getLogger(AutoIncrementDAOImpl.class);
	
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Long getNextNumber(String sequenceName, Long startNumber, String officeCode, Integer year) {

		Query query = new Query(
				Criteria.where("seqName").is(sequenceName).and("year").is(year).and("officeCode").is(officeCode));

		return getNextNumber(sequenceName, startNumber, officeCode, year, null,query);
	}

	@Override
	public Long getNextNumber(String sequenceName, Long startNumber, Integer year) {

		synchronized ((sequenceName + year).intern()) {
			Query query = new Query(Criteria.where("seqName").is(sequenceName).and("year").is(year));
			return getNextNumber(sequenceName, startNumber, null, year,null, query);
		}
	}
	
	//VCR application number generation month wise reset.
	@Override
	public Long getNextNumber(String sequenceName, Long startNumber, Integer year, Integer month) {

		synchronized ((sequenceName + year).intern()) {
			Query query = new Query(Criteria.where("seqName").is(sequenceName).and("year").is(year).and("month").is(month));
			return getNextNumber(sequenceName, startNumber, null, year,month, query);
		}
	}
	private Long getNextNumber(String sequenceName, Long startNumber, String officeCode, Integer year, Integer month, Query query) {

		synchronized ((sequenceName + officeCode + year).intern()) {

			Update update = new Update().inc("startNum", 1);

			SequenceDTO sequence = mongoTemplate.findAndModify(query, update, SequenceDTO.class);

			if (sequence == null) {

				sequence = new SequenceDTO(sequenceName, startNumber + 1, officeCode, year,month);
				mongoTemplate.save(sequence);
				return startNumber;
			} else
				return sequence.getStartNum();
		}
	}

	@Override
	public synchronized Long getNextNumber(String sequenceName, Long startNumber, Integer year, Long incrementValue) {
		
		Query query = new Query(Criteria.where("seqName").is(sequenceName).and("year").is(year));
		
		return getNextNumber(sequenceName, startNumber, null, year, query, incrementValue);
	}

	private Long getNextNumber(String sequenceName, Long startNumber, String officeCode, Integer year, Query query,
			Long IncrementValue) {
		
		Update update = new Update().inc("startNum", IncrementValue);
		
		SequenceDTO seq = mongoTemplate.findOne(query, SequenceDTO.class);
		
		SequenceDTO sequence = mongoTemplate.findAndModify(query, update, SequenceDTO.class);
		
		if (sequence == null) {
			
			sequence = new SequenceDTO(sequenceName, startNumber + IncrementValue, officeCode, year, null);
			mongoTemplate.save(sequence);
			return startNumber;
		} else{
			
			if(seq.getStartNum() == sequence.getStartNum()){
				logger.warn("AutoIncrement Updated Manually... [{}] with Increment [{}]",sequence.getStartNum(),IncrementValue);
				return sequence.getStartNum() + IncrementValue;
			}else{
				logger.warn("AutoIncrement Updated ... [{}] with Increment [{}]",sequence.getStartNum(),IncrementValue);
			}
			return sequence.getStartNum();
		}
	}

	@Override
	public void moveToHistory(String sequenceName) {
		
		
		
	}
}
