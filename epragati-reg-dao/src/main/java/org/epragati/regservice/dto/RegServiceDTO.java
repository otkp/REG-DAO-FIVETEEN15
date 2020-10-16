package org.epragati.regservice.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Document(collection = "registration_services")
public class RegServiceDTO extends RegServiceApprovedDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6276831218646786937L;}
