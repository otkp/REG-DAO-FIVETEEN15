package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class DocumentImpoundedDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean registration;
	private boolean licence;
	private boolean permit;
	public boolean isRegistration() {
		return registration;
	}
	public void setRegistration(boolean registration) {
		this.registration = registration;
	}
	public boolean isLicence() {
		return licence;
	}
	public void setLicence(boolean licence) {
		this.licence = licence;
	}
	public boolean isPermit() {
		return permit;
	}
	public void setPermit(boolean permit) {
		this.permit = permit;
	}
	

}
