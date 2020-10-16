package org.epragati.permits.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "temporary_permit_passenger_details")
public class TemporaryPermitPassengerDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String permitNo;

	private String permitReferenceId;

	private Integer noOfPassengers;

	private List<PassengerDetailsDTO> passengerDetails;

	private String status;

	private String fromRoute;

	private String toRoute;

	private String driverName;

	private String dlNumber;

	private String secondryDriverName;

	private String secondryDriverDLNumber;

	private String prNo;

	private PermitOtherServicesValidityDetailsDTO otherServicesDetails;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfJourney;

	private String startingTime;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo
	 *            the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the permitReferenceId
	 */
	public String getPermitReferenceId() {
		return permitReferenceId;
	}

	/**
	 * @param permitReferenceId
	 *            the permitReferenceId to set
	 */
	public void setPermitReferenceId(String permitReferenceId) {
		this.permitReferenceId = permitReferenceId;
	}

	/**
	 * @return the passengerDetails
	 */
	public List<PassengerDetailsDTO> getPassengerDetails() {
		return passengerDetails;
	}

	/**
	 * @param passengerDetails
	 *            the passengerDetails to set
	 */
	public void setPassengerDetails(List<PassengerDetailsDTO> passengerDetails) {
		this.passengerDetails = passengerDetails;
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
	 * @return the noOfPassengers
	 */
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}

	/**
	 * @param noOfPassengers
	 *            the noOfPassengers to set
	 */
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	/**
	 * @return the fromRoute
	 */
	public String getFromRoute() {
		return fromRoute;
	}

	/**
	 * @param fromRoute
	 *            the fromRoute to set
	 */
	public void setFromRoute(String fromRoute) {
		this.fromRoute = fromRoute;
	}

	/**
	 * @return the toRoute
	 */
	public String getToRoute() {
		return toRoute;
	}

	/**
	 * @param toRoute
	 *            the toRoute to set
	 */
	public void setToRoute(String toRoute) {
		this.toRoute = toRoute;
	}

	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * @param driverName
	 *            the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/**
	 * @return the dlNumber
	 */
	public String getDlNumber() {
		return dlNumber;
	}

	/**
	 * @param dlNumber
	 *            the dlNumber to set
	 */
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}

	/**
	 * @return the secondryDriverName
	 */
	public String getSecondryDriverName() {
		return secondryDriverName;
	}

	/**
	 * @param secondryDriverName
	 *            the secondryDriverName to set
	 */
	public void setSecondryDriverName(String secondryDriverName) {
		this.secondryDriverName = secondryDriverName;
	}

	/**
	 * @return the secondryDriverDLNumber
	 */
	public String getSecondryDriverDLNumber() {
		return secondryDriverDLNumber;
	}

	/**
	 * @param secondryDriverDLNumber
	 *            the secondryDriverDLNumber to set
	 */
	public void setSecondryDriverDLNumber(String secondryDriverDLNumber) {
		this.secondryDriverDLNumber = secondryDriverDLNumber;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the otherServicesDetails
	 */
	public PermitOtherServicesValidityDetailsDTO getOtherServicesDetails() {
		return otherServicesDetails;
	}

	/**
	 * @param otherServicesDetails
	 *            the otherServicesDetails to set
	 */
	public void setOtherServicesDetails(PermitOtherServicesValidityDetailsDTO otherServicesDetails) {
		this.otherServicesDetails = otherServicesDetails;
	}

	/**
	 * @return the dateOfJourney
	 */
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}

	/**
	 * @param dateOfJourney
	 *            the dateOfJourney to set
	 */
	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	/**
	 * @return the startingTime
	 */
	public String getStartingTime() {
		return startingTime;
	}

	/**
	 * @param startingTime
	 *            the startingTime to set
	 */
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

}
