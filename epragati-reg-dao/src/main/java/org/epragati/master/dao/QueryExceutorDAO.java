package org.epragati.master.dao;

import org.epragati.master.dto.QueryExecutionDetailsDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

/*@Repository
public interface QueryExceutorDAO extends BaseRepository<QueryExecutionDetailsDTO, Serializable> {

}
*/

public interface QueryExceutorDAO extends MongoRepository<QueryExecutionDetailsDTO,String> {


}
