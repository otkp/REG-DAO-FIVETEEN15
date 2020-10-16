package org.epragati.civilsupplies.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection ="civil_supplies_districts")
public class RationCardDistrictDTO {

	private String aadhaarDistrict;
	
	private String rationCardDistrict;
	
	private Integer rationCardDistrictCode;
	
	private Integer districtId;

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getAadhaarDistrict() {
		return aadhaarDistrict;
	}

	public void setAadhaarDistrict(String aadhaarDistrict) {
		this.aadhaarDistrict = aadhaarDistrict;
	}

	public String getRationCardDistrict() {
		return rationCardDistrict;
	}

	public void setRationCardDistrict(String rationCardDistrict) {
		this.rationCardDistrict = rationCardDistrict;
	}

	public Integer getRationCardDistrictCode() {
		return rationCardDistrictCode;
	}

	public void setRationCardDistrictCode(Integer rationCardDistrictCode) {
		this.rationCardDistrictCode = rationCardDistrictCode;
	}
	
	
}
