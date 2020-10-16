package org.epragati.master.dto;

import java.io.Serializable;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class TrailerChassisDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer gvw;
	private Integer gtw;
	private String chassisNo;
	private Integer ulw;
	private String makerName;
	private String colour;

	/**
	 * @return the makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName
	 *            the makerName to set
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return the gvw
	 */
	public Integer getGvw() {
		return gvw;
	}

	/**
	 * @param gvw
	 *            the gvw to set
	 */
	public void setGvw(Integer gvw) {
		this.gvw = gvw;
	}

	/**
	 * @return the gtw
	 */
	public Integer getGtw() {
		return gtw;
	}

	/**
	 * @param gtw
	 *            the gtw to set
	 */
	public void setGtw(Integer gtw) {
		this.gtw = gtw;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo
	 *            the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}

	/**
	 * @param ulw
	 *            the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

}
