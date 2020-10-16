package org.epragati.gstn.dto;


/**
 * 
 * @author saroj.sahoo
 *
 */
public class GSTNConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String gstin;
	
	private String authToken;
	
	private String sessionid;
	
	private String enc;
	
	private String statusCode;
	
	private String sek;

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getEnc() {
		return enc;
	}

	public void setEnc(String enc) {
		this.enc = enc;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getSek() {
		return sek;
	}

	public void setSek(String sek) {
		this.sek = sek;
	}

}
