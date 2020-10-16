package org.epragati.common.dto;

import java.io.Serializable;

import org.epragati.master.dto.RegistrationDetailsDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SAS_staging_registration_details")
public class StagingRegistrationDetails_last5d extends RegistrationDetailsDTO implements Serializable , Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}