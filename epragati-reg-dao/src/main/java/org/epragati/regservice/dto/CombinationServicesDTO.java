package org.epragati.regservice.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_reg_combinations")
@CompoundIndexes({
	@CompoundIndex(name ="serviceId",def ="{'serviceId':1}")
})
public class CombinationServicesDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer serviceId;
	private List<Integer> combinationServices;
	private String serviceDescription;
	private boolean status;
	private int orderNo;
	private boolean aadhaarAuthenticationRequired;
	private boolean isSlotReqiured = false;
	private Set<String> validation;
	private Set<String> transportValidation;
	private List<String> roles;
	private String module;
	private boolean isMobile = false;
	
	private Integer nicCode;
	

	/**
	 * @return the nicCode
	 */
	public Integer getNicCode() {
		return nicCode;
	}

	/**
	 * @param nicCode the nicCode to set
	 */
	public void setNicCode(Integer nicCode) {
		this.nicCode = nicCode;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public Set<String> getTransportValidation() {
		return transportValidation;
	}

	public void setTransportValidation(Set<String> transportValidation) {
		this.transportValidation = transportValidation;
	}

	public Set<String> getValidation() {
		return validation;
	}

	public void setValidation(Set<String> validation) {
		this.validation = validation;
	}

	/**
	 * @return the combinationServices
	 */
	public List<Integer> getCombinationServices() {
		return combinationServices;
	}

	/**
	 * @param combinationServices
	 *            the combinationServices to set
	 */
	public void setCombinationServices(List<Integer> combinationServices) {
		this.combinationServices = combinationServices;
	}

	/**
	 * @return the serviceDescription
	 */
	public String getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * @param serviceDescription
	 *            the serviceDescription to set
	 */
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the orderNo
	 */
	public int getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public boolean isAadhaarAuthenticationRequired() {
		return aadhaarAuthenticationRequired;
	}

	public void setAadhaarAuthenticationRequired(boolean aadhaarAuthenticationRequired) {
		this.aadhaarAuthenticationRequired = aadhaarAuthenticationRequired;
	}

	/**
	 * @return the isSlotReqiured
	 */
	public boolean isSlotReqiured() {
		return isSlotReqiured;
	}

	/**
	 * @param isSlotReqiured
	 *            the isSlotReqiured to set
	 */
	public void setSlotReqiured(boolean isSlotReqiured) {
		this.isSlotReqiured = isSlotReqiured;
	}

	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the module
	 */
	public String getModule() {
		return module;
	}

	/**
	 * @param module the module to set
	 */
	public void setModule(String module) {
		this.module = module;
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}

}
