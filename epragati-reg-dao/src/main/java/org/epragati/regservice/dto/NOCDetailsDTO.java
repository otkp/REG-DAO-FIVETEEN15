package org.epragati.regservice.dto;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "noc_details")
public class NOCDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String applicationNo;

	private String state;

	private String district;

	private String rtaOffice;

	private String periodOfStay;

	private PoliceClearanceCertificateDTO policeClearanceDetails;

	private IssuingAuthorityDetailsDTO issueAuthorityDetails;

	private String nOCIssuedRtaOffice;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate issueDate;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfEntry;

	private boolean isNocIssued;

	private String cancellationReason;

	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getRtaOffice() {
		return rtaOffice;
	}

	public void setRtaOffice(String rtaOffice) {
		this.rtaOffice = rtaOffice;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public String getnOCIssuedRtaOffice() {
		return nOCIssuedRtaOffice;
	}

	public void setnOCIssuedRtaOffice(String nOCIssuedRtaOffice) {
		this.nOCIssuedRtaOffice = nOCIssuedRtaOffice;
	}

	public String getPeriodOfStay() {
		return periodOfStay;
	}

	public void setPeriodOfStay(String periodOfStay) {
		this.periodOfStay = periodOfStay;
	}

	/**
	 * @return the policeClearanceDetails
	 */
	public PoliceClearanceCertificateDTO getPoliceClearanceDetails() {
		return policeClearanceDetails;
	}

	/**
	 * @param policeClearanceDetails
	 *            the policeClearanceDetails to set
	 */
	public void setPoliceClearanceDetails(PoliceClearanceCertificateDTO policeClearanceDetails) {
		this.policeClearanceDetails = policeClearanceDetails;
	}

	/**
	 * @return the issueAuthorityDetails
	 */
	public IssuingAuthorityDetailsDTO getIssueAuthorityDetails() {
		return issueAuthorityDetails;
	}

	/**
	 * @param issueAuthorityDetails
	 *            the issueAuthorityDetails to set
	 */
	public void setIssueAuthorityDetails(IssuingAuthorityDetailsDTO issueAuthorityDetails) {
		this.issueAuthorityDetails = issueAuthorityDetails;
	}
	

	public boolean isNocIssued() {
		return isNocIssued;
	}

	public void setNocIssued(boolean isNocIssued) {
		this.isNocIssued = isNocIssued;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	/**
	 * @return the dateOfEntry
	 */
	public LocalDate getDateOfEntry() {
		return dateOfEntry;
	}

	/**
	 * @param dateOfEntry the dateOfEntry to set
	 */
	public void setDateOfEntry(LocalDate dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

}
