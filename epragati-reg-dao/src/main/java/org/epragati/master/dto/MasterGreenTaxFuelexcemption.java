package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_greenTax_fuelexcemption")
public class MasterGreenTaxFuelexcemption extends BaseEntity {

	private List<String> fuelType;

	/**
	 * @return the fuelType
	 */
	public List<String> getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(List<String> fuelType) {
		this.fuelType = fuelType;
	}	
	
	
}
