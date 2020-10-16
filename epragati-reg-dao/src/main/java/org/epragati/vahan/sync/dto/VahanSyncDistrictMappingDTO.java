package org.epragati.vahan.sync.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="master_nic_district_mapping")
public class VahanSyncDistrictMappingDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7601101686406968775L;
	@Id
	private String id;
	private Integer districtCode;
	private String districtName;
	private String stateCode;
	private String stateName;
	public Integer getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
