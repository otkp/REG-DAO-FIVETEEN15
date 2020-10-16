package org.epragati.cfst.dao;

import java.io.Serializable;

import org.epragati.cfst.dto.CfstNonPaymentSkipRecordsDTO;
import org.epragati.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CfstNonPaymentSkipRecordsDAO extends BaseRepository<CfstNonPaymentSkipRecordsDTO, Serializable>{
	
}
