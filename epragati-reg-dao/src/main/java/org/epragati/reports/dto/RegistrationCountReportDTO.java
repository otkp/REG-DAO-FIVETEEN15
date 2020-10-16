package org.epragati.reports.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author naga.pulaparthi
 *
 */

@Document(collection = "registration_count")
public class RegistrationCountReportDTO extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2289381836101369713L;

	@Id
	private String _id; 
	
	private String officeCode;
	
	private String officeName;
	
	private String covcode;
	
	private String covdescription;
	
	private String groupCategory;
	
	private String vehicleType;
	
	private Integer distId;
	
//	private String districtName;
	
//	private String mandalCode;
//	
//	private String mandalName;
	
	private long count;
	
	private LocalDate countDate;

	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getCovcode() {
		return covcode;
	}

	public void setCovcode(String covcode) {
		this.covcode = covcode;
	}

	public String getCovdescription() {
		return covdescription;
	}

	public void setCovdescription(String covdescription) {
		this.covdescription = covdescription;
	}

	public String getGroupCategory() {
		return groupCategory;
	}

	public void setGroupCategory(String groupCategory) {
		this.groupCategory = groupCategory;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getDistId() {
		return distId;
	}

	public void setDistId(Integer distId) {
		this.distId = distId;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public LocalDate getCountDate() {
		return countDate;
	}

	public void setCountDate(LocalDate countDate) {
		this.countDate = countDate;
	}
	
	
}
