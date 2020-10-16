package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_holiday_excemption")
public class HolidayExcemptionDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	
	private LocalDate excemptionDate; 
	
	private boolean holidayType;
	
	//private String id;
	
	private List<String> officeCode;
	
	private Integer serviceId;

	/**
	 * @return the _id
	 */
	/*public String get_id() {
		return _id;
	}*/

	/**
	 * @param _id the _id to set
	 */
	/*public void set_id(String _id) {
		this._id = _id;
	}*/

	/**
	 * @return the excemptionDate
	 */
	
	/**
	 * @return the holidayType
	 */
	public boolean isHolidayType() {
		return holidayType;
	}

	/**
	 * @param holidayType the holidayType to set
	 */
	public void setHolidayType(boolean holidayType) {
		this.holidayType = holidayType;
	}

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

	

	public List<String> getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(List<String> officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HolidayExcemptionDTO [excemptionDate=" + excemptionDate + ", holidayType="
				+ holidayType + ", id=" + id + ", officeCode=" + officeCode + ", serviceId=" + serviceId + "]";
	}

	/**
	 * @return the excemptionDate
	 */
	public LocalDate getExcemptionDate() {
		return excemptionDate;
	}

	/**
	 * @param excemptionDate the excemptionDate to set
	 */
	public void setExcemptionDate(LocalDate excemptionDate) {
		this.excemptionDate = excemptionDate;
	} 
	 
}
