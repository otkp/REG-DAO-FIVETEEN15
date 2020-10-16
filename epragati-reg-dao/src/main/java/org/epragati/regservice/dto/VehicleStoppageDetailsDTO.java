package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.epragati.master.dto.ApplicantAddressDTO;
import org.epragati.master.dto.MasterStoppageQuationsDTO;
import org.epragati.master.dto.MasterStoppageRevocationQuationsDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "stoppage_details")
public class VehicleStoppageDetailsDTO extends BaseEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9018979830632882292L;
	
	@Id
	private String applicationNo;
	private String regApplicationNo;
	private String prNo;
	private ApplicantAddressDTO vehicleAddressDetails;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageDate;
	private String reasonForStoppage;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate stoppageRevpkationDate;
	private List<MasterStoppageQuationsDTO> stoppageQuations;
	private List<MasterStoppageRevocationQuationsDTO>  stoppageRevocationQuations;
	
	private Map<String , Map> stoppageMapQuations;
	private List<ActionDetails> actions;
	private List<VehicleStoppageMVIReportDTO> mviReport;
	private String officeCode;//vehicle office code
	private String userId;//current MVI user id
	private String rtoUserId;//rto user id
	private String dtcUserId;//rto user id
	private Boolean otherState;
	private String mviOfficeCode;//MVI office code
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate aoOrRtostoppageDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate aoOrRtostoppageRevpkationDate;
	private long taxExemMonths;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate inspectionUpto;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate mviAssignedDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dtcAssignedDate;
	private Boolean autoRevoked;
	private Boolean rejected;
	private Boolean rtoCompleted;
	private Boolean staus;
	private String mviNumber;
	private String dtcNumber;
	private String rejectionComments;
	private String stoppageApplicationNo;
	
	/**
	 * @return the vehicleAddressDetails
	 */
	public ApplicantAddressDTO getVehicleAddressDetails() {
		return vehicleAddressDetails;
	}
	/**
	 * @param vehicleAddressDetails the vehicleAddressDetails to set
	 */
	public void setVehicleAddressDetails(ApplicantAddressDTO vehicleAddressDetails) {
		this.vehicleAddressDetails = vehicleAddressDetails;
	}
	/**
	 * @return the stoppageDate
	 */
	public LocalDate getStoppageDate() {
		return stoppageDate;
	}
	/**
	 * @param stoppageDate the stoppageDate to set
	 */
	public void setStoppageDate(LocalDate stoppageDate) {
		this.stoppageDate = stoppageDate;
	}
	/**
	 * @return the reasonForStoppage
	 */
	public String getReasonForStoppage() {
		return reasonForStoppage;
	}
	/**
	 * @param reasonForStoppage the reasonForStoppage to set
	 */
	public void setReasonForStoppage(String reasonForStoppage) {
		this.reasonForStoppage = reasonForStoppage;
	}
	/**
	 * @return the stoppageRevpkationDate
	 */
	public LocalDate getStoppageRevpkationDate() {
		return stoppageRevpkationDate;
	}
	/**
	 * @param stoppageRevpkationDate the stoppageRevpkationDate to set
	 */
	public void setStoppageRevpkationDate(LocalDate stoppageRevpkationDate) {
		this.stoppageRevpkationDate = stoppageRevpkationDate;
	}
	/**
	 * @return the stoppageQuations
	 */
	public List<MasterStoppageQuationsDTO> getStoppageQuations() {
		return stoppageQuations;
	}
	/**
	 * @param stoppageQuations the stoppageQuations to set
	 */
	public void setStoppageQuations(List<MasterStoppageQuationsDTO> stoppageQuations) {
		this.stoppageQuations = stoppageQuations;
	}
	/**
	 * @return the stoppageRevocationQuations
	 */
	public List<MasterStoppageRevocationQuationsDTO> getStoppageRevocationQuations() {
		return stoppageRevocationQuations;
	}
	/**
	 * @param stoppageRevocationQuations the stoppageRevocationQuations to set
	 */
	public void setStoppageRevocationQuations(List<MasterStoppageRevocationQuationsDTO> stoppageRevocationQuations) {
		this.stoppageRevocationQuations = stoppageRevocationQuations;
	}
	
	/**
	 * @return the stoppageMapQuations
	 */
	public Map<String, Map> getStoppageMapQuations() {
		return stoppageMapQuations;
	}
	/**
	 * @param stoppageMapQuations the stoppageMapQuations to set
	 */
	public void setStoppageMapQuations(Map<String, Map> stoppageMapQuations) {
		this.stoppageMapQuations = stoppageMapQuations;
	}
	public List<ActionDetails> getActions() {
		return actions;
	}
	public void setActions(List<ActionDetails> actions) {
		this.actions = actions;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRtoUserId() {
		return rtoUserId;
	}
	public void setRtoUserId(String rtoUserId) {
		this.rtoUserId = rtoUserId;
	}
	public Boolean getOtherState() {
		return otherState;
	}
	public void setOtherState(Boolean otherState) {
		this.otherState = otherState;
	}
	public List<VehicleStoppageMVIReportDTO> getMviReport() {
		return mviReport;
	}
	public void setMviReport(List<VehicleStoppageMVIReportDTO> mviReport) {
		this.mviReport = mviReport;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}
	public String getDtcUserId() {
		return dtcUserId;
	}
	public void setDtcUserId(String dtcUserId) {
		this.dtcUserId = dtcUserId;
	}
	public LocalDate getAoOrRtostoppageDate() {
		return aoOrRtostoppageDate;
	}
	public void setAoOrRtostoppageDate(LocalDate aoOrRtostoppageDate) {
		this.aoOrRtostoppageDate = aoOrRtostoppageDate;
	}
	public LocalDate getAoOrRtostoppageRevpkationDate() {
		return aoOrRtostoppageRevpkationDate;
	}
	public void setAoOrRtostoppageRevpkationDate(LocalDate aoOrRtostoppageRevpkationDate) {
		this.aoOrRtostoppageRevpkationDate = aoOrRtostoppageRevpkationDate;
	}
	public LocalDate getInspectionUpto() {
		return inspectionUpto;
	}
	public void setInspectionUpto(LocalDate inspectionUpto) {
		this.inspectionUpto = inspectionUpto;
	}
	public long getTaxExemMonths() {
		return taxExemMonths;
	}
	public void setTaxExemMonths(long taxExemMonths) {
		this.taxExemMonths = taxExemMonths;
	}
	public String getRegApplicationNo() {
		return regApplicationNo;
	}
	public void setRegApplicationNo(String regApplicationNo) {
		this.regApplicationNo = regApplicationNo;
	}
	public LocalDate getDtcAssignedDate() {
		return dtcAssignedDate;
	}
	public void setDtcAssignedDate(LocalDate dtcAssignedDate) {
		this.dtcAssignedDate = dtcAssignedDate;
	}
	public LocalDate getMviAssignedDate() {
		return mviAssignedDate;
	}
	public void setMviAssignedDate(LocalDate mviAssignedDate) {
		this.mviAssignedDate = mviAssignedDate;
	}
	public Boolean getAutoRevoked() {
		return autoRevoked;
	}
	public void setAutoRevoked(Boolean autoRevoked) {
		this.autoRevoked = autoRevoked;
	}
	public Boolean getRejected() {
		return rejected;
	}
	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}
	public Boolean getRtoCompleted() {
		return rtoCompleted;
	}
	public void setRtoCompleted(Boolean rtoCompleted) {
		this.rtoCompleted = rtoCompleted;
	}
	public Boolean getStaus() {
		return staus;
	}
	public void setStaus(Boolean staus) {
		this.staus = staus;
	}
	public String getMviNumber() {
		return mviNumber;
	}
	public void setMviNumber(String mviNumber) {
		this.mviNumber = mviNumber;
	}
	public String getDtcNumber() {
		return dtcNumber;
	}
	public void setDtcNumber(String dtcNumber) {
		this.dtcNumber = dtcNumber;
	}
	public String getRejectionComments() {
		return rejectionComments;
	}
	public void setRejectionComments(String rejectionComments) {
		this.rejectionComments = rejectionComments;
	}
	public String getStoppageApplicationNo() {
		return stoppageApplicationNo;
	}
	public void setStoppageApplicationNo(String stoppageApplicationNo) {
		this.stoppageApplicationNo = stoppageApplicationNo;
	}
	

	
}
