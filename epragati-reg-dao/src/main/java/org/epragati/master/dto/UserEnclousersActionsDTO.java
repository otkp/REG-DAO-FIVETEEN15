package org.epragati.master.dto;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="user_enclousers_actions")
public class UserEnclousersActionsDTO  implements Serializable {
	

	@Id
	private String id;
	
	private Integer ueaId;
	private String ueId;
	private Integer action;
	private String actionBy;
	private String actionDate;
	private Integer role;
	private String remarks;
	
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
	 * @return the ueaId
	 */
	public Integer getUeaId() {
		return ueaId;
	}

	/**
	 * @param ueaId the ueaId to set
	 */
	public void setUeaId(Integer ueaId) {
		this.ueaId = ueaId;
	}

	/**
	 * @return the ueId
	 */
	public String getUeId() {
		return ueId;
	}

	/**
	 * @param ueId the ueId to set
	 */
	public void setUeId(String ueId) {
		this.ueId = ueId;
	}

	/**
	 * @return the action
	 */
	public Integer getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(Integer action) {
		this.action = action;
	}

	/**
	 * @return the actionBy
	 */
	public String getActionBy() {
		return actionBy;
	}

	/**
	 * @param actionBy the actionBy to set
	 */
	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	/**
	 * @return the actionDate
	 */
	public String getActionDate() {
		return actionDate;
	}

	/**
	 * @param actionDate the actionDate to set
	 */
	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	/**
	 * @return the role
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEnclousersActionsDTO [id=" + id + ", ueaId=" + ueaId + ", ueId=" + ueId + ", action=" + action
				+ ", actionBy=" + actionBy + ", actionDate=" + actionDate + ", role=" + role + ", remarks=" + remarks
				+ "]";
	}

}
