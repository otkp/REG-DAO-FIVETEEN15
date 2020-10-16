package org.epragati.vahan.sync.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="master_nic_vehicle_validations")
public class VahanSyncVehicleCategoryMappingDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4405725786234266003L;
	
	private List<String> covCode;
	
	private Integer fromGvw;
	
	private Integer toGvw; 
	
	private String nicCode;
	
	private Boolean status;

	private List<String> weightType;
	
	

	/**
	 * @return the weightType
	 */
	public List<String> getWeightType() {
		return weightType;
	}

	/**
	 * @param weightType the weightType to set
	 */
	public void setWeightType(List<String> weightType) {
		this.weightType = weightType;
	}

	/**
	 * @return the fromGvw
	 */
	public Integer getFromGvw() {
		return fromGvw;
	}

	/**
	 * @param fromGvw the fromGvw to set
	 */
	public void setFromGvw(Integer fromGvw) {
		this.fromGvw = fromGvw;
	}

	/**
	 * @return the toGvw
	 */
	public Integer getToGvw() {
		return toGvw;
	}

	/**
	 * @param toGvw the toGvw to set
	 */
	public void setToGvw(Integer toGvw) {
		this.toGvw = toGvw;
	}

	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}



	/**
	 * @return the covCode
	 */
	public List<String> getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode the covCode to set
	 */
	public void setCovCode(List<String> covCode) {
		this.covCode = covCode;
	}

	/**
	 * @return the nicCode
	 */
	public String getNicCode() {
		return nicCode;
	}

	/**
	 * @param nicCode the nicCode to set
	 */
	public void setNicCode(String nicCode) {
		this.nicCode = nicCode;
	}
	
	

}
