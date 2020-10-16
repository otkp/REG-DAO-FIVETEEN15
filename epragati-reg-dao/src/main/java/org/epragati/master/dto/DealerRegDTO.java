package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.gstn.dto.GSTNDataDTO;
import org.epragati.payment.dto.ClassOfVehiclesDTO;
import org.epragati.payment.dto.FeeDetailsDTO;
import org.epragati.regservice.dto.ActionDetails;
import org.epragati.util.StatusRegistration;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "dealer_registration_details")
public class DealerRegDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String applicationNo;

	private String dealerUserId;

	private GSTNDataDTO gstnData;

	private List<ClassOfVehiclesDTO> classOfVehicles;

	private String category;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

	private ApplicantDetailsDTO applicantDetails;

	private String officeCode;

	private StatusRegistration applicationStatus;

	private List<Integer> serviceIds;

	private List<ServiceEnum> serviceType;

	private String gateWayType;

	private OfficeDTO officeDetails;

	private FeeDetailsDTO feeDetails;

	private List<ActionDetails> actionDetails;

	private Integer currentIndex;

	private Integer iterationCount;

	private Set<String> currentRoles;

	private ServiceEnum.Flow flowId;

	private Boolean isMVIassigned;

	private OfficeDTO mviOfficeDetails;

	private List<LockedDetailsDTO> lockedDetails;

	private String assignedMvi;

	private LocalDateTime mviAssignedDate;

	private String mviOfficeCode;

	private String paymentTransactionNo;

	private PanDetailsDTO panDetails;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate suspendedFrom;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate suspendedTo;

	private String suspendedBy;

	private String cancelledBy;

	private UserDTO existingUserDetails;

	private String cancellationComments;

	private Boolean isMVIDone = false;

	private Boolean isChild;

	private String parentUserId;

	private List<MakersDTO> makers;

	private ApplicantAddressDTO dealerAddress;

	private List<DealerActionDetailsLog> actionDetailsLog;

	/**
	 * @return the isChild
	 */
	public Boolean getIsChild() {
		return isChild;
	}

	/**
	 * @param isChild the isChild to set
	 */
	public void setIsChild(Boolean isChild) {
		this.isChild = isChild;
	}

	/**
	 * @return the parentUserId
	 */
	public String getParentUserId() {
		return parentUserId;
	}

	/**
	 * @param parentUserId the parentUserId to set
	 */
	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}

	/**
	 * @return the isMVIDone
	 */
	public Boolean getIsMVIDone() {
		return isMVIDone;
	}

	/**
	 * @param isMVIDone the isMVIDone to set
	 */
	public void setIsMVIDone(Boolean isMVIDone) {
		this.isMVIDone = isMVIDone;
	}

	/**
	 * @return the cancellationComments
	 */
	public String getCancellationComments() {
		return cancellationComments;
	}

	/**
	 * @param cancellationComments the cancellationComments to set
	 */
	public void setCancellationComments(String cancellationComments) {
		this.cancellationComments = cancellationComments;
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
	 * @return the gstnData
	 */
	public GSTNDataDTO getGstnData() {
		return gstnData;
	}

	/**
	 * @param gstnData the gstnData to set
	 */
	public void setGstnData(GSTNDataDTO gstnData) {
		this.gstnData = gstnData;
	}

	/**
	 * @return the classOfVehicles
	 */
	public List<ClassOfVehiclesDTO> getClassOfVehicles() {
		return classOfVehicles;
	}

	/**
	 * @param classOfVehicles the classOfVehicles to set
	 */
	public void setClassOfVehicles(List<ClassOfVehiclesDTO> classOfVehicles) {
		this.classOfVehicles = classOfVehicles;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the applicantDetails
	 */
	public ApplicantDetailsDTO getApplicantDetails() {
		return applicantDetails;
	}

	/**
	 * @param applicantDetails the applicantDetails to set
	 */
	public void setApplicantDetails(ApplicantDetailsDTO applicantDetails) {
		this.applicantDetails = applicantDetails;
	}

	/**
	 * @return the actionDetails
	 */
	public List<ActionDetails> getActionDetails() {
		return actionDetails;
	}

	/**
	 * @param actionDetails the actionDetails to set
	 */
	public void setActionDetails(List<ActionDetails> actionDetails) {
		this.actionDetails = actionDetails;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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
	 * @return the serviceIds
	 */
	public List<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds the serviceIds to set
	 */
	public void setServiceIds(List<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the serviceType
	 */
	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the gateWayType
	 */
	public String getGateWayType() {
		return gateWayType;
	}

	/**
	 * @param gateWayType the gateWayType to set
	 */
	public void setGateWayType(String gateWayType) {
		this.gateWayType = gateWayType;
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
	 * @return the feeDetails
	 */
	public FeeDetailsDTO getFeeDetails() {
		return feeDetails;
	}

	/**
	 * @param feeDetails the feeDetails to set
	 */
	public void setFeeDetails(FeeDetailsDTO feeDetails) {
		this.feeDetails = feeDetails;
	}

	/**
	 * @return the currentIndex
	 */
	public Integer getCurrentIndex() {
		return currentIndex;
	}

	/**
	 * @param currentIndex the currentIndex to set
	 */
	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	/**
	 * @return the iterationCount
	 */
	public Integer getIterationCount() {
		return iterationCount;
	}

	/**
	 * @param iterationCount the iterationCount to set
	 */
	public void setIterationCount(Integer iterationCount) {
		this.iterationCount = iterationCount;
	}

	/**
	 * @return the currentRoles
	 */
	public Set<String> getCurrentRoles() {
		return currentRoles;
	}

	/**
	 * @param currentRoles the currentRoles to set
	 */
	public void setCurrentRoles(Set<String> currentRoles) {
		this.currentRoles = currentRoles;
	}

	/**
	 * @return the flowId
	 */
	public ServiceEnum.Flow getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(ServiceEnum.Flow flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the isMVIassigned
	 */
	public Boolean getIsMVIassigned() {
		return isMVIassigned;
	}

	/**
	 * @param isMVIassigned the isMVIassigned to set
	 */
	public void setIsMVIassigned(Boolean isMVIassigned) {
		this.isMVIassigned = isMVIassigned;
	}

	/**
	 * @return the mviOfficeDetails
	 */
	public OfficeDTO getMviOfficeDetails() {
		return mviOfficeDetails;
	}

	/**
	 * @param mviOfficeDetails the mviOfficeDetails to set
	 */
	public void setMviOfficeDetails(OfficeDTO mviOfficeDetails) {
		this.mviOfficeDetails = mviOfficeDetails;
	}

	/**
	 * @return the lockedDetails
	 */
	public List<LockedDetailsDTO> getLockedDetails() {
		return lockedDetails;
	}

	/**
	 * @param lockedDetails the lockedDetails to set
	 */
	public void setLockedDetails(List<LockedDetailsDTO> lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	/**
	 * @return the assignedMvi
	 */
	public String getAssignedMvi() {
		return assignedMvi;
	}

	/**
	 * @param assignedMvi the assignedMvi to set
	 */
	public void setAssignedMvi(String assignedMvi) {
		this.assignedMvi = assignedMvi;
	}

	/**
	 * @return the mviAssignedDate
	 */
	public LocalDateTime getMviAssignedDate() {
		return mviAssignedDate;
	}

	/**
	 * @param mviAssignedDate the mviAssignedDate to set
	 */
	public void setMviAssignedDate(LocalDateTime mviAssignedDate) {
		this.mviAssignedDate = mviAssignedDate;
	}

	/**
	 * @return the mviOfficeCode
	 */
	public String getMviOfficeCode() {
		return mviOfficeCode;
	}

	/**
	 * @param mviOfficeCode the mviOfficeCode to set
	 */
	public void setMviOfficeCode(String mviOfficeCode) {
		this.mviOfficeCode = mviOfficeCode;
	}

	/**
	 * @return the paymentTransactionNo
	 */
	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	/**
	 * @param paymentTransactionNo the paymentTransactionNo to set
	 */
	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	/**
	 * @return the panDetails
	 */
	public PanDetailsDTO getPanDetails() {
		return panDetails;
	}

	/**
	 * @param panDetails the panDetails to set
	 */
	public void setPanDetails(PanDetailsDTO panDetails) {
		this.panDetails = panDetails;
	}

	/**
	 * @return the existingUserDetails
	 */
	public UserDTO getExistingUserDetails() {
		return existingUserDetails;
	}

	/**
	 * @param existingUserDetails the existingUserDetails to set
	 */
	public void setExistingUserDetails(UserDTO existingUserDetails) {
		this.existingUserDetails = existingUserDetails;
	}

	/**
	 * @return the makers
	 */
	public List<MakersDTO> getMakers() {
		return makers;
	}

	/**
	 * @param makers the makers to set
	 */
	public void setMakers(List<MakersDTO> makers) {
		this.makers = makers;
	}

	/**
	 * @return the dealerAddress
	 */
	public ApplicantAddressDTO getDealerAddress() {
		return dealerAddress;
	}

	/**
	 * @param dealerAddress the dealerAddress to set
	 */
	public void setDealerAddress(ApplicantAddressDTO dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	/**
	 * @return the actionDetailsLog
	 */
	public List<DealerActionDetailsLog> getActionDetailsLog() {
		return actionDetailsLog;
	}

	/**
	 * @param actionDetailsLog the actionDetailsLog to set
	 */
	public void setActionDetailsLog(List<DealerActionDetailsLog> actionDetailsLog) {
		this.actionDetailsLog = actionDetailsLog;
	}

}
