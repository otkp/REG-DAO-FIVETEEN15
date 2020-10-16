package org.epragati.gstn.dto;

import java.io.Serializable;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class EntityAddressDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bnm;
	
	private String st;
	
	private String loc;
	
	private String bno;
	
	private String stcd;
	
	private String dst;
	
	private String city;
	
	private String flno;
	
	private String lt;
	
	private String pncd;
	
	private String lg;

	public String getBnm() {
		return bnm;
	}

	public void setBnm(String bnm) {
		this.bnm = bnm;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getStcd() {
		return stcd;
	}

	public void setStcd(String stcd) {
		this.stcd = stcd;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFlno() {
		return flno;
	}

	public void setFlno(String flno) {
		this.flno = flno;
	}

	public String getLt() {
		return lt;
	}

	public void setLt(String lt) {
		this.lt = lt;
	}

	public String getPncd() {
		return pncd;
	}

	public void setPncd(String pncd) {
		this.pncd = pncd;
	}

	public String getLg() {
		return lg;
	}

	public void setLg(String lg) {
		this.lg = lg;
	}
	
}
