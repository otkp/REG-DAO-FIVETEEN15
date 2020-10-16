package org.epragati.common.dto;

import java.io.Serializable;

import org.epragati.master.dto.BaseRegistrationDetailsDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SAS_registration_details")
public class RegistrationDetails_last5d extends BaseRegistrationDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2049605922960067126L;

}