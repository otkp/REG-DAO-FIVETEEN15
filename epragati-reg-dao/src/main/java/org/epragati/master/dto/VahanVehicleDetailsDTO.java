package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "vahan_vehicle_details")
public class VahanVehicleDetailsDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4023587894244052098L;

	@Id
	private String id;
}
