package org.epragati.regservice.dto;


import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_trailer_capacity")
public class TrailerCapacityDTO  extends TrailerCapacityLogDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -529681771624316255L;

}
