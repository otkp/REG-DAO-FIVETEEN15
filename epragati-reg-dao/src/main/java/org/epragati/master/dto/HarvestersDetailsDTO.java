package org.epragati.master.dto;

import java.io.Serializable;

public class HarvestersDetailsDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String harvestersMakerName;
	private String harvestersMakerClass;
	private String chassisNumber;
	private Integer ulw;
	private Integer rlw;
	
	
	/**
	 * @return the harvestersMakerClass
	 */
	public String getHarvestersMakerClass() {
		return harvestersMakerClass;
	}
	/**
	 * @param harvestersMakerClass the harvestersMakerClass to set
	 */
	public void setHarvestersMakerClass(String harvestersMakerClass) {
		this.harvestersMakerClass = harvestersMakerClass;
	}
	/**
	 * @return the chassisNumber
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}
	/**
	 * @param chassisNumber the chassisNumber to set
	 */
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	/**
	 * @return the ulw
	 */
	public Integer getUlw() {
		return ulw;
	}
	/**
	 * @param ulw the ulw to set
	 */
	public void setUlw(Integer ulw) {
		this.ulw = ulw;
	}
	/**
	 * @return the harvestersMakerName
	 */
	public String getHarvestersMakerName() {
		return harvestersMakerName;
	}
	/**
	 * @param harvestersMakerName the harvestersMakerName to set
	 */
	public void setHarvestersMakerName(String harvestersMakerName) {
		this.harvestersMakerName = harvestersMakerName;
	}
	/**
	 * @return the rlw
	 */
	public Integer getRlw() {
		return rlw;
	}
	/**
	 * @param rlw the rlw to set
	 */
	public void setRlw(Integer rlw) {
		this.rlw = rlw;
	}
	
	
}
