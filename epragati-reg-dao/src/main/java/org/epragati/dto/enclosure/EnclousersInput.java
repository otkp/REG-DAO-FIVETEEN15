package org.epragati.dto.enclosure;

import javax.validation.constraints.NotNull;

public class EnclousersInput {

	
	

	@NotNull(message = "Differently Abled is required.")
	private Boolean differentlyAbled;

	@NotNull(message = "Same as Aadhaar is required.")
	private Boolean sameAsAadhaar;

	
	private Boolean istransportVehicle;
	
	private Boolean isVehicleFinance;
	
	@NotNull(message = "Application number is required.")
	private String applicationNo;

	
	/**
	 * @return the istransportVehicle
	 */
	public Boolean getIstransportVehicle() {
		return istransportVehicle;
	}

	/**
	 * @param istransportVehicle the istransportVehicle to set
	 */
	public void setIstransportVehicle(Boolean istransportVehicle) {
		this.istransportVehicle = istransportVehicle;
	}

	/**
	 * @return the isVehicleFinance
	 */
	public Boolean getIsVehicleFinance() {
		return isVehicleFinance;
	}

	/**
	 * @param isVehicleFinance the isVehicleFinance to set
	 */
	public void setIsVehicleFinance(Boolean isVehicleFinance) {
		this.isVehicleFinance = isVehicleFinance;
	}

	/**
	 * @return the differentlyAbled
	 */
	public Boolean getDifferentlyAbled() {
		return differentlyAbled;
	}

	/**
	 * @param differentlyAbled the differentlyAbled to set
	 */
	public void setDifferentlyAbled(Boolean differentlyAbled) {
		this.differentlyAbled = differentlyAbled;
	}

	/**
	 * @return the sameAsAadhaar
	 */
	public Boolean getSameAsAadhaar() {
		return sameAsAadhaar;
	}

	/**
	 * @param sameAsAadhaar the sameAsAadhaar to set
	 */
	public void setSameAsAadhaar(Boolean sameAsAadhaar) {
		this.sameAsAadhaar = sameAsAadhaar;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	
}
