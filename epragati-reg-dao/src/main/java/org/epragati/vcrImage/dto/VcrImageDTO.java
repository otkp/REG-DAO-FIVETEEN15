package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "table_vcr_image")
public class VcrImageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String vcrNo;
	private String vehicleNo;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

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

	@Override
	public String toString() {
		return "VcrImageDTO [id=" + id + ", vcrNo=" + vcrNo + ", vehicleNo=" + vehicleNo + ", enclosures=" + enclosures
				+ "]";
	}

}
