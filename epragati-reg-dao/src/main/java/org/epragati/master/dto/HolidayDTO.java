package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.payment.ModuleEnum;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="master_holiday")
public class HolidayDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String slno;
	
	private LocalDate holidayDate;
	
	private String holidayDescription;
	
	private Boolean holidayStatus;
	
	private ModuleEnum module;
	

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSlno() {
		return slno;
	}

	public void setSlno(String slno) {
		this.slno = slno;
	}

	public LocalDate getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}

	public String getHolidayDescription() {
		return holidayDescription;
	}

	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}

	public Boolean getHolidayStatus() {
		return holidayStatus;
	}

	public void setHolidayStatus(Boolean holidayStatus) {
		this.holidayStatus = holidayStatus;
	}
	

	public ModuleEnum getModule() {
		return module;
	}

	public void setModule(ModuleEnum module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "HolidayDTO [id=" + id + ", slno=" + slno + ", holidayDate=" + holidayDate + ", holidayDescription="
				+ holidayDescription + ", holidayStatus=" + holidayStatus + "]";
	}

	
}
