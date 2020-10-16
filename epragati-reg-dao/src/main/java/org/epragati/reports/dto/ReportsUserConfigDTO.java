package org.epragati.reports.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author saikiran.kola
 *
 */
@Document(collection = "reports_user_config")
public class ReportsUserConfigDTO {

	@Id
	private String id;

	private String role;

	private String userId;

	private String officeCode;

	private List<String> reportsInclude;

	private List<String> reportsExclude;

	private boolean isRestricted;

	private String reportName;

	private List<String> grantedUser;

	public List<String> getGrantedUser() {
		return grantedUser;
	}

	public void setGrantedUser(List<String> grantedUser) {
		this.grantedUser = grantedUser;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
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

	public boolean isRestricted() {
		return isRestricted;
	}

	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the reportsInclude
	 */
	public List<String> getReportsInclude() {
		return reportsInclude;
	}

	/**
	 * @param reportsInclude the reportsInclude to set
	 */
	public void setReportsInclude(List<String> reportsInclude) {
		this.reportsInclude = reportsInclude;
	}

	/**
	 * @return the reportsExclude
	 */
	public List<String> getReportsExclude() {
		return reportsExclude;
	}

	/**
	 * @param reportsExclude the reportsExclude to set
	 */
	public void setReportsExclude(List<String> reportsExclude) {
		this.reportsExclude = reportsExclude;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

}
