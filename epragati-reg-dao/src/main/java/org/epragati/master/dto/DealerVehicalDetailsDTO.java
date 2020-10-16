package org.epragati.master.dto;

import java.util.List;

import org.epragati.common.dto.BaseEntity;

public class DealerVehicalDetailsDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MasterCovDTO> classOfVehicals;
	private List<MakersDTO> makerNames;

	public List<MasterCovDTO> getClassOfVehicals() {
		return classOfVehicals;
	}

	public void setClassOfVehicals(List<MasterCovDTO> classOfVehicals) {
		this.classOfVehicals = classOfVehicals;
	}

	public List<MakersDTO> getMakerNames() {
		return makerNames;
	}

	public void setMakerNames(List<MakersDTO> makerNames) {
		this.makerNames = makerNames;
	}

	@Override
	public String toString() {
		return "DealerVehicalDetailsDTO [classOfVehicals=" + classOfVehicals + ", makerNames=" + makerNames + "]";
	}
	
	

}
