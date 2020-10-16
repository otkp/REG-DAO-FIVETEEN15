package org.epragati.ticket.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
public class TicketDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String ticketNo;
	private String module;
	private String subModule;
	private String issueType;
	private String problemLevel;
	private String problemOcurredAt;
	private String ticketUser;
	private String mobileNo;
	private Integer districtId;
	private String districtName;
	private String officeCode;
	private String officeName;
	private String status;
	private String trNo;
	private String prNo;
	private String regapplicationNo;
	private String chassisNumber;
	private String engineNumber;
	private String dlNo;
	private String llrNo;
	private String dlApplicationNo;
	private String dlAadharNo;
	private Integer currentIndex;
	private String currentRole;
	private List<Map<String, String>> reopenComments;
	private List<UpdateActionRoles> updateActionRoles;
	private List<TicketImageDTO> TicketImageDTO;
	private List<SuggestionActionRolesDTO> suggestionActionRoles;
	private List<ReopenActionRoles> reopenActionRoles;
	private String closedBy;
	private String closedLevel;
	private LocalDateTime closedDate;
	private String lUpdatedUser;
	private String lUpdatedRole;
	private Integer previousClosedIndex;
	private String previousClosedRole;
	private String firstCreatedRole;
	private String request;
	private String firstCreatedUser;
	private String searchBy;
	private LocalDateTime reOpenDate;
	private Boolean isFromDept = Boolean.FALSE;
	private String stateId;
	private TicketLockedDetails lockedDetails;
	private List<TicketAssignedDTO> ticketAssignedDTO;
	private Boolean isTicketLocked;
	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public Boolean getIsFromDept() {
		return isFromDept;
	}

	public TicketLockedDetails getLockedDetails() {
		return lockedDetails;
	}

	public void setLockedDetails(TicketLockedDetails lockedDetails) {
		this.lockedDetails = lockedDetails;
	}

	public Boolean getIsTicketLocked() {
		return isTicketLocked;
	}

	public void setIsTicketLocked(Boolean isTicketLocked) {
		this.isTicketLocked = isTicketLocked;
	}

	public void setIsFromDept(Boolean isFromDept) {
		this.isFromDept = isFromDept;
	}

	public String getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSubModule() {
		return subModule;
	}

	public void setSubModule(String subModule) {
		this.subModule = subModule;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getProblemLevel() {
		return problemLevel;
	}

	public void setProblemLevel(String problemLevel) {
		this.problemLevel = problemLevel;
	}

	public String getProblemOcurredAt() {
		return problemOcurredAt;
	}

	public void setProblemOcurredAt(String problemOcurredAt) {
		this.problemOcurredAt = problemOcurredAt;
	}

	public String getTicketUser() {
		return ticketUser;
	}

	public void setTicketUser(String ticketUser) {
		this.ticketUser = ticketUser;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrNo() {
		return trNo;
	}

	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public String getRegapplicationNo() {
		return regapplicationNo;
	}

	public void setRegapplicationNo(String regapplicationNo) {
		this.regapplicationNo = regapplicationNo;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getLlrNo() {
		return llrNo;
	}

	public void setLlrNo(String llrNo) {
		this.llrNo = llrNo;
	}

	public String getDlApplicationNo() {
		return dlApplicationNo;
	}

	public void setDlApplicationNo(String dlApplicationNo) {
		this.dlApplicationNo = dlApplicationNo;
	}

	public String getDlAadharNo() {
		return dlAadharNo;
	}

	public void setDlAadharNo(String dlAadharNo) {
		this.dlAadharNo = dlAadharNo;
	}

	public Integer getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(Integer currentIndex) {
		this.currentIndex = currentIndex;
	}

	public String getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}


	public List<UpdateActionRoles> getUpdateActionRoles() {
		return updateActionRoles;
	}

	public void setUpdateActionRoles(List<UpdateActionRoles> updateActionRoles) {
		this.updateActionRoles = updateActionRoles;
	}

	public List<TicketImageDTO> getTicketImageDTO() {
		return TicketImageDTO;
	}

	public void setTicketImageDTO(List<TicketImageDTO> ticketImageDTO) {
		TicketImageDTO = ticketImageDTO;
	}

	public String getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	public String getClosedLevel() {
		return closedLevel;
	}

	public void setClosedLevel(String closedLevel) {
		this.closedLevel = closedLevel;
	}

	public String getlUpdatedUser() {
		return lUpdatedUser;
	}

	public void setlUpdatedUser(String lUpdatedUser) {
		this.lUpdatedUser = lUpdatedUser;
	}

	public String getlUpdatedRole() {
		return lUpdatedRole;
	}

	public void setlUpdatedRole(String lUpdatedRole) {
		this.lUpdatedRole = lUpdatedRole;
	}

	public String getFirstCreatedRole() {
		return firstCreatedRole;
	}

	public void setFirstCreatedRole(String firstCreatedRole) {
		this.firstCreatedRole = firstCreatedRole;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getFirstCreatedUser() {
		return firstCreatedUser;
	}

	public void setFirstCreatedUser(String firstCreatedUser) {
		this.firstCreatedUser = firstCreatedUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getPreviousClosedIndex() {
		return previousClosedIndex;
	}

	public void setPreviousClosedIndex(Integer previousClosedIndex) {
		this.previousClosedIndex = previousClosedIndex;
	}

	public String getPreviousClosedRole() {
		return previousClosedRole;
	}

	public void setPreviousClosedRole(String previousClosedRole) {
		this.previousClosedRole = previousClosedRole;
	}

	public LocalDateTime getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(LocalDateTime closedDate) {
		this.closedDate = closedDate;
	}

	public List<Map<String, String>> getReopenComments() {
		return reopenComments;
	}

	public void setReopenComments(List<Map<String, String>> reopenComments) {
		this.reopenComments = reopenComments;
	}

	public List<TicketAssignedDTO> getTicketAssignedDTO() {
		return ticketAssignedDTO;
	}

	public void setTicketAssignedDTO(List<TicketAssignedDTO> ticketAssignedDTO) {
		this.ticketAssignedDTO = ticketAssignedDTO;
	}

	public LocalDateTime getReOpenDate() {
		return reOpenDate;
	}

	public void setReOpenDate(LocalDateTime reOpenDate) {
		this.reOpenDate = reOpenDate;
	}

	public List<ReopenActionRoles> getReopenActionRoles() {
		return reopenActionRoles;
	}

	public void setReopenActionRoles(List<ReopenActionRoles> reopenActionRoles) {
		this.reopenActionRoles = reopenActionRoles;
	}

	public List<SuggestionActionRolesDTO> getSuggestionActionRoles() {
		return suggestionActionRoles;
	}

	public void setSuggestionActionRoles(List<SuggestionActionRolesDTO> suggestionActionRoles) {
		this.suggestionActionRoles = suggestionActionRoles;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


}
