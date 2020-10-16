package org.epragati.regservice.dto;

import java.io.Serializable;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "master_trailer_capacity_log")
public class TrailerCapacityLogDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7284997011637475804L;
	
	@Id
	private String id;
	
	private Integer mId;
	
	private String modelDesc; 
	
	private Integer year;
	
	private Map<String, Integer> monthWiseCapacity;
	
	private String cretedby;
	
	private boolean status;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the mId
	 */
	public Integer getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * @return the modelDesc
	 */
	public String getModelDesc() {
		return modelDesc;
	}

	/**
	 * @param modelDesc the modelDesc to set
	 */
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return the monthWiseCapacity
	 */
	public Map<String, Integer> getMonthWiseCapacity() {
		return monthWiseCapacity;
	}

	/**
	 * @param monthWiseCapacity the monthWiseCapacity to set
	 */
	public void setMonthWiseCapacity(Map<String, Integer> monthWiseCapacity) {
		this.monthWiseCapacity = monthWiseCapacity;
	}

	/**
	 * @return the cretedby
	 */
	public String getCretedby() {
		return cretedby;
	}

	/**
	 * @param cretedby the cretedby to set
	 */
	public void setCretedby(String cretedby) {
		this.cretedby = cretedby;
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

}
