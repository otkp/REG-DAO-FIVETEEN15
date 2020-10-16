package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.StatusRegistration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dealer_action_details")
public class DealerActionDetailsDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String dealerUserId;

	private List<MasterCovDTO> classOfVehicles;

	private StatusRegistration applicationStatus;

	private OfficeDTO officeDetails;

	private LocalDate suspendedFrom;

	private LocalDate suspendedTo;

	private String suspendedBy;

	private String cancelledBy;

	private UserDTO dealerDetails;

	private LocalDate cancelledDate;

	private String revokedBy;

	private LocalDate revokedDate;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dealerUserId
	 */
	public String getDealerUserId() {
		return dealerUserId;
	}

	/**
	 * @param dealerUserId the dealerUserId to set
	 */
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}

	/**
	 * @return the classOfVehicles
	 */
	public List<MasterCovDTO> getClassOfVehicles() {
		return classOfVehicles;
	}

	/**
	 * @param classOfVehicles the classOfVehicles to set
	 */
	public void setClassOfVehicles(List<MasterCovDTO> classOfVehicles) {
		this.classOfVehicles = classOfVehicles;
	}

	/**
	 * @return the applicationStatus
	 */
	public StatusRegistration getApplicationStatus() {
		return applicationStatus;
	}

	/**
	 * @param applicationStatus the applicationStatus to set
	 */
	public void setApplicationStatus(StatusRegistration applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	/**
	 * @return the officeDetails
	 */
	public OfficeDTO getOfficeDetails() {
		return officeDetails;
	}

	/**
	 * @param officeDetails the officeDetails to set
	 */
	public void setOfficeDetails(OfficeDTO officeDetails) {
		this.officeDetails = officeDetails;
	}

	/**
	 * @return the suspendedFrom
	 */
	public LocalDate getSuspendedFrom() {
		return suspendedFrom;
	}

	/**
	 * @param suspendedFrom the suspendedFrom to set
	 */
	public void setSuspendedFrom(LocalDate suspendedFrom) {
		this.suspendedFrom = suspendedFrom;
	}

	/**
	 * @return the suspendedTo
	 */
	public LocalDate getSuspendedTo() {
		return suspendedTo;
	}

	/**
	 * @param suspendedTo the suspendedTo to set
	 */
	public void setSuspendedTo(LocalDate suspendedTo) {
		this.suspendedTo = suspendedTo;
	}

	/**
	 * @return the suspendedBy
	 */
	public String getSuspendedBy() {
		return suspendedBy;
	}

	/**
	 * @param suspendedBy the suspendedBy to set
	 */
	public void setSuspendedBy(String suspendedBy) {
		this.suspendedBy = suspendedBy;
	}

	/**
	 * @return the cancelledBy
	 */
	public String getCancelledBy() {
		return cancelledBy;
	}

	/**
	 * @param cancelledBy the cancelledBy to set
	 */
	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	/**
	 * @return the dealerDetails
	 */
	public UserDTO getDealerDetails() {
		return dealerDetails;
	}

	/**
	 * @param dealerDetails the dealerDetails to set
	 */
	public void setDealerDetails(UserDTO dealerDetails) {
		this.dealerDetails = dealerDetails;
	}

	/**
	 * @return the cancelledDate
	 */
	public LocalDate getCancelledDate() {
		return cancelledDate;
	}

	/**
	 * @param cancelledDate the cancelledDate to set
	 */
	public void setCancelledDate(LocalDate cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	/**
	 * @return the revokedBy
	 */
	public String getRevokedBy() {
		return revokedBy;
	}

	/**
	 * @param revokedBy the revokedBy to set
	 */
	public void setRevokedBy(String revokedBy) {
		this.revokedBy = revokedBy;
	}

	/**
	 * @return the revokedDate
	 */
	public LocalDate getRevokedDate() {
		return revokedDate;
	}

	/**
	 * @param revokedDate the revokedDate to set
	 */
	public void setRevokedDate(LocalDate revokedDate) {
		this.revokedDate = revokedDate;
	}

}
