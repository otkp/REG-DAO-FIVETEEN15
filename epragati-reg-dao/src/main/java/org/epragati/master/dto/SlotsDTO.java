package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "slots")
public class SlotsDTO extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private List<String> service;
	private String module;
	private LocalDate date;
	private String officeCode;
	private Integer availableSlots;
	private Integer totalSlots;;
	private Boolean holiday = false;
	private Integer booked;;
	private Boolean isFastFilling  = false;
	private String status = "Available";
	private Integer lockedSlots = 0 ;
	

	public Boolean getHoliday() {
		return holiday;
	}

	public void setHoliday(Boolean holiday) {
		this.holiday = holiday;
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

	/**
	 * @return the service
	 */
	public List<String> getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(List<String> service) {
		this.service = service;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	/**
	 * @return the availableSlots
	 */
	public Integer getAvailableSlots() {
		return availableSlots;
	}

	/**
	 * @param availableSlots the availableSlots to set
	 */
	public void setAvailableSlots(Integer availableSlots) {
		this.availableSlots = availableSlots;
	}

	/**
	 * @return the totalSlots
	 */
	public Integer getTotalSlots() {
		return totalSlots;
	}

	/**
	 * @param totalSlots the totalSlots to set
	 */
	public void setTotalSlots(Integer totalSlots) {
		this.totalSlots = totalSlots;
	}

	/**
	 * @return the booked
	 */
	public Integer getBooked() {
		return booked;
	}

	/**
	 * @param booked the booked to set
	 */
	public void setBooked(Integer booked) {
		this.booked = booked;
	}

	/**
	 * @return the isFastFilling
	 */
	public Boolean getIsFastFilling() {
		return isFastFilling;
	}

	/**
	 * @param isFastFilling the isFastFilling to set
	 */
	public void setIsFastFilling(Boolean isFastFilling) {
		this.isFastFilling = isFastFilling;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the lockedSlots
	 */
	public Integer getLockedSlots() {
		return lockedSlots;
	}

	/**
	 * @param lockedSlots the lockedSlots to set
	 */
	public void setLockedSlots(Integer lockedSlots) {
		this.lockedSlots = lockedSlots;
	}
	
}
