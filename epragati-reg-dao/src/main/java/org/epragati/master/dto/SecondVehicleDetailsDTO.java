package org.epragati.master.dto;

import java.io.Serializable;

public class SecondVehicleDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String comments;
	private boolean isSecondVehicle;
	private String secondVehicleNo;
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the isSecondVehicle
	 */
	
	/**
	 * @return the secondVehicleNo
	 */
	public String getSecondVehicleNo() {
		return secondVehicleNo;
	}
	/**
	 * @param secondVehicleNo the secondVehicleNo to set
	 */
	public void setSecondVehicleNo(String secondVehicleNo) {
		this.secondVehicleNo = secondVehicleNo;
	}
	/**
	 * @return the isFirstVehicle
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SecondVehicleDetailsDTO [comments=" + comments + ", isSecondVehicle=" + isSecondVehicle
				+ ", secondVehicleNo=" + secondVehicleNo + "]";
	}
	/**
	 * @return the isSecondVehicle
	 */
	public boolean isSecondVehicle() {
		return isSecondVehicle;
	}
	/**
	 * @param isSecondVehicle the isSecondVehicle to set
	 */
	public void setSecondVehicle(boolean isSecondVehicle) {
		this.isSecondVehicle = isSecondVehicle;
	}
	

}