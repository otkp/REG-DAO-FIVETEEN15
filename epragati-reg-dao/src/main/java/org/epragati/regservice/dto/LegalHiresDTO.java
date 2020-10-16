package org.epragati.regservice.dto;


/**
 * 
 * @author krishnarjun.pampana
 *
 */

public class LegalHiresDTO {
	
	private Integer slNo;
	
	private String name;
	
	private String aadhaarNo;
	
	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}

	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	/**
	 * @param aadhaarNo the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

}

