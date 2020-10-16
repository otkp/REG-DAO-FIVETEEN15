package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;

public class VehicleSeizedDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vehicleKeptAt;
	private LocalDate dateOfSeized;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String address;
	private boolean releaseOrder;
	private boolean courtOrder;
	private boolean departmentAction;
	private String remarks;
	
	public String getVehicleKeptAt() {
		return vehicleKeptAt;
	}
	public void setVehicleKeptAt(String vehicleKeptAt) {
		this.vehicleKeptAt = vehicleKeptAt;
	}
	public LocalDate getDateOfSeized() {
		return dateOfSeized;
	}
	public void setDateOfSeized(LocalDate dateOfSeized) {
		this.dateOfSeized = dateOfSeized;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isReleaseOrder() {
		return releaseOrder;
	}
	public void setReleaseOrder(boolean releaseOrder) {
		this.releaseOrder = releaseOrder;
	}
	public boolean isCourtOrder() {
		return courtOrder;
	}
	public void setCourtOrder(boolean courtOrder) {
		this.courtOrder = courtOrder;
	}
	public boolean isDepartmentAction() {
		return departmentAction;
	}
	public void setDepartmentAction(boolean departmentAction) {
		this.departmentAction = departmentAction;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
