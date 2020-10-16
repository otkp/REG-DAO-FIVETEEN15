package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;

public class VcrImageResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vcrNo;
	private String vehicleNo;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	private String imageResponse;
	
	public String getVcrNo() {
		return vcrNo;
	}
	public void setVcrNo(String vcrNo) {
		this.vcrNo = vcrNo;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	public String getImageResponse() {
		return imageResponse;
	}
	public void setImageResponse(String imageResponse) {
		this.imageResponse = imageResponse;
	}
	
	
}
