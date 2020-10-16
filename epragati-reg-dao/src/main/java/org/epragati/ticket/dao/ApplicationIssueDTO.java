package org.epragati.ticket.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "application_issues")
public class ApplicationIssueDTO {

	@Id
	private String issueNo;
	private String issue;
	private String probLevel;
	private String ticketNo;
	private String raisedBy;
	private String status;
	private String module;
	private List<IssueImageDTO> issueImageDTO;
	private List<IssueSolutionDTO> issueSolutionDTO;
	private List<ReopenIssueDTO> reopenIssueDTO;
	private LocalDateTime createdDate;
	private String lUpdatedBy;
	private LocalDateTime lUpdatedDate;

	public String getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getProbLevel() {
		return probLevel;
	}

	public void setProbLevel(String probLevel) {
		this.probLevel = probLevel;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<IssueImageDTO> getIssueImageDTO() {
		return issueImageDTO;
	}

	public void setIssueImageDTO(List<IssueImageDTO> issueImageDTO) {
		this.issueImageDTO = issueImageDTO;
	}

	public List<IssueSolutionDTO> getIssueSolutionDTO() {
		return issueSolutionDTO;
	}

	public void setIssueSolutionDTO(List<IssueSolutionDTO> issueSolutionDTO) {
		this.issueSolutionDTO = issueSolutionDTO;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getlUpdatedBy() {
		return lUpdatedBy;
	}

	public void setlUpdatedBy(String lUpdatedBy) {
		this.lUpdatedBy = lUpdatedBy;
	}

	public LocalDateTime getlUpdatedDate() {
		return lUpdatedDate;
	}

	public void setlUpdatedDate(LocalDateTime lUpdatedDate) {
		this.lUpdatedDate = lUpdatedDate;
	}

	public List<ReopenIssueDTO> getReopenIssueDTO() {
		return reopenIssueDTO;
	}

	public void setReopenIssueDTO(List<ReopenIssueDTO> reopenIssueDTO) {
		this.reopenIssueDTO = reopenIssueDTO;
	}

	@Override
	public String toString() {
		return "ApplicationIssueDTO [issueNo=" + issueNo + ", issue=" + issue + ", probLevel=" + probLevel
				+ ", ticketNo=" + ticketNo + ", raisedBy=" + raisedBy + ", status=" + status + ", module=" + module
				+ ", issueImageDTO=" + issueImageDTO + ", issueSolutionDTO=" + issueSolutionDTO + ", reopenIssueDTO="
				+ reopenIssueDTO + ", createdDate=" + createdDate + ", lUpdatedBy=" + lUpdatedBy + ", lUpdatedDate="
				+ lUpdatedDate + "]";
	}

}
