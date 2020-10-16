package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="master_tax_fueltype_excemption")
public class MasterTaxFuelTypeExcemptionDTO  extends BaseEntity implements Serializable {

private static final long serialVersionUID = 1L;

private String id;
private List<String> fuelType;
private Map<String, Integer> noOfYears;
private List<String> erktAndEcrtfuelType;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
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
public Map<String, Integer> getNoOfYears() {
	return noOfYears;
}
public void setNoOfYears(Map<String, Integer> noOfYears) {
	this.noOfYears = noOfYears;
}
public List<String> getErktAndEcrtfuelType() {
	return erktAndEcrtfuelType;
}
public void setErktAndEcrtfuelType(List<String> erktAndEcrtfuelType) {
	this.erktAndEcrtfuelType = erktAndEcrtfuelType;
}



}
