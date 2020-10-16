package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.util.document.KeyValue;

public class RoleActionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String role;
	private String action;
	private LocalDateTime actionTime;
	private String actionBy;
	private String applicatioNo;
	private String module;
	private String userId;
	private Integer iteration;
	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;
	
	

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
	 * @return the applicatioNo
	 */
	public String getApplicatioNo() {
		return applicatioNo;
	}

	/**
	 * @param applicatioNo the applicatioNo to set
	 */
	public void setApplicatioNo(String applicatioNo) {
		this.applicatioNo = applicatioNo;
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

	/**
	 * @return the actionTime
	 */
	public LocalDateTime getActionTime() {
		return actionTime;
	}

	/**
	 * @param actionTime the actionTime to set
	 */
	public void setActionTime(LocalDateTime actionTime) {
		this.actionTime = actionTime;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "RoleActionDTO [role=" + role + ", action=" + action + ", actionTime=" + actionTime + ", actionBy="
				+ actionBy + ", applicatioNo=" + applicatioNo + ", module=" + module + ", userId=" + userId
				+ ", enclosures=" + enclosures + "]";
	}

	/**
	 * @return the iterator
	 */
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the iteration
	 */
	public Integer getIteration() {
		return iteration;
	}

	/**
	 * @param iteration the iteration to set
	 */
	public void setIteration(Integer iteration) {
		this.iteration = iteration;
	}

	/**
	 * @return the id
	 */
	
}
