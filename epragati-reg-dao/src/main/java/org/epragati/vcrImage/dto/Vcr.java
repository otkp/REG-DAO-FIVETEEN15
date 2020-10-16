package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "VCR")
public class Vcr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dateOfCheck;
	@NotNull(message = "placeOfCheck are required.")
	private String placeOfCheck;
	private String vcrNumber;
	private String place;
	private String latitude;
	private String longitude;

	public LocalDateTime getDateOfCheck() {
		return dateOfCheck;
	}

	public void setDateOfCheck(LocalDateTime dateOfCheck) {
		this.dateOfCheck = dateOfCheck;
	}

	public String getPlaceOfCheck() {
		return placeOfCheck;
	}

	public void setPlaceOfCheck(String placeOfCheck) {
		this.placeOfCheck = placeOfCheck;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getVcrNumber() {
		return vcrNumber;
	}

	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
