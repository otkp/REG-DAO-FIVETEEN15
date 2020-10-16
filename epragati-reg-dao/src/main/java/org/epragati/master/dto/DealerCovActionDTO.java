package org.epragati.master.dto;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author saikiran.kola
 *
 */
@Document(collection = "master_dealer_cov_action")
@CompoundIndexes({ 
	@CompoundIndex(name = "actionBy", def = "{'actionBy': 1}"),
	@CompoundIndex(name = "role", def = "{'role': 1}"),
	@CompoundIndex(name = "role_and_action", def = "{'role': 1, 'action': 1}"),
})
public class DealerCovActionDTO{

	@Id
	private String id;

	private Integer dcaId;

	private String dcId;

	private Integer action;
	
	private String actionBy;

	private String actionDate;

	private Integer role;

	private String remarks;

	public Integer getAction() {
		return action;
	}

	public String getActionBy() {
		return actionBy;
	}

	public String getActionDate() {
		return actionDate;
	}

	public Integer getDcaId() {
		return dcaId;
	}

	public String getDcId() {
		return dcId;
	}

	public String getId() {
		return id;
	}

	public String getRemarks() {
		return remarks;
	}

	public Integer getRole() {
		return role;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public void setDcaId(Integer dcaId) {
		this.dcaId = dcaId;
	}

	public void setDcId(String dcId) {
		this.dcId = dcId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}
