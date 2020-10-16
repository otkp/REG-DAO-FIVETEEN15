package org.epragati.dao.enclosure;

import java.util.List;

import org.epragati.common.dao.BaseRepository;
import org.epragati.payment.dto.Enclosures;
import org.springframework.stereotype.Repository;


@Repository
public interface EnclosurDAO extends BaseRepository<Enclosures, String>{
	
	List<Enclosures> findByServiceID(int serviceId);

}
