package org.epragati.regservice.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;

public class TheftVehicleDetailsDTO extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type; // 
	private String status; // Revocation & Intimation
	private String firNo;
	private Integer firYear;
	private LocalDate complaintDate;
	private String complaintDateStr;
	private String district;
	private String policeStationName;
	private String otherState;
	private String state;
	private String revocationRemarks;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the firNo
	 */
	public String getFirNo() {
		return firNo;
	}

	/**
	 * @param firNo
	 *            the firNo to set
	 */
	public void setFirNo(String firNo) {
		this.firNo = firNo;
	}

	/**
	 * @return the firYear
	 */
	public Integer getFirYear() {
		return firYear;
	}

	/**
	 * @param firYear
	 *            the firYear to set
	 */
	public void setFirYear(Integer firYear) {
		this.firYear = firYear;
	}

	/**
	 * @return the complaintDate
	 */
	public LocalDate getComplaintDate() {
		return complaintDate;
	}

	/**
	 * @param complaintDate
	 *            the complaintDate to set
	 */
	public void setComplaintDate(LocalDate complaintDate) {
		this.complaintDate = complaintDate;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the policeStationName
	 */
	public String getPoliceStationName() {
		return policeStationName;
	}

	/**
	 * @param policeStationName
	 *            the policeStationName to set
	 */
	public void setPoliceStationName(String policeStationName) {
		this.policeStationName = policeStationName;
	}

	/**
	 * @return the remarks
	 */
	
	
	public String getOtherState() {
		return otherState;
	}

	/**
	 * @param otherState
	 *            the otherState to set
	 */
	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the complaintDateStr
	 */
	public String getComplaintDateStr() {
		return complaintDateStr;
	}

	/**
	 * @param complaintDateStr the complaintDateStr to set
	 */
	public void setComplaintDateStr(String complaintDateStr) {
		this.complaintDateStr = complaintDateStr;
	}

	/**
	 * @return the revocationRemarks
	 */
	public String getRevocationRemarks() {
		return revocationRemarks;
	}

	/**
	 * @param revocationRemarks the revocationRemarks to set
	 */
	public void setRevocationRemarks(String revocationRemarks) {
		this.revocationRemarks = revocationRemarks;
	}

}
