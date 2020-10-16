package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class SeizedAndDocumentImpoundedDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VehicleSeizedDTO vehicleSeizedDTO;
	private DocumentImpoundedDTO documentImpoundedDTO;
	
	public VehicleSeizedDTO getVehicleSeizedDTO() {
		return vehicleSeizedDTO;
	}
	public void setVehicleSeizedDTO(VehicleSeizedDTO vehicleSeizedDTO) {
		this.vehicleSeizedDTO = vehicleSeizedDTO;
	}
	public DocumentImpoundedDTO getDocumentImpoundedDTO() {
		return documentImpoundedDTO;
	}
	public void setDocumentImpoundedDTO(DocumentImpoundedDTO documentImpoundedDTO) {
		this.documentImpoundedDTO = documentImpoundedDTO;
	}
	

}
