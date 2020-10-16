package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class PassengersDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer noOfseats;
	private Integer noOfPasssengers;
	private Integer overloadedPassenger;
	public Integer getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(Integer noOfseats) {
		this.noOfseats = noOfseats;
	}
	public Integer getNoOfPasssengers() {
		return noOfPasssengers;
	}
	public void setNoOfPasssengers(Integer noOfPasssengers) {
		this.noOfPasssengers = noOfPasssengers;
	}
	public Integer getOverloadedPassenger() {
		return overloadedPassenger;
	}
	public void setOverloadedPassenger(Integer overloadedPassenger) {
		this.overloadedPassenger = overloadedPassenger;
	}
	@Override
	public String toString() {
		return "PassengersVO [noOfseats=" + noOfseats + ", noOfPasssengers=" + noOfPasssengers
				+ ", overloadedPassenger=" + overloadedPassenger + "]";
	}
	
	

}
