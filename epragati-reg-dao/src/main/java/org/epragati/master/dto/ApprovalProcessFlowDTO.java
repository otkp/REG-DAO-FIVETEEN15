package org.epragati.master.dto;

import java.util.Map;

import org.epragati.common.dto.BaseEntity;
import org.epragati.util.StatusRegistration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * master_approval_process_flow to maintain rta admin side approval
 * directions
 * 
 * @author naga.pulaparthi
 *
 */

@Document(collection = "master_approval_process_flow")
public class ApprovalProcessFlowDTO extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private Integer serviceId;
    private String role;
    private Integer index;
    private StatusRegistration approveStatus;
    private StatusRegistration rejectionStatus;
    private String heigherAuthor;//AO or RTO
    private Map<String, String> finalStepChecker;
    private Boolean isFinal; 
    private Integer nextIndex;
	
        

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}
	/**
	 * @return the approveStatus
	 */
	public StatusRegistration getApproveStatus() {
		return approveStatus;
	}
	/**
	 * @param approveStatus the approveStatus to set
	 */
	public void setApproveStatus(StatusRegistration approveStatus) {
		this.approveStatus = approveStatus;
	}
	/**
	 * @return the rejectionStatus
	 */

	/**
	 * @return the finalStepChecker
	 */
	public Map<String, String> getFinalStepChecker() {
		return finalStepChecker;
	}
	/**
	 * @param finalStepChecker the finalStepChecker to set
	 */
	public void setFinalStepChecker(Map<String, String> finalStepChecker) {
		this.finalStepChecker = finalStepChecker;
	}
	/**
	 * @return the rejectionStatus
	 */
	public StatusRegistration getRejectionStatus() {
		return rejectionStatus;
	}
	/**
	 * @param rejectionStatus the rejectionStatus to set
	 */
	public void setRejectionStatus(StatusRegistration rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
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
	 * @return the heigherAuthor
	 */
	public String getHeigherAuthor() {
		return heigherAuthor;
	}
	/**
	 * @param heigherAuthor the heigherAuthor to set
	 */
	public void setHeigherAuthor(String heigherAuthor) {
		this.heigherAuthor = heigherAuthor;
	}
	/**
	 * @return the isFinal
	 */
	public Boolean getIsFinal() {
		return isFinal;
	}
	/**
	 * @param isFinal the isFinal to set
	 */
	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}
	public Integer getNextIndex() {
		return nextIndex;
	}
	public void setNextIndex(Integer nextIndex) {
		this.nextIndex = nextIndex;
	}
	
    
}
