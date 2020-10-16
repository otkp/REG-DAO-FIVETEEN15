package org.epragati.ticket.dao;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="issuetypes")
public class IssueTypesDTO {
	
	private String issue;
	private String[] issueTypes;
	private Boolean isEnable=Boolean.TRUE;
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String[] getIssueTypes() {
		return issueTypes;
	}
	public void setIssueTypes(String[] issueTypes) {
		this.issueTypes = issueTypes;
	}
	public Boolean getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}
    
}
