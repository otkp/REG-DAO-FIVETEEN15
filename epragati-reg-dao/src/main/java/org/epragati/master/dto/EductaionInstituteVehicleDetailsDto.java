package org.epragati.master.dto;

import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * @author sai.naganaboyena
 *
 */
@Document(collection = "eibt_institute_vehicle_details")
@CompoundIndexes({ 
	@CompoundIndex(name = "applicationNo", def = "{'applicationNo': 1}"),
	@CompoundIndex(name = "prNo", def = "{'prNo': 1}"),
	@CompoundIndex(name = "userId", def = "{'userId': 1}"),
	@CompoundIndex(name = "driverDetails_dlNo", def = "{'driverDetails.dlNo': 1}")
})
public class EductaionInstituteVehicleDetailsDto extends BaseEntity{
	private static final long serialVersionUID = -2049605922960067126L;
	
	@Id
	private String applicationNo;
	private String userId;
	private String aadharNo;
	
	private String prNo;
	private String ownerName;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate registrationDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate taxValidity;
	private String fcNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate fcValidity;
	private String permitNumber;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate permitValidity;
	private DriverDetailsDto driverDetails;
	private AttendantDetailsDto attendantDetails;
	private String route;
	private List<StudentDetailsDto> studentDetails;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures; 
	private boolean isTowDone = Boolean.FALSE;
	private boolean enableDriverThumb; 
	
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public DriverDetailsDto getDriverDetails() {
		return driverDetails;
	}
	public void setDriverDetails(DriverDetailsDto driverDetails) {
		this.driverDetails = driverDetails;
	}
	public AttendantDetailsDto getAttendantDetails() {
		return attendantDetails;
	}
	public void setAttendantDetails(AttendantDetailsDto attendantDetails) {
		this.attendantDetails = attendantDetails;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}

	/**
	 * @return the studentDetails
	 */
	public List<StudentDetailsDto> getStudentDetails() {
		return studentDetails;
	}
	/**
	 * @param studentDetails the studentDetails to set
	 */
	public void setStudentDetails(List<StudentDetailsDto> studentDetails) {
		this.studentDetails = studentDetails;
	}
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}
	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}
	/**
	 * @param applicationNo the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the registrationDate
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the taxValidity
	 */
	public LocalDate getTaxValidity() {
		return taxValidity;
	}
	/**
	 * @param taxValidity the taxValidity to set
	 */
	public void setTaxValidity(LocalDate taxValidity) {
		this.taxValidity = taxValidity;
	}
	/**
	 * @return the fcNumber
	 */
	public String getFcNumber() {
		return fcNumber;
	}
	/**
	 * @param fcNumber the fcNumber to set
	 */
	public void setFcNumber(String fcNumber) {
		this.fcNumber = fcNumber;
	}
	/**
	 * @return the fcValidity
	 */
	public LocalDate getFcValidity() {
		return fcValidity;
	}
	/**
	 * @param fcValidity the fcValidity to set
	 */
	public void setFcValidity(LocalDate fcValidity) {
		this.fcValidity = fcValidity;
	}
	/**
	 * @return the permitNumber
	 */
	public String getPermitNumber() {
		return permitNumber;
	}
	/**
	 * @param permitNumber the permitNumber to set
	 */
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}
	/**
	 * @return the permitValidity
	 */
	public LocalDate getPermitValidity() {
		return permitValidity;
	}
	/**
	 * @param permitValidity the permitValidity to set
	 */
	public void setPermitValidity(LocalDate permitValidity) {
		this.permitValidity = permitValidity;
	}
	/**
	 * @return the isTowDone
	 */
	public boolean isTowDone() {
		return isTowDone;
	}
	/**
	 * @param isTowDone the isTowDone to set
	 */
	public void setTowDone(boolean isTowDone) {
		this.isTowDone = isTowDone;
	}
	public boolean isEnableDriverThumb() {
		return enableDriverThumb;
	}
	public void setEnableDriverThumb(boolean enableDriverThumb) {
		this.enableDriverThumb = enableDriverThumb;
	}



	
}
