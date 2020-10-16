package org.epragati.vcrImage.dto;

import java.io.Serializable;

import org.epragati.master.dto.DistrictDTO;
import org.epragati.master.dto.StateDTO;

public class ToVcrDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StateDTO state;
	private DistrictDTO district;
	//@NotNull(message = "place are required.")
	private String place;
	public StateDTO getState() {
		return state;
	}
	public void setState(StateDTO state) {
		this.state = state;
	}
	public DistrictDTO getDistrict() {
		return district;
	}
	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
