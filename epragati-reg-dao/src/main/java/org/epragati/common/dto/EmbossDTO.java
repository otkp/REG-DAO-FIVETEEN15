package org.epragati.common.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmbossDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String frontLaserCode;

	private String rearLaserCode;

	private String registrationPlate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfEmbossing;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate embbosUpdateDate;

	public String getFrontLaserCode() {
		return frontLaserCode;
	}

	public void setFrontLaserCode(String frontLaserCode) {
		this.frontLaserCode = frontLaserCode;
	}

	public String getRearLaserCode() {
		return rearLaserCode;
	}

	public void setRearLaserCode(String rearLaserCode) {
		this.rearLaserCode = rearLaserCode;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}

	public LocalDate getDateOfEmbossing() {
		return dateOfEmbossing;
	}

	public void setDateOfEmbossing(LocalDate dateOfEmbossing) {
		this.dateOfEmbossing = dateOfEmbossing;
	}

	public LocalDate getEmbbosUpdateDate() {
		return embbosUpdateDate;
	}

	public void setEmbbosUpdateDate(LocalDate embbosUpdateDate) {
		this.embbosUpdateDate = embbosUpdateDate;
	}

}
