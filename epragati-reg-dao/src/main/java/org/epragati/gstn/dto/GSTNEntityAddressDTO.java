package org.epragati.gstn.dto;

import java.io.Serializable;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class GSTNEntityAddressDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EntityAddressDTO addr;
	
	private String ntr;

	public EntityAddressDTO getAddr() {
		return addr;
	}

	public void setAddr(EntityAddressDTO addr) {
		this.addr = addr;
	}

	public String getNtr() {
		return ntr;
	}

	public void setNtr(String ntr) {
		this.ntr = ntr;
	}
	
}
