package org.epragati.sn.numberseries.dto;

public class BidParticipantsDto {

	private String specialNumberAppId;

	private String regApplicationNo;

	private String trNumber;

	public String getSpecialNumberAppId() {
		return specialNumberAppId;
	}

	public void setSpecialNumberAppId(String specialNumberAppId) {
		this.specialNumberAppId = specialNumberAppId;
	}


	/**
	 * @return the regApplicationNo
	 */
	public String getRegApplicationNo() {
		return regApplicationNo;
	}

	/**
	 * @param regApplicationNo the regApplicationNo to set
	 */
	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}

	public String getTrNumber() {
		return trNumber;
	}

	public void setTrNumber(String trNumber) {
		this.trNumber = trNumber;
	}

}
