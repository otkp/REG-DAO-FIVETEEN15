package org.epragati.master.dto;

import java.time.LocalTime;

public class ClientMetaData {

	private String publicIPAddress;
	private String url;
	private String uri;
	private String scheme;
	private String serverName;
	private int portNumber;
	private String contextPath;
	private String servletPath;
	private long sessionTime;
	private LocalTime requestTime;
	private LocalTime responseTime;
	private String userName;
	private String roleType;
	private String officeCode;

	/**
	 * @return the publicIPAddress
	 */
	public String getPublicIPAddress() {
		return publicIPAddress;
	}

	/**
	 * @param publicIPAddress the publicIPAddress to set
	 */
	public void setPublicIPAddress(String publicIPAddress) {
		this.publicIPAddress = publicIPAddress;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return the scheme
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * @param scheme the scheme to set
	 */
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * @return the portNumber
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * @return the contextPath
	 */
	public String getContextPath() {
		return contextPath;
	}

	/**
	 * @param contextPath the contextPath to set
	 */
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	/**
	 * @return the servletPath
	 */
	public String getServletPath() {
		return servletPath;
	}

	/**
	 * @param servletPath the servletPath to set
	 */
	public void setServletPath(String servletPath) {
		this.servletPath = servletPath;
	}

	/**
	 * @return the sessionTime
	 */
	public long getSessionTime() {
		return sessionTime;
	}

	/**
	 * @param l the sessionTime to set
	 */
	public void setSessionTime(long l) {
		this.sessionTime = l;
	}

	/**
	 * @return the requestTime
	 */
	public LocalTime getRequestTime() {
		return requestTime;
	}

	/**
	 * @param requestTime the requestTime to set
	 */
	public void setRequestTime(LocalTime requestTime) {
		this.requestTime = requestTime;
	}

	/**
	 * @return the responseTime
	 */
	public LocalTime getResponseTime() {
		return responseTime;
	}

	/**
	 * @param responseTime the responseTime to set
	 */
	public void setResponseTime(LocalTime responseTime) {
		this.responseTime = responseTime;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the roleType
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * @param roleType the roleType to set
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType;
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
