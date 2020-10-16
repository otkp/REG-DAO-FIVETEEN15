package org.epragati.master.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "staging_registration_details")
public class StagingRegistrationDetailsDTO extends RegistrationDetailsDTO implements Serializable , Cloneable{
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