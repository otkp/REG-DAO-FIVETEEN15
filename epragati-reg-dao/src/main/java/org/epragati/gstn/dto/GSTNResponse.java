package org.epragati.gstn.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author saroj.sahoo
 *
 */
@JsonInclude(Include.NON_NULL)
public class GSTNResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3597226988744078872L;

	private String status_cd;
	
	private String data;
	
	private String rek;
	
	private String hmac; 

	public String getStatus_cd() {
		return status_cd;
	}

	public void setStatus_cd(String status_cd) {
		this.status_cd = status_cd;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRek() {
		return rek;
	}

	public void setRek(String rek) {
		this.rek = rek;
	}

	public String getHmac() {
		return hmac;
	}

	public void setHmac(String hmac) {
		this.hmac = hmac;
	}

	@Override
	public String toString() {
		return "GSTNResponse [status_cd=" + status_cd + ", data=" + data + ", rek=" + rek + ", hmac=" + hmac + "]";
	}
	
}
