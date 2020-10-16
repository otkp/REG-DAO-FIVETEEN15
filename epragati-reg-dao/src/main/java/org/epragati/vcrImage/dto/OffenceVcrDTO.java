package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.epragati.master.dto.MisusedAsDTO;
import org.epragati.master.dto.OffenceDTO;

public class OffenceVcrDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private List<OffenceDTO> offence;
	private boolean illicitOperation;
	private String pilledAs;
	private String registeredAs;
	private MisusedAsDTO misusedAs;
	private String remarks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<OffenceDTO> getOffence() {
		return offence;
	}

	public void setOffence(List<OffenceDTO> offence) {
		this.offence = offence;
	}

	public boolean isIllicitOperation() {
		return illicitOperation;
	}

	public void setIllicitOperation(boolean illicitOperation) {
		this.illicitOperation = illicitOperation;
	}

	public String getPilledAs() {
		return pilledAs;
	}

	public void setPilledAs(String pilledAs) {
		this.pilledAs = pilledAs;
	}

	public MisusedAsDTO getMisusedAs() {
		return misusedAs;
	}

	public void setMisusedAs(MisusedAsDTO misusedAs) {
		this.misusedAs = misusedAs;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRegisteredAs() {
		return registeredAs;
	}

	public void setRegisteredAs(String registeredAs) {
		this.registeredAs = registeredAs;
	}
	
	

}
