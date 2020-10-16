package org.epragati.permits.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_permit_districtmapping")
public class PermitDistrictMappingDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private String distictName;

	private Integer districtCode;

	private Boolean status;

	private String neighbourDistrict;
	
	private String neighbourDistrictcode;

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
	 * @return the distictName
	 */
	public String getDistictName() {
		return distictName;
	}

	/**
	 * @param distictName the distictName to set
	 */
	public void setDistictName(String distictName) {
		this.distictName = distictName;
	}

	/**
	 * @return the districtCode
	 */
	public Integer getDistrictCode() {
		return districtCode;
	}

	/**
	 * @param districtCode the districtCode to set
	 */
	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
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
	 * @return the neighbourDistrict
	 */
	public String getNeighbourDistrict() {
		return neighbourDistrict;
	}

	/**
	 * @param neighbourDistrict the neighbourDistrict to set
	 */
	public void setNeighbourDistrict(String neighbourDistrict) {
		this.neighbourDistrict = neighbourDistrict;
	}

	/**
	 * @return the neighbourDistrictcode
	 */
	public String getNeighbourDistrictcode() {
		return neighbourDistrictcode;
	}

	/**
	 * @param neighbourDistrictcode the neighbourDistrictcode to set
	 */
	public void setNeighbourDistrictcode(String neighbourDistrictcode) {
		this.neighbourDistrictcode = neighbourDistrictcode;
	}

	
}
