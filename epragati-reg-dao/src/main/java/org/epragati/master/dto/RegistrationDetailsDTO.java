package org.epragati.master.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registration_details")
public class RegistrationDetailsDTO extends BaseRegistrationDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2049605922960067126L;

}