package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */

@Document(collection="master_trailer_codes")
public class TrailerCodesDTO  extends BaseEntity{
	
	private Integer rId;
	
	private String stateCode;
	
	private String districtCode;
	
	private String 	oldDealerCode;
	
	private String dealerCode;
	
	private String weight;
	
	private String weightCode;
	
	private boolean status;
	
	private Integer districtId;
	
	private String trailerType;
	
	private String WheelType;
	
	private String makerClass;

	/**
	 * @return the rId
	 */
	public Integer getrId() {
		return rId;
	}

	/**
	 * @param rId the rId to set
	 */
	public void setrId(Integer rId) {
		this.rId = rId;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * @return the districtCode
	 */
	public String getDistrictCode() {
		return districtCode;
	}

	/**
	 * @param districtCode the districtCode to set
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	/**
	 * @return the oldDealerCode
	 */
	public String getOldDealerCode() {
		return oldDealerCode;
	}

	/**
	 * @param oldDealerCode the oldDealerCode to set
	 */
	public void setOldDealerCode(String oldDealerCode) {
		this.oldDealerCode = oldDealerCode;
	}

	/**
	 * @return the dealerCode
	 */
	public String getDealerCode() {
		return dealerCode;
	}

	/**
	 * @param dealerCode the dealerCode to set
	 */
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @return the weightCode
	 */
	public String getWeightCode() {
		return weightCode;
	}

	/**
	 * @param weightCode the weightCode to set
	 */
	public void setWeightCode(String weightCode) {
		this.weightCode = weightCode;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	/**
	 * @return the trailerType
	 */
	public String getTrailerType() {
		return trailerType;
	}

	/**
	 * @param trailerType the trailerType to set
	 */
	public void setTrailerType(String trailerType) {
		this.trailerType = trailerType;
	}

	/**
	 * @return the wheelType
	 */
	public String getWheelType() {
		return WheelType;
	}

	/**
	 * @param wheelType the wheelType to set
	 */
	public void setWheelType(String wheelType) {
		WheelType = wheelType;
	}

	/**
	 * @return the makerClass
	 */
	public String getMakerClass() {
		return makerClass;
	}

	/**
	 * @param makerClass the makerClass to set
	 */
	public void setMakerClass(String makerClass) {
		this.makerClass = makerClass;
	}

}
