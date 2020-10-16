package org.epragati.master.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.springframework.data.annotation.Id;

/*@Document(collection = "collectionCorrectionServiceLogs")*/
public class CollectionCorrectionServiceLogsDTO {
	@Id
	private String id;
	private String requestId;
    private String collectionName;
    private String requestIp;
    private String responseIp;
    private String status;
    private String applicationNo;
    private String prNo;
    private String chassisNo;
    private String trNo;
    private String ticketNumber;
    private CcrRequestDetails  ccrRequestDetails;
    private CcrResponseDetails  ccrResponseDetails;
    private String aadhaarNumber;
    private String userName;
    private LocalDateTime createdDate;
    
    private Boolean notifyRequired;
    
    
    
     public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public Boolean getNotifyRequired() {
		return notifyRequired;
	}
	public void setNotifyRequired(Boolean notifyRequired) {
		this.notifyRequired = notifyRequired;
	}
	private List<ImageEnclosureDTO> enclosures;
    
    
	/**
	 * @return the enclosures
	 */
	public List<ImageEnclosureDTO> getEnclosures() {
		return enclosures;
	}
	/**
	 * @param enclosures the enclosures to set
	 */
	public void setEnclosures(List<ImageEnclosureDTO> enclosures) {
		this.enclosures = enclosures;
	}
	/*
    
    
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Boolean getNotifyRequired() {
		return notifyRequired;
	}
	public void setNotifyRequired(Boolean notifyRequired) {
		this.notifyRequired = notifyRequired;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * @return the collectionName
	 */
	public String getCollectionName() {
		return collectionName;
	}
	/**
	 * @param collectionName the collectionName to set
	 */
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	/**
	 * @return the requestIp
	 */
	public String getRequestIp() {
		return requestIp;
	}
	/**
	 * @param requestIp the requestIp to set
	 */
	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	/**
	 * @return the responseIp
	 */
	public String getResponseIp() {
		return responseIp;
	}
	/**
	 * @param responseIp the responseIp to set
	 */
	public void setResponseIp(String responseIp) {
		this.responseIp = responseIp;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the ccrRequestDetails
	 */
	public CcrRequestDetails getCcrRequestDetails() {
		return ccrRequestDetails;
	}
	/**
	 * @param ccrRequestDetails the ccrRequestDetails to set
	 */
	public void setCcrRequestDetails(CcrRequestDetails ccrRequestDetails) {
		this.ccrRequestDetails = ccrRequestDetails;
	}
	/**
	 * @return the ccrResponseDetails
	 */
	public CcrResponseDetails getCcrResponseDetails() {
		return ccrResponseDetails;
	}
	/**
	 * @param ccrResponseDetails the ccrResponseDetails to set
	 */
	public void setCcrResponseDetails(CcrResponseDetails ccrResponseDetails) {
		this.ccrResponseDetails = ccrResponseDetails;
	}
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	
}
