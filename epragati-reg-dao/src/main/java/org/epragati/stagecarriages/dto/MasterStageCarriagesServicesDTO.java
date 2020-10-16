package org.epragati.stagecarriages.dto;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_stage_carriages_services")
public class MasterStageCarriagesServicesDTO {

	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer serviceId;
	private String serviceDescription;
	private boolean status;
	private boolean aadhaarAuthenticationRequired;
	private boolean isSlotReqiured = false;
	private Set<String> validation;
	private List<String> roles;
	private String module;
	private boolean autoApprove;
	
	
	
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isAadhaarAuthenticationRequired() {
		return aadhaarAuthenticationRequired;
	}
	public void setAadhaarAuthenticationRequired(boolean aadhaarAuthenticationRequired) {
		this.aadhaarAuthenticationRequired = aadhaarAuthenticationRequired;
	}
	public boolean isSlotReqiured() {
		return isSlotReqiured;
	}
	public void setSlotReqiured(boolean isSlotReqiured) {
		this.isSlotReqiured = isSlotReqiured;
	}
	public Set<String> getValidation() {
		return validation;
	}
	public void setValidation(Set<String> validation) {
		this.validation = validation;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public boolean isAutoApprove() {
		return autoApprove;
	}
	public void setAutoApprove(boolean autoApprove) {
		this.autoApprove = autoApprove;
	}
	
	
	
	
}
