package org.epragati.regservice.dto;

import java.time.LocalDate;

import org.epragati.constants.DuplicateReasonEnum;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DuplicateDetailsDTO {

	private DuplicateReasonEnum chooseReason;
	private String remarksForReason;
	private String firNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate firDate;
	private String policeStation;

	/**
	 * @return the chooseReason
	 */
	public DuplicateReasonEnum getChooseReason() {
		return chooseReason;
	}

	/**
	 * @param chooseReason
	 *            the chooseReason to set
	 */
	public void setChooseReason(DuplicateReasonEnum chooseReason) {
		this.chooseReason = chooseReason;
	}

	/**
	 * @return the remarksForReason
	 */
	public String getRemarksForReason() {
		return remarksForReason;
	}

	/**
	 * @param remarksForReason
	 *            the remarksForReason to set
	 */
	public void setRemarksForReason(String remarksForReason) {
		this.remarksForReason = remarksForReason;
	}

	/**
	 * @return the firNumber
	 */

	public LocalDate getFirDate() {
		return firDate;
	}

	/**
	 * @param firDate
	 *            the firDate to set
	 */
	public void setFirDate(LocalDate firDate) {
		this.firDate = firDate;
	}

	/**
	 * @return the policeStation
	 */
	public String getPoliceStation() {
		return policeStation;
	}

	/**
	 * @param policeStation
	 *            the policeStation to set
	 */
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	/**
	 * @return the firNumber
	 */
	public String getFirNumber() {
		return firNumber;
	}

	/**
	 * @param firNumber
	 *            the firNumber to set
	 */
	public void setFirNumber(String firNumber) {
		this.firNumber = firNumber;
	}

}
